/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class TestScoresDemo 
{
    public static void main(String[] args)
    {
        double[] testScores = {85, 92, 87, 68, 98};
                
        double total = 0;
        double average = 0;
        for(int i = 0; i < testScores.length; i++)
            total += testScores[i];
        average = total/testScores.length;
        
        try
        {    
            System.out.println(average);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
