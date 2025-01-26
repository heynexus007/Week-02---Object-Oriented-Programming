package com.encapsulation.employeemanagementsystem;

abstract class PartTimeEmployee extends Employee implements Department {
    private String departmentName;
    private int workHours;

    PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours){
        super(employeeId,name,baseSalary);
        this.workHours=workHours;
    }

    //@Override
    double calculatedSalary(){
        return (getBaseSalary()+ (workHours*300));
    }
    @Override
    public void assignDepartment(String departmentName){
        this.departmentName=departmentName;
    }
    @Override
    public String getDepartmentDetails(){
        return "Department : "+departmentName;
    }
}
