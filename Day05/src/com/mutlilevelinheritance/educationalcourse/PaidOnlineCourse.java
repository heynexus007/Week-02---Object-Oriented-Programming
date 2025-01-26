package com.mutlilevelinheritance.educationalcourse;

// subclass 'PaidOnlineCourse' inherits OnlineClass
public class PaidOnlineCourse  extends OnlineCourse {
    int fee ,discount;
    PaidOnlineCourse(String courseName , int duration, String platform, String isRecorded,int fee, int discount){
        super(courseName,duration,platform,isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
    void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Course fee : "+ fee+ "rs");
        System.out.println("Discount fee : "+ discount +"%");
    }
}
