package org.learning.structural.adapter;

public class EmployeeNew implements Employee{

    private String name;
    private String age;
    private String number;

     EmployeeNew(String name, String age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }


}
