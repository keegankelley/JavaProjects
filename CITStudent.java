/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class CITStudent extends Student
{
    private String track;
    
    public CITStudent(String n, String id, String e, String t)
    {
        super(n, id, e);
        track = t;
    }
    
    
    public void setTrack(String t)
    {
        track = t;
    }
    
    public String getTrack()
    {
        return track;    
    }
    
    public void displayStudentName()
    {
        System.out.println("I am a CIT student");
    }
}
