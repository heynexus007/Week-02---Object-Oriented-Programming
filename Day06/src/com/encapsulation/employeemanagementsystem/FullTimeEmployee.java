package com.encapsulation.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {
    String departmentName;
    private double fixedSalary;
    private int workHours;

    public FullTimeEmployee(int employeeId,String name, double baseSalary, double fixedSalary){
        super(employeeId, name, baseSalary);
        this.fixedSalary=fixedSalary;
        this.workHours=workHours;
    }

    @Override
    double calculateSalary() {
        return getBaseSalary()+fixedSalary;
    }

    @Override
    public void assignDepartment(String departmentName){
        this.departmentName=departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department : "+departmentName;
    }
}
