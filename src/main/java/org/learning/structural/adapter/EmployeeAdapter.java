package org.learning.structural.adapter;

public class EmployeeAdapter implements Employee{

    private EmployeeOld oldEmployee;

    EmployeeAdapter(EmployeeOld oldemployee) {
        this.oldEmployee = oldEmployee;
    }

    public String getName() {
        return oldEmployee.getCn();
    }

    public String getAge() {
        return oldEmployee.getAge();
    }

    public String getNumber() {
        return oldEmployee.getMobile();
    }


}
