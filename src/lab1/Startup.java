/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author Justin
 */
public class Startup {
    public static void main(String[] args) {
        
        ProgrammingCourses intro1 = new  IntroToProgrammingCourse();
        intro1.setCourseName("Intro to Programming");
        intro1.setCourseNumber("152-135");
        intro1.setCredits(3);
        System.out.println("Course name: " + intro1.getCourseName());
        System.out.println("Course Number: " + intro1.getCourseNumber());
        System.out.println("This course is " + intro1.getCredits() + " credits");
        System.out.println(" ");
        
        IntroJavaCourse javaIntro1 = new  IntroJavaCourse();
        javaIntro1.setCourseName("Intro to Java");
        javaIntro1.setCourseNumber("152-158");
        javaIntro1.setCredits(4);
        javaIntro1.setPrerequisites("Intro to Programming");
        System.out.println("Course name: " + javaIntro1.getCourseName());
        System.out.println("Course Number: " + javaIntro1.getCourseNumber());
        System.out.println("This course is " + javaIntro1.getCredits() +
                " credits");
        System.out.println("This course needs a prerequisite of " + 
                javaIntro1.getPrerequisites());
        System.out.println(" ");
        
        IntroJavaCourse advancedJava1 = new  AdvancedJavaCourse();
        advancedJava1.setCourseName("Advanced Java");
        advancedJava1.setCourseNumber("152-147");
        advancedJava1.setCredits(4);
        advancedJava1.setPrerequisites("Intro to Java");
        System.out.println("Course name: " + advancedJava1.getCourseName());
        System.out.println("Course Number: " + advancedJava1.getCourseNumber());
        System.out.println("This course is " + advancedJava1.getCredits() + 
                " credits");
        System.out.println("This course needs a prerequisite of " + 
                advancedJava1.getPrerequisites());
    }
}
