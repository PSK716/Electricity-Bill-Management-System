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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class updateuser extends JFrame implements ActionListener,ItemListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l9,l10,l12,l13,l14,l17,l16;
JTextField t1,t2,t3,t4,t5,t66;
JRadioButton r1,r2,r3;
JDateChooser t6;
JButton b1,b2,b3;
JPanel p1,p2,p3,p4,p5;
JTextArea t7;
ButtonGroup bg;
updateuser()
{
                setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Edit Employee Details");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l10=new JLabel("Edit Employee Details");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(490,0,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\update.png");
                l9=new JLabel(icon2);
                l9.setBounds(400, 10,60, 60);
                l1=new JLabel("Enter ID:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(350,100,100,50);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(450,110,200,30);
                b1=new JButton("Search");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(700,110,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(900,110,150,30);
                
                
                l2=new JLabel("Name:");
                l2.setFont(new Font("arial",Font.BOLD,20));
                l2.setForeground(Color.BLACK);
                l2.setBounds(150,200,100,50);
                
                t2=new JTextField();
                t2.setFont(new Font("arial",Font.BOLD,15));
                t2.setForeground(Color.BLACK);
                t2.setBounds(250,210,200,30);
                t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }});
                l12=new JLabel();
                l12.setFont(new Font("arial",Font.BOLD,13));
                l12.setForeground(Color.RED);
                l12.setBounds(450,210,200,30);
                
                l3=new JLabel("Email-Id:");
                l3.setFont(new Font("arial",Font.BOLD,20));
                l3.setForeground(Color.BLACK);
                l3.setBounds(150,300,100,50);
                
                t3=new JTextField();
                t3.setFont(new Font("arial",Font.BOLD,15));
                t3.setForeground(Color.BLACK);
                t3.setBounds(250,310,200,30);
                t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }});
                l13=new JLabel();
                l13.setFont(new Font("arial",Font.BOLD,13));
                l13.setForeground(Color.RED);
                l13.setBounds(450,310,200,30);
                
                l4=new JLabel("Mobile Number:");
                l4.setFont(new Font("arial",Font.BOLD,20));
                l4.setForeground(Color.BLACK);
                l4.setBounds(700,200,200,50);
                
                t4=new JTextField();
                t4.setFont(new Font("arial",Font.BOLD,15));
                t4.setForeground(Color.BLACK);
                t4.setBounds(900,210,200,30);
                
                t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t4KeyReleased(evt);
            }});
                l14=new JLabel();
                l14.setFont(new Font("arial",Font.BOLD,13));
                l14.setForeground(Color.RED);
                l14.setBounds(1100,210,200,30);
                
                l5=new JLabel("Gender:");
                l5.setFont(new Font("arial",Font.BOLD,20));
                l5.setForeground(Color.BLACK);
                l5.setBounds(700,400,100,50);
                
//                t5=new JTextField();
//                t5.setFont(new Font("TimesRoman",Font.BOLD,15));
//                t5.setForeground(Color.BLACK);
//                t5.setBounds(800,410,100,30);
                r1=new JRadioButton("Male");
                r1.setFont(new Font("arial",Font.BOLD,15));
                r1.setForeground(Color.BLACK);
                r1.setBounds(900,410,100,30);
                r2=new JRadioButton("Female");
                r2.setFont(new Font("arial",Font.BOLD,15));
                r2.setForeground(Color.BLACK);
                r2.setBounds(1000,410,100,30);
                r1.addItemListener(this); 
    r2.addItemListener( this); 
                 bg=new ButtonGroup();
                bg.add(r1);bg.add(r2);
                
                l6=new JLabel("Date Of Birth:");
                l6.setFont(new Font("arial",Font.BOLD,20));
                l6.setForeground(Color.BLACK);
                l6.setBounds(700,300,150,50);
               l16=new JLabel();
                l16.setFont(new Font("arial",Font.BOLD,13));
                l16.setForeground(Color.RED);
                
                //l16.setBounds(700,300,150,50);
               l16.setBounds(1125, 310,200,30);
//                t6=new JDateChooser();
//                t6.setBounds(1125, 310,150,30);
                t66=new JTextField();
                t66.setFont(new Font("arial",Font.BOLD,15));
                t66.setForeground(Color.BLACK);
                t66.setBounds(900,310,200,30);
                
                    t66.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t66KeyReleased(evt);
            }});
                 
//               
//               String selectdate=((JTextField)t6.getDateEditor().getUiComponent()).getText();
//               t66.setText(selectdate);
                       
