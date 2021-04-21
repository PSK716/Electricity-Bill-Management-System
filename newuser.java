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
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.layout.Border;
public class newuser extends JFrame implements ActionListener,ItemListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
static JTextField t1,t2,t3,t4,t8,t9;
JRadioButton r1,r2,r3;
JButton b1,b2,b3,b4;
JPanel p1,p2,p3,p4,p5;
JTextArea  t7;
JDateChooser t6;
ButtonGroup bg;
ResultSet rs;
newuser()
{
                setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Employee Registration Form");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l10=new JLabel("Employee Registration Form");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(450,0,800,80);
                l1=new JLabel("ID:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(100,130,100,50);
//                l11=new JLabel();
//                l11.setFont(new Font("TimesRoman",Font.BOLD,13));
//                l11.setForeground(Color.RED);
//                l11.setBounds(420,140,150,30);
//               p1=new JPanel();
//               p1.setBackground(Color.black);
//               p1.setBounds(15, 35,2, 570);
//               p2=new JPanel();
//               p2.setBackground(Color.black);
//               p2.setBounds(15, 35,300, 2);
////                
//               p3=new JPanel();
//               p3.setBackground(Color.black);
//               p3.setBounds(1270, 35,2, 570);
//               p4=new JPanel();
//               p4.setBackground(Color.black);
//               p4.setBounds(900, 35,370, 2);
//               p5=new JPanel();
//               p5.setBackground(Color.black);
//               p5.setBounds(15,605,1257, 2);
//               add(p3);add(p4);
//                add(p1);
//                add(p2);
//                add(p5);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(200,140,200,30);
//                t1.addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyReleased(java.awt.event.KeyEvent evt) {
//                t1KeyReleased(evt);
//            }});
        
                
                l2=new JLabel("Enter Full Name:");
                l2.setFont(new Font("arial",Font.BOLD,20));
                l2.setForeground(Color.BLACK);
                l2.setBounds(650,130,200,50);
                l12=new JLabel();
                l12.setFont(new Font("arial",Font.BOLD,13));
                l12.setForeground(Color.RED);
                l12.setBounds(1070,140,150,30);
                t2=new JTextField();
                t2.setFont(new Font("arial",Font.BOLD,15));
                t2.setForeground(Color.BLACK);
                t2.setBounds(850,140,200,30);
                t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }});
                
                l3=new JLabel("Email-Id:");
                l3.setFont(new Font("arial",Font.BOLD,20));
                l3.setForeground(Color.BLACK);
                l3.setBounds(100,230,100,50);
                l13=new JLabel();
                l13.setFont(new Font("arial",Font.BOLD,13));
                l13.setForeground(Color.RED);
                l13.setBounds(420,240,150,30);
                t3=new JTextField();
                t3.setFont(new Font("arial",Font.BOLD,15));
                t3.setForeground(Color.BLACK);
                t3.setBounds(200,240,200,30);
                t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }});
                l4=new JLabel("Mobile Number:");
                l4.setFont(new Font("arial",Font.BOLD,20));
                l4.setForeground(Color.BLACK);
                l4.setBounds(650,230,200,50);
                l14=new JLabel();
                l14.setFont(new Font("arial",Font.BOLD,13));
                l14.setForeground(Color.RED);
                l14.setBounds(1070,240,250,30);
                t4=new JTextField();
                t4.setFont(new Font("arial",Font.BOLD,15));
                t4.setForeground(Color.BLACK);
                t4.setBounds(850,240,200,30);
                t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t4KeyReleased(evt);
            }});
                
                l5=new JLabel("Gender:");
                l5.setFont(new Font("arial",Font.BOLD,20));
                l5.setForeground(Color.BLACK);
                l5.setBounds(100,330,200,50);
                l15=new JLabel();
                l15.setFont(new Font("arial",Font.BOLD,13));
                l15.setForeground(Color.RED);
                l15.setBounds(420,340,150,30);
                r1=new JRadioButton("Male");
                r1.setFont(new Font("arial",Font.BOLD,15));
                r1.setForeground(Color.BLACK);
                r1.setBounds(200,340,100,30);
                r2=new JRadioButton("Female");
                r2.setFont(new Font("arial",Font.BOLD,15));
                r2.setForeground(Color.BLACK);
                r2.setBounds(300,340,100,30);
                r1.addItemListener(this); 
                r2.addItemListener( this); 
    
                 bg=new ButtonGroup();
                bg.add(r1);bg.add(r2);
                
                l6=new JLabel("Date Of Birth:");
                l6.setFont(new Font("arial",Font.BOLD,20));
                l6.setForeground(Color.BLACK);
                l6.setBounds(650,330,200,50);
                l16=new JLabel();
                l16.setFont(new Font("arial",Font.BOLD,13));
                l16.setForeground(Color.RED);
                l16.setBounds(1070,340,150,30);
                t6=new JDateChooser();
                t6.setBounds(850, 340,200,30);
                t6.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                t6InputMethodTextChanged(evt);
            }
        });
                
                                                  

               
                l7=new JLabel("Address:");
                l7.setFont(new Font("arial",Font.BOLD,20));
                l7.setForeground(Color.BLACK);
                l7.setBounds(100,430,200,50);   
                 l17=new JLabel();
                l17.setFont(new Font("arial",Font.BOLD,13));
                l17.setForeground(Color.RED);
                l17.setBounds(420,460,200,30);
                t7=new JTextArea();
                t7.setFont(new Font("arial",Font.BOLD,15));
                t7.setForeground(Color.BLACK);
                t7.setBounds(200,440,200,80);
                t7.setLineWrap(true);
                t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t7KeyReleased(evt);
            }});
                
                javax.swing.border.Border border=BorderFactory.createLineBorder(Color.BLACK, 1);
                t7.setBorder(border);
                
                l8=new JLabel("Set Password:");
                l8.setFont(new Font("arial",Font.BOLD,20));
                l8.setForeground(Color.BLACK);
                l8.setBounds(650,430,200,50);   
                l18=new JLabel();
                l18.setFont(new Font("arial",Font.BOLD,10));
                l18.setForeground(Color.RED);
                l18.setBounds(1060,380,300,150);
                t8=new JTextField();
                t8.setFont(new Font("arial",Font.BOLD,15));
                t8.setForeground(Color.BLACK);
                t8.setBounds(850,440,200,30);
                t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t8KeyReleased(evt);
            }});
                Icon icon9=new ImageIcon("D:\\prologos\\userlogo2.png");
                l9=new JLabel(icon9);
                l9.setBounds(330, 10,80, 80);
                
                b1=new JButton("Submit");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(450,550,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(650,550,150,30);
                b3=new JButton("Bank Details >>");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(1050,20,200,30);
                b1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(e.getSource()==b1)
                        {
                            
                            int i=0;int a=0,b=5;
//                            if(t1.getText().equals(null) || t2.getText().equals(null) ||
//                               t3.getText().equals(null) || t4.getText().equals(null)  || r3.getText().equals(null) || t6.getDate()==null
//                              || dat.isEmpty() && t7.getText().equals(null) || t8.getText().equals(null))
//                            {//System.out.println("1");
//                             System.out.println(" 11");
//                            JOptionPane.showMessageDialog(null, "Please Field All Details","Error",JOptionPane.ERROR_MESSAGE);
//                        b=a;
//                            }
//                        else
//                        {
                           
//                     if(!l11.getText().trim().isEmpty() || !l12.getText().trim().isEmpty()|| !l13.getText().trim().isEmpty()
//                             || !l14.getText().trim().isEmpty()|| !l15.getText().trim().isEmpty()|| !l16.getText().trim().isEmpty()
//                             || !l17.getText().trim().isEmpty()|| !l18.getText().trim().isEmpty())
//                        {
//                         
//                            JOptionPane.showMessageDialog(null, "Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);
//                        }
//                     else{
//                            String la11,la12,la13,la14,la15,la16,la17,la18;
//                            la11=l11.getText();
//                            la12=l12.getText();
//                            la13=l13.getText();
//                            la14=l14.getText();
//                            la15=l15.getText();
//                            la16=l16.getText();
//                            la17=l17.getText();
//                            la18=l18.getText();
//                            if(la11.trim().isEmpty() ||la12.trim().isEmpty()||la13.trim().isEmpty()||la14.trim().isEmpty()||la17.trim().isEmpty()||la18.trim().isEmpty())
//                        {
//                            JOptionPane.showMessageDialog(null, "Please Fill All the Details1","Error",JOptionPane.ERROR_MESSAGE);
                             
                     if( l12.getText()==null && l13.getText()==null && l14.getText()==null && l17.getText()==null && l18.getText()==null)
                     {
                            if(t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty()||t4.getText().trim().isEmpty()||
                                    t6.getDate()==null || t7.getText().trim().isEmpty()||t8.getText().trim().isEmpty() ||bg.getSelection()==null)
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                            
                        }
                         
                            else 
                        {
//                            int m =0;
//                            String text1 = t1.getText();
//                            try
//                            {
//                Class.forName("com.mysql.jdbc.Driver");
//                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
//                           String sql = "select * from user1 where id = '"+text1+"'";
//                           System.out.println("2");
//                          PreparedStatement ps = con.prepareStatement(sql);
//                          ResultSet rs = ps.executeQuery();
//                          
//                            
//			if(rs.next())
//	        {
//                            l11.setText(rs.getString(1));
//                            m++;
//                }
//                             
//                        if(m <1)
//			{
////				JOptionPane.showMessageDialog(null, "No Record Found","Error",
////						JOptionPane.ERROR_MESSAGE);
//                            //l11.setText("Id is Already Register");
//                                System.out.println("4");
			
                        
                        
                             try
                       {    
//                          String dat=t6.getDate().toString();
                           String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(t6.getDate());
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1="insert into user1 (id,name,email,contact,gender,dob,address,password) values(?,?,?,?,?,?,?,?)";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           pstmt.setString(1, null);
                           System.out.println("3");
                           pstmt.setString(2, t2.getText());
                           System.out.println("4");
                           pstmt.setString(3, t3.getText());
                           System.out.println("5");
                           pstmt.setString(4, t4.getText());
                           System.out.println("6");
                           pstmt.setString(5, r3.getText());
                           System.out.println("7");
                           pstmt.setString(6, BD);
                           System.out.println("8");
                           pstmt.setString(7, t7.getText());
                           System.out.println("9");
                           pstmt.setString(8, t8.getText());
                           System.out.println("10");
                          //JOptionPane.showMessageDialog(null, "Successfully Registred","Success",JOptionPane.INFORMATION_MESSAGE);
                        pstmt.executeUpdate();
                        pstmt.close();
                        
                        
                        
                        String text11=t4.getText();
//                Class.forName("com.mysql.jdbc.Driver");
//                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql2 = "select id from user1 where contact ='"+text11+"'";
                           System.out.println("2");
                          PreparedStatement ps = con1.prepareStatement(sql2);
                          ResultSet rs1 = ps.executeQuery();
                        if(rs1.next())
	        {
                            t1.setText(rs1.getString(1));
//                            m++;
                }
                        String r=t1.getText();
                        JOptionPane.showMessageDialog(null, "Id:"+r+"  Successfully Registered","Success",JOptionPane.INFORMATION_MESSAGE);
                       con1.close();
                        //con1.close();
                          // b=a;
                        b3.setVisible(true);
                        
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       } }      
//                        }else if(m ==1)
//			{
//                            JOptionPane.showMessageDialog(null, "ID is Already Exist","Failed",
//						JOptionPane.ERROR_MESSAGE);
//                            l11.setText("Id is Already Exist");
//                                System.out.println("4");
//                        }
//                        }
//                     catch(Exception q)
//                       {
//                           q.printStackTrace();
//                       } }  }    
                     }
                           else if(t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty()||t4.getText().trim().isEmpty()||
                                    t6.getDate()==null || t7.getText().trim().isEmpty()||t8.getText().trim().isEmpty() ||bg.getSelection()==null)
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                            
                        }
                            else
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);   
                        }
                         
                        
                            
                          
                        
                            //l11.setText(null);
