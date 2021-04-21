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
import javax.sql.*;
import java.sql.*;
public class adduser extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
public int z=0;
adduser()
{
    setSize(1366,768);
    setExtendedState(JFrame.MAXIMIZED_BOTH); 
                //setLocationRelativeTo(null);
                setLayout(new FlowLayout());
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo.jpg")));      
                setVisible(true);
                setResizable(false);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Icon icon1=new ImageIcon("D:\\prologos\\button.png");
                 b1=new JButton(icon1);
               b1.setBounds(30,30,80,80);
               l1=new JLabel("Click Me");
                l1.setFont(new Font("arial",Font.BOLD,15));
                l1.setForeground(Color.WHITE);
                l1.setBackground(Color.WHITE);
                l1.setBounds(40,110,300,40);
               Icon icon2=new ImageIcon("D:\\prologos\\userlogo2.png");
              b2=new JButton(icon2);
               b2.setBounds(190,30,80,80);
               l2=new JLabel("New Employee");
                l2.setFont(new Font("arial",Font.BOLD,15));
                l2.setForeground(Color.WHITE);
                l2.setBackground(Color.WHITE);
                l2.setBounds(175,110,200,40);
               Icon icon3=new ImageIcon("D:\\prologos\\buyer.png");
                 b3=new JButton(icon3);
               b3.setBounds(350,30,80,80);
               l3=new JLabel("<html>View Employee<br>Details</html>");
                l3.setFont(new Font("arial",Font.BOLD,15));
                l3.setForeground(Color.WHITE);
                l3.setBackground(Color.WHITE);
                l3.setBounds(340,120,200,40);
               Icon icon4=new ImageIcon("D:\\prologos\\update.png");
                 b4=new JButton(icon4);
               b4.setBounds(510,30,80,80);
               l4=new JLabel("<html>Edit Employee<br>Details</html>");
                l4.setFont(new Font("arial",Font.BOLD,15));
                l4.setForeground(Color.WHITE);
                l4.setBackground(Color.WHITE);
                l4.setBounds(505,120,200,40);
               Icon icon5=new ImageIcon("D:\\prologos\\delete.png");
                 b5=new JButton(icon5);
               b5.setBounds(670,30,80,80);
               l5=new JLabel("<html>Delete Employee</html>");
                l5.setFont(new Font("arial",Font.BOLD,15));
                l5.setForeground(Color.WHITE);
                l5.setBackground(Color.WHITE);
                l5.setBounds(650,110,200,40);
                 Icon icon8=new ImageIcon("D:\\prologos\\adminlogo2.png");
                 b8=new JButton(icon8);
               b8.setBounds(830,30,80,80);
               l8=new JLabel("<html>Logout</html>");
                l8.setFont(new Font("arial",Font.BOLD,15));
                l8.setForeground(Color.WHITE);
                l8.setBackground(Color.WHITE);
                l8.setBounds(845,110,200,40);
                Icon icon9=new ImageIcon("D:\\prologos\\new.png");
                l9=new JLabel(icon9);
                l9.setBounds(590, 20,150, 100);
                Icon icon=new ImageIcon("D:\\prologos\\backlogo.png");
               b9=new JButton(icon);
               b9.setBounds(1250,580,100,100);
               add(b1).setVisible(true);add(b9);
              add(b2);add(b3);add(b4);add(b5);add(b8);
              add(l1).setVisible(true);add(l2);add(l3);
             add(l4);add(l5);add(l8);
             
             b2.setVisible(false);b3.setVisible(false);b4.setVisible(false);b5.setVisible(false);
             l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);
             b8.setVisible(false);l8.setVisible(false);
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
                             public void actionPerformed(ActionEvent e) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             newuser nu=new newuser();
                             nu.setVisible(true);
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
                             public void actionPerformed(ActionEvent e) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             viewuser vu=new viewuser();
                             vu.setVisible(true);
                             
                             }
                         });}
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
                             public void actionPerformed(ActionEvent e) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             updateuser uu=new updateuser();
                            uu.setVisible(true);
                             
                             }
                         });
                         
                         }
                          catch(Exception d)
                     {
                         d.printStackTrace();
                     }
                         try{
                         Thread.sleep(50);
                         b5.setVisible(true);
                         l5.setVisible(true);
                         b5.addActionListener(new ActionListener() {

                             @Override
                             public void actionPerformed(ActionEvent e) {
                                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             
                             deleteuser du=new deleteuser();
                            du.setVisible(true);
                             
                             }
                         });}
                          catch(Exception d)
                     {
                         d.printStackTrace();
                     }
                         
                         try{
                         Thread.sleep(50);
                         b8.setVisible(true);
                         l8.setVisible(true);
                         b8.addActionListener(new ActionListener() {

                             @Override
                             public void actionPerformed(ActionEvent e) {
                                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             int a = JOptionPane.showConfirmDialog(null, "Are you sure?","Logout",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    login obj = new login();
                    obj.setVisible(true);}
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
                      b2.setVisible(false);b3.setVisible(false);b4.setVisible(false);b5.setVisible(false);
             l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);  
             b8.setVisible(false);l8.setVisible(false);        
             z=0;
                     }
                    
                    }
                });
              b9.addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent el) {
                     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 
                 
                 if(el.getSource()==b9)
                 {
                     adminsuccess l1=new adminsuccess();
                     l1.setVisible(true);
                     l1.setLocationRelativeTo(null);
                     dispose();
                 }
                 
                 
                 }
             });
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new adduser();
    }
    
}