//                String strdate = DateFormat.getDateInstance().format(t6);
//                t66.setText(strdate);
                
                l7=new JLabel("Address:");
                l7.setFont(new Font("arial",Font.BOLD,20));
                l7.setForeground(Color.BLACK);
                l7.setBounds(150,400,200,50);   
                 
                
                t7=new JTextArea();
                t7.setFont(new Font("arial",Font.BOLD,15));
                t7.setForeground(Color.BLACK);
                t7.setBounds(250,410,200,80);
                t7.setLineWrap(true);
                t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t7KeyReleased(evt);
            }});
                
                
                javax.swing.border.Border border=BorderFactory.createLineBorder(Color.BLACK, 1);
                t7.setBorder(border);
                l17=new JLabel();
                l17.setFont(new Font("arial",Font.BOLD,13));
                l17.setForeground(Color.RED);
                l17.setBounds(450,410,200,30);
                b3=new JButton("Update Employee Details");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(510,530,300,30);
//                 p1=new JPanel();
//               p1.setBackground(Color.black);
//               p1.setBounds(15, 35,2, 570);
//               p2=new JPanel();
//               p2.setBackground(Color.black);
//               p2.setBounds(15, 35,350, 2);
////                
//               p3=new JPanel();
//               p3.setBackground(Color.black);
//               p3.setBounds(1270, 35,2, 570);
//               p4=new JPanel();
//               p4.setBackground(Color.black);
//               p4.setBounds(870, 35,400, 2);
//               p5=new JPanel();
//               p5.setBackground(Color.black);
//               p5.setBounds(15,605,1257, 2);
//               add(p3);add(p4);
//                add(p1);
//                add(p2);
//                add(p5);
                add(l10);add(l9);add(l1);add(t1);add(b1);add(b2);
                add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);add(l5);
