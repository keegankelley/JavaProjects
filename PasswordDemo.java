/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class PasswordDemo 
{
    public static void main(String [] args)
    {
        String myPW = "88Kkel1ey";
        
        if(PasswordVerifier.isValidPassword(myPW))
            System.out.println("This password is good");
        else
            System.out.println("This password does not meet requirements");
    }
}
