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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sql.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.filechooser.FileNameExtensionFilter;
public class updatecustomer  extends JFrame implements ActionListener,ItemListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;
static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
JRadioButton r1,r2,r3;
JButton b1,b2,b3,b4,b5,b6;
Object s3;
JTextArea  t21;
//InputStream is,is1;
//JDateChooser t6;
JComboBox c23;
ButtonGroup bg;
ResultSet rs;
String s,s1,s2;
updatecustomer()
{
                setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Edit Customer Details");
                
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l10=new JLabel("Edit Customer Details");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(490,0,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\update.png");
                l9=new JLabel(icon2);
                l9.setBounds(400, 10,60, 60);
                l1=new JLabel("Enter Consumer Number:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(350,100,250,50);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(600,110,200,30);
                b1=new JButton("Search");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(850,110,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("TimesRoman",Font.BOLD,20));
                b2.setBounds(1050,110,150,30);
                
                
                l2=new JLabel("First Name:");
                l2.setFont(new Font("arial",Font.BOLD,17));
                l2.setForeground(Color.BLACK);
                l2.setBounds(50,170,200,50);
                l12=new JLabel();
                l12.setFont(new Font("arial",Font.BOLD,12));
                l12.setForeground(Color.RED);
                l12.setBounds(320,180,100,30);
                t2=new JTextField();
                t2.setFont(new Font("arial",Font.BOLD,15));
                t2.setForeground(Color.BLACK);
                t2.setBounds(170,180,150,30);
                t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }});
                
                
                
                
                l3=new JLabel("Middle Name:");
                l3.setFont(new Font("arial",Font.BOLD,17));
                l3.setForeground(Color.BLACK);
                l3.setBounds(430,170,200,50);
                l13=new JLabel();
                l13.setFont(new Font("arial",Font.BOLD,12));
                l13.setForeground(Color.RED);
                l13.setBounds(720,180,100,30);
                t3=new JTextField();
                t3.setFont(new Font("arial",Font.BOLD,15));
                t3.setForeground(Color.BLACK);
                t3.setBounds(570,180,150,30);
                t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }});
                
                
                
                l4=new JLabel("Last Name:");
                l4.setFont(new Font("arial",Font.BOLD,17));
                l4.setForeground(Color.BLACK);
                l4.setBounds(830,170,200,50);
                l14=new JLabel();
                l14.setFont(new Font("arial",Font.BOLD,12));
                l14.setForeground(Color.RED);
                l14.setBounds(1100,180,100,30);
                t4=new JTextField();
                t4.setFont(new Font("arial",Font.BOLD,15));
                t4.setForeground(Color.BLACK);
                t4.setBounds(950,180,150,30);
                t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t4KeyReleased(evt);
            }});
                
                
                
                l5=new JLabel("Gender:");
                l5.setFont(new Font("arial",Font.BOLD,17));
                l5.setForeground(Color.BLACK);
                l5.setBounds(50,240,200,50);
                
                r1=new JRadioButton("Male");
                r1.setFont(new Font("arial",Font.BOLD,15));
                r1.setForeground(Color.BLACK);
                r1.setBounds(170,250,80,30);
                r2=new JRadioButton("Female");
                r2.setFont(new Font("arial",Font.BOLD,15));
                r2.setForeground(Color.BLACK);
                r2.setBounds(250,250,80,30);
                bg=new ButtonGroup();
                bg.add(r1);bg.add(r2);
                r1.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent i2) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                    r3=(JRadioButton)i2.getItem();
                    
                    
                    }
                });
                r2.addItemListener(new ItemListener() {

                    @Override
                    public void itemStateChanged(ItemEvent i3) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                    r3=(JRadioButton)i3.getItem();
                    
                    
                    }
                });
