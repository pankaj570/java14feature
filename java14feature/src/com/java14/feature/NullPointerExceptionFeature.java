package com.java14.feature;
/*
* Java 14 introduced a new JVM feature
* which gives better insights with a more descriptive stack as shown below:
*before in upto java 8 version
* Exception in thread "main" java.lang.NullPointerException: Age not define
	at com.java14.feature.Employee.getAge(NullPointerExceptionFeature.java:12)
	at com.java14.feature.NullPointerExceptionFeature.main(NullPointerExceptionFeature.java:6)

* now in java 14 version it is give more descriptive
*c\>: java -XX:+ShowCodeDetailsInExceptionMessages NullPointerExceptionFeature.java
* pass VM as run time
*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.concat(String)" because "<local1>" is null
        at com.java14.feature.Employee.getAge(NullPointerExceptionFeature.java:24)
        at com.java14.feature.NullPointerExceptionFeature.main(NullPointerExceptionFeature.java:17)
* */
public class NullPointerExceptionFeature {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getAge());
    }
}
class Employee{
    private Integer age;
    public Integer getAge() {
        String str=null;
        str.concat("Pankaj");
        throw new NullPointerException("Age not define");
    }
}