//                add(t5);
                add(l6);
                //add(t6);
                add(l7);add(t7);
                add(r1);add(r2);add(l12);add(l13);add(l17);add(l14);add(t66);add(b3);add(l16);
                l2.setVisible(false);t2.setVisible(false);l3.setVisible(false);t3.setVisible(false);
                l4.setVisible(false);t4.setVisible(false);l5.setVisible(false);
                //t5.setVisible(false);
                l6.setVisible(false);
                //t6.setVisible(false);
                l7.setVisible(false);t7.setVisible(false);
                r1.setVisible(false);r2.setVisible(false);b3.setVisible(false);t66.setVisible(false);
                l16.setVisible(false);l12.setVisible(false);l13.setVisible(false);l17.setVisible(false);
                l14.setVisible(false);
                b1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(e.getSource()==b1)
                        {
                            
                            String text1 = t1.getText();
                             try
                {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from user1 where id = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			if(rs.next())
	        {
                            t2.setText(rs.getString(2));
                            t3.setText(rs.getString(3));
                            t4.setText(rs.getString(4));
                            //t5.setText(rs.getString(5));
                            
                            String gn=rs.getString(5);
                            if(gn.equals("Male"))
                            {
                                r1.setSelected(true);
                            }
                            else
                            {
                                r2.setSelected(true);
                            }
                            t66.setText(rs.getString(6));
//                            if(t5.getText()=="Female"){
//                                r2.isEnabled();
//                            }else{
//                                r1.isEnabled();
//                            }
//                            
                            
                            t7.setText(rs.getString(7));
                            
				i++;
                                System.out.println("3");
	        }
			if(i <1)
			{
				JOptionPane.showMessageDialog(null, "No Record Found","Error",
						JOptionPane.ERROR_MESSAGE);
                                System.out.println("4");
			}
                        else if(i ==1)
			{
                            JOptionPane.showMessageDialog(null, "Record Found","Success",
						JOptionPane.INFORMATION_MESSAGE);
			System.out.println(i+" Record Found");
                        System.out.println("5");
                        l2.setVisible(true);t2.setVisible(true);l3.setVisible(true);t3.setVisible(true);
                l4.setVisible(true);t4.setVisible(true);l5.setVisible(true);
                //t5.setVisible(true);
                l6.setVisible(true);
                //t6.setVisible(true);
                l7.setVisible(true);t7.setVisible(true);
                r1.setVisible(true);r2.setVisible(true);b3.setVisible(true);t66.setVisible(true);
                 l12.setVisible(true);l13.setVisible(true);l17.setVisible(true);
                l14.setVisible(true);
		l16.setVisible(true);	}
			else
			{
				System.out.println(i+" Records Found");
                                System.out.println("6");
			}
		
                }
                catch(Exception m)
                {
                    m.printStackTrace();
                }
                             
                        }
    }
                });
                b2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent g) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(g.getSource()==b2)
                        {
                            t1.setText(null);
                            l2.setVisible(false);t2.setVisible(false);l3.setVisible(false);t3.setVisible(false);
                l4.setVisible(false);t4.setVisible(false);l5.setVisible(false);
                //t5.setVisible(false);
                l6.setVisible(false);
                //t6.setVisible(false);
                l7.setVisible(false);t7.setVisible(false);
                r1.setVisible(false);r2.setVisible(false);b3.setVisible(false);t66.setVisible(false);
                       l16.setVisible(false);  l12.setVisible(false);l13.setVisible(false);l17.setVisible(false);
                l14.setVisible(false);   
                        }
        
        
        
        }
    });
       b3.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent u) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(u.getSource()==b3)
               {
                   if(l12.getText()!="" ||l13.getText()!="" || l16.getText()!="" || l17.getText()!="" || l14.getText()!="" )
               {
                   JOptionPane.showMessageDialog(null, "Please Fill the Proper Details","Error",JOptionPane.ERROR_MESSAGE);
               }
                   else
               {
                   if(t1.getText().trim().isEmpty() ||t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty()||t4.getText().trim().isEmpty()||
                                    t66.getText().trim().isEmpty()|| t7.getText().trim().isEmpty()||bg.getSelection()==null)
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill the Details","Error",JOptionPane.WARNING_MESSAGE);
                            
                        }
                   else
               {
                   try
                {
//                    String dat=t6.getDate().toString();
                   // String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(t6.getDate());
                    String text2 = t1.getText();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                String sql = "update user1 set name=?,email=?,contact=?,gender=?,dob=?,address=? where id = '"+text2+"'";
                System.out.println("22");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ps.setString(1, t2.getText());
                          ps.setString(2, t3.getText());
                          ps.setString(3, t4.getText());
                          ps.setString(4,r3.getText());
                          
                         // ps.setString(5, BD);
                          ps.setString(5, t66.getText());
                          //ps.setString(5, t66.getText());
                          ps.setString(6, t7.getText());
                        System.out.println("23");
                          ps.executeUpdate();
                          ps.close();
                          con.close();
                          System.out.println("24");
                          int aaa = JOptionPane.showConfirmDialog(null, "Are you sure Employee want to Update Details?","Update Employee Details",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.setRootFrame(null);
                if (aaa == JOptionPane.YES_OPTION) {
//                    dispose();
//                    login obj = new login();
//                    obj.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Successfully Updated","Success",
						JOptionPane.INFORMATION_MESSAGE);
                                                   }
                          
                                  System.out.println("10");
                

                }
                   catch(Exception s)
               {
                   s.printStackTrace();
                   
                   System.out.println("100");
               }
                   
//                   if (l12.getText()==null && l13.getText()==null && l14.getText()==null && l17.getText()==null)
//                     {
//                       JOptionPane.showMessageDialog(null, "Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);  
//                       System.out.println("25");
//                   }
                        
               }
                       }}
                 
//                   
//                if (l12.getText()==null && l13.getText()==null && l14.getText()==null && l17.getText()==null)
//                     {
//                       JOptionPane.showMessageDialog(null, "11Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);  
//                       System.out.println("25");
//                   }
//                   
               
        }
    });
       
                
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new updateuser();
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    r3=(JRadioButton)ie.getItem();
   
//    t5.setText(r3.getText());
    
    
    }
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
            l12.setText("");
        }
        
    }
  public void t3KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern =
                "^[a-zA-Z0-9_+&*-.]{0,30}[@][a-zA-Z]{0,10}[.][a-zA-Z.]{0,10}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t3.getText());
        if(!match.matches() )
        {
           l13.setText("Enter Proper Email");
        }
        else
        {
            l13.setText("");
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
            l14.setText("");
        }
        
    }      
    public void t7KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern="[a-zA-z0-9\\s\\W]{10,100}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t7.getText());
        if(!match.matches() )
        {
           l17.setText("Enter Proper Address");
        }
        else
        {
            l17.setText("");
        }
    }      
    public void t66KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern=
                "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
//"^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        System.out.println("20");
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t66.getText());
        if(!match.matches() )
        {System.out.println("51");
           l16.setText("Date of Birth in mm/dd/yyyy");
        }
        else
        {
            System.out.println("52");
            l16.setText("");
        }
    }      
    
}
