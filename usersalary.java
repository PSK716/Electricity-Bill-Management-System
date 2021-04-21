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
//import com.itextpdf.io.image.ImageData; 
//import com.itextpdf.io.image.ImageDataFactory; 
import com.itextpdf.text.Image;

import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.scenario.effect.ImageData;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.sql.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import javafx.scene.control.Cell;
import javax.swing.table.DefaultTableModel;
//import javax.swing.text.StyleConstants.FontConstants;
public class usersalary extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l66,l77,l15,l16,l17,l18,l19;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
JPanel jp1;
JTable j1;
//private static final  Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
//            Font.BOLD);
usersalary()
{                
//                setSize(1368,768);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                setResizable(false);
//               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));
                setVisible(true);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setTitle("Employee Salary");
                setExtendedState(JFrame.MAXIMIZED_BOTH); 
                l15=new JLabel("Employee Salary");
                l15.setFont(new Font("arial",Font.BOLD,30));
                l15.setForeground(Color.BLACK);
                l15.setBackground(Color.BLACK);
                l15.setBounds(550,0,800,80);
                l16=new JLabel("Date:");
                l16.setFont(new Font("arial",Font.BOLD,15));
                l16.setForeground(Color.BLACK);
                l16.setBackground(Color.BLACK);
                l16.setBounds(1050,0,100,80);
                l17=new JLabel("Time:");
                l17.setFont(new Font("arial",Font.BOLD,15));
                l17.setForeground(Color.BLACK);
                l17.setBackground(Color.BLACK);
                l17.setBounds(1050,30,100,80);
                l18=new JLabel();
                l18.setFont(new Font("arial",Font.BOLD,15));
                l18.setForeground(Color.BLACK);
                l18.setBackground(Color.BLACK);
                l18.setBounds(1100,0,100,80);
                l19=new JLabel();
                l19.setFont(new Font("arial",Font.BOLD,15));
                l19.setForeground(Color.BLACK);
                l19.setBackground(Color.BLACK);
                l19.setBounds(1100,30,100,80);

                SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
                Date date=new Date();
                l18.setText(dformat.format(date));
//                DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:MM:SS");
//                LocalDateTime now=LocalDateTime.now();
//                l19.setText(dtf.format(now));

                SimpleDateFormat dformat1=new SimpleDateFormat("hh:mm:ss a");
                l19.setText(dformat1.format(date));

                l1=new JLabel("Enter ID:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(350,100,100,50);
                Icon icon2=new ImageIcon("D:\\prologos\\salary1.png");
                l2=new JLabel(icon2);
                l2.setBounds(440,5,80, 80);
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
                l3=new JLabel("Bank Name:");
                l3.setFont(new Font("arial",Font.BOLD,20));
                l3.setForeground(Color.BLACK);
                l3.setBounds(100,200,200,50);
                t3=new JTextField();
                t3.setFont(new Font("arial",Font.BOLD,15));
                t3.setForeground(Color.BLACK);
                t3.setBounds(240,210,150,30);
                l4=new JLabel("Bank Branch:");
                l4.setFont(new Font("arial",Font.BOLD,20));
                l4.setForeground(Color.BLACK);
                l4.setBounds(100,300,200,50);
                t4=new JTextField();
                t4.setFont(new Font("arial",Font.BOLD,15));
                t4.setForeground(Color.BLACK);
                t4.setBounds(240,310,150,30);
                l5=new JLabel("Account No:");
                l5.setFont(new Font("arial",Font.BOLD,20));
                l5.setForeground(Color.BLACK);
                l5.setBounds(100,400,200,50);
                t5=new JTextField();
                t5.setFont(new Font("arial",Font.BOLD,15));
                t5.setForeground(Color.BLACK);
                t5.setBounds(240,410,150,30);
                b3=new JButton("Proceed");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(170,500,150,30);
                jp1=new JPanel();
                jp1.setBounds(450, 200, 1200,450);
                l6=new JLabel("Working Days:");
                l6.setFont(new Font("arial",Font.BOLD,20));
                l6.setForeground(Color.BLACK);
                l6.setBounds(500,200,200,50);
                l66=new JLabel();
                l66.setFont(new Font("arial",Font.BOLD,12));
                l66.setForeground(Color.RED);
                l66.setBounds(870,200,250,50);
                t6=new JTextField();
                t6.setFont(new Font("arial",Font.BOLD,15));
                t6.setForeground(Color.BLACK);
                t6.setBounds(700,210,150,30);
                t6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t6KeyReleased(evt);
            }});
                b4=new JButton("Calculate");
                b4.setFont(new Font("arial",Font.BOLD,20));
                b4.setBounds(1070,210,150,30);
                l7=new JLabel("Basic Salary:");
                l7.setFont(new Font("arial",Font.BOLD,20));
                l7.setForeground(Color.BLACK);
                l7.setBounds(500,280,200,50);
