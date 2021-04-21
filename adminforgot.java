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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class adminforgot extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l22,l5;
JPasswordField t2,t3,t5;
//JTextField t5;
JButton b1,b2,b5;
JTextField t1;
adminforgot()
{
                setSize(800,400);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                setResizable(false);
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               setTitle("Forgot Password");
               setVisible(true);
                Icon icon=new ImageIcon("D:\\prologos\\adminlogo2.png");
                 b2=new JButton(icon);
               b2.setBounds(20,20,100,100);
               l3=new JLabel("Admin");
               l3.setFont(new Font("arial",Font.BOLD,20));
               l3.setForeground(Color.BLACK);
               l3.setBackground(Color.BLACK);
               l3.setBounds(40,120,100,40);
               l1=new JLabel("Enter Id:");
               l1.setFont(new Font("arial",Font.BOLD,20));
               l1.setForeground(Color.BLACK);
               l1.setBackground(Color.BLACK);
               l1.setBounds(200,20,200,40);
               t1=new JTextField(20);
               t1.setFont(new Font("arial",Font.BOLD,15));
               t1.setBounds(400,20,170,30);
               l5=new JLabel("What is Your Favourite Name?");
               l5.setFont(new Font("arial",Font.BOLD,20));
               l5.setForeground(Color.BLACK);
               l5.setBackground(Color.BLACK);
               l5.setBounds(240,70,500,40);
               t5=new JPasswordField(20);
               t5.setFont(new Font("arial",Font.BOLD,15));
               t5.setBounds(290,130,170,30);
               b5=new JButton("Check");
               b5.setFont(new Font("arial",Font.BOLD,20));
               b5.setBounds(570,130,100,30);
               t1.setText(adminlogin.t1.getText());
               l2=new JLabel("New Password:");
               l2.setFont(new Font("arial",Font.BOLD,20));
               l2.setForeground(Color.BLACK);
               l2.setBackground(Color.BLACK);
               l2.setBounds(200,180,200,40);
               
               l22=new JLabel();
               l22.setFont(new Font("arial",Font.BOLD,10));
               l22.setForeground(Color.RED);
               l22.setBackground(Color.RED);
               l22.setBounds(580,170,300,100);
               t2=new JPasswordField(20);
               t2.setFont(new Font("arial",Font.BOLD,15));
               t2.setBounds(400,190,170,30);
               t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }});
        
               l4=new JLabel("Confirm Password:");
               l4.setFont(new Font("arial",Font.BOLD,20));
               l4.setForeground(Color.BLACK);
               l4.setBackground(Color.BLACK);
               l4.setBounds(200,240,200,40);
               t3=new JPasswordField(20);
               t3.setFont(new Font("arial",Font.BOLD,15));
               t3.setBounds(400,250,170,30);
                b1=new JButton("Change Password");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(250,300,250,40);
                add(l1);
                add(l2);
                add(b1);
                add(b2);
                add(t1);
                add(t2);
                add(l3);
                add(l4);
                add(t3);
                add(l22);
                add(l5);add(t5);add(b5);
                b1.setVisible(false);
                l2.setVisible(false);l22.setVisible(false);t2.setVisible(false);
                l4.setVisible(false);t3.setVisible(false);
                b5.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent btn5) {
//                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(btn5.getSource()==b5)
                        {
                            String text11,text22;
                            text11=t1.getText();
                        text22=t5.getText();
                        if(t1.getText().trim().isEmpty() ||t5.getText().trim().isEmpty())
                                        {
                         JOptionPane.showMessageDialog(null, "Enter Information","Failed",JOptionPane.WARNING_MESSAGE);
                                        }               
                        else{
                     try
                       {    
//                           Class.forName("oracle.jdbc.driver.OracleDriver");
//                           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pratik");
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql="select id,fav from admin where id=? and fav=?";
                           PreparedStatement pstmt=con.prepareStatement(sql);
                           pstmt.setString(1, text11);
                           pstmt.setString(2, text22);
                           ResultSet rs = pstmt.executeQuery();
                           int i=0;
                           System.out.println("1");
                          
                          if(rs.next())
                           {
                               String uid=rs.getString("id");
//                               String upass=rs.getString("fav");
                               System.out.println("2");
                               if(text11.equals(uid))
                               {
                                   System.out.println("33");
//                                   if(text22.equals(upass))
//                               {
                               System.out.println("22");
                               System.out.println("Success");
        JOptionPane.showMessageDialog(null, "Successfull!","Sucess",JOptionPane.INFORMATION_MESSAGE);
        i++;
         b1.setVisible(true);
                l2.setVisible(true);l22.setVisible(true);t2.setVisible(true);
                l4.setVisible(true);t3.setVisible(true);
        
//                           }else
//        {
//            System.out.println("Wrong answer X");
//            JOptionPane.showMessageDialog(null, "Wrong answer X","Failed",JOptionPane.ERROR_MESSAGE);
//        }
                           }
                           else
        {
            System.out.println("Invalid Id1");
            JOptionPane.showMessageDialog(null, "Invalid Id1","Error!",JOptionPane.ERROR_MESSAGE);
        }
                        }else
        {
            System.out.println("10101");
            JOptionPane.showMessageDialog(null, "Wrong answer X","Error!",JOptionPane.ERROR_MESSAGE);
        }
                          
                       }
                         
                     catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }
                    }
                        
                        
                        }
                    
                    }
                });
                b1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                        if(e.getSource()==b1)
                        {
                            
                        String text1,text2,text3;
                        text1=t1.getText();
                        text2=t2.getText();
                        text3=t3.getText();
//                        if(text2.equals(text3))
//                        {
                        if(t2.getText().trim().isEmpty()|| t3.getText().trim().isEmpty())
                                        {
                                            
                                   System.out.println("6");
                            JOptionPane.showMessageDialog(null, "Enter Information","Failed",JOptionPane.WARNING_MESSAGE);
                                        }
                        else
                        {
                        if(l22.getText()==null )
                        {
                            
                        
                            try
                       {    
//                           Class.forName("oracle.jdbc.driver.OracleDriver");
//                           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pratik");
                            Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql="select * from admin";
                           Statement st=con.createStatement();
                           ResultSet rs=st.executeQuery(sql);
                           
                           System.out.println("1");
                           while(rs.next())
                           {
                               String uid=rs.getString("id");
                               String upass=rs.getString("password");
                               System.out.println("2");
                               if(text1.equals(uid))
                               {
                                   System.out.println("3");
                                   if(text2.equals(text3))
                                   {
                                       String sql1="update admin set password=? where id =?";
                                       PreparedStatement st1=con.prepareStatement(sql1);
                                       st1.setString(1,text2);
                                       st1.setString(2, text1);
                                       st1.executeUpdate();
                                       JOptionPane.showMessageDialog(null, "Password Updated Successfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
                                       st1.close();
                                       System.out.println("4");
                                       t1.setText("");
                                       t2.setText("");
                                       t3.setText("");
                                       t5.setText("");
                                   
                                   }
                                    else
                                   {    
                            System.out.println("5");
                            JOptionPane.showMessageDialog(null, "New Password & Confirm Password Does Not Match","Failed",JOptionPane.ERROR_MESSAGE);
                                    }
                               }
//                                    else if(t1.getText().trim().isEmpty() ||t2.getText().trim().isEmpty())
//                                        {
//                                            
//                                   System.out.println("6");
//                            JOptionPane.showMessageDialog(null, "Enter Information","Failed",JOptionPane.WARNING_MESSAGE);
//                                        }
                                    else  
                                        {
                                         System.out.println("7");
                            JOptionPane.showMessageDialog(null, "Invalid Id","Failed",JOptionPane.ERROR_MESSAGE);
                                        }
                           }
                       }
                          
                       catch(SQLException ex)
                       {
                          ex.printStackTrace();
                       }    
                       catch (ClassNotFoundException ex)
                       {
                          Logger.getLogger(adminforgot.class.getName()).log(Level.SEVERE, null, ex);
                        }}
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Please fill the Proper Password","Failed",JOptionPane.ERROR_MESSAGE);
                        }
                       }}
  }
  } 
  );
}
  @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public static void main(String args[])
    {
        new adminforgot();
    }
    public void t2KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,15})";
               
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t2.getText());
        if(!match.matches() )
        {
           l22.setText("<html>Password must be 6-15 characters long<br>"
                   + "Contain at least 1 digit<br>"
                   + "Contain at least One Uppercase letter<br>"
                   + "Contain at least One lowercase letter<br>"
                   + "Contain at least on special character<br>"
                   + "from [ @ # $ % ! . ]. </html>");
        }
        else
        {
            l22.setText(null);
        }
    }
}
