/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class PasswordVerifier 
{
    private static final int MIN_PW_LENGTH = 8;
    
    public static boolean isValidPassword(String str)
    {
        boolean status = false;
        
        if( (str.length() >= MIN_PW_LENGTH) && hasUpperCase(str) && hasDigit(str) && hasLowerCase(str))
        {
            status = true;
        }
        
        return status;
    }
    
    public static boolean hasUpperCase(String str)
    {
        boolean status = false;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                status = true;
        }
        
        return status;
        
    }
    
    private static boolean hasDigit(String str)
    {
        boolean status = false;

        
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isDigit(str.charAt(i)))
                status = true;
        }
        
        return status;
    }
    
    private static boolean hasLowerCase(String str)
    {
        boolean status= false;
        
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
                status = true;
        }
        return status;
    }
}
