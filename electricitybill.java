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

public class electricitybill extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;

JButton b1,b2,b3,b4,b9;

public int z=0;
electricitybill()
{
                setSize(1368,768);setExtendedState(JFrame.MAXIMIZED_BOTH); 
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo.jpg")));      
                setVisible(true);
                
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
               
                
                 Icon icon1=new ImageIcon("D:\\prologos\\button.png");
                 b1=new JButton(icon1);
               b1.setBounds(30,30,80,80);
               l1=new JLabel("Click Me");
                l1.setFont(new Font("arial",Font.BOLD,15));
                l1.setForeground(Color.WHITE);
                l1.setBackground(Color.WHITE);
                l1.setBounds(40,110,300,40);
               Icon icon2=new ImageIcon("D:\\prologos\\billgeneration1.png");
              b2=new JButton(icon2);
               b2.setBounds(190,30,80,80);
               l2=new JLabel("Generate Bill");
                l2.setFont(new Font("arial",Font.BOLD,15));
                l2.setForeground(Color.WHITE);
                l2.setBackground(Color.WHITE);
                l2.setBounds(180,110,200,40);
               Icon icon3=new ImageIcon("D:\\prologos\\billpay1.png");
                 b3=new JButton(icon3);
               b3.setBounds(350,30,80,80);
               l3=new JLabel("Pay Bill");
                l3.setFont(new Font("arial",Font.BOLD,15));
                l3.setForeground(Color.WHITE);
                l3.setBackground(Color.WHITE);
                l3.setBounds(365,110,200,40);
                
                Icon icon4=new ImageIcon("D:\\prologos\\status2.png");
                 b4=new JButton(icon4);
               b4.setBounds(510,30,80,80);
               l4=new JLabel("Check Bill Payment");
                l4.setFont(new Font("arial",Font.BOLD,15));
                l4.setForeground(Color.WHITE);
                l4.setBackground(Color.WHITE);
                l4.setBounds(490,110,200,40);
                Icon icon=new ImageIcon("D:\\prologos\\backlogo.png");
                 b9=new JButton(icon);
               b9.setBounds(1250,590,100,100);
               add(b9);
                add(l1);add(l2);add(l3);add(b1);add(b2);add(b3); l2.setVisible(false);l3.setVisible(false);
                 b2.setVisible(false);b3.setVisible(false);
                 add(b4);add(l4);
                 b4.setVisible(false);l4.setVisible(false);
                 
                 
                 b1.addActionListener(new ActionListener() {
             
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   if(z==0)
                     {
                         try
                     {
                         Thread.sleep(50);
                         b2.setVisible(true);
                         l2.setVisible(true);
                         b2.addActionListener(new ActionListener() {

                             @Override
                             public void actionPerformed(ActionEvent btn2) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            
                     
                         generatebill gb=new generatebill ();
                         gb.setVisible(true);
                     
                             
                             
                             }
                         });
                     }
                         catch(Exception d)
                     {
                         d.printStackTrace();
                     }
                       
                         try
                         {
                         Thread.sleep(50);
                         b3.setVisible(true);
                         l3.setVisible(true);
                         b3.addActionListener(new ActionListener() {

                             @Override
                             public void actionPerformed(ActionEvent btn3) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                           
                             paybill pb=new paybill();
                             pb.setVisible(true);
                                   
                             
                             }
                         });
//                        z=1;
                         }
                          catch(Exception d)
                     {
                         d.printStackTrace();
                     }
                          try{
                         Thread.sleep(50);
                         b4.setVisible(true);
                         l4.setVisible(true);
                         b4.addActionListener(new ActionListener() {

                             @Override
                             public void actionPerformed(ActionEvent btn4) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            
                         billpayementstatus bps=new billpayementstatus();
                         bps.setVisible(true);
                             
                             }
                         });
                          z=1;
                     }
                           catch(Exception d)
                     {
                         d.printStackTrace();
                     }
                     }
                   else
                     {
                      b2.setVisible(false);b3.setVisible(false);l2.setVisible(false);l3.setVisible(false);
                      l4.setVisible(false);b4.setVisible(false);
                      z=0;
                     }
                    }});
                 
                  b9.addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent el) {
                     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 
                 
                 if(el.getSource()==b9)
                 {
                     usersuccess l1=new usersuccess();
                     l1.setVisible(true);
                     l1.setLocationRelativeTo(null);
                     dispose();
                 }
                 
                 
                 }
             });
}
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new electricitybill();
    }
    
}
