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
import java.text.SimpleDateFormat;
public class usersuccess extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l10,l8,l9,l11;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5;
usersuccess()
{
                setSize(1368,768);
                //setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                
                setExtendedState(JFrame.MAXIMIZED_BOTH); 
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setResizable(false);
               setTitle("Elecricity Bill Management");
               Icon icon=new ImageIcon("D:\\prologos\\userlogo2.png");
               b1=new JButton(icon);
               b1.setBounds(1120,20,100,100);
               l1=new JLabel("Employee");
               l1.setFont(new Font("arial",Font.BOLD,20));
               l1.setForeground(Color.BLACK);
               l1.setBackground(Color.BLACK);
               l1.setBounds(1125,120,100,40);
//               b2=new JButton("Logout");
//               b2.setBounds(1250,40,100,40);
               Icon icon101=new ImageIcon("D:\\prologos\\logout1.png");
               b2=new JButton(icon101);
               b2.setBounds(1320,20,30,30);
               l2=new JLabel("Express Electric");
                l2.setFont(new Font("arial",Font.BOLD,40));
                l2.setForeground(Color.BLUE);
//                l2.setBackground(Color.RED);
                l2.setBounds(520,100,500,100);
                 l3=new JLabel("Express Electric Private Ltd.");
                l3.setFont(new Font("arial",Font.BOLD,20));
                l3.setForeground(Color.BLACK);
                l3.setBackground(Color.BLACK);
                l3.setBounds(540,150,700,100);
                Icon icon1=new ImageIcon("D:\\prologos\\images2.png");
                l4=new JLabel(icon1);
                l4.setBounds(590, 20,150, 100);
                 Icon icon2=new ImageIcon("D:\\prologos\\addremove.png");
                 b3=new JButton(icon2);
               b3.setBounds(50,350,270,220);
               b3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent btn3) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    addconnection ac=new addconnection();
                    ac.setVisible(true);
                    //ac.setLocationReleative(null);
                    dispose();
                    }
                });
               Icon icon3=new ImageIcon("D:\\prologos\\billpay.png");
               l5=new JLabel("Consumer Connection");
                l5.setFont(new Font("arial",Font.BOLD,20));
                l5.setForeground(Color.BLACK);
                l5.setBackground(Color.BLACK);
                l5.setBounds(70,580,300,40);
                 b4=new JButton(icon3);
               b4.setBounds(550,350,270,220);
               b4.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent btn4) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    electricitybill eb =new electricitybill();
                    eb.setVisible(true);
                    dispose();
                    }
                });
               l6=new JLabel("Electricity Bill");
                l6.setFont(new Font("arial",Font.BOLD,20));
                l6.setForeground(Color.BLACK);
                l6.setBackground(Color.BLACK);
                l6.setBounds(610,580,300,40);
               Icon icon4=new ImageIcon("D:\\prologos\\complaints.png");
                 b5=new JButton(icon4);
               b5.setBounds(1050,350,270,220);
               b5.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent btn5) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        complaints cp=new complaints();
                        cp.setVisible(true);
                        dispose();
                    }
                });
               l7=new JLabel("Consumer Complaints");
                l7.setFont(new Font("arial",Font.BOLD,20));
                l7.setForeground(Color.BLACK);
                l7.setBackground(Color.BLACK);
                l7.setBounds(1085,580,300,40);
                
                Icon icon10=new ImageIcon("D:\\prologos\\gogreen2.png");
                l10=new JLabel(icon10);
                l10.setBounds(10, 10,150, 90);
                
                
                l8=new JLabel("Id:");
                l8.setFont(new Font("arial",Font.BOLD,16));
                l8.setForeground(Color.BLACK);
                l8.setBackground(Color.BLACK);
                l8.setBounds(1240,40,100,50);
                
                
                l9=new JLabel();
                l9.setFont(new Font("arial",Font.BOLD,14));
                l9.setForeground(Color.BLACK);
                l9.setBackground(Color.BLACK);
                l9.setBounds(1265,40,100,50);
                l9.setText(userlogin.t1.getText());
                
                
                
                l11=new JLabel();
                l11.setFont(new Font("arial",Font.BOLD,14));
                l11.setForeground(Color.BLACK);
                l11.setBackground(Color.BLACK);
                l11.setBounds(1240,70,100,50);
                
                
                
                SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
                java.util.Date date=new java.util.Date();
                l11.setText(dformat.format(date));
                
                
                add(l8);add(l9);add(l11);
                
                add(l10);
               add(b1);
               add(l1);
               add(b2);
               add(l2);
               add(l3);
               add(l4);
               add(b3);
               add(b4);
               add(b5);
               add(l5);
               add(l6);
               add(l7);
               b2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
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
               
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new usersuccess();
    }
    
}
