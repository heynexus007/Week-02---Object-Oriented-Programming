class StudentRes{
    String name;
    int rollNumber;
    int marks;
// Creating Constructor
StudentRes(String name, int rollNumber, int marks){
    this.name=name;
    this.rollNumber=rollNumber;
    this.marks=marks;
}

// method for printing student details
void display(){
    System.out.println("Student Name : "+ name);
    System.out.println("Student Roll Number : "+ rollNumber);
    System.out.println("Student Marks : "+ marks);
    }
// Method for calculating grade according to students marks
void calculateGrade(){
        if(marks>=85)
        System.out.println("Grade A");
    
        else if(marks>=70 && marks<85)
        System.out.println("Grade B");
    
        else if(marks>=60 && marks<70)
        System.out.println("Grade C");
    
        else
        System.out.println("Grade D");
        }
}
public class StudentReport {
    public static void main(String[] args) {
        // Creating class object
        StudentRes s=new StudentRes("Yamraj Singh", 21, 67);
        s.display();
        s.calculateGrade();
    }
}
