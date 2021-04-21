/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.start;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;

/**
 *
 * @author User
 */
public class adminlogin extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
   static JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;
    JPanel p1,p2,p3,p4;
    adminlogin()
    {
         setSize(1000,600);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                setResizable(false);
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));
//                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Icon icon=new ImageIcon("D:\\prologos\\adminlogo.png");
               b3=new JButton(icon);
               b3.setBounds(50,150,250,250);
               Icon icon1=new ImageIcon("D:\\prologos\\backlogo.png");
               b4=new JButton(icon1);
               b4.setBounds(850,450,100,100);
               l3=new JLabel("Admin Login");
                l3.setFont(new Font("arial",Font.BOLD,30));
                l3.setForeground(Color.BLACK);
                l3.setBackground(Color.BLACK);
                l3.setBounds(80,300,250,250);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               setTitle("Admin Login");
            l1=new JLabel("Enter ID:");
                l1.setFont(new Font("arial",Font.BOLD,25));
                l1.setForeground(Color.BLACK);
                l1.setBounds(400,200,200,40);
                t1=new JTextField(20);
                t1.setFont(new Font("arial",Font.BOLD,20));
                t1.setBounds(600,200,150,40);
                l2=new JLabel("Enter Password:");
                l2.setFont(new Font("arial",Font.BOLD,25));
                l2.setForeground(Color.BLACK);
                l2.setBounds(400,300,200,40);
                t2=new JPasswordField(20);
                t2.setFont(new Font("arial",Font.BOLD,18));
                t2.setBounds(600,300,150,40);
                
                b1=new JButton("Login");
                b1.setFont(new Font("arial",Font.BOLD,25));
                b1.setBounds(400,430,200,50);
                b2=new JButton("Forgot Password ?");
                b2.setFont(new Font("arial",Font.BOLD,12));
                b2.setBounds(770,310,150,20);
                
//                p1=new JPanel();
//               p1.setBackground(Color.black);
//               p1.setBounds(350, 150,2, 250);
//                p2=new JPanel();
//               p2.setBackground(Color.black);
//               p2.setBounds(350, 150,600, 2);
////                
//                p3=new JPanel();
//               p3.setBackground(Color.black);
//               p3.setBounds(950, 150,2, 250);
//                p4=new JPanel();
//               p4.setBackground(Color.black);
//               p4.setBounds(350, 400,602, 2);
//               add(p3);add(p4);
//                add(p1);
//                add(p2);
                add(l1);
                add(t1);
                add(l2);
                add(t2);
                add(b1);
                add(b2);              
               add(b3);
               add(l3);
               add(b4);
                b1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(e.getSource()==b1)
                 {
                     String text1=t1.getText();
                     String text2=t2.getText();
                      if(t1.getText().trim().isEmpty() ||t2.getText().trim().isEmpty())
                      {
                          JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.ERROR_MESSAGE);
                      }
                      else
                      {
                    try
                       {    
//                           Class.forName("oracle.jdbc.driver.OracleDriver");
//                           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","pratik");
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql="select id,password from admin where id=? and password=?";
                           PreparedStatement pstmt=con.prepareStatement(sql);
                           pstmt.setString(1, text1);
                           pstmt.setString(2, text2);
                           ResultSet rs = pstmt.executeQuery();
                           int i=0;
                           if(rs.next())
                           {
                               
                               System.out.println("Success");
        JOptionPane.showMessageDialog(null, "Login Successfull","Success",JOptionPane.INFORMATION_MESSAGE);
        i++;
        adminsuccess as= new adminsuccess();
        as.setVisible(true);
        dispose();
                           }
                           else 
        {
            System.out.println("Failed");
            JOptionPane.showMessageDialog(null, "Login Failed!","Failed",JOptionPane.ERROR_MESSAGE);
        }              rs.close();
                       pstmt.close();
                       con.close();}
                         
                     catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }
     
         }}
        }       
        });     
                
               
                b2.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent em) {
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             
             if(em.getSource()==b2)
             {
                 adminforgot forget=new adminforgot();
                 forget.setVisible(true);
                 forget.setLocationRelativeTo(null);
               
             }
 
             }
         });
                    b4.addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent el) {
                     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 
                 
                 if(el.getSource()==b4)
                 {
                     login l1=new login();
                     l1.setVisible(true);
                     l1.setLocationRelativeTo(null);
                     dispose();
                 }
                 
                 
                 }
             });
             
             setVisible(true);
                    
                    
                    
                    }
                

public static void main(String args[])
{
new adminlogin();
}

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}