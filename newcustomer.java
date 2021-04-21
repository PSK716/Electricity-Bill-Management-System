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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.filechooser.FileNameExtensionFilter;
public class newcustomer extends JFrame implements ActionListener,ItemListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;
static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
JRadioButton r1,r2,r3;
JButton b1,b2,b3,b4,b5,b6;
Object s3;
JTextArea  t21;
//JDateChooser t6;
JComboBox c23;
ButtonGroup bg;
ResultSet rs;
String s,s1,s2;
newcustomer()
{
                setSize(1300,650);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
               setResizable(false);
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("New Customer Connection Request");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                l10=new JLabel("New Connection Request");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(480,0,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\new.png");
                l9=new JLabel(icon2);
                l9.setBounds(400, 10,60, 60);
                l1=new JLabel("Consumer Number:");
                l1.setFont(new Font("arial",Font.BOLD,17));
                l1.setForeground(Color.BLACK);
                l1.setBounds(400,100,300,50);
//                l11=new JLabel();
//                l11.setFont(new Font("TimesRoman",Font.BOLD,12));
//                l11.setForeground(Color.RED);
//                l11.setBounds(830,110,150,30);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(620,110,200,30);
//                t1.addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyReleased(java.awt.event.KeyEvent evt) {
//                t1KeyReleased(evt);
//            }});
                
                
                
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
                
                
                
                
                
                
                l23=new JLabel("Billing Unit:");
                l23.setFont(new Font("arial",Font.BOLD,17));
                l23.setForeground(Color.BLACK);
                l23.setBounds(830,320,200,50);
                c23=new JComboBox();
                c23.setFont(new Font("arial",Font.BOLD,15));
                c23.setForeground(Color.BLACK);
                c23.setBounds(950,330,250,30);
                c23.addItem("4100 DAHANU S/DN");
                c23.addItem("4101 BOISAR(R) S/DN");
                c23.addItem("4102 PALGHAR S/DN");
                c23.addItem("4103 SAFALA S/DN");
                c23.addItem("4104 VIRAR EAST S/DN");
                c23.addItem("4105 VIRAR WEST S/DN");
                c23.addItem("4106 NALASOPARA EAST S/DN");
                c23.addItem("4107 NALASOPARA WEST S/DN");
                c23.addItem("4108 VASAI RD.EAST S/DN");
                c23.setSelectedIndex(-1);
                c23.addItemListener(new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent e1) {
            if(e1.getSource()==c23)
            {
                s3=(Object)c23.getSelectedItem();
                
                
            }}});
                
                
                
                l24=new JLabel("<html>Upload<br>Customer<br>Photo:</html>");
                l24.setFont(new Font("arial",Font.BOLD,17));
                l24.setForeground(Color.BLACK);
                l24.setBounds(50,430,200,80);
//                b1=new JButton("Browse");
                Icon icon=new ImageIcon("D:\\prologos\\browse.png");
                b1=new JButton(icon);
                b1.setFont(new Font("arial",Font.BOLD,15));
                b1.setForeground(Color.BLACK);
                b1.setBounds(280,450,48,48);
                l26=new JLabel();
                l26.setFont(new Font("arial",Font.BOLD,17));
                l26.setForeground(Color.BLACK);
                l26.setBounds(170,430,100,80);
                 javax.swing.border.Border border1=BorderFactory.createLineBorder(Color.BLACK, 2);
                l26.setBorder(border1);
                l27=new JLabel();
                l27.setFont(new Font("arial",Font.BOLD,12));
                l27.setForeground(Color.BLACK);
                l27.setBounds(170,520,150,20);
                l27.setBorder(border);
                
                
                
                
                l25=new JLabel("<html>Upload<br>Aadhar Card:</html>");
                l25.setFont(new Font("arial",Font.BOLD,17));
                l25.setForeground(Color.BLACK);
                l25.setBounds(430,430,200,80);
