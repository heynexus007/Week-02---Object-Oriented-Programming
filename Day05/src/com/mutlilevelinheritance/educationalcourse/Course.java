package com.mutlilevelinheritance.educationalcourse;

public class Course {
    String courseName;
    int duration;
    Course (String courseName , int duration){
        this.courseName =courseName ;
        this.duration=duration;
    }
    void displayCourseDetails(){
        System.out.println("----Course Details----");
        System.out.println("Course Name : "+ courseName);
        System.out.println("Course duration : "+ duration+"hrs");
    }
}
