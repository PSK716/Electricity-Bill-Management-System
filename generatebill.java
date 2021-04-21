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
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
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
public class generatebill extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l211,l222,l31,l32;
static JTextField t1,t2,t3,t4,t8,t9;
JRadioButton r1,r2,r3;
JButton b1,b2,b3,b4,b5,b6;
JTextArea  t7;
JDateChooser t6;
ButtonGroup bg;
    generatebill()
    {
                setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Generate Bill");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l16=new JLabel("Generate Consumer Bill");
                l16.setFont(new Font("arial",Font.BOLD,30));
                l16.setForeground(Color.BLACK);
                l16.setBackground(Color.BLACK);
                l16.setBounds(500,10,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\billgeneration1.png");
                l18=new JLabel(icon2);
                l18.setBounds(400, 10,80, 80);
                l17=new JLabel("Enter Consumer Number:");
                l17.setFont(new Font("arial",Font.BOLD,20));
                l17.setForeground(Color.BLACK);
                l17.setBounds(350,120,250,50);
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
                l2.setFont(new Font("arial",Font.BOLD,15));
                l2.setForeground(Color.BLACK);
                l2.setBounds(20,180,100,50);
                l3=new JLabel();
                l3.setFont(new Font("arial",Font.BOLD,12));
                l3.setForeground(Color.BLACK);
                l3.setBounds(120,180,100,50);
                l4=new JLabel();
                l4.setFont(new Font("arial",Font.BOLD,12));
                l4.setForeground(Color.BLACK);
                l4.setBounds(200,180,100,50);
                l5=new JLabel();
                l5.setFont(new Font("arial",Font.BOLD,12));
                l5.setForeground(Color.BLACK);
                l5.setBounds(280,180,250,50);
                
                
                
                l6=new JLabel("Mobile No:");
                l6.setFont(new Font("arial",Font.BOLD,15));
                l6.setForeground(Color.BLACK);
                l6.setBounds(20,230,250,50);
                l7=new JLabel();
                l7.setFont(new Font("arial",Font.BOLD,12));
                l7.setForeground(Color.BLACK);
                l7.setBounds(120,230,250,50);
                
                
                
                
                l8=new JLabel("E-mail:");
                l8.setFont(new Font("arial",Font.BOLD,15));
                l8.setForeground(Color.BLACK);
                l8.setBounds(20,280,250,50);
                l9=new JLabel();
                l9.setFont(new Font("arial",Font.BOLD,12));
                l9.setForeground(Color.BLACK);
                l9.setBounds(120,280,250,50);
                
                
                
                l10=new JLabel("Address:");
                l10.setFont(new Font("arial",Font.BOLD,15));
                l10.setForeground(Color.BLACK);
                l10.setBounds(20,330,250,50);
                l11=new JLabel();
                l11.setFont(new Font("arial",Font.BOLD,12));
                l11.setForeground(Color.BLACK);
                l11.setBounds(120,330,450,50);
                
                
                
                l12=new JLabel("Landmark:");
                l12.setFont(new Font("arial",Font.BOLD,15));
                l12.setForeground(Color.BLACK);
                l12.setBounds(20,380,250,50);
                l13=new JLabel();
                l13.setFont(new Font("arial",Font.BOLD,12));
                l13.setForeground(Color.BLACK);
                l13.setBounds(120,380,250,50);
                
                
                
                l14=new JLabel("Biling Unit:");
                l14.setFont(new Font("arial",Font.BOLD,15));
                l14.setForeground(Color.BLACK);
                l14.setBounds(20,430,250,50);
                l15=new JLabel();
                l15.setFont(new Font("arial",Font.BOLD,12));
                l15.setForeground(Color.BLACK);
                l15.setBounds(120,430,250,50);
                
                
                l19=new JLabel("Date:");
                l19.setFont(new Font("arial",Font.BOLD,15));
                l19.setForeground(Color.BLACK);
                l19.setBounds(1050,20,100,50);
                l20=new JLabel();
                l20.setFont(new Font("arial",Font.BOLD,15));
                l20.setForeground(Color.BLACK);
                l20.setBounds(1100,20,100,50);
                
                SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
                Date date=new Date();
                l20.setText(dformat.format(date));
                
                
                b3=new JButton("Proceed");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(80,500,150,30);
                
                
                l21=new JLabel("Total Units Consumed:");
                l21.setFont(new Font("arial",Font.BOLD,17));
                l21.setForeground(Color.BLACK);
                l21.setBounds(700,180,200,50);
                t2=new JTextField();
                t2.setFont(new Font("arial",Font.BOLD,15));
                t2.setForeground(Color.BLACK);
                t2.setBounds(900,190,150,30);
                t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }});
                l211=new JLabel();
                l211.setFont(new Font("arial",Font.BOLD,12));
                l211.setForeground(Color.RED);
                l211.setBounds(1070,180,200,50);
                
                
                
                
                l22=new JLabel("Per Unit Rate:");
                l22.setFont(new Font("arial",Font.BOLD,17));
                l22.setForeground(Color.BLACK);
                l22.setBounds(700,230,200,50);
                t3=new JTextField();
                t3.setFont(new Font("arial",Font.BOLD,15));
                t3.setForeground(Color.BLACK);
                t3.setBounds(900,240,150,30);
                t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }});
                l222=new JLabel();
                l222.setFont(new Font("arial",Font.BOLD,12));
                l222.setForeground(Color.RED);
                l222.setBounds(1070,230,200,50);
                
                
                
                 b4=new JButton("Calculate");
                b4.setFont(new Font("arial",Font.BOLD,20));
                b4.setBounds(800,300,150,30);
                
                
                l23=new JLabel("Fixed Charges(FC):");
                l23.setFont(new Font("arial",Font.BOLD,15));
                l23.setForeground(Color.BLACK);
                l23.setBounds(700,330,200,50);
                l24=new JLabel();
                l24.setFont(new Font("arial",Font.BOLD,15));
                l24.setForeground(Color.BLACK);
                l24.setBounds(900,330,200,50);
                
                
                
                
                l25=new JLabel("Enery Charges(EC):");
                l25.setFont(new Font("arial",Font.BOLD,15));
                l25.setForeground(Color.BLACK);
                l25.setBounds(700,380,200,50);
                l26=new JLabel();
                l26.setFont(new Font("arial",Font.BOLD,15));
                l26.setForeground(Color.BLACK);
                l26.setBounds(900,380,200,50);
                
                
                
                l27=new JLabel("<html>Wheeling Charges<br>@ 1.45 Rs/U:</html>");
                l27.setFont(new Font("arial",Font.BOLD,15));
                l27.setForeground(Color.BLACK);
                l27.setBounds(700,430,200,50);
                l28=new JLabel();
                l28.setFont(new Font("arial",Font.BOLD,15));
                l28.setForeground(Color.BLACK);
                l28.setBounds(900,430,200,50);
                
                
                
                l29=new JLabel("<html>Electricity Duty(ED)<br>@ 16.0%:</html>");
                l29.setFont(new Font("arial",Font.BOLD,15));
                l29.setForeground(Color.BLACK);
                l29.setBounds(700,480,200,50);
                l30=new JLabel();
                l30.setFont(new Font("arial",Font.BOLD,15));
                l30.setForeground(Color.BLACK);
                l30.setBounds(900,480,200,50);
                
                
                
                
                l31=new JLabel("Total Bill Payable:");
                l31.setFont(new Font("arial",Font.BOLD,15));
                l31.setForeground(Color.BLACK);
                l31.setBounds(700,530,200,50);
                l32=new JLabel();
                l32.setFont(new Font("arial",Font.BOLD,15));
                l32.setForeground(Color.BLACK);
                l32.setBounds(900,530,200,50);
                
                b5=new JButton("Save");
                b5.setFont(new Font("arial",Font.BOLD,20));
                b5.setBounds(1050,490,150,30);
                
                
                b6=new JButton("Generate Bill");
                b6.setFont(new Font("arial",Font.BOLD,20));
                b6.setBounds(1040,540,175,30);
                
                
                add(l16);add(l17);add(l18);add(l19);add(l20);
                add(l10);
                add(l9);
               
                add(t1);add(b1);add(b2);add(l2);add(l3);
                add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l10);
                add(l11);add(l12);add(l13);add(l14);add(l15);
                add(b3);
                l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);
                l6.setVisible(false);l7.setVisible(false);l8.setVisible(false);l9.setVisible(false);
                l10.setVisible(false);l11.setVisible(false);l12.setVisible(false);l13.setVisible(false);
                l14.setVisible(false);l15.setVisible(false);
                b3.setVisible(false);
                add(l21);add(l211);
                add(t2);
                add(l22);add(t3);add(l222);
                add(l23);add(l24);add(l25);add(l26);add(l27);add(l28);add(l29);add(l30);add(l31);add(l32);
                add(b4);add(b5);add(b6);
                
                l21.setVisible(false); l211.setVisible(false); t2.setVisible(false); l22.setVisible(false);
                 t3.setVisible(false); l222.setVisible(false); l23.setVisible(false); l24.setVisible(false);
                 l25.setVisible(false); l26.setVisible(false); l27.setVisible(false); l28.setVisible(false);
                  l29.setVisible(false); l30.setVisible(false); l31.setVisible(false); l32.setVisible(false);
                  b4.setVisible(false); b5.setVisible(false); 
                  b6.setVisible(false);
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
                           String sql = "select fname,mname,lname,contact,email,address,landmark,bu from customer where consumer_no = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			if(rs.next())
	        {
                            l3.setText(rs.getString(1));
                            l4.setText(rs.getString(2));
                            l5.setText(rs.getString(3));
                            l7.setText(rs.getString(4));
                            l9.setText(rs.getString(5));
                            l11.setText(rs.getString(6));
                            l13.setText(rs.getString(7));
                            l15.setText(rs.getString(8));
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
                            JOptionPane.showMessageDialog(null, "Record Found","Success",
						JOptionPane.INFORMATION_MESSAGE);
			System.out.println(i+" Record Found");
                        System.out.println("5");
                        l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
                        l6.setVisible(true);l7.setVisible(true);l8.setVisible(true);l9.setVisible(true);
                        l10.setVisible(true);l11.setVisible(true);l12.setVisible(true);l13.setVisible(true);
                        l14.setVisible(true);l15.setVisible(true);b3.setVisible(true);
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
                }}}});
                
                
                
                b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent cl) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            if(cl.getSource()==b2)
                        {
                            l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);
                l6.setVisible(false);l7.setVisible(false);l8.setVisible(false);l9.setVisible(false);
                l10.setVisible(false);l11.setVisible(false);l12.setVisible(false);l13.setVisible(false);
                l14.setVisible(false);l15.setVisible(false);
                b3.setVisible(false);
                
                l21.setVisible(false); l211.setVisible(false); t2.setVisible(false); l22.setVisible(false);
                 t3.setVisible(false); l222.setVisible(false); l23.setVisible(false); l24.setVisible(false);
                 l25.setVisible(false); l26.setVisible(false); l27.setVisible(false); l28.setVisible(false);
                  l29.setVisible(false); l30.setVisible(false); l31.setVisible(false); l32.setVisible(false);
                  b4.setVisible(false); b5.setVisible(false); b6.setVisible(false);
                  t1.setText(null);t2.setText(null);t3.setText(null);
                  
                  
                
                        }
            
            }
        });
                
                b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent pro) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(pro.getSource()==b3)
                        {
                            l21.setVisible(true); l211.setVisible(true); t2.setVisible(true); l22.setVisible(true);
                 t3.setVisible(true); l222.setVisible(true);
                  b4.setVisible(true);
                            
                        }
            
            
            }
        });
                b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent cal) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                if(cal.getSource()==b4)
                        {
                            if(l211.getText()==null && l222.getText()==null){
                        {
                            if(t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill the Unit & Unit Rates ","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("13");    
                        }
                            else
                        {
                                
                            l23.setVisible(true); l24.setVisible(true);
                 l25.setVisible(true); l26.setVisible(true); l27.setVisible(true); l28.setVisible(true);
                  l29.setVisible(true); l30.setVisible(true); l31.setVisible(true); l32.setVisible(true);
                   b5.setVisible(true);
                      int unit_consumed=Integer.parseInt(t2.getText());
                      float unit_rate=Float.parseFloat(t3.getText());
                      float fixed,energy,electricity,wheeling,total;
                      fixed=(float) 110.00;
                      energy=unit_consumed*unit_rate;
                      wheeling=(float) (unit_consumed *1.45);
                      
                      
                      float elec;
                      elec=fixed+energy+wheeling;
                      electricity=(float) (elec/16.00);
                      l24.setText(""+fixed);
                      l26.setText(""+energy);
                      l28.setText(""+wheeling);
                      l30.setText(""+electricity);
                      
                      total=(fixed+energy+wheeling+electricity);
                      l32.setText(""+total);
                      
                        }}
                        }
                           else  if(t2.getText().trim().isEmpty()||t3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill the Unit & Unit Rates ","Error",JOptionPane.WARNING_MESSAGE);
                         System.out.println("13");    
                        }
                        
                else
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill the proper values","Error",JOptionPane.ERROR_MESSAGE);   
                        }
            
                        }
            
            }
        });
            b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent da) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            if(da.getSource()==b5)
                    {
                        
                        int m =0;
                            String text1 = t1.getText();
                        
                        
                        try
                            {
                        Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from generate_bill where consumer_no = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                            System.out.println("22");
			if(rs.next())
	        {
//                            System.out.println("222");
//                            t1.setText(rs.getString(1));
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
                           String sql1="insert into generate_bill values(?,?,?,?,?,?,?,?)";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           pstmt.setString(1, t1.getText());
                           System.out.println("3");
                           pstmt.setString(2, t2.getText());
                           System.out.println("4");
                           pstmt.setString(3, t3.getText());
                           System.out.println("5");
                           pstmt.setString(4, l24.getText());
                           System.out.println("6");
                           pstmt.setString(5,l26.getText());
                           System.out.println("7");
                           pstmt.setString(6,l28.getText());
                           pstmt.setString(7,l30.getText());
                           System.out.println("10");
                          pstmt.setString(8,l32.getText());
                        pstmt.executeUpdate();
                        pstmt.close();
                        con1.close();
                        JOptionPane.showMessageDialog(null, "Bill Saved!","Success",JOptionPane.INFORMATION_MESSAGE);
                          // b=a;
                       
                         b6.setVisible(true);
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }   }
                          else if(m ==1)
			{
                            JOptionPane.showMessageDialog(null, "Bill Already Generated","Failed",
						JOptionPane.ERROR_MESSAGE);
//                            l11.setText("Id is Already Exist");
                                System.out.println("4");
                        }
                        }
                     catch(Exception  q)
                       {
                           
                           q.printStackTrace();
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
                         PdfWriter.getInstance(doc, new FileOutputStream(path+""+t1.getText()+"ElectricityBill"+".pdf"));
                         doc.open();
                                                                                                                          
                         com.itextpdf.text.Image img = com.itextpdf.text.Image.getInstance("D:\\prologos\\images3.png");
     doc.add(img);
                         
                        //Paragraph paragraph3=new Paragraph("\n                                                                                                                    Time:\t"+l19.getText());
                        Paragraph paragraph1=new Paragraph("                                                Electricity Bill",FontFactory.getFont(FontFactory.TIMES_ROMAN,18));         
                         doc.add(paragraph1);
                        Paragraph paragraph2=new Paragraph("\n                                                    `                                                                                         Date:"+l20.getText()+"\n",FontFactory.getFont(FontFactory.TIMES_ROMAN,12));                                                                           
                          doc.add(paragraph2);
                        // doc.add(paragraph3);
                         Paragraph paragraph=new Paragraph("-------------------------------------------------------------------------------------------------------------------------------");                                                                           
//                       
                         doc.add(paragraph);
                        
                         Paragraph paragraph3=new Paragraph("Consumer Number:"+t1.getText()+"\nCustomer Details:\nName:  "+l3.getText()+"  "+l4.getText()+"  "+l5.getText()+"\nContact Number:  "+l7.getText()+"\n"
                                 + "E-mail:  "+l9.getText()+"\nAddress:  "+l11.getText()+"\nLandmark:  "+l13.getText()+"\nBilling Unit:  "+l15.getText()+"\n\n\n\n");
                         doc.add(paragraph3);
                         //PdfPTable ptable=new PdfPTable(2);
//                         ptable.addCell("Description");
//                         ptable.addCell("Working Days:");
//                         ptable.addCell("Deductions");
//                         doc.add(ptable);
//                         PdfPCell c1=new PdfPCell(new Phrase("Description"));
//                       ptable.addCell(c1);  
//                       c1=new PdfPCell(new Phrase("Amount"));
                        Paragraph paragraph4=new Paragraph("Bill Details:\n\n",FontFactory.getFont(FontFactory.TIMES_BOLD,15));
                        doc.add(paragraph4);
//                         Paragraph paragraph55=new Paragraph("Total Units Consumed:                                                   "+t2.getText()+"\n\n");
//                         doc.add(paragraph55);
//                         Paragraph paragraph5=new Paragraph("Fixed Charges (FC):                                                      "+l24.getText()+"\n\n");
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
                         
                         
                         
                         
                          PdfPTable ptable=new PdfPTable(2);
                         PdfPCell pcell=new PdfPCell(new Paragraph("Description"));
                         PdfPCell pcell1=new PdfPCell(new Paragraph("Amount"));
                         pcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                         pcell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                         pcell.setFixedHeight(30f);pcell1.setFixedHeight(30f);
                          ptable.addCell(pcell);
                         ptable.addCell(pcell1);
                         
                         PdfPCell p1=new PdfPCell(new Paragraph("Total Units Consumed:"));
                         PdfPCell p2=new PdfPCell(new Paragraph("Fixed Charges (FC):"));
                         PdfPCell p3=new PdfPCell(new Paragraph("Energy Charges (EC):"));
                         PdfPCell p4=new PdfPCell(new Paragraph("Wheeling Charges @ 1.45 Rs/U:"));
                         PdfPCell p5=new PdfPCell(new Paragraph("Electricity Duty (ED) @ 16.0%:"));
                         PdfPCell p6=new PdfPCell(new Paragraph("Total Bill:"));
//                         PdfPCell p7=new PdfPCell(new Paragraph(""));
//                         PdfPCell p8=new PdfPCell(new Paragraph("Net Salary:"));
//                         
                         
                         PdfPCell p11=new PdfPCell(new Paragraph(t2.getText()));
                         PdfPCell p12=new PdfPCell(new Paragraph(l24.getText()));
                         PdfPCell p13=new PdfPCell(new Paragraph(l26.getText()));
                         PdfPCell p14=new PdfPCell(new Paragraph(l28.getText()));
                         PdfPCell p15=new PdfPCell(new Paragraph(l30.getText()));
                         PdfPCell p16=new PdfPCell(new Paragraph(l32.getText()));
//                         PdfPCell p17=new PdfPCell(new Paragraph(t12.getText()));
//                         PdfPCell p18=new PdfPCell(new Paragraph(t13.getText()));
                         
                         
                         
                         p1.setFixedHeight(30f);p11.setFixedHeight(30f);
                         p2.setFixedHeight(30f);p12.setFixedHeight(30f);
                         p3.setFixedHeight(30f);p13.setFixedHeight(30f);
                         p4.setFixedHeight(30f);p14.setFixedHeight(30f);
                         p5.setFixedHeight(30f);p15.setFixedHeight(30f);
                         p6.setFixedHeight(30f);p16.setFixedHeight(30f);
//                         p7.setFixedHeight(30f);p17.setFixedHeight(30f);
//                         p8.setFixedHeight(30f);p18.setFixedHeight(30f);
                         
                         
                         p11.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p12.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p13.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p14.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p15.setHorizontalAlignment(Element.ALIGN_CENTER);
                         p16.setHorizontalAlignment(Element.ALIGN_CENTER);
//                         p17.setHorizontalAlignment(Element.ALIGN_CENTER);
//                         p18.setHorizontalAlignment(Element.ALIGN_CENTER);
                         ptable.addCell(p1);ptable.addCell(p11);
                        
                         ptable.addCell(p2);ptable.addCell(p12);
                         ptable.addCell(p3);ptable.addCell(p13);
                          ptable.addCell(p4);ptable.addCell(p14);
                          ptable.addCell(p5);ptable.addCell(p15);
                          ptable.addCell(p6);ptable.addCell(p16);
//                          ptable.addCell(p7);ptable.addCell(p17);
//                          ptable.addCell(p8);ptable.addCell(p18);
                        
                         doc.add(ptable);
                         Paragraph paragraph13=new Paragraph("\n\n"+"Computer Generated Electricity Bill.",FontFactory.getFont(FontFactory.TIMES_ITALIC,12));
                         doc.add(paragraph13);
                         Paragraph para1=new Paragraph("\n"+"                                                         -------------------------------------------");                                                                           
//                       
                         doc.add(para1);
                         
                         JOptionPane.showMessageDialog(null, "Bill Generated!","Bill",JOptionPane.INFORMATION_MESSAGE);
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new generatebill();
    }
 
    public void t2KeyReleased(java.awt.event.KeyEvent evt) {

        String pattern ="^[0-9]{2,4}";
//"[0-3][0-9]";

        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t2.getText());
        if(!match.matches() )
        {
           l211.setText("Enter Proper Unit (0-9999)");
        }
        else
        {
            l211.setText(null);
        }



    }
    public void t3KeyReleased(java.awt.event.KeyEvent evt) {

        String pattern ="^[0-9.]{2,6}";


        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t3.getText());
        if(!match.matches() )
        {
           l222.setText("Enter Proper Bill Unit Rates ");
        }
        else
        {
            l222.setText(null);
        }

}
}
