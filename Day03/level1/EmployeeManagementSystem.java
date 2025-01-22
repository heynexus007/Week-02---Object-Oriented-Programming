class Employees {
    static String companyName;
    String name,designation;
    final int id;
    static int totalEmployee;

    // Creating constructor 
    Employees(String name, String designation ,int id){
        this.name=name;
        this.designation=designation;
        this.id=id;
        totalEmployee++;
    }

    static void displayTotalEmployees(){
        System.out.println("Total Employees : "+totalEmployee);
    }

    // Display output
    public void displayDetails(){
        System.out.println("Employee Name : "+ name);
        System.out.println("Employee Designation : "+ designation);
        System.out.println("Employee Id : "+ id);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employees.companyName="Xtreme Ride";
        Employees emp1=new Employees("Franciso", "Manager", 891);
        System.out.println("emp1 object is an instance of the Employee class? "+ (emp1 instanceof Employees));
        Employees.displayTotalEmployees();
        emp1.displayDetails();

        System.out.println("------------------------------");
        
        Employees emp2=new Employees("D. Franciso", "Developer", 861);
        System.out.println("emp2 object is an instance of the Employee class? "+ (emp2 instanceof Employees));
        Employees.displayTotalEmployees();
        emp2.displayDetails();
    }
}
