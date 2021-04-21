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
import static java.awt.FlowLayout.CENTER;
import static java.awt.Font.BOLD;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class billpayementstatus extends JFrame implements ActionListener{
JLabel l10,l1,l2,l22,l3,l4,l5,l6,l7;
JTextField t1;
JButton b1,b2;
static JTable j1,j11; 
JScrollPane scroll,scroll1;
String[] columnNames = {"Consumer Number","Bill Amount","Payment Type"};
String[] columnNames1 = {"Consumer Number","First Name","Middle Name","Last Name","Billing Unit","Bill Amount","Payment Type","Total Amount","Paid Amount","Return Amount","Bank Name","Cheque Number","Cheque Amount"};
JPanel jp;
DefaultTableModel model,model1 ;
billpayementstatus()
{
    setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                setTitle("Bill Payment Status");
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l10=new JLabel("Check Bill Payment");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
//                l10.setBounds(490,0,800,80);
                l10.setBounds(490,0,800,80);
                
//                l1=new JLabel("Enter ID:");
//                l1.setFont(new Font("TimesRoman",Font.BOLD,20));
//                l1.setForeground(Color.BLACK);
//                l1.setBounds(500,100,100,50);
                Icon icon2=new ImageIcon("D:\\prologos\\status2.png");
                l2=new JLabel(icon2);
                l2.setBounds(420, 10,60, 60);
                
                l22=new JLabel("Consumer Number:");
                l22.setFont(new Font("arial",Font.BOLD,20));
                l22.setForeground(Color.BLACK);
//                l22.setBounds(350,120,250,50);
                l22.setBounds(450,100,300,50);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
//                t1.setBounds(600,130,200,30);
                t1.setBounds(650,110,200,30);
                b1=new JButton("Search");
                b1.setFont(new Font("arial",Font.BOLD,20));
//                b1.setBounds(850,130,150,30);
                 b1.setBounds(450,190,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
//                b2.setBounds(1050,130,150,30);
                b2.setBounds(700,190,150,30);
                 add(l10);add(l2);
                 add(t1);add(b1);add(b2);add(l22);
                 showtabledata();add(scroll);
                b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent l) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           b1 = (JButton)l.getSource();
           showtabledata1();
           System.out.println("1");
            }
        });
                b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            t1.setText(null);
            j11.setModel(new DefaultTableModel());
            
            }
        });
               
    
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void showtabledata()
    {
        DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
                
                j1=new JTable();
                j1.setModel(model);		
		j1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
               j1.setRowSelectionAllowed(true);
               j1.setRowHeight(75);
               JTableHeader tableHeader = j1.getTableHeader();
             // Font tb=tableHeader.setFont(new Font("TimesRoman",Font.BOLD,20));
               Font headerFont = new Font("TimesRoman", Font.BOLD, 14);
              tableHeader.setFont( headerFont);
		//j1.setBackground(Color.yellow);
                //j1.setBounds(50, 250, 1200, 300);
                Font font = new Font("TimesRoman", Font.PLAIN, 14);
      j1.setFont(font);
      
      DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
j1.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);

		 scroll = new JScrollPane(j1);
		scroll.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll.setBounds(20, 100, 250, 500);
               
                String text111 =t1.getText();
		String text2= "";
		String text3= "";
		String text4 = "";
                String text5 ="";
                String text6 = "";
                String text7 = "";
                String text8 = "";
                String text9 = "";
                String text10 = "";
                String text11= "";
                String text12 = "";
                String text13 = "";
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
//                           String sql1 = "select consumer_no,fname,mname,lname,bu,billamount,paymenttype,totalamount,paidamount,returnamount,bankname,chequeno,chequeamount from customer_payment where consumer_no = '"+text111+"'";
                            String sql1 = "select consumer_no,billamount,paymenttype from customer_payment";
                           System.out.println("2");
                          PreparedStatement ps1 = con1.prepareStatement(sql1);
                          ResultSet rs1 = ps1.executeQuery(sql1);
                           System.out.println("22");
                          int i1 =0;
			while(rs1.next())
	        {
				text111= rs1.getString("consumer_no");
//				
                                text6= rs1.getString("billamount");
                                text7= rs1.getString("paymenttype");
//                                
                                model.addRow(new Object[]{text111,text6,text7});
				i1++;	
                                System.out.println("3");
                                
	        }
//			
                
                }
                catch(Exception m)
                {
                    m.printStackTrace();
                }
                        }
                