//                l77=new JLabel("ferf");
//                l77.setFont(new Font("TimesRoman",Font.BOLD,12));
//                l77.setForeground(Color.RED);
//                l77.setBounds(870,280,250,50);
                t7=new JTextField();
                t7.setFont(new Font("arial",Font.BOLD,15));
                t7.setForeground(Color.BLACK);
                t7.setBounds(700,290,150,30);
//                t7.addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyReleased(java.awt.event.KeyEvent evt) {
//                t7KeyReleased(evt);
//            }});
                l8=new JLabel("HRA:");
                l8.setFont(new Font("arial",Font.BOLD,20));
                l8.setForeground(Color.BLACK);
                l8.setBounds(500,360,200,50);
                t8=new JTextField();
                t8.setFont(new Font("arial",Font.BOLD,15));
                t8.setForeground(Color.BLACK);
                t8.setBounds(700,370,150,30);
                l9=new JLabel("Traveling Allowance:");
                l9.setFont(new Font("arial",Font.BOLD,20));
                l9.setForeground(Color.BLACK);
                l9.setBounds(500,440,200,50);
                t9=new JTextField();
                t9.setFont(new Font("arial",Font.BOLD,15));
                t9.setForeground(Color.BLACK);
                t9.setBounds(700,450,150,30);
                l10=new JLabel("Professional Tax:");
                l10.setFont(new Font("arial",Font.BOLD,20));
                l10.setForeground(Color.BLACK);
                l10.setBounds(500,520,200,50);
                t10=new JTextField();
                t10.setFont(new Font("arial",Font.BOLD,15));
                t10.setForeground(Color.BLACK);
                t10.setBounds(700,530,150,30);
                l11=new JLabel("Gross Salary:");
                l11.setFont(new Font("arial",Font.BOLD,20));
                l11.setForeground(Color.BLACK);
                l11.setBounds(920,280,200,50);
                t11=new JTextField();
                t11.setFont(new Font("arial",Font.BOLD,15));
                t11.setForeground(Color.BLACK);
                t11.setBounds(1070,290,150,30);
                l12=new JLabel("Deduction:");
                l12.setFont(new Font("arial",Font.BOLD,20));
                l12.setForeground(Color.BLACK);
                l12.setBounds(920,360,200,50);
                t12=new JTextField();
                t12.setFont(new Font("arial",Font.BOLD,15));
                t12.setForeground(Color.BLACK);
                t12.setBounds(1070,370,150,30);
                l13=new JLabel("Net Salary:");
                l13.setFont(new Font("arial",Font.BOLD,20));
                l13.setForeground(Color.BLACK);
                l13.setBounds(920,440,200,50);
                t13=new JTextField();
                t13.setFont(new Font("arial",Font.BOLD,15));
                t13.setForeground(Color.BLACK);
                t13.setBounds(1070,450,150,30);
                b5=new JButton("Pay Salary");
                b5.setFont(new Font("arial",Font.BOLD,20));
                b5.setBounds(920,530,150,30);
                b6=new JButton("Clear");
                b6.setFont(new Font("arial",Font.BOLD,20));
                b6.setBounds(1100,530,150,30);
                b7=new JButton("Pay Slip");
                b7.setFont(new Font("arial",Font.BOLD,20));
                b7.setBounds(1000,575,150,30);
                
                 Icon icon=new ImageIcon("D:\\prologos\\backlogo.png");
               b9=new JButton(icon);
               b9.setBounds(10,10,100,100);
               add(b9);
               
               
               Icon icon10=new ImageIcon("D:\\prologos\\pdf.png");
                b10=new JButton(icon10);
                b10.setFont(new Font("arial",Font.BOLD,15));
                b10.setForeground(Color.BLACK);
                b10.setBounds(1190,575,60,60);
                
                
                add(b10);
                add(l10);add(l1);add(l2);add(t1);add(b1);add(b2);add(l3);add(t3);add(l4);add(t4);add(l5);add(t5);add(b3);add(l6);add(t6);
                add(l7);add(t7);add(l8);add(t8);add(l9);add(t9);add(l66);add(b4);add(l10);add(t10);add(l15);add(b7);
                add(l11);add(t11);add(l12);add(t12);add(l13);add(t13);add(b5);add(b6);add(l16);add(l17);
                add(l18);add(l19);
                t7.setEditable(false);t10.setEditable(false);t11.setEditable(false);t12.setEditable(false);t13.setEditable(false);
                t3.setEditable(false);t4.setEditable(false);t5.setEditable(false);t8.setEditable(false);t9.setEditable(false);
                l3.setVisible(false);t3.setVisible(false);l4.setVisible(false);t4.setVisible(false);l5.setVisible(false);t5.setVisible(false);
                l6.setVisible(false);l66.setVisible(false);t6.setVisible(false);b3.setVisible(false);b4.setVisible(false);
                l7.setVisible(false);t7.setVisible(false);l8.setVisible(false);t8.setVisible(false);
                l9.setVisible(false);t9.setVisible(false);l10.setVisible(false);t10.setVisible(false);
                l11.setVisible(false);t11.setVisible(false);l12.setVisible(false);t12.setVisible(false);
                l13.setVisible(false);t13.setVisible(false);b5.setVisible(false);b6.setVisible(false);b7.setVisible(false);
                b10.setVisible(false);
                add(jp1);jp1.setVisible(false);
                b1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent a) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(a.getSource()==b1)
                        {
                            try
                {
                    String text1 = t1.getText();
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from user1 where id = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();

                          int i =0;
			if(rs.next())
	        {
				text1= rs.getString("id");

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
			System.out.println(i+" Record Found");System.out.println("5");
                       try{


                       String text2 = t1.getText();
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1 = "select * from user2 where id = '"+text2+"'";
                           System.out.println("22");
                          PreparedStatement ps1 = con.prepareStatement(sql1);
                          ResultSet rs1 = ps1.executeQuery();
                          while(rs1.next())
                        {
                            t3.setText(rs1.getString(2));
                            t4.setText(rs1.getString(3));
                            t5.setText(rs1.getString(4));

                        }
                          rs1.close();
                          ps1.close();
                          con1.close();
                          l3.setVisible(true);t3.setVisible(true);l4.setVisible(true);t4.setVisible(true);l5.setVisible(true);t5.setVisible(true);
			b3.setVisible(true);
                                       
                       }
                        catch(Exception mm)
                {
                    mm.printStackTrace();
                }}
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
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        t1.setText(null);
        t3.setText(null);t4.setText(null);t5.setText(null);
        
        l3.setVisible(false);t3.setVisible(false);l4.setVisible(false);t4.setVisible(false);l5.setVisible(false);t5.setVisible(false);
                l6.setVisible(false);l66.setVisible(false);t6.setVisible(false);b3.setVisible(false);b4.setVisible(false);
                l7.setVisible(false);t7.setVisible(false);l8.setVisible(false);t8.setVisible(false);
                l9.setVisible(false);t9.setVisible(false);l10.setVisible(false);t10.setVisible(false);
                l11.setVisible(false);t11.setVisible(false);l12.setVisible(false);t12.setVisible(false);
                l13.setVisible(false);t13.setVisible(false);b5.setVisible(false);b6.setVisible(false);b7.setVisible(false);
                add(jp1);jp1.setVisible(false);
                t6.setText(null);
                 b10.setVisible(false);
        
        }
    });
                b3.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    l6.setVisible(true);l66.setVisible(true);t6.setVisible(true);
                    b4.setVisible(true);jp1.setVisible(true);
                    
                    }
                });
                b4.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent cal) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

                    if(cal.getSource()==b4)
                        {
                          if(l66.getText()==null)
                        {
                            if(t6.getText().trim().isEmpty())
                        {

                         l7.setVisible(false);t7.setVisible(false);l8.setVisible(false);t8.setVisible(false);
                l9.setVisible(false);t9.setVisible(false);l10.setVisible(false);t10.setVisible(false);
                l11.setVisible(false);t11.setVisible(false);l12.setVisible(false);t12.setVisible(false);
                l13.setVisible(false);t13.setVisible(false);b5.setVisible(false);b6.setVisible(false);b7.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Fill the Working Days ","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else{

                            l7.setVisible(true);t7.setVisible(true);l8.setVisible(true);t8.setVisible(true);
                l9.setVisible(true);t9.setVisible(true);l10.setVisible(true);t10.setVisible(true);
                l11.setVisible(true);t11.setVisible(true);l12.setVisible(true);t12.setVisible(true);
                l13.setVisible(true);t13.setVisible(true);b5.setVisible(true);b6.setVisible(true);
                            float work,bs,hra,ta,pt,gs,ded,net;
                            work=Float.parseFloat(t6.getText());
                            bs=work*1000;
                            t7.setText(""+bs);
                            hra=2000;
                            t8.setText(""+hra);
                             ta=500;
                            t9.setText(""+ta);
//                            pt=(float) 0.05;
//                            pt=(bs+hra+ta)*pt;
                            pt=200;
                            t10.setText(""+pt);
                            gs=bs+hra+ta;
                            t11.setText(""+gs);
                            ded=pt;
                            t12.setText(""+ded);
                            net=gs-ded;
                            t13.setText(""+net);
                            }
                        }
                        }
                    }
                });
                b5.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent pay) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(pay.getSource()==b5)
                        {
                            
                            
                            
                            
                            
                            int m =0;
                            String text1 = t1.getText();
                            try
                            {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from paysalary where id = '"+text1+"'";
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
                           String sql1="insert into paysalary values(?,?,?,?,?,?,?,?,?,?,?,?)";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           pstmt.setString(1, t1.getText());
                           System.out.println("3");
                           pstmt.setString(2, t3.getText());
                           System.out.println("4");
                           pstmt.setString(3, t4.getText());
                           System.out.println("5");
                           pstmt.setString(4, t5.getText());
                           System.out.println("6");
                          
                           System.out.println("7");
                           pstmt.setString(5, t6.getText());
                           System.out.println("9");
                           pstmt.setString(6, t7.getText());
                           
                           pstmt.setString(7, t8.getText());
                           pstmt.setString(8, t9.getText());
                           pstmt.setString(9, t10.getText());
                           pstmt.setString(10, t11.getText());
                           pstmt.setString(11, t12.getText());
                           pstmt.setString(12, t13.getText());
//                           pstmt.setString(11, s);
//                           pstmt.setString(12, s1);
                           
                           System.out.println("10");
                          
                        pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
                        //JOptionPane.showMessageDialog(null, "Successfully Registred","Success",JOptionPane.INFORMATION_MESSAGE);
                          // b=a;
                       int option = JOptionPane.showConfirmDialog(null, "Are You Sure?","Salary",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.setRootFrame(null);
                if (option == JOptionPane.YES_OPTION) {
                    String text3 = t1.getText();
                    JOptionPane.showMessageDialog(null, "Salary Successfully Credited to Employee: "+text3,"Salary",JOptionPane.INFORMATION_MESSAGE);
                         b7.setVisible(true);        
                          
}
                        
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }       
                        }else if(m ==1)
			{
                            JOptionPane.showMessageDialog(null, "Salary is Already Paid","Salary",
						JOptionPane.ERROR_MESSAGE);
                           // l11.setText("Salary is Already Paid");
                                System.out.println("4");
                        }
                        }
                     catch(Exception  q)
                       {
                           
                           q.printStackTrace();
                       } }      
                        
                            

                        }



                    
                });
                b6.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    t6.setText(null);t7.setText(null);t8.setText(null);t9.setText(null);t10.setText(null);t11.setText(null);t12.setText(null);t13.setText(null);
                   b7.setVisible(false); b10.setVisible(false);
                    }
                });
                b7.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent slip) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    if(slip.getSource()==b7)
                        {
                            String id=t1.getText();
                            String bank_name=t3.getText();
                            String bank_branch=t4.getText();
                            String acc_no=t5.getText();
                            String work_day=t6.getText();
                            String basic=t7.getText();
                            String home=t8.getText();
                            String tra=t9.getText();
                            String pro_tax=t10.getText();
                            String gross=t11.getText();
                            String dedu=t12.getText();
                            String netsal=t13.getText();
                            String path="E:\\";
                            com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
                            try
                        {
                         PdfWriter.getInstance(doc, new FileOutputStream(path+""+t1.getText()+"payslip"+".pdf"));
                         doc.open();
                         Image img = Image.getInstance("D:\\prologos\\images3.png");
     doc.add(img);
//                         
                         Paragraph paragraph1=new Paragraph("                                                   Pay Slip",FontFactory.getFont(FontFactory.TIMES_ROMAN,18));                                                                                                          
//                     
                         doc.add(paragraph1);
                         Paragraph paragraph2=new Paragraph("\n                                                    `                                                Date & Time:\t"+l18.getText()+"  "+l19.getText()+"\n",FontFactory.getFont(FontFactory.TIMES_ROMAN,12));                                                                           
//                       
                         doc.add(paragraph2);
                        
                        Paragraph paragraph=new Paragraph("-------------------------------------------------------------------------------------------------------------------------------");                                                                           
//                       
                         doc.add(paragraph);
                         Paragraph paragraph3=new Paragraph("Employee Id:\t"+t1.getText()+"\nEmployee Bank Details:\nBank Name:\t"+t3.getText()+"\nBank Branch:\t"+t4.getText()+"\nAccount Number:\t"+t5.getText()+"\n\n");
                         doc.add(paragraph3);
                         //PdfPTable ptable=new PdfPTable(2);
//                         ptable.addCell("Description");
//                         ptable.addCell("Working Days:");
//                         ptable.addCell("Deductions");
//                         doc.add(ptable);
//                         PdfPCell c1=new PdfPCell(new Phrase("Description"));
//                       ptable.addCell(c1);  
//                       c1=new PdfPCell(new Phrase("Amount"));
                         
//                         Paragraph para=new Paragraph("-------------------------------------------------------------------------------------------------------------------------------");                                                                           
////                       
//                         doc.add(para);
                        Paragraph paragraph4=new Paragraph("Salary Details:\n\n",FontFactory.getFont(FontFactory.TIMES_BOLD,15));
                        doc.add(paragraph4);
//                         Paragraph paragraph5=new Paragraph("Working Days:                                                    "+t6.getText()+"\n\n");
//                         doc.add(paragraph5);
//                         Paragraph paragraph6=new Paragraph("Basic Salary:                                                  "+t7.getText()+"\n\n");
//                         doc.add(paragraph6);
//                         Paragraph paragraph7=new Paragraph("House Rent Allowance:                                  "+t8.getText()+"\n\n");
//                         doc.add(paragraph7);
//                         Paragraph paragraph8=new Paragraph("Traveling Allowance:                                      "+t9.getText()+"\n\n");
//                         doc.add(paragraph8);
//                         Paragraph paragraph9=new Paragraph("Professional Tax:                                           "+t10.getText()+"\n\n");
//                         doc.add(paragraph9);
//                         Paragraph paragraph10=new Paragraph("Gross Salary:                                                 "+t11.getText()+"\n\n");
//                         doc.add(paragraph10);
//                         Paragraph paragraph11=new Paragraph("Deduction:                                                      "+t12.getText()+"\n\n");
//                         doc.add(paragraph11);
//                         Paragraph paragraph12=new Paragraph("Net Salary:                                                     "+t13.getText()+"\n\n\n");
//                         doc.add(paragraph12);
                         
                         
                         
                         
                         
                         PdfPTable ptable=new PdfPTable(2);
                         PdfPCell pcell=new PdfPCell(new Paragraph("Description"));
                         PdfPCell pcell1=new PdfPCell(new Paragraph("Amount"));
                         pcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                         pcell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                         pcell.setFixedHeight(30f);pcell1.setFixedHeight(30f);
                          ptable.addCell(pcell);
                         ptable.addCell(pcell1);
                         
                         PdfPCell p1=new PdfPCell(new Paragraph("Working Days:"));
                         PdfPCell p2=new PdfPCell(new Paragraph("Basic Salary:"));
                         PdfPCell p3=new PdfPCell(new Paragraph("House Rent Allowance:"));
                         PdfPCell p4=new PdfPCell(new Paragraph("Traveling Allowance:"));
                         PdfPCell p5=new PdfPCell(new Paragraph("Professional Tax:"));
                         PdfPCell p6=new PdfPCell(new Paragraph("Gross Salary:"));
                         PdfPCell p7=new PdfPCell(new Paragraph("Deduction:"));
                         PdfPCell p8=new PdfPCell(new Paragraph("Net Salary:"));
                         
                         
                         PdfPCell p11=new PdfPCell(new Paragraph(t6.getText()));
                         PdfPCell p12=new PdfPCell(new Paragraph(t7.getText()));
                         PdfPCell p13=new PdfPCell(new Paragraph(t8.getText()));
                         PdfPCell p14=new PdfPCell(new Paragraph(t9.getText()));
                         PdfPCell p15=new PdfPCell(new Paragraph(t10.getText()));
                         PdfPCell p16=new PdfPCell(new Paragraph(t11.getText()));
                         PdfPCell p17=new PdfPCell(new Paragraph(t12.getText()));
                         PdfPCell p18=new PdfPCell(new Paragraph(t13.getText()));
                         
                         
                         
                         p1.setFixedHeight(30f);p11.setFixedHeight(30f);
                         p2.setFixedHeight(30f);p12.setFixedHeight(30f);
                         p3.setFixedHeight(30f);p13.setFixedHeight(30f);
                         p4.setFixedHeight(30f);p14.setFixedHeight(30f);
                         p5.setFixedHeight(30f);p15.setFixedHeight(30f);
                         p6.setFixedHeight(30f);p16.setFixedHeight(30f);
                         p7.setFixedHeight(30f);p17.setFixedHeight(30f);
                         p8.setFixedHeight(30f);p18.setFixedHeight(30f);
                         
                         
                         p11.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p12.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p13.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p14.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p15.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p16.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p17.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p18.setHorizontalAlignment(Element.ALIGN_CENTER);
                         
                         
                         
                         
                        
//                         ptable.addCell(p1);ptable.addCell(p2);
//                         pcell.addElement(p1);
//                         pcell.addElement(p2);
//                         pcell1.addElement(p3);
//                         pcell1.addElement(p4);
//                         pcell.setRowspan(8);
//                         pcell1.setRowspan(8);
                       ptable.addCell(p1);ptable.addCell(p11);
                        
                         ptable.addCell(p2);ptable.addCell(p12);
                         ptable.addCell(p3);ptable.addCell(p13);
                          ptable.addCell(p4);ptable.addCell(p14);
                          ptable.addCell(p5);ptable.addCell(p15);
                          ptable.addCell(p6);ptable.addCell(p16);
                          ptable.addCell(p7);ptable.addCell(p17);
                          ptable.addCell(p8);ptable.addCell(p18);
                        
                         doc.add(ptable);
                         Paragraph paragraph13=new Paragraph("\n\n"+"Computer Generated Salary Slip.\nSignature not Required.",FontFactory.getFont(FontFactory.TIMES_ITALIC,12));
                         doc.add(paragraph13);
//                         Font.BOLD
                         Paragraph para1=new Paragraph("\n"+"                                                         -------------------------------------------");                                                                           
//                       
                         doc.add(para1);
                         
                         JOptionPane.showMessageDialog(null, "Pay Slip Generated","Salary",JOptionPane.INFORMATION_MESSAGE);
                        b10.setVisible(true);
                        }
                            catch(Exception ee)
                        {
                            ee.printStackTrace();
                        }
                            doc.close();
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
                
                b10.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
//                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                     if (Desktop.isDesktopSupported()) {
    try {
        File myFile = new File("E:");
        Desktop.getDesktop().open(myFile);
        
    } catch (IOException ex) {
        // no application registered for PDFs
    }
}
                    
                    
                    }
                });
}
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new usersalary();
    }
 public void t6KeyReleased(java.awt.event.KeyEvent evt) {

        String pattern ="^[0-2]?[0-9]$|[3]?[0-1]$";
//"[0-3][0-9]";

        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t6.getText());
        if(!match.matches() )
        {
           l66.setText("Enter Proper Working Days (0-31)");
        }
        else
        {
            l66.setText(null);
        }



    }
// public void t7KeyReleased(java.awt.event.KeyEvent evt) {
//
//        String pattern ="^([0-3]?[0-9]{0,5})";
//
//
//        Pattern patt=Pattern.compile(pattern);
//        Matcher match=patt.matcher(t7.getText());
//        if(!match.matches() )
//        {
//           l77.setText("Salary (0-30000)");
//        }
//        else
//        {
//            l77.setText(null);
//        }
//


    }

