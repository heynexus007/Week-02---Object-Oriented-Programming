import javax.security.auth.Subject;

class Student{
    static String universityName ;
    String name,grade;
    final int rollNumber=19;
    static int totalStudent;

    Student(String universityName, String name, String grade){
        this.universityName=universityName;
        this.name=name;
        this.grade=grade;
        totalStudent++;
    }

    static void displayTotalStudents(){
        System.out.println("Total Student : "+ totalStudent);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        Student s1= new Student("IIT", "Yashasvi", "B");
        Student s2= new Student("MANIT", "Kashvi", "A");

        System.out.println("Is s1 object is an instance of the Student class? "+ (s1 instanceof Student));
        System.out.println("Is s2 object is an instance of the Student class? "+ (s2 instanceof Student));

        s2.displayTotalStudents();
        
    }
}
