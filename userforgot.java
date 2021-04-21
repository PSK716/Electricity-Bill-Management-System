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
import static java.time.Clock.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class userforgot extends JFrame implements ActionListener {
JLabel l1,l2,l3,l4,l22,l5,l15;
JPasswordField t2,t3;

JButton b1,b2,b3;
JTextField t1,t5;
userforgot()
{
                setSize(800,400);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               setTitle("Forgot Password");
               setVisible(true);
               setResizable(false);
                Icon icon=new ImageIcon("D:\\prologos\\userlogo2.png");
                 b2=new JButton(icon);
               b2.setBounds(20,20,100,100);
               l3=new JLabel("Employee");
               l3.setFont(new Font("arial",Font.BOLD,20));
               l3.setForeground(Color.BLACK);
               l3.setBackground(Color.BLACK);
               l3.setBounds(25,120,100,40);
               l1=new JLabel("Enter Id:");
               l1.setFont(new Font("arial",Font.BOLD,20));
               l1.setForeground(Color.BLACK);
               l1.setBackground(Color.BLACK);
               l1.setBounds(210,20,200,40);
               t1=new JTextField(20);
               t1.setFont(new Font("arial",Font.BOLD,15));
               t1.setBounds(400,20,170,30);
               t1.setText(userlogin.t1.getText());
               l2=new JLabel("New Password:");
               l2.setFont(new Font("arial",Font.BOLD,20));
               l2.setForeground(Color.BLACK);
               l2.setBackground(Color.BLACK);
               l2.setBounds(210,200,200,40);
               l22=new JLabel();
               l22.setFont(new Font("arial",Font.BOLD,10));
               l22.setForeground(Color.RED);
               l22.setBackground(Color.RED);
               l22.setBounds(580,200,300,100);
               t2=new JPasswordField(20);
               t2.setFont(new Font("arial",Font.BOLD,15));
               t2.setBounds(400,210,170,30);
               t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }});
               l4=new JLabel("Confirm Password:");
               l4.setFont(new Font("arial",Font.BOLD,20));
               l4.setForeground(Color.BLACK);
               l4.setBackground(Color.BLACK);
               l4.setBounds(210,250,200,40);
               t3=new JPasswordField(20);
               t3.setFont(new Font("arial",Font.BOLD,15));
               t3.setBounds(400,260,170,30);
               
               
               
               l5=new JLabel("Date Of Birth:");
               l5.setFont(new Font("arial",Font.BOLD,20));
               l5.setForeground(Color.BLACK);
               l5.setBackground(Color.BLACK);
               l5.setBounds(210,80,200,40);
               
               t5=new JTextField(20);
               t5.setFont(new Font("arial",Font.BOLD,15));
               t5.setBounds(400,80,170,30);
                 t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t5KeyReleased(evt);
            }});
                  l15=new JLabel();
                l15.setFont(new Font("arial",Font.BOLD,13));
                l15.setForeground(Color.RED);
                
                //l16.setBounds(700,300,150,50);
               l15.setBounds(580, 80,200,30);
                 
                 
                 
                 
                b3=new JButton("Submit");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(300,140,150,40);
               
               
               
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
                add(l5);add(t5);
                add(b3);
                add(l15);
                
                b1.setVisible(false);
                l2.setVisible(false);l22.setVisible(false);t2.setVisible(false);
                l4.setVisible(false);t3.setVisible(false);
               
                 b3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent btn3) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                    if(btn3.getSource()==b3)
                        {
                        
                    String text11,text12;
                        text11=t1.getText();
                        text12=t5.getText();
                        if(t1.getText().trim().isEmpty() ||t5.getText().trim().isEmpty())
                                        {
                                            
                                   System.out.println("6");
                            JOptionPane.showMessageDialog(null, "Enter Information","Failed",JOptionPane.WARNING_MESSAGE);
                                        }
                        else if(l15.getText()!="")
                         {
                             JOptionPane.showMessageDialog(null, "Date of Birth (mm/dd/yyyy)","Failed",JOptionPane.ERROR_MESSAGE);
                         }
                         else{
                     try
                       {    
//                           Class.forName("oracle.jdbc.driver.OracleDriver");
//                           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pratik");
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql="select id,dob from user1 where id=? and dob=?";
                           PreparedStatement pstmt=con.prepareStatement(sql);
                           pstmt.setString(1, text11);
                           pstmt.setString(2, text12);
                           ResultSet rs = pstmt.executeQuery();
                           int i=0;
                           System.out.println("1");
                          
                          if(rs.next())
                           {
                              
                               System.out.println("2");
                               System.out.println("Success");
        JOptionPane.showMessageDialog(null, "Successfull!","Sucess",JOptionPane.INFORMATION_MESSAGE);
        i++;
         b1.setVisible(true);
                l2.setVisible(true);l22.setVisible(true);t2.setVisible(true);
                l4.setVisible(true);t3.setVisible(true);
        
                           }
                           else
        {
            System.out.println("Failed");
            JOptionPane.showMessageDialog(null, "Error!","Failed",JOptionPane.ERROR_MESSAGE);
        }
                       }
                         
                     catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }
                    }}
                }});
                
                
                b1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent m) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(m.getSource()==b1)
                        {
                        String text1,text2,text3;
                        text1=t1.getText();
                        text2=t2.getText();
                        text3=t3.getText();
                     
                          int a=0,b=5;                 
                                   if(t1.getText().trim().isEmpty() ||t2.getText().trim().isEmpty()|| t3.getText().trim().isEmpty())
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
                           String sql="select * from user1";
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
                                       String sql1="update user1 set password=? where id =?";
                                       PreparedStatement st1=con.prepareStatement(sql1);
                                       st1.setString(1,text2);
                                       st1.setString(2, text1);
                                       st1.executeUpdate();
                                       JOptionPane.showMessageDialog(null, "Password Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                                       st1.close();
                                       System.out.println("4");
                                       t1.setText("");
                                       t2.setText("");
                                       t3.setText("");
                                       t5.setText("");
                                     b=a;
                                     break;
                                     
                                   }
                                    else
                                   {    
                            System.out.println("5");
                            JOptionPane.showMessageDialog(null, "New Password & Confirm Password Does Not Match","Failed",JOptionPane.ERROR_MESSAGE);
                                b=a;
                                   break;}
                                    }
                              
                           
                               
