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
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
public class paybill extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l188,l22,l23,l24,l25,l26,l27,l28,l29,l30,l211,l222,l31,l32;
static JTextField t1,t2,t3,t4,t8,t9,t11,t12,t13;
JRadioButton r1,r2,r3;
JButton b1,b2,b3,b4,b5,b6,b7;
JTextArea  t7;
JDateChooser t6;
ButtonGroup bg;
JComboBox c1;
Object s3,s4;
paybill()
{
                setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Customer Bill Payment");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l21=new JLabel("Pay Consumer Bill");
                l21.setFont(new Font("arial",Font.BOLD,30));
                l21.setForeground(Color.BLACK);
                l21.setBackground(Color.BLACK);
                l21.setBounds(500,10,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\billpay1.png");
                l18=new JLabel(icon2);
                l18.setBounds(400, 10,80, 80);
                l22=new JLabel("Enter Consumer Number:");
                l22.setFont(new Font("arial",Font.BOLD,20));
                l22.setForeground(Color.BLACK);
                l22.setBounds(350,120,250,50);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(600,130,200,30);
                b1=new JButton("Search");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(850,130,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(1050,130,150,30);
                
                
                l2=new JLabel("Name:");
                l2.setFont(new Font("arial",Font.BOLD,17));
                l2.setForeground(Color.BLACK);
                l2.setBounds(20,180,100,50);
                l3=new JLabel();
                l3.setFont(new Font("arial",Font.BOLD,15));
                l3.setForeground(Color.BLACK);
                l3.setBounds(120,180,100,50);
                l4=new JLabel();
                l4.setFont(new Font("arial",Font.BOLD,15));
                l4.setForeground(Color.BLACK);
                l4.setBounds(200,180,100,50);
                l5=new JLabel();
                l5.setFont(new Font("arial",Font.BOLD,15));
                l5.setForeground(Color.BLACK);
                l5.setBounds(280,180,250,50);
                
                l14=new JLabel("Biling Unit:");
                l14.setFont(new Font("arial",Font.BOLD,17));
                l14.setForeground(Color.BLACK);
                l14.setBounds(20,230,250,50);
                l15=new JLabel();
                l15.setFont(new Font("arial",Font.BOLD,15));
                l15.setForeground(Color.BLACK);
                l15.setBounds(120,230,250,50);
                
                
                l16=new JLabel("Bill Amount:");
                l16.setFont(new Font("arial",Font.BOLD,17));
                l16.setForeground(Color.BLACK);
                l16.setBounds(20,280,250,50);
                l17=new JLabel();
                l17.setFont(new Font("arial",Font.BOLD,15));
                l17.setForeground(Color.BLACK);
                l17.setBounds(120,280,250,50);
                
                l23=new JLabel("Date:");
                l23.setFont(new Font("arial",Font.BOLD,15));
                l23.setForeground(Color.BLACK);
                l23.setBounds(1050,0,100,80);
                l19=new JLabel();
                l19.setFont(new Font("arial",Font.BOLD,15));
                l19.setForeground(Color.BLACK);
                l19.setBounds(1100,0,100,80);
                SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
                Date date=new Date();
                l19.setText(dformat.format(date));
                
                
                
                
                l24=new JLabel("Time:");
                l24.setFont(new Font("arial",Font.BOLD,15));
                l24.setForeground(Color.BLACK);
                l24.setBounds(1050,30,100,80);
                l20=new JLabel();
                l20.setFont(new Font("arial",Font.BOLD,15));
                l20.setForeground(Color.BLACK);
                l20.setBounds(1100,30,100,80);
                SimpleDateFormat dformat1=new SimpleDateFormat("hh:mm:ss a");
                l20.setText(dformat1.format(date));
                
                
                
                
                
                b3=new JButton("Proceed");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(80,350,150,30);
                
                l25=new JLabel("Payment Type:");
                l25.setFont(new Font("arial",Font.BOLD,17));
                l25.setForeground(Color.BLACK);
                l25.setBounds(20,400,150,50);
                
                
                
                
                
                
                l6=new JLabel("Total Amount:");
                l6.setFont(new Font("arial",Font.BOLD,17));
                l6.setForeground(Color.BLACK);
                l6.setBounds(850,180,200,50);
                l7=new JLabel();
                l7.setFont(new Font("arial",Font.BOLD,15));
                l7.setForeground(Color.BLACK);
                l7.setBounds(980,180,100,50);
                //
                
                
                l8=new JLabel("Paid Amount:");
                l8.setFont(new Font("arial",Font.BOLD,17));
                l8.setForeground(Color.BLACK);
                l8.setBounds(850,230,200,50);
                t8=new JTextField();
                t8.setFont(new Font("arial",Font.BOLD,15));
                t8.setForeground(Color.BLACK);
                t8.setBounds(980,240,100,30);
                t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t8KeyReleased(evt);
            }});
                
                l188=new JLabel();
                l188.setFont(new Font("arial",Font.BOLD,12));
                l188.setForeground(Color.RED);
                l188.setBounds(1080,230,200,50);
                
                l9=new JLabel("Return Amount:");
                l9.setFont(new Font("arial",Font.BOLD,17));
                l9.setForeground(Color.BLACK);
                l9.setBounds(850,280,200,50);
                l10=new JLabel();
                l10.setFont(new Font("arial",Font.BOLD,15));
                l10.setForeground(Color.BLACK);
                l10.setBounds(980,290,100,30);
                
                b4=new JButton("Bill Paid");
                b4.setFont(new Font("arial",Font.BOLD,20));
                b4.setBounds(950,350,150,30);
                
                
                l11=new JLabel("Bank Name:");
                l11.setFont(new Font("arial",Font.BOLD,17));
                l11.setForeground(Color.BLACK);
                l11.setBounds(850,230,200,50);
                t11=new JTextField();
                t11.setFont(new Font("arial",Font.BOLD,15));
                t11.setForeground(Color.BLACK);
                t11.setBounds(990,240,150,30);
                t11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t11KeyReleased(evt);
            }});
                l29=new JLabel();
                l29.setFont(new Font("arial",Font.BOLD,12));
                l29.setForeground(Color.RED);
                l29.setBounds(1140,230,200,50);
                
                
                l12=new JLabel("Cheque No:");
                l12.setFont(new Font("arial",Font.BOLD,17));
                l12.setForeground(Color.BLACK);
                l12.setBounds(850,280,200,50);
                t12=new JTextField();
                t12.setFont(new Font("arial",Font.BOLD,15));
                t12.setForeground(Color.BLACK);
                t12.setBounds(990,290,150,30);
                t12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t12KeyReleased(evt);
            }});
                l30=new JLabel();
                l30.setFont(new Font("arial",Font.BOLD,12));
                l30.setForeground(Color.RED);
                l30.setBounds(1140,280,200,50);
                
                
                
                
                l13=new JLabel("Cheque Amount:");
                l13.setFont(new Font("arial",Font.BOLD,17));
                l13.setForeground(Color.BLACK);
                l13.setBounds(850,330,200,50);
                t13=new JTextField();
                t13.setFont(new Font("arial",Font.BOLD,15));
                t13.setForeground(Color.BLACK);
                t13.setBounds(990,340,150,30);
                t13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t13KeyReleased(evt);
            }});
                l31=new JLabel();
                l31.setFont(new Font("arial",Font.BOLD,12));
                l31.setForeground(Color.RED);
                l31.setBounds(1140,330,200,50);
                
                
                
                b5=new JButton("Bill Paid");
                b5.setFont(new Font("arial",Font.BOLD,20));
                b5.setBounds(950,400,150,30);
                
                
                
                b6=new JButton("Generate Receipt");
                b6.setFont(new Font("arial",Font.BOLD,20));
                b6.setBounds(920,400,200,30);
                
                
                
                b7=new JButton("Generate Receipt");
                b7.setFont(new Font("arial",Font.BOLD,20));
                b7.setBounds(920,450,200,30);
                
                
                
                c1=new JComboBox();
                c1.setFont(new Font("arial",Font.BOLD,15));
                c1.setForeground(Color.BLACK);
                c1.setBounds(160,410,100,30);
                c1.addItem("Cash");
                c1.addItem("Cheque");
                c1.setSelectedIndex(-1);
                c1.addItemListener(new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent e1) {
            if(e1.getSource()==c1)
            {
                s3=(Object)c1.getSelectedItem();
                
                
            }}});
                
                
                
                
                 add(l16);add(l18);add(l17);add(t1);add(b1);add(b2);
                add(l2);add(l3);add(l4);add(l5);add(l14);add(l15);add(l19);add(l20);
                add(l16);add(l17);add(l19);add(l18);
                add(l21);add(l22);add(l23);add(l24);
                add(b3);add(l25);add(c1);
                add(l188);
                add(l13);add(t13);add(l31);
                add(l6);add(l7);add(l8);add(t8);add(l9);add(l10);add(b4);
                add(l11);add(t11);add(l12);add(t12);add(b5);add(l29);add(l30);
                add(b6);add(b7);
                l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);
                l14.setVisible(false);l15.setVisible(false);l16.setVisible(false);l17.setVisible(false);
                b3.setVisible(false);l25.setVisible(false);l6.setVisible(false);l7.setVisible(false);
                l8.setVisible(false);t8.setVisible(false);l9.setVisible(false);l10.setVisible(false);
                b4.setVisible(false);c1.setVisible(false);l188.setVisible(false);
                l11.setVisible(false);l12.setVisible(false);t11.setVisible(false);t12.setVisible(false);
                b5.setVisible(false);l29.setVisible(false);l30.setVisible(false);
                l13.setVisible(false);t13.setVisible(false);l31.setVisible(false);
                b6.setVisible(false);b7.setVisible(false);
                c1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent type) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                    if(type.getSource()==c1)
                        {
                            
                            String value=(String) c1.getSelectedItem();
                            if("Cash".equals(value))
                        {
                            l6.setVisible(true);l7.setVisible(true);
                l8.setVisible(true);t8.setVisible(true);l9.setVisible(true);l10.setVisible(true);
                b4.setVisible(true);l188.setVisible(true);
//                b6.setVisible(true);
                
                
                l11.setVisible(false);l12.setVisible(false);t11.setVisible(false);t12.setVisible(false);
                b5.setVisible(false);l29.setVisible(false);l30.setVisible(false);
                l13.setVisible(false);t13.setVisible(false);l31.setVisible(false);
                b7.setVisible(false);
                
                        }
                            else if("Cheque".equals(value))
                        {
//                            electricitybill ec=new electricitybill();
//                            ec.setVisible(true);
                            l6.setVisible(true);l7.setVisible(true);
                            l11.setVisible(true);l12.setVisible(true);
                            t11.setVisible(true);t12.setVisible(true);
                            b5.setVisible(true);
                            l29.setVisible(true);l30.setVisible(true);
                            l13.setVisible(true);t13.setVisible(true);l31.setVisible(true);
//                            b7.setVisible(true);
                            
                           // l6.setVisible(false);l7.setVisible(false);
                l8.setVisible(false);t8.setVisible(false);l9.setVisible(false);l10.setVisible(false);
                b4.setVisible(false);l188.setVisible(false);
                b6.setVisible(false);
                        }
                            
                        
                    }
                    }
                });
                
                
                
                
                
                
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
                           String sql = "select fname,mname,lname,bu from customer where consumer_no = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			if(rs.next())
	        {
                            l3.setText(rs.getString(1));
                            l4.setText(rs.getString(2));
                            l5.setText(rs.getString(3));
//                            l7.setText(rs.getString(4));
//                            l9.setText(rs.getString(5));
//                            l11.setText(rs.getString(6));
//                            l13.setText(rs.getString(7));
                            l15.setText(rs.getString(4));
                            i++;
                }
                        if(i <1)
			{
				JOptionPane.showMessageDialog(null, "No Record Found","Error",
						JOptionPane.ERROR_MESSAGE);
                                System.out.println("4");
			}
                        else if(i ==1)
			{
//                            JOptionPane.showMessageDialog(null, "Record Found","Success",
//						JOptionPane.INFORMATION_MESSAGE);
			System.out.println(i+" Record Found");
                        System.out.println("5");
                        String text2 = t1.getText();
                             try
                {
                            Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1 = "select total from generate_bill where consumer_no = '"+text2+"'";
                           System.out.println("2");
                          PreparedStatement ps1 = con1.prepareStatement(sql1);
                          ResultSet rs1 = ps1.executeQuery();
                          
                          int i1 =0;
			if(rs1.next())
	        {
                            l17.setText(rs1.getString(1));
//                            l4.setText(rs.getString(2));
//                            l5.setText(rs.getString(3));
//                            l7.setText(rs.getString(4));
//                            l9.setText(rs.getString(5));
//                            l11.setText(rs.getString(6));
//                            l13.setText(rs.getString(7));
//                            l15.setText(rs.getString(4));
                            //l7.setText(l17.getText());
                            
                            
                            i1++;
                }
                        if(i1 <1)
			{
				JOptionPane.showMessageDialog(null, "Bill not Generated","Error",
						JOptionPane.ERROR_MESSAGE);
                                System.out.println("4");
			}
                        else if(i1 ==1)
			{
                            JOptionPane.showMessageDialog(null, "Record Found","Success",
						JOptionPane.INFORMATION_MESSAGE);
			System.out.println(i1+" Record Found");
                        System.out.println("5");
                        //l7.setText(l17.getText());
                         l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
                l14.setVisible(true);l15.setVisible(true);
                        l16.setVisible(true);l17.setVisible(true);
                b3.setVisible(true);
                
                                Float total_amount= Float.parseFloat(l17.getText());
                                int total1= Math.round(total_amount);
                l7.setText(""+total1);
//                
                
//                        l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
//                        l6.setVisible(true);l7.setVisible(true);l8.setVisible(true);l9.setVisible(true);
//                        l10.setVisible(true);l11.setVisible(true);l12.setVisible(true);l13.setVisible(true);
//                        l14.setVisible(true);l15.setVisible(true);b3.setVisible(true);
                }
                        
                        else
			{
				System.out.println(i1+" Records Found");
                                System.out.println("6");
			}
                        }
                
                catch(Exception m)
                {
                    m.printStackTrace();
                }
                        
                      
                
//                while(l17.getText().trim().isEmpty())
//                        {
//                            JOptionPane.showMessageDialog(null, "Bill not Generated","Error",
//						JOptionPane.ERROR_MESSAGE);
//                            
//                            i++;
//                            break;
//                        }
//                else
//                        {
////                            JOptionPane.showMessageDialog(null, "Record Found","Success",
////						JOptionPane.INFORMATION_MESSAGE);
//                            
//                        
//                        System.out.println("555");
//                        
//                        }
//                        l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
//                        l6.setVisible(true);l7.setVisible(true);l8.setVisible(true);l9.setVisible(true);
//                        l10.setVisible(true);l11.setVisible(true);l12.setVisible(true);l13.setVisible(true);
//                        l14.setVisible(true);l15.setVisible(true);b3.setVisible(true);
                }
                        
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
                
                
                
                
                
                
                
                
            }}});
                b2.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent clear) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                    if(clear.getSource()==b2)
                        {
                            l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);
                l14.setVisible(false);l15.setVisible(false);l16.setVisible(false);l17.setVisible(false);
                b3.setVisible(false);l25.setVisible(false);l6.setVisible(false);l7.setVisible(false);
                l8.setVisible(false);t8.setVisible(false);l9.setVisible(false);l10.setVisible(false);
                b4.setVisible(false);c1.setVisible(false);l188.setVisible(false);
               t1.setText(null);l17.setText(null);
               
               
               l11.setVisible(false);l12.setVisible(false);t11.setVisible(false);t12.setVisible(false);
                b5.setVisible(false);l29.setVisible(false);l30.setVisible(false);
                l13.setVisible(false);t13.setVisible(false);l31.setVisible(false);
                
                t11.setText(null);t12.setText(null);t13.setText(null);l30.setText(null);l31.setText(null);
                        }
                    
                    
                    }
                });
                
                
                
                
                b3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent pro) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(pro.getSource()==b3)
                        {
                            
                            l25.setVisible(true);c1.setVisible(true);
                        }
                    
                    
                    }
                });
                
                
                b4.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent paid) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(paid.getSource()==b4)
                        {
                             if(l188.getText()==null )
                        {
                            if(t8.getText().trim().isEmpty() )
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the Amount","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("13");         
                        }
                            else
                        {
                            Float total_amount= Float.parseFloat(l17.getText());
                                int total1= Math.round(total_amount);
                            int total2=Integer.parseInt(t8.getText());
                int total3=total2-total1;
                
                l10.setText(""+total3);
                
//                int a = JOptionPane.showConfirmDialog(null, "Is payment is given by Consumer?","Bill Payment",JOptionPane.INFORMATION_MESSAGE);
//                // JOptionPane.setRootFrame(null);
//                if (a == JOptionPane.YES_OPTION) {
////                    dispose();
//                    login obj = new login();
//                    obj.setVisible(true);
                    
                    
                    System.out.println("14");   
                        
                        int m =0;
                            String text3 = t1.getText();
                            try
                            {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from customer_payment where consumer_no = '"+text3+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                            
			if(rs.next())
	        {
                           rs.getString(1);
                            m++;
                }
                             
                        if(m <1)
			{
//				JOptionPane.showMessageDialog(null, "No Record Found","Error",
//						JOptionPane.ERROR_MESSAGE);
                            //l11.setText("Id is Already Register");
                                System.out.println("4");
			
                        
                        
                             try
                       {    
//                          String dat=t6.getDate().toString();
                           //String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(t6.getDate());
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1="insert into customer_payment (consumer_no,fname,mname,lname,bu,billamount,paymenttype,totalamount,paidamount,returnamount) values(?,?,?,?,?,?,?,?,?,?)";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           pstmt.setString(1, t1.getText());
                           System.out.println("3");
                           pstmt.setString(2, l3.getText());
                           System.out.println("4");
                           pstmt.setString(3, l4.getText());
                           System.out.println("5");
                           pstmt.setString(4, l5.getText());
                           System.out.println("6");
                           pstmt.setString(5,l15.getText());
                           System.out.println("7");
                           
                           pstmt.setString(6, l17.getText());
                           pstmt.setString(7, s3.toString());
                           pstmt.setString(8, l7.getText());
                           pstmt.setString(9, t8.getText());
                           pstmt.setString(10, l10.getText());
//                           pstmt.setString(11, s);
//                           pstmt.setString(12, s1);
                           
                          
                        pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
                        JOptionPane.showMessageDialog(null, "Successfully Paid","Success",JOptionPane.INFORMATION_MESSAGE);
                          // b=a;
                       b6.setVisible(true);b7.setVisible(false);
                        
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }       
                        }else if(m ==1)
			{
                            JOptionPane.showMessageDialog(null, "Bill Already Paid","Failed",
						JOptionPane.ERROR_MESSAGE);
//                            l11.setText("Id is Already Exist");
                                System.out.println("4");
                        }
                        }
                     catch(Exception  q)
                       {
                           
                           q.printStackTrace();
                       }
                    
                       //}
                            
                        }
                    
                        }
                             else if(t8.getText().trim().isEmpty() )
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the Amount","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("132");         
                        }
                             
                     else
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);   
                        }
                    }}
                });
                
                
                
                
                b5.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent paid1) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(paid1.getSource()==b5)
                        {
                            if( l29.getText()==null && l30.getText()==null && l31.getText()==null)
                        {
                            
                        
                            if(t11.getText().trim().isEmpty()||t12.getText().trim().isEmpty()||t13.getText().trim().isEmpty() )
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the Details","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("13");         
                        }
                            else
                        {
                            Float total_amount= Float.parseFloat(l17.getText());
                                int total1= Math.round(total_amount);
                            int total2=Integer.parseInt(t13.getText());
                int total3=total2-total1;
                
                l10.setText(""+total3);
                
//                int a = JOptionPane.showConfirmDialog(null, "Is payment is given by Consumer?","Bill Payment",JOptionPane.INFORMATION_MESSAGE);
//                // JOptionPane.setRootFrame(null);
//                if (a == JOptionPane.YES_OPTION) {
//                    dispose();
//                    login obj = new login();
//                    obj.setVisible(true);
                    
                    
                    System.out.println("14");   
                        
                        int m =0;
                            String text3 = t1.getText();
                            try
                            {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from customer_payment where consumer_no = '"+text3+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                            
			if(rs.next())
	        {
                           rs.getString(1);
                            m++;
                }
                             
                        if(m <1)
			{
//				JOptionPane.showMessageDialog(null, "No Record Found","Error",
//						JOptionPane.ERROR_MESSAGE);
                            //l11.setText("Id is Already Register");
                                System.out.println("4");
			
                        
                        
                             try
                       {    
//                          String dat=t6.getDate().toString();
                           //String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(t6.getDate());
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1="insert into customer_payment (consumer_no,fname,mname,lname,bu,billamount,paymenttype,totalamount,bankname,chequeno,chequeamount) values(?,?,?,?,?,?,?,?,?,?,?)";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           pstmt.setString(1, t1.getText());
                           System.out.println("3");
                           pstmt.setString(2, l3.getText());
                           System.out.println("4");
                           pstmt.setString(3, l4.getText());
                           System.out.println("5");
                           pstmt.setString(4, l5.getText());
                           System.out.println("6");
                           pstmt.setString(5,l15.getText());
                           System.out.println("7");
                           
                           pstmt.setString(6, l17.getText());
                           pstmt.setString(7, s3.toString());
                           pstmt.setString(8, l7.getText());
                           pstmt.setString(9, t11.getText());
                           pstmt.setString(10, t12.getText());
                           pstmt.setString(11, t13.getText());
//                           pstmt.setString(11, s);
//                           pstmt.setString(12, s1);
                           
                          
                        pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
                        JOptionPane.showMessageDialog(null, "Successfully Paid","Success",JOptionPane.INFORMATION_MESSAGE);
                          // b=a;
                       b7.setVisible(true);b6.setVisible(false);
                        
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }       
                        }else if(m ==1)
			{
                            JOptionPane.showMessageDialog(null, "Bill Already Paid","Failed",
						JOptionPane.ERROR_MESSAGE);
//                            l11.setText("Id is Already Exist");
                                System.out.println("4");
                        }
                        }
                     catch(Exception  q)
                       {
                           
                           q.printStackTrace();
                       }
                    
                      // }
                            
                        }
                    
                        }
                        else if(t11.getText().trim().isEmpty()||t12.getText().trim().isEmpty()||t13.getText().trim().isEmpty() )
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the Details","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("134");         
                        }
                         else
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);   
                        }
                        }
                    }
                });
                
                
                
                b6.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent bill) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(bill.getSource()==b6)
                        {
//                            String consumer=t1.getText();
//                            String bank_name=t3.getText();
//                            String bank_branch=t4.getText();
//                            String acc_no=t5.getText();
//                            String work_day=t6.getText();
//                            String basic=t7.getText();
//                            String home=t8.getText();
//                            String tra=t9.getText();
//                            String pro_tax=t10.getText();
//                            String gross=t11.getText();
//                            String dedu=t12.getText();
//                            String netsal=t13.getText();
                            String path="E:\\";
                            com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
                            try
                        {
                         PdfWriter.getInstance(doc, new FileOutputStream(path+""+t1.getText()+"consumer_receipt"+".pdf"));
                         doc.open();
                                                                                                                     
                          com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance("D:\\prologos\\images3.png");
     doc.add(img);
                         Paragraph paragraph1=new Paragraph("                                                   Receipt",FontFactory.getFont(FontFactory.TIMES_ROMAN,18));              
                        //Paragraph paragraph3=new Paragraph("\n                                                                                                                    Time:\t"+l19.getText());
                         doc.add(paragraph1);
                         Paragraph paragraph2=new Paragraph("\n                                                    `                                                    Date & Time:"+l19.getText()+"   "+l20.getText(),FontFactory.getFont(FontFactory.TIMES_ROMAN,12));                                                                           
                         
                         doc.add(paragraph2);
                        // doc.add(paragraph3);
                         
                         Paragraph para=new Paragraph("-------------------------------------------------------------------------------------------------------------------------------");
                         doc.add(para);
                        Paragraph paragraph=new Paragraph("                                                      Consumer Details\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN,15));
                        doc.add(paragraph);
                         Paragraph paragraph3=new Paragraph("Consumer Number:  "+t1.getText()+"\nName:  "+l3.getText()+"  "+l4.getText()+"  "+l5.getText()+
                                  "\nBilling Unit:  "+l15.getText()+"\nBill Amount:  "+l17.getText()+"\n");
                         doc.add(paragraph3);
                         //PdfPTable ptable=new PdfPTable(2);
//                         ptable.addCell("Description");
//                         ptable.addCell("Working Days:");
//                         ptable.addCell("Deductions");
//                         doc.add(ptable);
//                         PdfPCell c1=new PdfPCell(new Phrase("Description"));
//                       ptable.addCell(c1);  
//                       c1=new PdfPCell(new Phrase("Amount"));
                         Paragraph paragraph5=new Paragraph("-------------------------------------------------------------------------------------------------------------------------------");
                         doc.add(paragraph5);
                        Paragraph paragraph4=new Paragraph("Payment Type:   "+s3.toString());
                        doc.add(paragraph4);
                         Paragraph paragraph55=new Paragraph("Total Amount:    "+l7.getText()+"\n\n");
                         doc.add(paragraph55);
//                         Paragraph paragraph5=new Paragraph("Paid Amount:                                                      "+l24.getText()+"\n\n");
//                         doc.add(paragraph5);
//                         Paragraph paragraph6=new Paragraph("Energy Charges (EC):                                                   "+l26.getText()+"\n\n");
//                         doc.add(paragraph6);
//                         Paragraph paragraph7=new Paragraph("Wheeling Charges @ 1.45 Rs/U:                                   "+l28.getText()+"\n\n");
//                         doc.add(paragraph7);
//                         Paragraph paragraph8=new Paragraph("Electricity Duty (ED) @ 16.0%:                                      "+l30.getText()+"\n\n");
//                         doc.add(paragraph8);
//                         Paragraph paragraph9=new Paragraph("Total Bill:                                                                        "+l32.getText()+"\n\n");
//                         doc.add(paragraph9);
//                         Paragraph paragraph10=new Paragraph("Gross Salary:                                                 "+t11.getText()+"\n\n");
//                         doc.add(paragraph10);
//                         Paragraph paragraph11=new Paragraph("Deduction:                                                      "+t12.getText()+"\n\n");
//                         doc.add(paragraph11);
//                         Paragraph paragraph12=new Paragraph("Net Salary:                                                     "+t13.getText()+"\n\n\n\n");
//                         doc.add(paragraph12);
                         Paragraph paragraph13=new Paragraph("\n Computer Generated Electricity Bill Receipt.",FontFactory.getFont(FontFactory.TIMES_ITALIC,12));
                         doc.add(paragraph13);
                         
                         Paragraph para1=new Paragraph("\n"+"                                                         -------------------------------------------");                                                                           
//                       
                         doc.add(para1);
                         
                         JOptionPane.showMessageDialog(null, "Receipt Generated!","Bill",JOptionPane.INFORMATION_MESSAGE);
                        }
                            catch(Exception ee)
                        {
                            ee.printStackTrace();
                        }
                            doc.close();
                        }

                    }
                });
                
                
                
                b7.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent bill1) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(bill1.getSource()==b7)
                        {
//                            String consumer=t1.getText();
//                            String bank_name=t3.getText();
//                            String bank_branch=t4.getText();
//                            String acc_no=t5.getText();
//                            String work_day=t6.getText();
//                            String basic=t7.getText();
//                            String home=t8.getText();
//                            String tra=t9.getText();
//                            String pro_tax=t10.getText();
//                            String gross=t11.getText();
//                            String dedu=t12.getText();
//                            String netsal=t13.getText();
                            String path="E:\\";
                            com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
                            try
                        {
                         PdfWriter.getInstance(doc, new FileOutputStream(path+""+t1.getText()+"consumer_receipt"+".pdf"));
                         doc.open();
//                        
                          com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance("D:\\prologos\\images3.png");
     doc.add(img);
                         Paragraph paragraph1=new Paragraph("                                                   Receipt",FontFactory.getFont(FontFactory.TIMES_ROMAN,18));              
                        //Paragraph paragraph3=new Paragraph("\n                                                                                                                    Time:\t"+l19.getText());
                         doc.add(paragraph1);
                         Paragraph paragraph2=new Paragraph("\n                                                    `                                                    Date & Time:"+l19.getText()+"   "+l20.getText(),FontFactory.getFont(FontFactory.TIMES_ROMAN,12));                                                                           
                         
                         doc.add(paragraph2);
                        // doc.add(paragraph3);
                         
                         Paragraph para=new Paragraph("-------------------------------------------------------------------------------------------------------------------------------");
                         doc.add(para);
                        Paragraph paragraph=new Paragraph("                                                      Consumer Details\n\n",FontFactory.getFont(FontFactory.TIMES_ROMAN,15));
                        doc.add(paragraph);
                         Paragraph paragraph3=new Paragraph("Consumer Number:"+t1.getText()+"\nName:  "+l3.getText()+"  "+l4.getText()+"  "+l5.getText()+
                                  "\nBilling Unit:  "+l15.getText()+"\nBill Amount:  "+l17.getText()+"\n");
                         doc.add(paragraph3);
                         //PdfPTable ptable=new PdfPTable(2);
//                         ptable.addCell("Description");
//                         ptable.addCell("Working Days:");
//                         ptable.addCell("Deductions");
//                         doc.add(ptable);
//                         PdfPCell c1=new PdfPCell(new Phrase("Description"));
//                       ptable.addCell(c1);  
//                       c1=new PdfPCell(new Phrase("Amount"));
                         Paragraph paragraph5=new Paragraph("-------------------------------------------------------------------------------------------------------------------------------");
                         doc.add(paragraph5);
                        Paragraph paragraph4=new Paragraph("Payment Type:   "+s3.toString());
                        doc.add(paragraph4);
                         Paragraph paragraph55=new Paragraph("Bank Name:   "+t11.getText()+"\n"+"Cheque Number:   "+t12.getText()+"\nCheque Amount:   "+t13.getText()+"\n\n");
                         doc.add(paragraph55);
//                         Paragraph paragraph5=new Paragraph("Paid Amount:                                                      "+l24.getText()+"\n\n");
//                         doc.add(paragraph5);
//                         Paragraph paragraph6=new Paragraph("Energy Charges (EC):                                                   "+l26.getText()+"\n\n");
//                         doc.add(paragraph6);
//                         Paragraph paragraph7=new Paragraph("Wheeling Charges @ 1.45 Rs/U:                                   "+l28.getText()+"\n\n");
//                         doc.add(paragraph7);
//                         Paragraph paragraph8=new Paragraph("Electricity Duty (ED) @ 16.0%:                                      "+l30.getText()+"\n\n");
//                         doc.add(paragraph8);
//                         Paragraph paragraph9=new Paragraph("Total Bill:                                                                        "+l32.getText()+"\n\n");
//                         doc.add(paragraph9);
//                         Paragraph paragraph10=new Paragraph("Gross Salary:                                                 "+t11.getText()+"\n\n");
//                         doc.add(paragraph10);
//                         Paragraph paragraph11=new Paragraph("Deduction:                                                      "+t12.getText()+"\n\n");
//                         doc.add(paragraph11);
//                         Paragraph paragraph12=new Paragraph("Net Salary:                                                     "+t13.getText()+"\n\n\n\n");
//                         doc.add(paragraph12);
                         Paragraph paragraph13=new Paragraph("Computer Generated Electricity Bill Receipt.",FontFactory.getFont(FontFactory.TIMES_ITALIC,12));
                         doc.add(paragraph13);
                         Paragraph para1=new Paragraph("\n"+"                                                         -------------------------------------------");                                                                           
//                       
                         doc.add(para1);
                         JOptionPane.showMessageDialog(null, "Receipt Generated!","Bill",JOptionPane.INFORMATION_MESSAGE);
                        }
                            catch(Exception ee)
                        {
                            ee.printStackTrace();
                        }
                            doc.close();
                        }

                    }
                });
                
}
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String args[])
    {
        new paybill();
    }
    
    public void t8KeyReleased(java.awt.event.KeyEvent evt) {

        String pattern ="^[0-9]{2,6}";


        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t8.getText());
        if(!match.matches() )
        {
           l188.setText("Enter Proper Amount ");
        }
        else
        {
            l188.setText(null);
        }
    }

public void t11KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="^[a-zA-Z\\s]{3,40}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t11.getText());
        if(!match.matches() )
        {
           l29.setText("Bank Name");
        }
        else
        {
            l29.setText(null);
        }
        
    }


 public void t12KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern ="^[0-9]{6}";
                
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t12.getText());
        if(!match.matches() )
        {
           l30.setText("Cheque Number(6)");
        }
        else
        {
            l30.setText(null);
        }
        
    }

 public void t13KeyReleased(java.awt.event.KeyEvent evt) {

        String pattern ="^[0-9]{2,7}";


        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t13.getText());
        if(!match.matches() )
        {
           l31.setText("Enter Proper Amount ");
        }
        else
        {
            l31.setText(null);
        }
    }
}
    

