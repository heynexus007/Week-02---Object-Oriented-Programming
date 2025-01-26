// Creating a Super Class 'Employee'
class Employee{
    String name;
    final int id;
    int salary;

    Employee(String name, int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public void displayDetails(){
        System.out.println("Name : "+ name);
        System.out.println("Id : "+ id);
        System.out.println("Salary : "+ salary);
    }
}

// Creating a sub-class 'Manager' inherits 'Employee' Parent class
class Manager extends Employee{
    int teamSize=7;
    Manager(String name, int id, int salary, int teamSize ){
        super(name, id, salary);
        this.teamSize=teamSize;
    }

    public void displayDetils(){
        super.displayDetails();     // Call the superclass method
        System.out.println("Team Size : "+teamSize);
    }
}

// Creating a sub-class 'Developer' inherits 'Employee' Parent class
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name, int id, int salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();     // Call the superclass method
        System.out.println("Programming Language : "+ programmingLanguage);
    }
}

// Creating a sub-class 'Intern' inherits 'Employee' Parent class
class Intern extends Employee{
    String type;
    Intern(String name, int id, int salary, String type){
        super(name, id, salary);
        this.type=type;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();     // Call the superclass method
        System.out.println("Intern type : "+type);
    }
}
// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager=new Manager("Abhinav", 161, 27000, 4);
        Developer devOp= new Developer("Georg", 3238778, 67000, "Java");
        Intern intern = new Intern("Jack", 74687, 24000, "Java Full-Stack");

        // Displaying each Details of Employees by
        System.out.println("Manager Details :");
        manager.displayDetails();

        System.out.println("\nDeveloper Details :");
        devOp.displayDetails();

        System.out.println("\nIntern Details :");
        intern.displayDetails();
        
    }
}
