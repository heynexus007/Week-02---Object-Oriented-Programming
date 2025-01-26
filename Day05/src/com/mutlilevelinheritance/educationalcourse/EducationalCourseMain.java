package com.mutlilevelinheritance.educationalcourse;

// Main class
public class EducationalCourseMain {
    public static void main(String[] args) {
    //Creating object of Course or OnlineClass
    Course c= new OnlineCourse("Java",48,"OnlineLearn","Yes");
    c.displayCourseDetails(); // calling display method
    System.out.println();
    //Creating object of OnlineCourse or PaidOnlineClass
    OnlineCourse obj=new PaidOnlineCourse("Java",48,"OnlineLearn","YES",4999,10);
    obj.displayCourseDetails(); // calling display method
    }
}
