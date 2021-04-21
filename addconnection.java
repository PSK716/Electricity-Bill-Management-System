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
import java.awt.event.ComponentEvent;
public class addconnection extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
public int z=0;
addconnection()
{
                setSize(1366,768);
                //setLocationRelativeTo(null);
                
                setExtendedState(JFrame.MAXIMIZED_BOTH); 
                setLayout(new FlowLayout());
               // setLayout(new BorderLayout());
                setResizable(false);
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
               Icon icon2=new ImageIcon("D:\\prologos\\new.png");
              b2=new JButton(icon2);
               b2.setBounds(190,30,80,80);
               l2=new JLabel("New Connection");
                l2.setFont(new Font("arial",Font.BOLD,15));
                l2.setForeground(Color.WHITE);
                l2.setBackground(Color.WHITE);
                l2.setBounds(170,110,200,40);
               Icon icon3=new ImageIcon("D:\\prologos\\buyer.png");
                 b3=new JButton(icon3);
               b3.setBounds(350,30,80,80);
               l3=new JLabel("<html>View Customer<br>Details</html>");
                l3.setFont(new Font("arial",Font.BOLD,15));
                l3.setForeground(Color.WHITE);
                l3.setBackground(Color.WHITE);
                l3.setBounds(340,120,200,40);
               Icon icon4=new ImageIcon("D:\\prologos\\update.png");
                 b4=new JButton(icon4);
               b4.setBounds(510,30,80,80);
               l4=new JLabel("<html>Update Customer<br>Details</html>");
                l4.setFont(new Font("arial",Font.BOLD,15));
                l4.setForeground(Color.WHITE);
                l4.setBackground(Color.WHITE);
                l4.setBounds(490,120,200,40);
               Icon icon5=new ImageIcon("D:\\prologos\\delete.png");
                 b5=new JButton(icon5);
               b5.setBounds(670,30,80,80);
               l5=new JLabel("<html>Remove Connection</html>");
                l5.setFont(new Font("arial",Font.BOLD,15));
                l5.setForeground(Color.WHITE);
                l5.setBackground(Color.WHITE);
                l5.setBounds(640,110,200,40);
               Icon icon6=new ImageIcon("D:\\prologos\\billrates.png");
                 b6=new JButton(icon6);
               b6.setBounds(830,30,80,80);
               l6=new JLabel("<html>View Bill Rates</html>");
                l6.setFont(new Font("arial",Font.BOLD,15));
                l6.setForeground(Color.WHITE);
                l6.setBackground(Color.WHITE);
                l6.setBounds(820,110,200,40);
               Icon icon7=new ImageIcon("D:\\prologos\\calculator.png");
                 b7=new JButton(icon7);
               b7.setBounds(990,30,80,80);
               l7=new JLabel("<html>Bill Calculator</html>");
                l7.setFont(new Font("arial",Font.BOLD,15));
                l7.setForeground(Color.WHITE);
                l7.setBackground(Color.WHITE);
                l7.setBounds(980,110,200,40);
                 Icon icon8=new ImageIcon("D:\\prologos\\userlogo2.png");
                 b8=new JButton(icon8);
               b8.setBounds(1150,30,80,80);
               l8=new JLabel("<html>Logout</html>");
                l8.setFont(new Font("arial",Font.BOLD,15));
                l8.setForeground(Color.WHITE);
                l8.setBackground(Color.WHITE);
                l8.setBounds(1165,110,200,40);
                 Icon icon=new ImageIcon("D:\\prologos\\backlogo.png");
               b9=new JButton(icon);
               b9.setBounds(1250,590,100,100);
               add(b9);
               add(b1).setVisible(true);
              add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);
              add(l1).setVisible(true);add(l2);add(l3);
             add(l4);add(l5);add(l6);add(l7);add(l8);
             
             b2.setVisible(false);b3.setVisible(false);b4.setVisible(false);b5.setVisible(false);b6.setVisible(false);b7.setVisible(false);
             l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);l6.setVisible(false);l7.setVisible(false);
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
                             public void actionPerformed(ActionEvent btn2) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            
                     
                         newcustomer nc=new newcustomer();
                         nc.setVisible(true);
                     
                             
                             
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
                           
                             viewcustomer vc=new viewcustomer();
                             vc.setVisible(true);
                                   
                             
                             }
                         });
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
                             
                             updatecustomer uc=new updatecustomer();
                             uc.setVisible(true);
                             
                             
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
                             public void actionPerformed(ActionEvent btn5) {
                                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             deletecustomer dc=new deletecustomer();
                             dc.setVisible(true);
                             
                             }
                         });}
                          catch(Exception d)
                     {
                         d.printStackTrace();
                     }
                         try{
                         Thread.sleep(50);
                         b6.setVisible(true);
                         l6.setVisible(true);
                         b6.addActionListener(new ActionListener() {

                             @Override
                             public void actionPerformed(ActionEvent btn6) {
                                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            
                         billratesemp be=new billratesemp();
                         be.setVisible(true);
                             
                             }
                         });
                         
                         
                         }
                          catch(Exception d)
                     {
                         d.printStackTrace();
                     }
                         try{
                         Thread.sleep(50);
                         b7.setVisible(true);
                         l7.setVisible(true);
                         b7.addActionListener(new ActionListener() {

                             @Override
                             public void actionPerformed(ActionEvent e) {
//                                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                             billcalculator bc=new billcalculator();
                             bc.setVisible(true);
                             
                             }
                         });
                         
                         
                     }
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
                             public void actionPerformed(ActionEvent btn8) {
                                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            
                             int a = JOptionPane.showConfirmDialog(null, "Are you sure?","Logout",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                    dispose();
                    login obj = new login();
                    obj.setVisible(true);
                                                   }
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
                      b2.setVisible(false);b3.setVisible(false);b4.setVisible(false);b5.setVisible(false);b6.setVisible(false);b7.setVisible(false);
             l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);l6.setVisible(false);l7.setVisible(false);   
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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new addconnection();
    }
}
