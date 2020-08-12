/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KeeganKelley
 */
public class SumOfNumbers 
{
    public static void main(String args[])
    {
        System.out.println("The sum of the numbers up to 50 is " + sum(50));
        sum(50);
    }
    
    public static int sum(int max)
    {
        if(max > 0)
            return max + sum(max - 1);
        else
            return 0;
    }
}