//                if(r1.isSelected())
//                {
//                    s2="Male";
//                }
//                else if(r2.isSelected())
//                {
//                    s2="Female";
//                }
                
                
                l6=new JLabel("Mobile No:");
                l6.setFont(new Font("arial",Font.BOLD,17));
                l6.setForeground(Color.BLACK);
                l6.setBounds(430,240,200,50);
                t6=new JTextField();
                t6.setFont(new Font("arial",Font.BOLD,15));
                t6.setForeground(Color.BLACK);
                t6.setBounds(570,250,150,30);
                l16=new JLabel();
                l16.setFont(new Font("arial",Font.BOLD,12));
                l16.setForeground(Color.RED);
                l16.setBounds(720,250,100,30);
                t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t6KeyReleased(evt);
            }});
                
                
                
                
                l7=new JLabel("E-mail:");
                l7.setFont(new Font("arial",Font.BOLD,17));
                l7.setForeground(Color.BLACK);
                l7.setBounds(830,240,200,50);
                t7=new JTextField();
                t7.setFont(new Font("arial",Font.BOLD,15));
                t7.setForeground(Color.BLACK);
                t7.setBounds(950,250,150,30);
                l17=new JLabel();
                l17.setFont(new Font("arial",Font.BOLD,12));
                l17.setForeground(Color.RED);
                l17.setBounds(1100,250,150,30);
                 t7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t7KeyReleased(evt);
            }});
                
                
                
                l8=new JLabel("Address:");
                l8.setFont(new Font("arial",Font.BOLD,17));
                l8.setForeground(Color.BLACK);
                l8.setBounds(50,320,200,50);
                t21=new JTextArea();
                t21.setFont(new Font("arial",Font.BOLD,15));
                t21.setForeground(Color.BLACK);
                t21.setBounds(170,330,150,80);
                t21.setLineWrap(true);
                l18=new JLabel();
                l18.setFont(new Font("arial",Font.BOLD,12));
                l18.setForeground(Color.RED);
                l18.setBounds(320,350,100,30);
                t21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t21KeyReleased(evt);
            }});
                javax.swing.border.Border border=BorderFactory.createLineBorder(Color.BLACK, 1);
                t21.setBorder(border);
                
                l21=new JLabel("Landmark:");
                l21.setFont(new Font("arial",Font.BOLD,17));
                l21.setForeground(Color.BLACK);
                l21.setBounds(430,320,200,50);
                t8=new JTextField();
                t8.setFont(new Font("arial",Font.BOLD,15));
                t8.setForeground(Color.BLACK);
                t8.setBounds(570,330,150,30);
                l22=new JLabel();
                l22.setFont(new Font("arial",Font.BOLD,12));
                l22.setForeground(Color.RED);
                l22.setBounds(720,330,100,30);
                t8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t8KeyReleased(evt);
            }});
                
                
                b3=new JButton("Update Customer Details");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(530,530,300,30);
                
                
                
                
                 l24=new JLabel("<html>Customer<br>Photo:</html>");
                l24.setFont(new Font("arial",Font.BOLD,17));
                l24.setForeground(Color.BLACK);
                l24.setBounds(830,320,200,80);