//                           
    

    
    public void showtabledata1()
    {
        DefaultTableModel model1 = new DefaultTableModel();
		model1.setColumnIdentifiers(columnNames1);
                
                j11=new JTable();
                j11.setModel(model1);		
		j11.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
               j11.setRowSelectionAllowed(true);
               j11.setRowHeight(75);
               JTableHeader tableHeader = j11.getTableHeader();
             // Font tb=tableHeader.setFont(new Font("TimesRoman",Font.BOLD,20));
               Font headerFont = new Font("TimesRoman", Font.BOLD, 14);
              tableHeader.setFont( headerFont);
		//j1.setBackground(Color.yellow);
                //j1.setBounds(50, 250, 1200, 300);
                Font font = new Font("TimesRoman", Font.PLAIN, 14);
      j11.setFont(font);
      
      DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
j11.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(8).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(9).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(10).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(11).setCellRenderer(rightRenderer);
j11.getColumnModel().getColumn(12).setCellRenderer(rightRenderer);
//j11.getColumnModel().getColumn(13).setCellRenderer(rightRenderer);
		 scroll1 = new JScrollPane(j11);
		scroll1.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll1.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll1.setBounds(300, 300, 950, 100);
               //add(scroll);
              
                
                
                
                String text1 = t1.getText();
                             try
                {
                         Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select consumer_no from customer where consumer_no = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			if(rs.next())
	        {
                            rs.getString(1);
//                            l4.setText(rs.getString(2));
//                            l5.setText(rs.getString(3));
////                            l7.setText(rs.getString(4));
////                            l9.setText(rs.getString(5));
////                            l11.setText(rs.getString(6));
////                            l13.setText(rs.getString(7));
//                            l15.setText(rs.getString(4));
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
                String text111 =t1.getText();
		String text2= "";
		String text3= "";
		String text4 = "";
                String text5 ="";
                String text6 = "";
                String text7 = "";
                String text8 = "";
                String text9 = "";
                String text10 = "";
                String text11= "";
                String text12 = "";
                String text13 = "";
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1 = "select consumer_no,fname,mname,lname,bu,billamount,paymenttype,totalamount,paidamount,returnamount,bankname,chequeno,chequeamount from customer_payment where consumer_no = '"+text111+"'";
//                            String sql1 = "select consumer_no,billamount,paymenttype from customer_payment";
                           System.out.println("2");
                          PreparedStatement ps1 = con1.prepareStatement(sql1);
                          ResultSet rs1 = ps1.executeQuery(sql1);
                           System.out.println("22");
                          int i1 =0;
			if(rs1.next())
	        {
				text111= rs1.getString("consumer_no");
				text2 = rs1.getString("fname");
				text3= rs1.getString("mname");
                                text4= rs1.getString("lname");
                                text5= rs1.getString("bu");
                                text6= rs1.getString("billamount");
                                text7= rs1.getString("paymenttype");
                                text8= rs1.getString("totalamount");
                                text9= rs1.getString("paidamount");
                                if(text9!=null)
                                {
                                    rs1.getString("paidamount");
                                }
                                else
                                {
                                 text9="__";
                                    
                                }
                                text10= rs1.getString("returnamount");
                                if(text10!=null)
                                {
                                    rs1.getString("returnamount");
                                }
                                else
                                {
                                 text10="__";
                                    
                                }
                                text11= rs1.getString("bankname");
                                
                                if(text11!=null)
                                {
                                    rs1.getString("bankname");
                                }
                                else
                                {
                                 text11="__";
                                    
                                }
                                text12= rs1.getString("chequeno");
                                if(text12!=null)
                                {
                                    rs1.getString("chequeno");
                                }
                                else
                                {
                                 text12="__";
                                    
                                }
                                text13= rs1.getString("chequeamount");
                                if(text13!=null)
                                {
                                    rs1.getString("chequeamount");
                                }
                                else
                                {
                                 text13="__";
                                    
                                }
                                model1.addRow(new Object[]{text111,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11,text12,text13});
				i1++;	
                                System.out.println("3");
                                //
	        }
			if(i1 <1)
			{
				JOptionPane.showMessageDialog(null, "Bill Not Paid!","Error",
						JOptionPane.ERROR_MESSAGE);
                                System.out.println("4");
			}
                        else if(i1 ==1)
			{
                            JOptionPane.showMessageDialog(null, "Record Found","Success",
						JOptionPane.INFORMATION_MESSAGE);
			System.out.println(i+" Record Found");System.out.println("5");
                        add(scroll1);
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
                        }}
                
                             catch(Exception m)
                {
                    m.printStackTrace();
                }
    } 
    

                
    public static void main(String args[])
    {
        new billpayementstatus();
    }
}
