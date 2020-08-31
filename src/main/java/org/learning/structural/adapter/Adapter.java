package org.learning.structural.adapter;


public class Adapter {
//Used for handling legacy code
    public static void main(String [] args){
        System.out.println("Hi");
        EmployeeOld old = new EmployeeOld("cn","20","90");
        Employee newEmp = new EmployeeNew("name","20","90");
        Employee oldnew = new EmployeeAdapter(old);
        System.out.println(oldnew.getName()+newEmp.getName());
    }
}