//                               else if(text1.equals("") && text2.equals("") && text3.equals(""))
//                                        {
//                                   System.out.println("6");
//                            JOptionPane.showMessageDialog(null, "Enter Information","Failed",JOptionPane.WARNING_MESSAGE);
//                                    b=a; break;   };                                 
                           }  
                           String sql1="select * from user1";
                           Statement st1=con.createStatement();
                           ResultSet rs1=st1.executeQuery(sql1);
                                
                                while(rs1.next()){
                                    String uid1=rs1.getString("id");
                                    if(text1!=uid1)  
                                        {  
                                            if(a==0 && b==5)
                        {
                             System.out.println("7");
                            JOptionPane.showMessageDialog(null, "Invalid Id","Failed",JOptionPane.ERROR_MESSAGE);
                           break;
                        }
                                        
                                      break;  }
                                  
                                     }
                       
                  
                       }
                       catch(SQLException ex)
                       {
                          ex.printStackTrace();
                       }    
                       catch (ClassNotFoundException ex)
                       {
                          Logger.getLogger(adminforgot.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                        
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Please fill the Proper Password","Failed",JOptionPane.ERROR_MESSAGE);
                        }
                        }
                      
}}
    });
                
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new userforgot();
    }
    public void t2KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,8})";
               
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t2.getText());
        if(!match.matches() )
        {
           l22.setText("<html>Password must be 6-8 characters long<br>"
                   + "Contain at least 1 digit<br>"
                   + "Contain at least One Uppercase letter<br>"
                   + "Contain at least One lowercase letter<br>"
                   + "Contain at least One special character<br>"
                   + "from [ @ # $ % ! . ]. </html>");
        }
        else
        {
            l22.setText(null);
        }
    }
     public void t5KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern=
                "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
//"^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        System.out.println("20");
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t5.getText());
        if(!match.matches() )
        {System.out.println("51");
           l15.setText("Date of Birth in mm/dd/yyyy");
        }
        else
        {
            System.out.println("52");
            l15.setText("");
        }
    }      
    
}


