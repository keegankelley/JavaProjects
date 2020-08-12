/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class TestScores 
{
    private double [] scores;
    
    public TestScores(double[] s) throws IllegalArgumentException
    {
        for(int i = 0; i < s.length; i++)
        {
            if(s[i]<0 || s[i] > 100)
                throw new IllegalArgumentException("Element: " + i + " Score " +
                        s[i] + " is illegal");
            else
                scores[i] = s[i];
        }
     
    }
}