//                b2=new JButton("Browse");
                Icon icon1=new ImageIcon("D:\\prologos\\browse.png");
                 b2=new JButton(icon1);
                b2.setFont(new Font("arial",Font.BOLD,15));
                b2.setForeground(Color.BLACK);
                b2.setBounds(680,450,48,48);
                l28=new JLabel();
                l28.setFont(new Font("arial",Font.BOLD,17));
                l28.setForeground(Color.BLACK);
                l28.setBounds(570,430,100,80);
                l28.setBorder(border1);
                l29=new JLabel();
                l29.setFont(new Font("arial",Font.BOLD,12));
                l29.setForeground(Color.BLACK);
                l29.setBounds(570,520,150,20);
                l29.setBorder(border);
                
                
                b3=new JButton("Terms & Conditions");
                b3.setFont(new Font("arial",Font.BOLD,15));
                b3.setForeground(Color.BLACK);
                b3.setBounds(850,460,250,30);
                
                
                
                
                b4=new JButton("Submit");
                b4.setFont(new Font("arial",Font.BOLD,15));
                b4.setForeground(Color.BLACK);
                b4.setBounds(400,560,150,30);
                
                
                
                b5=new JButton("Clear");
                b5.setFont(new Font("arial",Font.BOLD,15));
                b5.setForeground(Color.BLACK);
                b5.setBounds(700,560,150,30);
                
                
                
                
                l31=new JLabel("<html><b>Note:<br>Size of Image should be between 10 kb to 900 kb<html>");
                l31.setFont(new Font("arial",Font.BOLD,13));
                l31.setForeground(Color.RED);
                l31.setBounds(10,520,250,100);
                
                add(l10);add(l9);
                        add(l1);add(t1);
                        add(l2);add(l12);add(t2);add(l3);add(l13);add(t3);
                add(l4);add(l14);add(t4);add(l5);add(r1);add(r2);add(l6);add(t6);add(l16);
                add(l7);add(t7);add(l17);add(l8);add(t21);add(l18);add(l21);add(t8);add(l22);
                add(l23);add(c23);add(l24);add(b1);add(l25);add(b2);add(b3);add(b4);add(b5);
                add(l26);add(l27);add(l28);add(l29);add(l31);
                t1.setEditable(false);
//                add(r3);
                
                
                
                b1.addActionListener(new ActionListener() {
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
                b2.addActionListener(new ActionListener() {
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
                    public void actionPerformed(ActionEvent e) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    terms t=new terms();
                    t.setVisible(true);
                    
                    
                    }
                });
                
                b4.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent sub) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(sub.getSource()==b4)
                        {
                            System.out.println("11");
                            if( l12.getText()==null && l13.getText()==null && l14.getText()==null && l16.getText()==null &&l17.getText()==null 
                                    && l18.getText()==null && l22.getText()==null)
                                    
                     {System.out.println("12");
                            if(t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty()||t4.getText().trim().isEmpty()||
                                  t6.getText().trim().isEmpty() ||  t7.getText().trim().isEmpty()||t8.getText().trim().isEmpty()|| bg.getSelection()==null
                                    || l27.getText().trim().isEmpty() ||  l29.getText().trim().isEmpty() || c23.getSelectedItem()==null ||l21.getText().trim().isEmpty()
                                )
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("13");      
                        }
                            else
                        {
                            //JOptionPane.showMessageDialog(null, "Successfully Registred","Success",JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("14");   
                                
//                        int m =0;
//                            String text1 = t1.getText();
//                            try
//                            {
//                Class.forName("com.mysql.jdbc.Driver");
//                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
//                           String sql = "select * from customer where consumer_no = '"+text1+"'";
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
//				JOptionPane.showMessageDialog(null, "No Record Found","Error",
//						JOptionPane.ERROR_MESSAGE);
                            //l11.setText("Id is Already Register");
                                System.out.println("4");
	///	
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
//                          String dat=t6.getDate().toString();
                           //String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(t6.getDate());
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1="insert into customer(consumer_no,fname,mname,lname,gender,contact,email,address,landmark,bu,photo,aadhar) values(?,?,?,?,?,?,?,?,?,?,?,?)";
                           System.out.println("2");
                           InputStream is=new FileInputStream(new File(s));
                           InputStream is1=new FileInputStream(new File(s1));
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           
                           pstmt.setString(1, null);
                           System.out.println("3");
                           pstmt.setString(2, t2.getText());
                           System.out.println("4");
                           pstmt.setString(3, t3.getText());
                           System.out.println("5");
                           pstmt.setString(4, t4.getText());
                           System.out.println("6");
                           pstmt.setString(5,r3.getText());
                           System.out.println("7");
                           pstmt.setString(6, t6.getText());
                           System.out.println("9");
                           pstmt.setString(7, t7.getText());
                           pstmt.setString(8, t21.getText());
                           pstmt.setString(9, t8.getText());
                           pstmt.setString(10, s3.toString());
//                           pstmt.setString(11, s);
//                           pstmt.setString(12, s1);
                           pstmt.setBlob(11, is);
                           pstmt.setBlob(12, is1);
                           System.out.println("10");
                          
                        pstmt.executeUpdate();
                        pstmt.close();
                        
                        
                          // b=a;
//                       try
//                            {
                        String text11=t6.getText();
//                Class.forName("com.mysql.jdbc.Driver");
//                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql2 = "select consumer_no from customer where contact ='"+text11+"'";
                           System.out.println("2");
                          PreparedStatement ps = con1.prepareStatement(sql2);
                          ResultSet rs1 = ps.executeQuery();
                        if(rs1.next())
	        {
                            t1.setText(rs1.getString(1));
//                            m++;
                }
                        String r=t1.getText();
                        JOptionPane.showMessageDialog(null, "Consumer Number:"+r+"  Successfully Registered","Success",JOptionPane.INFORMATION_MESSAGE);
                       con1.close();}
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }
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
                        