//                            l12.setText(null);
//                            l13.setText(null);
//                            l14.setText(null);
//                            l15.setText(null);
//                            l16.setText(null);
//                            l17.setText(null);
//                            l18.setText(null);
                            
                        }} 
                        
                    
                });
                b2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(e.getSource()==b2)
                        {
                            t1.setText(null);
                            t2.setText(null);
                            t3.setText(null); 
                            t4.setText(null);
                            t6.setDate(null);
                            t7.setText(null);
                            t8.setText(null);
                            //l11.setText(null);
                            l12.setText(null);
                            l13.setText(null);
                            l14.setText(null);
                            l15.setText(null);
                            l16.setText(null);
                            l17.setText(null);
                            l18.setText(null);
                           bg.clearSelection();
                           b3.setVisible(false);
                        }
                    }
                });
                 b3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                    bankdetails bd=new bankdetails();
                    bd.setVisible(true);
                    dispose();
                    }
                });
                add(l1);add(l10);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);add(l5);add(r1);add(r2);add(l6);add(t6);
                add(l7);add(t7);add(l8);add(t8);add(b1);add(b2);
//                add(l11);
                add(l12);add(l13);add(l14);add(l15);add(l16);add(l17);add(l18);
                add(b3);
                add(l9);b3.setVisible(false);
                t1.setEditable(false);
                
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new newuser();
    }
    public void t6InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {                                                     
        // TODO add your handling code here:
        String dat=t6.getDateFormatString();
        System.out.println(dat);
    }
    //public void t1KeyReleased(java.awt.event.KeyEvent evt) {                                        