//                b4=new JButton("Browse");
//                b4.setFont(new Font("arial",Font.BOLD,15));
//                b4.setForeground(Color.BLACK);
//                b4.setBounds(170,460,100,30);
                
                Icon icon1=new ImageIcon("D:\\prologos\\browse.png");
                 b4=new JButton(icon1);
                b4.setFont(new Font("arial",Font.BOLD,15));
                b4.setForeground(Color.BLACK);
                b4.setBounds(1070,340,48,48);
                
                javax.swing.border.Border border1=BorderFactory.createLineBorder(Color.BLACK, 2);
                
                l26=new JLabel();
                l26.setFont(new Font("arial",Font.BOLD,17));
                l26.setForeground(Color.BLACK);
                l26.setBounds(950,320,100,80);
                l26.setBorder(border1);
                l27=new JLabel();
                l27.setFont(new Font("arial",Font.BOLD,12));
                l27.setForeground(Color.BLACK);
                l27.setBounds(950,410,150,30);
                l27.setBorder(border);
                
                
                
                
                l25=new JLabel("<html>Aadhar Card:</html>");
                l25.setFont(new Font("arial",Font.BOLD,17));
                l25.setForeground(Color.BLACK);
                l25.setBounds(50,430,200,80);
                 Icon icon3=new ImageIcon("D:\\prologos\\browse.png");
                b5=new JButton(icon3);
                b5.setFont(new Font("arial",Font.BOLD,15));
                b5.setForeground(Color.BLACK);
                b5.setBounds(280,460,48,48);
                l28=new JLabel();
                l28.setFont(new Font("arial",Font.BOLD,17));
                l28.setForeground(Color.BLACK);
                l28.setBounds(170,440,100,80);
                l28.setBorder(border1);
                l29=new JLabel();
                l29.setFont(new Font("arial",Font.BOLD,12));
                l29.setForeground(Color.BLACK);
                l29.setBounds(170,530,150,30);
                l29.setBorder(border);
                
                
                
                l31=new JLabel("<html><b>Note:</b><br>When you have to change any of your details then before that you have to verify the photo and aadhar card.<html>");
                l31.setFont(new Font("arial",Font.BOLD,13));
                l31.setForeground(Color.RED);
                l31.setBounds(1000,500,250,100);
                
                
                
                add(l10);add(l9);add(l1);add(t1);add(b1);add(b2);
                add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);
                add(l5);add(r1);add(r2);add(l6);add(t6);add(l7);add(t7);add(l8);add(t21);
                add(l21);add(t8);add(b3);add(b4);add(b5);
                add(l12);add(l13);add(l14);add(l16);add(l17);add(l18);add(l22);add(l24);add(l25);add(l26);add(l27);add(l28);
                add(l29);
                
                add(l31);
                l2.setVisible(false);t2.setVisible(false);l3.setVisible(false);t3.setVisible(false);
                l4.setVisible(false);t4.setVisible(false);l5.setVisible(false);
                l6.setVisible(false);t6.setVisible(false);l7.setVisible(false);t7.setVisible(false);
                r1.setVisible(false);r2.setVisible(false);b3.setVisible(false);b4.setVisible(false);b5.setVisible(false);
                l31.setVisible(false);
                //t66.setVisible(true);
                l8.setVisible(false);t21.setVisible(false);l21.setVisible(false);t8.setVisible(false);
                 l12.setVisible(false);l13.setVisible(false);l14.setVisible(false);l16.setVisible(false);l17.setVisible(false);
                 l18.setVisible(false);l22.setVisible(false);l24.setVisible(false);l25.setVisible(false);
                 l26.setVisible(false);
                l27.setVisible(false);
                l28.setVisible(false);
                l29.setVisible(false);
                 
                
                
                
                
                
                
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
                           String sql = "select * from customer where consumer_no = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			if(rs.next())
	        {
                            t2.setText(rs.getString(2));
                            t3.setText(rs.getString(3));
                            t4.setText(rs.getString(4));
//                            t5.setText(rs.getString(5));
//                            //t66.setText(rs.getString(6));
//                            if(t5.getText()=="Female"){
//                                r2.isEnabled();
//                            }else{
//                                r1.isEnabled();
//                            }
//                            if(r3.toString().equals("Male"))
//                            {
//                                r1.setSelected(true);
//                            }
//                            else if(r3.toString().equals("Female"))
//                            {
//                                r2.setSelected(true);
//                            }
//                            r3.setText(rs.getString(5));
                            String gn=rs.getString(5);
                            if(gn.equals("Male"))
                            {
                                r1.setSelected(true);
                            }
                            else
                            {
                                r2.setSelected(true);
                            }
                            t6.setText(rs.getString(6));
                            t7.setText(rs.getString(7));
                            t21.setText(rs.getString(8));
                            t8.setText(rs.getString(9));
                            byte[] img=rs.getBytes(11);//"+t1.getText()+"'
                        ImageIcon image=new ImageIcon(img);
                        java.awt.Image in=image.getImage();
                        java.awt.Image myImg=in.getScaledInstance(l26.getWidth(),l26.getHeight(),java.awt.Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImg);
                        l26.setIcon(newImage);
                        
                        byte[] img1=rs.getBytes(12);//"+t1.getText()+"'
                        ImageIcon image1=new ImageIcon(img1);
                        java.awt.Image in1=image1.getImage();
                        java.awt.Image myImg1=in1.getScaledInstance(l28.getWidth(),l28.getHeight(),java.awt.Image.SCALE_SMOOTH);
                        ImageIcon newImage1=new ImageIcon(myImg1);
                        l28.setIcon(newImage1);
                        
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
                l6.setVisible(true);t6.setVisible(true);l7.setVisible(true);t7.setVisible(true);
                r1.setVisible(true);r2.setVisible(true);b3.setVisible(true);b4.setVisible(true);b5.setVisible(true);
                //t66.setVisible(true);
                l8.setVisible(true);t21.setVisible(true);l21.setVisible(true);t8.setVisible(true);
                 l12.setVisible(true);l13.setVisible(true);l14.setVisible(true);l16.setVisible(true);l17.setVisible(true);
                 l18.setVisible(true);l22.setVisible(true);l24.setVisible(true);l25.setVisible(true);
                 l26.setVisible(true);
                l27.setVisible(true);
                l28.setVisible(true);
                l29.setVisible(true);
                l31.setVisible(true);
                        }else
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
                
                
                
                
                b4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent photo) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           JFileChooser filechooser=new JFileChooser();
           filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
           FileNameExtensionFilter filter=new FileNameExtensionFilter("*.IMAGE","jpg","gif","png");
           filechooser.addChoosableFileFilter(filter);
           int result=filechooser.showSaveDialog(null);
           if(result==JFileChooser.APPROVE_OPTION)
           {
               File selectedfile=filechooser.getSelectedFile();
               String path=selectedfile.getAbsolutePath();
               l26.setIcon(ResizeImage(path));
               s=path;
               l27.setText(path);
//               try
//               {
//                    InputStream is=new FileInputStream(new File(s));
//                          // InputStream is1=new FileInputStream(new File(s1));
//                
//               }
//               catch(Exception mmm)
//               {
//                   mmm.printStackTrace();
//               }
               
           }
           else if(result==JFileChooser.CANCEL_OPTION)
           {
               System.out.println("No Data");
           }
           
           
           }

           public Icon ResizeImage(String path) {
              // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
           ImageIcon image=new ImageIcon(path);
                        java.awt.Image in=image.getImage();
                        java.awt.Image myImg=in.getScaledInstance(l26.getWidth(),l26.getHeight(),java.awt.Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImg);
                        return newImage;
                        
           
           }

           
     
          });     
                b5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent aadhar) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           JFileChooser filechooser1=new JFileChooser();
           filechooser1.setCurrentDirectory(new File(System.getProperty("user.home")));
           FileNameExtensionFilter filter=new FileNameExtensionFilter("*.IMAGE","jpg","gif","png");
           filechooser1.addChoosableFileFilter(filter);
           int result=filechooser1.showSaveDialog(null);
           if(result==JFileChooser.APPROVE_OPTION)
           {
               File selectedfile=filechooser1.getSelectedFile();
               String path1=selectedfile.getAbsolutePath();
               l28.setIcon(ResizeImage(path1));
               s1=path1;
               l29.setText(path1);
//               try
//               {
////                    InputStream is=new FileInputStream(new File(s));
//                           InputStream is1=new FileInputStream(new File(s1));
//                
//               }
//               catch(Exception mmm)
//               {
//                   mmm.printStackTrace();
//               }
           }
           else if(result==JFileChooser.CANCEL_OPTION)
           {
               System.out.println("No Data");
           }
           }

           public Icon ResizeImage(String path1) {
              // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
                        ImageIcon image=new ImageIcon(path1);
                        java.awt.Image in=image.getImage();
                        java.awt.Image myImg=in.getScaledInstance(l28.getWidth(),l28.getHeight(),java.awt.Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImg);
                        return newImage;
           
           }
          });
                
               
                 b3.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent u) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(u.getSource()==b3)
               {
                     if(l12.getText()!="" ||l13.getText()!="" || l14.getText()!="" || l16.getText()!="" || l17.getText()!="" ||l18.getText()!="" ||l22.getText()!="" )
               {
                   JOptionPane.showMessageDialog(null, "Please Fill the Proper Details","Error",JOptionPane.ERROR_MESSAGE);
               }
                     else
                         {
                   if(t1.getText().trim().isEmpty() ||t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty()||t4.getText().trim().isEmpty()||
    t6.getText().trim().isEmpty() ||  t7.getText().trim().isEmpty()||t8.getText().trim().isEmpty()|| bg.getSelection()==null
     || t21.getText().trim().isEmpty()|| l27.getText().trim().isEmpty() || l29.getText().trim().isEmpty())
                                
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("15");      
                        }
                   
                    else
                         {
                             
                             
                             long siz=0;
                                long siz1=0;
                                try 
                                {
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				InputStream is=new FileInputStream(new File(s));
				byte[] b=new byte[2^16];
				int read=is.read(b);
				while(read>-1) {
				baos.write(b,0,read);
				read=is.read(b);
				}
				siz=baos.toByteArray().length;
				System.out.println("Leng: "+siz);
									
				} 
				catch (IOException e) {
											// TODO Auto-generated catch block
				e.printStackTrace();
				}
                                if(siz<999000)
				{
                                
				try {
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				InputStream is=new FileInputStream(new File(s1));
				byte[] b=new byte[2^16];
				int read=is.read(b);
				while(read>-1) {
				baos.write(b,0,read);
				read=is.read(b);
				}
				siz1=baos.toByteArray().length;
				System.out.println("Leng1: "+siz1);
				} catch (IOException e) {
											// TODO Auto-generated catch block
				e.printStackTrace();
				}
										//for photo
				if(siz1<999000)
				{		
                                
                   try
                {
//                    String dat=t6.getDate().toString();
                   // String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(t6.getDate());
                    String text2 = t1.getText();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                String sql = "update customer set fname=?,mname=?,lname=?,gender=?,contact=?,email=?,address=?,landmark=?,photo=?,aadhar=? where consumer_no = '"+text2+"'";
                System.out.println("22");
                
                          PreparedStatement ps = con.prepareStatement(sql);
                          InputStream is=new FileInputStream(new File(s));
                          InputStream is1=new FileInputStream(new File(s1));
                          ps.setString(1, t2.getText());
                          ps.setString(2, t3.getText());
                          ps.setString(3, t4.getText());
                          ps.setString(4, r3.getText());
                          ps.setString(5, t6.getText());
                          ps.setString(6, t7.getText());
                          ps.setString(7, t21.getText());
                          ps.setString(8, t8.getText());
                          ps.setBlob(9,is);
                          ps.setBlob(10, is1);
                         // ps.setString(5, BD);
//                          ps.setString(5, t66.getText());
                          ////ps.setString(5, t66.getText());
                         // ps.setString(6, t7.getText());
                        System.out.println("23");
                          ps.executeUpdate();
                          ps.close();
                          con.close();
                          System.out.println("24");
                           int a = JOptionPane.showConfirmDialog(null, "Are you sure Customer want to Update Details ?","Customer Details",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
//                    dispose();
//                    login obj = new login();
//                    obj.setVisible(true);
                     JOptionPane.showMessageDialog(null, "Successfully Updated","Success",
						JOptionPane.INFORMATION_MESSAGE);
                                  System.out.println("10");
                                                   }
                         
                

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
                                else{
                                    JOptionPane.showMessageDialog(null, "Aadhar Card Size Should be Less than 999kb","Failed",
						JOptionPane.ERROR_MESSAGE);
                                    
                                } 
                        }
                        else{
                                    JOptionPane.showMessageDialog(null, "Photo Size Should be Less than 999kb","Failed",
						JOptionPane.ERROR_MESSAGE);
                                    
                                }
                             
                             
         ///                    
                        }
                       }
        
               }
//                   
//                if (l12.getText()==null && l13.getText()==null && l14.getText()==null && l17.getText()==null)
//                     {
//                       JOptionPane.showMessageDialog(null, "11Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);  
//                       System.out.println("25");
//                   }
//                   
               
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
                l6.setVisible(false);t6.setVisible(false);
                //t6.setVisible(false);
                l7.setVisible(false);t7.setVisible(false);
                r1.setVisible(false);r2.setVisible(false);b3.setVisible(false);b4.setVisible(false);b5.setVisible(false);
               l8.setVisible(false);t21.setVisible(false);l21.setVisible(false);
               l12.setVisible(false);l13.setVisible(false);l14.setVisible(false);
               l16.setVisible(false);l17.setVisible(false);l18.setVisible(false);
               l22.setVisible(false);l24.setVisible(false);l25.setVisible(false);l26.setVisible(false);l27.setVisible(false);
               l28.setVisible(false);l29.setVisible(false);t8.setVisible(false);
                       l16.setVisible(false);  l12.setVisible(false);l13.setVisible(false);l17.setVisible(false);
                       l31.setVisible(false);l27.setText(null);l29.setText(null);
                l14.setVisible(false);   
                        }}});

}
    @Override
    public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static void main(String args[])
    {
        new updatecustomer();
    }
     public void t1KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="^[0-9]{15}";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t1.getText());
        if(!match.matches() )
        {
           l11.setText("Enter Consumer No (15)");
        }
        else
        {
            l11.setText("");
        }
        
    }   
     public void t2KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="^[a-zA-Z]{2,40}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t2.getText());
        if(!match.matches() )
        {
           l12.setText("Enter Name");
        }
        else
        {
            l12.setText("");
        }
        
    }
     public void t3KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="^[a-zA-Z]{2,40}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t3.getText());
        if(!match.matches() )
        {
           l13.setText("Enter Name");
        }
        else
        {
            l13.setText("");
        }
        
    }
     public void t4KeyReleased(java.awt.event.KeyEvent evt) {                                        
        
        String pattern="^[a-zA-Z]{2,40}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t4.getText());
        if(!match.matches() )
        {
           l14.setText("Enter Name");
        }
        else
        {
            l14.setText("");
        }
        
    }
     public void t6KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern ="^[7-9][0-9]{9}";
                
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t6.getText());
        if(!match.matches() )
        {
           l16.setText("Enter Contact No");
        }
        else
        {
            l16.setText("");
        }
        
    }
      public void t7KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern ="^[a-zA-Z0-9_+&*-.]{4,30}[@][a-zA-Z]{0,10}[.][a-zA-Z.]{0,10}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t7.getText());
        if(!match.matches() )
        {
           l17.setText("Enter Proper Email");
        }
        else
        {
            l17.setText("");
        }
        
    }      
       public void t21KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern="[a-zA-z0-9\\s\\W]{10,75}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t21.getText());
        if(!match.matches() )
        {
           l18.setText("Enter Address");
        }
        else
        {
            l18.setText("");
        }
    }      
       public void t8KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern="[a-zA-z0-9\\s\\W]{4,50}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t8.getText());
        if(!match.matches())
        {
           l22.setText("Enter Address");
        }
        else
        {
            l22.setText("");
        }
    }   
       @Override
    public void itemStateChanged(ItemEvent i2) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    r3=(JRadioButton)i2.getItem();
    
    }
}
