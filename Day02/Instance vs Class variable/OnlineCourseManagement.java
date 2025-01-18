class Course {
    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    private static String instituteName = "CodingClub Institute";

    // Constructor -> Parameterized
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display all course details
    public void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Total Duration : " + duration + " hours");
        System.out.println("Fee Amount : " + fee +" Rs");
        System.out.println("Institute Name : " + instituteName);
    }

    // Class method to update institute new name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        // Creating object of Course class for access methods
        Course course1 = new Course("Java Core with DSA", 48, 899.00);
        course1.displayCourseDetails(); // call instance display method
        Course.updateInstituteName("TechnoRich Academy");   // update institute name
        course1.displayCourseDetails(); 
    }
}
