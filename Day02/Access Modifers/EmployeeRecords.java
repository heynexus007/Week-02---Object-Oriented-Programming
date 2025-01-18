// Problem 4: Employee Records
class Employee {
    // Instance variable
    public int employeeID;
    protected String department;
    private double salary;
    // Parameterized Constructor Employee
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Invalid salary value.");
    }

    // Public method to set salary
    public double getSalary() {
        return salary;
    }
}

// Creating a Subclass Manager for Employee
class Manager extends Employee {
    // Again creating Parameterized Constructor for Manager class
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating object of Manager sub-class for access methods
        Manager manager = new Manager(201, "IT", 75000.0);
        manager.displayEmployeeInfo();  //Calling display method 
        manager.setSalary(80000.0); //Calling setSalary method 
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
