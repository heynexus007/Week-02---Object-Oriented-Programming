import java.util.*;
class Employee {
    String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    void Display(Employee e){
        System.out.println(e.employeeName);
    }
}

public class CompanyDepartmentExp {
    public static void main(String[] args) {
        Company company = new Company("TechX");

        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("James"));
        itDept.addEmployee(new Employee("Drake"));

        company.addDepartment(itDept);

        System.out.println("Company \"" + company.name + "\" has " + company.departments.size() + " departments.");
    }
}

