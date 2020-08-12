/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TMPGCalculator extends JFrame implements ActionListener
{
    private JPanel panel;
    private JTextField gallon;
    private JTextField milesInput;
    private JButton calcButton;
    
    public TMPGCalculator()
    {
        setTitle("Miles Per Gallon Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel message1 = new JLabel("Total number of gallons /");
        JLabel message2 = new JLabel("Number of miles driven");
        gallon = new JTextField(10);
        milesInput = new JTextField(10);
        calcButton = new JButton("Calculate MPG");
        
        panel = new JPanel();
        panel.add(message1);
        panel.add(message2);
        panel.add(milesInput);
        panel.add(gallon);
        panel.add(calcButton);
        
        add(panel);
        setSize(400,150);
        setVisible(true);
        
        calcButton.addActionListener(this);
    }
        
        public void actionPerformed(ActionEvent e)
        {
            double gallons = Double.parseDouble(gallon.getText());
            double miles = Double.parseDouble(milesInput.getText());
            double mpg = miles/gallons;
            JOptionPane.showMessageDialog(rootPane, mpg);
            
        }    
    
    public static void main(String[] args)
    {
        new TMPGCalculator();
    }
}
