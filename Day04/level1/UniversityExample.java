import java.util.*;
class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
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

class University {
    String name;
    List<Department> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    void Display(Employee e){
        System.out.println(e.employeeName);
    }
}

public class UniversityExample {
    public static void main(String[] args) {
        University u = new University("TechX");

        Department itDept = new Department("IT");
        itDept.addEmployee(new Employee("James"));
        itDept.addEmployee(new Employee("Drake"));

        u.addDepartment(itDept);

        System.out.println("Company \"" + u.name + "\" has " + u.departments.size() + " departments.");
    }
}