//        
//        String pattern="^[a-zA-Z0-9]{5}$";
//        Pattern patt=Pattern.compile(pattern);
//        Matcher match=patt.matcher(t1.getText());
//        if(!match.matches() )
//        {
//           l11.setText("Enter Proper ID (5)");
//        }
//        else
//        {
//            l11.setText(null);
//        }
//        
//    }   
    public void t2KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="^[a-zA-Z\\s]{5,40}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t2.getText());
        if(!match.matches() )
        {
           l12.setText("Enter proper Name");
        }
        else
        {
            l12.setText(null);
        }
        
    }
  public void t3KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern ="^[a-zA-Z0-9_+&*-.]{0,30}[@][a-zA-Z]{0,10}[.][a-zA-Z.]{0,10}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t3.getText());
        if(!match.matches() )
        {
           l13.setText("Enter Proper Email");
        }
        else
        {
            l13.setText(null);
        }
        
    }      
    public void t4KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern ="^[7-9][0-9]{9}";
                
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t4.getText());
        if(!match.matches() )
        {
           l14.setText("Enter Contact Number");
        }
        else
        {
            l14.setText(null);
        }
        
    }      
    public void t7KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern="[a-zA-z0-9\\s,/.]{10,100}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t7.getText());
        if(!match.matches() )
        {
           l17.setText("Enter Proper Address");
        }
        else
        {
            l17.setText(null);
        }
    }      
    public void t8KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,15})";
               
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t8.getText());
        if(!match.matches() )
        {
           l18.setText("<html>Password must be 6-15 characters long<br>"
                   + "Contain at least 1 digit<br>"
                   + "Contain at least One Uppercase letter<br>"
                   + "Contain at least One lowercase letter<br>"
                   + "Contain at least One special character<br>"
                   + "from [ @ # $ % ! . ]. </html>");
        }
        else
        {
            l18.setText(null);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    r3=(JRadioButton)ie.getItem();
    }

}
