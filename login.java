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

import java.awt.*;
import  javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Date;
public class login extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton b1,b2; 
  //  JPasswordField jp1;
   // JTextField t1,t2;
    
    
   JFrame f1;
    login()
    {           
       
                //f1=new JFrame();
               setSize(1368,768);
                setLocationRelativeTo(null);
               setLayout(new FlowLayout());
               setResizable(false);
               // setLayout(new BorderLayout());
               setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setExtendedState(JFrame.MAXIMIZED_BOTH); 
               setTitle("Login");
               l3=new JLabel("Express Electric");
                l3.setFont(new Font("arial",Font.BOLD,40));
                l3.setForeground(Color.BLUE);
//                l3.setBackground(Color.YELLOW);
                l3.setBounds(520,100,500,100);
                l4=new JLabel("Express Electric Private Ltd.");
                l4.setFont(new Font("arial",Font.BOLD,20));
                l4.setForeground(Color.BLACK);
                l4.setBackground(Color.BLACK);
                l4.setBounds(540,550,700,100);
                Icon icon3=new ImageIcon("D:\\prologos\\images2.png");
                l5=new JLabel(icon3);
                l5.setBounds(590, 20,150, 100);
                Icon icon=new ImageIcon("D:\\prologos\\adminlogo.png");
                b1=new JButton(icon);
               b1.setBounds(50,300,250,250);
               l1=new JLabel("Admin Login");
               l1.setFont(new Font("arial",Font.BOLD,30));
               l1.setForeground(Color.BLACK);
               l1.setBackground(Color.BLACK);
               l1.setBounds(85,450,250,250);
               Icon icon1=new ImageIcon("D:\\prologos\\userlogo.png");
               b2=new JButton(icon1);
               b2.setBounds(1050,300,250,250);
               l2=new JLabel("Employee Login");
                l2.setFont(new Font("arial",Font.BOLD,30));
                l2.setForeground(Color.BLACK);
                l2.setBackground(Color.BLACK);
                l2.setBounds(1060,450,250,250);
                
                
                
                l6=new JLabel();
               l6.setFont(new Font("arial",Font.BOLD,15));
               l6.setForeground(Color.BLACK);
               l6.setBackground(Color.BLACK);
               l6.setBounds(1250,10,250,50);
               
               
               l7=new JLabel();
               l7.setFont(new Font("arial",Font.BOLD,15));
               l7.setForeground(Color.BLACK);
               l7.setBackground(Color.BLACK);
               l7.setBounds(1250,40,250,50);
               
               
               
               Icon icon8=new ImageIcon("D:\\prologos\\company7.png");
                l8=new JLabel(icon8);
                l8.setBounds(375, 200,600, 395);
                
                l9=new JLabel("<html>Enquiry for Technical Issue:<br/> Techware Solutions, Churchgate (E),Mumbai- 400020 <br/>Contact No: 7066685342 <br/>E-mail: support@techwaresolutions.com</html>");
                l9.setFont(new Font("arial",Font.BOLD,15));
                l9.setForeground(Color.BLACK);
                l9.setBackground(Color.BLACK);
                l9.setBounds(10,645,400,100);
                
                
                
                
                 
                
                
                
                
               SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
                Date date=new Date();
                l6.setText(dformat.format(date));
//                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:MM:SS");
//                LocalDateTime now=LocalDateTime.now();
//                l19.setText(dtf.format(now));

                SimpleDateFormat dformat1=new SimpleDateFormat("hh:mm:ss a");
                l7.setText(dformat1.format(date));
               
               b1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   adminlogin admin=new adminlogin();
                   admin.setVisible(true);
                   dispose();
                    }
               });
               b2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                   userlogin user=new userlogin();
                  user.setVisible(true);
                  dispose();
                    }
               });
                 add(l1);
                add(b1);
                add(l2);
                add(b2);
                add(l3);
                add(l4);
                add(l5);
                add(l6);
                add(l7);
                add(l8);
                add(l9);
               
                setVisible(true);
                
                
                
                
                
                
    }
   
   @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }
    
       

    
    
    
    
    public static void main(String args[])
    {
        new login();
    }

}
