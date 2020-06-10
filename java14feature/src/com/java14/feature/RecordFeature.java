

package com.java14.feature;
/*
* record can be used as data carrier it is representing the immutable in nature of state of record like ENUM.
* Benefits :
*  1. equals(), hashCode(), toString(), constructor() and read accessors(getter) are generated for you
*  2. interfaces can be implemented
*  3. implementing multiple constructors but need pointing to another constructor.
* Restrictions :
*  1.a record cannot be extended, it’s a final class
   2.a record cannot extend a class
   3. the value (reference) of a field is final and cannot be changed
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecordFeature {
    public static void main(String[] args) {
        // not allowed here
        //var pankaj = new Student();
        var student = new Student("Pankaj", 30, new ArrayList<String>(Arrays.asList(new String[]{"patna", "ranchi"})));
        var student1 = new Student("Pankaj", 30, new ArrayList<String>(Arrays.asList(new String[]{"patna", "ranchi"})));
        System.out.println(student.hashCode()); //-803209431
        System.out.println(student.toString());// Student[name=Pankaj, age=30, addresses=[patna, ranchi]]
        System.out.println(student.equals(student1)); // true -> because content are equal in both record
        System.out.println(student == student1); // false -> because object reference are different for both

        //with default constructor
        var raju = new Student();
        System.out.println("Name "+raju.name());

        var bablu = new Student("bablu",70);
        // bablu.setName("Pankaj"); // not allowed to modify the value.
        System.out.println("bablu :"+bablu);


    }
}

record Student(String name, Integer age, List<String>addresses) implements  StudentSpec{
    //you can create own the constructor but all the parameter is required.
    public Student(){
        this("Manish",null,null);
    }
    public Student(String name, Integer age){
        this(name,age,null);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public List<String> getAddress() {
        return this.addresses;
    }

    /*@Override
    public void setName(String name) {
        this.name=name;
    }*/
};

interface StudentSpec{
    public String getName();
    public Integer getAge();
    public List<String> getAddress();
    // value not modified due to final nature
    // public void setName(String name);
}

/* Student can not be extended because it is final nature
class Animal extends Student{

}*/
class MM{

}
// no extends is allowed for record.
//record Men() extends MM{};