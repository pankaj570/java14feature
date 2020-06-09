package com.java14.feature;
/*
* instanceof operator now can be used as pattern machhing and
* The scope of the personNew variable is limited to the if conditional block only.
*
* */
public class InstanceofAsPatternMaching {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        person.setName("PANKAJ");
        if (person instanceof Person personNew) {
            System.out.println("Person details :" + personNew);
        } else {
            System.out.println("Object is not type of Person class type !");
        }
    }
}

class Person {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
