package com.encapsulation.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();

        FullTimeEmployee fEmp=new FullTimeEmployee(12,"Jack",8000,1000);
        fEmp.assignDepartment("ffdsf");

//        PartTimeEmployee pEmp=new PartTimeEmployee(19,"Arlongg",9000,4);
//        pEmp.assignDepartment("devOP");

        employees.add(fEmp);
        //employees.add(pEmp);

        for (Employee emp : employees){
            emp.displayDetails();
        }
    }
}
