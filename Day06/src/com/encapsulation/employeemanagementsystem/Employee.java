package com.encapsulation.employeemanagementsystem;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    Employee(int employeeId, String name, double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }

    abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("Employee Details : ");
        System.out.println("Employee Id : "+ employeeId);
        System.out.println("Employee Name : "+name);
        System.out.println("Base Salary : "+baseSalary);
        System.out.println("Calculated Salary : "+calculateSalary());
        
    }

    //Getter Setter methods
    public int getId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary=baseSalary;
    }
}
