/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
public class ShiftSupervisor extends Employee
{
    
    private double salary;
    private double bonus;
    
    public void setSalary(double s)
    {
        salary = s;
    }
    
    public double getSalary()
    {
        return salary;
    }
            
    public ShiftSupervisor(String n, String num, String date, double s, double b)
    {
        super(n, num, date);
        salary = s;
        bonus = b;
    }
            
    public void setBonus(double b)
    {
        bonus = b;
    }
    
    public double getBonus()
    {
        return bonus;
    }
    
    @Override
    
    public String toString()
    {
        super.toString();
        
        String str;
        str = "Supervisor's Salary: " + salary + "\nBonus:" + bonus;
        
        return str;
    }
}
