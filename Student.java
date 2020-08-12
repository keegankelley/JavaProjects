/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class Student
{
    private String name;
    private String stuID;
    private String email;
    private static String schoolID = "School ID: GCTC";
       
    //constructor initializes all of the values of all attributes in the argument
    //gives each attribute a default value
    public Student(String n, String id, String e)
    {
        name = n;
        stuID = id;
        email = e;
    }
    
    public static void displaySchoolID()
    {
        System.out.println(schoolID);
    }
        
    public String getStudentName()
    {
        return name;
    }
    
    public void setStudentName(String n)
    {
        name = n;
    }
    
    public String getStudentEmail()
    {
        return email;
    }
    
    public void setStudentEmail(String e)
    {
        email = e;
    }
    
    public String getStudentID()
    {
        return stuID;
    }
    
    public void setStudentID(String id)
    {
        stuID = id;
    }
    
    public void setSchoolID(String sid)
    {
        schoolID = sid;
    }
    
    public String getSchoolID()
    {
        return schoolID;
    }
    
    public void displayStudentName()
    {
        System.out.println("I am a student");
    }
    
}
    
