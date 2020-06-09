package com.java14.feature;

/*
* to enable the preview mode use below command
jshell --enable-preview
javac --release 14 --enable-preview Author.java
1. it support the lambada expression with multiple case.
2. yield statements instead of break for returning values from an expression.
 */
public class SwitchStatement {
    public static void main(String[] args) {
      System.out.println(getData(""));
        System.out.println(getData("SUN"));
    }

    public static String getData(String day) {
        String result = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> "ALL ARE WEEKDAYS";
            case "SAT", "SUN" -> "ALL ARE WEEKEND";
            default -> {
                if(day.isBlank()){
                   yield  result = "DAY IS EMPTY OR NULL";
                }else{
                    yield  result ="LOOKS LIKE FUN!";
                }
            }
        };
        return result;
    }
}
