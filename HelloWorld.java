/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandj
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class HelloWorld extends JFrame
{
    private JLabel messageLabel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton reset;
    private JPanel panel;
    private final int WINDOW_HEIGHT = 300;
    private final int WINDOW_WIDTH = 300;
    
    public HelloWorld()
    {

        setTitle("Test");
        setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        messageLabel = new JLabel("Select an option below to see a color:");
        
        button1 = new JButton("CLICK");
        button2 = new JButton("CLICK");
        button3 = new JButton("CLICK");
        reset = new JButton("RESET");
        
        button1.addActionListener(new ButtonOneListener());
        button2.addActionListener(new ButtonTwoListener());
        button3.addActionListener(new ButtonThreeListener());
        reset.addActionListener(new ResetButtonListener());
        
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(reset);
        
        
        add(panel);

        setVisible(true);
    }
    
    private class ButtonOneListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            panel.setBackground(Color.magenta);
            messageLabel.setForeground(Color.cyan);
        }
    }
    
    private class ButtonTwoListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            panel.setBackground(Color.cyan);
            messageLabel.setForeground(Color.yellow);
        }
    }
    
    private class ButtonThreeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            panel.setBackground(Color.green);
            messageLabel.setForeground(Color.white);
        }
    }
    
    private class ResetButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            panel.setBackground(Color.white);
            messageLabel.setForeground(Color.black);
        }
    }
        
    public static void main(String[] args)
    {
        new HelloWorld();
    }


}


