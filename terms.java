/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.start;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class terms extends JFrame implements ActionListener{
    JLabel l1,l2;
    terms(){
                setSize(400,550);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
               setResizable(false);
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Terms & Conditions");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l1=new JLabel("Terms & Conditions");
                l1.setFont(new Font("TimesRoman",Font.BOLD,25));
                l1.setForeground(Color.BLACK);
                l1.setBounds(70,10,300,50);
                l2=new JLabel("<html>I  hereby declare that,<br>I will abide by the provisions of Electricity Act 2003 and "
                        + "Maharashtra Electricity<br>Regulatory Commision(Electricity Supply Code and other conditions of Supply)"
                        + "Regulation 2005.I will further abide by rules & regulations issued by regulatory bodies & Express Electric from time to time..."
                        + "I will pay the electricity bill as per prevailing Express Electric Tariff.If the premises is declared unauthorized then at the time of "
                        + "vacation of competent authority,Express Electric will have liberty to remove the electric connection immediately.<br><br>"
                        + "The above information is true and if any false information is observed, I/we will be responsible for the consequenece thereof");
                l2.setFont(new Font("TimesRoman",Font.BOLD,15));
                l2.setForeground(Color.BLACK);
                l2.setBounds(40,20,300,500);
                add(l1);add(l2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new terms();
    }
}
