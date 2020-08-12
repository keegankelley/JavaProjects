/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class StudentDemo 
{
    public static void main(String args[])
    {
        Student Keegan = new Student("Keegan Kelley", "123456789", "kkelley0062@kctcs.edu");
        CITStudent citKeegan = new CITStudent("Keegan Kelley", "123456789", "kkelley0062@kctcs.edu", "Programming");
        
        Student.displaySchoolID();
        
        System.out.println("");
        
        System.out.println("Name: " + citKeegan.getStudentName());
        System.out.println("ID: " + citKeegan.getStudentID());
        System.out.println("Email: " + citKeegan.getStudentEmail());
        System.out.println("Track: " + citKeegan.getTrack());
        
        /*
        System.out.println("");
        
        System.out.println("Name: " + Keegan.getStudentName());
        System.out.println("ID: " + Keegan.getStudentID());
        System.out.println("Email: " + Keegan.getStudentEmail());
        System.out.println("");
        */
        
        Keegan.displayStudentName();
        
    }
    
}
