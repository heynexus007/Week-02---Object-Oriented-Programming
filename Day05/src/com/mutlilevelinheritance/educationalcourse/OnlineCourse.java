package com.mutlilevelinheritance.educationalcourse;

// Intermediate subclass 'OnlineCourse' inherits Course
public class OnlineCourse extends Course {
    String platform, isRecorded;
    OnlineCourse (String courseName , int duration, String platform, String isRecorded){
        super(courseName,duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    void displayCourseDetails(){
        super.displayCourseDetails();
        System.out.println("Platform : "+ platform);
        System.out.println("Is Recorded? : "+isRecorded);
    }
}
// s
