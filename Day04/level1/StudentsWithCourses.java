import java.util.*;

class Course {
    public String name;
    public List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void enrollStudent(Student student) {
        students.add(student);
        student.enrollCourse(this);
    }

    public void displayStudents() {
        System.out.println("Course \"" + name + "\" has the following students:");
        for (Student student : students) {
            System.out.println("- " + student.name);
        }
    }
}

class Student {
    public String name;
    public List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void displayCourses() {
        System.out.println(name + " is enrolled in :");
        for (Course course : courses) {
            System.out.println("- " + course.name);
        }
    }
}

class School {
    public String name;
    public ArrayList<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

public class StudentsWithCourses {
    public static void main(String[] args) {
        School s = new School("Horwart");

        Student student1 = new Student("Harry");
        Student student2 = new Student("Harmoine");
        Student student3 = new Student("Ron");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        math.enrollStudent(student1);
        math.enrollStudent(student2);

        science.enrollStudent(student3);

        student1.displayCourses();
        student2.displayCourses();
        math.displayStudents();
        science.displayStudents();
    }
}