//                        }else if(m ==1)
//			{
//                            JOptionPane.showMessageDialog(null, "ID is Already Exist","Failed",
//						JOptionPane.ERROR_MESSAGE);
//                            l11.setText("Id is Already Exist");
//                                System.out.println("4");
//                        }
//                        }
//                     catch(Exception  q)
//                       {
//                           
//                           q.printStackTrace();
//                       } }      
                        
                     }
    else if(t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty()||t4.getText().trim().isEmpty()||
    t6.getText().trim().isEmpty() ||  t7.getText().trim().isEmpty()||t8.getText().trim().isEmpty()|| bg.getSelection()==null
     || l27.getText().trim().isEmpty() ||  l29.getText().trim().isEmpty() || c23.getSelectedItem()==null ||l21.getText().trim().isEmpty()
                                )
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("15");      
                        }
                            else
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the proper information","Error",JOptionPane.ERROR_MESSAGE);   
                        }
                            
                        }
                    
                    
                    }
                });
                
                b5.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent clear) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(clear.getSource()==b5)
                        {
                            t1.setText(null);
//                            l11.setText(null);
                            l12.setText(null);
                            l13.setText(null);
                            t3.setText(null);t2.setText(null);
                            l14.setText(null);t4.setText(null);
                            bg.clearSelection();
                            t6.setText(null);
                            l16.setText(null);
                            t7.setText(null);l17.setText(null);
                            t21.setText(null);l18.setText(null);
                            t8.setText(null);l22.setText(null);
                            l26.setText(null);l28.setText(null);
                            l29.setText(null);l27.setText(null);
                            c23.setSelectedItem(null);
                            l26.setIcon(null);
                            l28.setIcon(null);
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
        new newcustomer();
    }
//     public void t1KeyReleased(java.awt.event.KeyEvent evt) {                                        
//        
//        String pattern="^[0-9]{15}";
//        Pattern patt=Pattern.compile(pattern);
//        Matcher match=patt.matcher(t1.getText());
//        if(!match.matches() )
//        {
//           l11.setText("Enter Consumer No (15)");
//        }
//        else
//        {
//            l11.setText(null);
//        }
//        
//    }   
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
            l12.setText(null);
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
            l13.setText(null);
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
            l14.setText(null);
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
            l16.setText(null);
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
            l17.setText(null);
        }
        
    }      
       public void t21KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern="[a-zA-z0-9\\s,/.]{10,75}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t21.getText());
        if(!match.matches() )
        {
           l18.setText("Enter Address");
        }
        else
        {
            l18.setText(null);
        }
    }      
       public void t8KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern="[a-zA-z0-9\\s,/.]{4,50}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t8.getText());
        if(!match.matches())
        {
           l22.setText("Enter Landmark");
        }
        else
        {
            l22.setText(null);
        }
    }   
       @Override
    public void itemStateChanged(ItemEvent i2) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    r3=(JRadioButton)i2.getItem();
    
    }
}