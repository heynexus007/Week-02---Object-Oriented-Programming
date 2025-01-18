public class Employees {
    private String name;
    private int id;
    private int salary;
    // Creating constructor 
    Employees(String name, int  id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    // Display output
    public void display(){
        System.out.println("Employee Name : "+ name);
        System.out.println("Employee Id : "+ id);
        System.out.println("Employee Salary : "+ salary);
    }
    
    public static void main(String[] args) {
        // Creating Employee class object
        Employees emp1= new Employees("John", 10,2500);
        Employees emp2= new Employees("John", 10,2500);
        //Calling display method
        emp1.display();
        emp2.display();
    }
}
