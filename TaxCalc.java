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
import javax.swing.event.*;

public class TaxCalc extends JFrame
{
    private JTextField purchase;
    private JTextField tax;
    private JSlider slider;
    private JPanel dataPanel;
    private JPanel sliderPanel;
    private JPanel taxPanel;
    
    public TaxCalc()
    {
        setTitle("Tax Calculator");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildDataPanel();
        
        buildSliderPanel();
        
        buildTaxPanel();
        
        add(dataPanel, BorderLayout.NORTH);
        add(sliderPanel, BorderLayout.CENTER);
        add(taxPanel, BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private void buildDataPanel()
    {
        JLabel msg = new JLabel("Enter the amount of the purchase:");
        
        purchase = new JTextField(10);
        
        dataPanel = new JPanel();
        dataPanel.add(msg);
        dataPanel.add(purchase);
    }
    
    private void buildSliderPanel()
    {
        JLabel sliderMsg = new JLabel("Sales Tax Slider:");
        
        slider = new JSlider(JSlider.HORIZONTAL, 0,10,0);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        slider.addChangeListener(new SliderListener());
        
        sliderPanel = new JPanel();
        sliderPanel.add(sliderMsg);
        sliderPanel.add(slider);
    }
    
    private void buildTaxPanel()
    {
        JLabel taxMsg = new JLabel("Sales Tax:");
        
        tax = new JTextField(10);
        tax.setEditable(false);
        tax.setText("0.00");
        
        taxPanel = new JPanel();
        taxPanel.add(taxMsg);
        taxPanel.add(tax);
    }
    
    private class SliderListener implements ChangeListener
    {
        public void stateChanged(ChangeEvent e)
        {
            double taxRate;
            double salesTax;
            
            if(purchase.getText().length() == 0)
                JOptionPane.showMessageDialog(null, "Enter the purchase amount:");
            else
            {
                taxRate = slider.getValue() / 100.0;
                
                salesTax = Double.parseDouble(purchase.getText())* taxRate;
                
                tax.setText(String.format("%,.2f", salesTax));
            }
        }
    }
    
    public static void main(String[] args)
    {
        new TaxCalc();
    }
}
