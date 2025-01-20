class Person{
String name;
int contactNo;

// Parameterized constructor
Person(String name, int contactNo){
    this.name=name;
    this.contactNo=contactNo;
}

// Copy constructor
Person(Person p){
this.name=p.name;
this.contactNo=p.contactNo;
}

void displayPersonDetails(){
    System.out.println("Person Name : "+name);
    System.out.println("Contact Number :"+contactNo);
}
}
public class PersonDetail {
   public static void main(String[] args) {
    // Making obj of PC and Calling parameterized constructor(PC)
    Person p1=new Person("Jonny depp", 43843);
    p1.displayPersonDetails();
    
    System.out.println("---------------------");
    // Creating obj of copy constructor and also called
    Person p2=new Person(p1);
    p2.displayPersonDetails();
   } 
}
