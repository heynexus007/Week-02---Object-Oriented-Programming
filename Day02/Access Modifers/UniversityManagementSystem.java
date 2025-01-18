// Base class for Student
class Student {
    // Instance variable
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Parameterized Constructor for student class
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Creating aSubclass for Student
class PostgraduateStudent extends Student {
    // Again creating Parameterized Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display Student details
    void displayInfo() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Student Name : " + name);
        System.out.println("CGPA : " + getCGPA());
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating object of Student class for access methods
        PostgraduateStudent pgStudent = new PostgraduateStudent(21, "Stitch", 7.9);
        pgStudent.displayInfo();      //Calling display method 
        System.out.println("----------------------");
        //Update new CGPA by setCGPA method
        pgStudent.setCGPA(8.4);  
        System.out.println("Updated CGPA : " + pgStudent.getCGPA());
    }
}
