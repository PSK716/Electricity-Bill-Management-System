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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class complaints extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l23,l19,l18;
JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b9;
JComboBox c4;
ButtonGroup bg;
ResultSet rs;
String s,s1,s2;
Object s4;
JTextArea t5;
JScrollPane scroll,scr;
static JTable j1; 

String[] columnNames = {"Consumer Number","Complaint Type","Description","Date"};
JPanel jp;
DefaultTableModel model ;
complaints()
{
                    setSize(1368,768);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
                setExtendedState(JFrame.MAXIMIZED_BOTH); 
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setResizable(false);
               setTitle("Customer Complaints");
               l1=new JLabel("Consumer Complaints");
                l1.setFont(new Font("arial",Font.BOLD,30));
                l1.setForeground(Color.BLACK);
                l1.setBackground(Color.BLACK);
                l1.setBounds(490,10,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\complaints1.png");
                l2=new JLabel(icon2);
                l2.setBounds(400, 20,60, 60);
                l3=new JLabel("Enter Consumer Number:");
                l3.setFont(new Font("arial",Font.BOLD,20));
                l3.setForeground(Color.BLACK);
                l3.setBounds(50,150,250,50);
                t3=new JTextField();
                t3.setFont(new Font("arial",Font.BOLD,15));
                t3.setForeground(Color.BLACK);
                t3.setBounds(300,160,200,30);
                
                l4=new JLabel("Complaint Type:");
                l4.setFont(new Font("arial",Font.BOLD,20));
                l4.setForeground(Color.BLACK);
                l4.setBounds(50,250,250,50);
                c4=new JComboBox();
                c4.setFont(new Font("arial",Font.BOLD,15));
                c4.setForeground(Color.BLACK);
                c4.setBounds(300,260,200,30);
                c4.addItem("Power Failure");
                c4.addItem("High Bill");
                c4.addItem("Bill not Received");
                c4.addItem("Meter Problem");
                c4.addItem("Voltage Fluctuation/Dim Supply");
                c4.addItem("Change Of Details");
                 c4.addItem("Other");
                c4.setSelectedIndex(-1);
                c4.addItemListener(new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent e1) {
            if(e1.getSource()==c4)
            {
                s4=(Object)c4.getSelectedItem();
                
                
            }}});
                l5=new JLabel("Complaint Description:");
                l5.setFont(new Font("arial",Font.BOLD,20));
                l5.setForeground(Color.BLACK);
                l5.setBounds(50,350,250,50);
                t5=new JTextArea();
                t5.setFont(new Font("arial",Font.BOLD,15));
                t5.setForeground(Color.BLACK);
                 t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t5KeyReleased(evt);
            }});
                //t5.setBounds(300,360,200,100);
                t5.setLineWrap(true);
                l18=new JLabel();
                l18.setFont(new Font("arial",Font.BOLD,12));
                l18.setForeground(Color.RED);
                l18.setBounds(505,380,100,30);
               
                scr = new JScrollPane(t5);
		scr.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scr.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scr.setBounds(300, 360, 200, 80);
                add(scr);
                b1=new JButton("Register Complaint");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(50,480,250,30);
//                b2=new JButton("Change Complaint");
//                b2.setFont(new Font("TimesRoman",Font.BOLD,20));
//                b2.setBounds(350,480,250,30);
                b3=new JButton("Resolved Complaint");
                b3.setFont(new Font("arial",Font.BOLD,20));
//                b3.setBounds(650,480,250,30);
                b3.setBounds(350,480,250,30);
                b4=new JButton("Search Complaint");
                b4.setFont(new Font("arial",Font.BOLD,20));
                b4.setBounds(50,540,250,30);
                b5=new JButton("Clear");
                b5.setFont(new Font("arial",Font.BOLD,20));
                b5.setBounds(400,540,150,30);
                
                
                
                l23=new JLabel("Date:");
                l23.setFont(new Font("arial",Font.BOLD,15));
                l23.setForeground(Color.BLACK);
                l23.setBounds(1150,0,100,80);
                l19=new JLabel();
                l19.setFont(new Font("arial",Font.BOLD,15));
                l19.setForeground(Color.BLACK);
                l19.setBounds(1200,0,100,80);
                SimpleDateFormat dformat=new SimpleDateFormat("dd-MM-yyyy");
                Date date=new Date();
                l19.setText(dformat.format(date));
                Icon icon=new ImageIcon("D:\\prologos\\backlogo.png");
               b9=new JButton(icon);
               b9.setBounds(1250,590,100,100);
               add(b9);
               add(l1);add(l2);add(l3);add(t3);add(l4);add(c4);add(l5);add(l23);add(l19);add(l18);
               //add(t5);
               add(b1);
               //add(b2);
               add(b3);add(b4);add(b5);
               b1.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent reg) {
                           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        
                        if(reg.getSource()==b1)
                       {
                           if(l18.getText()==null)
                           {
                            if(t3.getText().trim().isEmpty() || c4.getSelectedItem()==null || t5.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                            
                        }
                         
                            else 
                        {
                            int m =0;
                            String text1 = t3.getText();
                            try
                            {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from customer where consumer_no = '"+text1+"'";
                           System.out.println("22");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                            
			if(rs.next())
	        {
                            rs.getString(1);
                            m++;
                }
                             
                        if(m <1)
			{
                            
				JOptionPane.showMessageDialog(null,  "Record not Found!","Error",
						JOptionPane.ERROR_MESSAGE);
                            //l11.setText("Id is Already Register");
                               
                       }
                            
                       
                        
                        else if(m==1)
                        {
                            //JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                             System.out.println("44");
			
                        String text3 = t3.getText();
                        int m2 =0;
                            try
                            {
                    Class.forName("com.mysql.jdbc.Driver");
                           Connection con2=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql2 = "select * from customer_complaints where consumer_no = '"+text3+"'";
                           System.out.println("2");
                          PreparedStatement ps2 = con2.prepareStatement(sql2);
                          ResultSet rs2 = ps2.executeQuery();
                          
                            
			if(rs2.next())
	        {
                            rs2.getString(1);
                            m2++;
                }
                             
                        if(m2 <1)
			{
                         try
                       {    
//                          String dat=t6.getDate().toString();
//                           String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(l19.getDate());
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1="insert into customer_complaints values(?,?,?,?)";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           pstmt.setString(1, t3.getText());
                           System.out.println("3");
                           pstmt.setString(2,s4.toString());
                           System.out.println("4");
                           pstmt.setString(3, t5.getText());
                           System.out.println("5");
                           pstmt.setString(4, l19.getText());
                           System.out.println("6");
//                           pstmt.setString(5, r3.getText());
//                           System.out.println("7");
//                           pstmt.setString(6, BD);
//                           System.out.println("8");
//                           pstmt.setString(7, t7.getText());
//                           System.out.println("9");
//                           pstmt.setString(8, t8.getText());
//                           System.out.println("10");
                          JOptionPane.showMessageDialog(null, "Complaint Registered","Success",JOptionPane.INFORMATION_MESSAGE);
                        pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
                          // b=a;
//                        b3.setVisible(true);
                        
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }
                            // JOptionPane.showMessageDialog(null, "Complaint not Found!","Error",JOptionPane.ERROR_MESSAGE);   
                       }
                        
                        else if(m2 ==1)
			{
                            
                            JOptionPane.showMessageDialog(null, "Complaint Already Register!","Failed",
						JOptionPane.ERROR_MESSAGE);
//                            l11.setText("Id is Already Exist");
                                System.out.println("4");
                        }
                        else
			{
				System.out.println(m2+" Records Found");
                                System.out.println("6");
			}
                            }
                        
                     catch(Exception q)
                       {
                           q.printStackTrace();
                       }
                        }
                            else
                        {
                         JOptionPane.showMessageDialog(null, "Record not Found","Error",JOptionPane.ERROR_MESSAGE);   
                        }
                       
                        
                       }
                            catch(Exception q)
                       {
                           q.printStackTrace();
                       }
                       }}
                           else
                           {
                                JOptionPane.showMessageDialog(null, "Please Fill Description","Error",JOptionPane.ERROR_MESSAGE);   
                           }
                       }
                        
                        }
                    });
               b3.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent del) {
                           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        
                        if(del.getSource()==b3)
                       {
                            if(t3.getText().trim().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill the Consumer Number","Error",JOptionPane.WARNING_MESSAGE);
                            
                        }
                         
                            else 
                        {
                            int m =0;
                            String text1 = t3.getText();
                            try
                            {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from customer where consumer_no = '"+text1+"'";
                           System.out.println("22");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                            
			if(rs.next())
	        {
                            rs.getString(1);
                            m++;
                }
                             
                        if(m <1)
			{
                            
				JOptionPane.showMessageDialog(null, " Record not Found","Error",
						JOptionPane.ERROR_MESSAGE);
                            //l11.setText("Id is Already Register");
                               
                       }
                            
                       
                        
                        else if(m==1)
                        {
                            //JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                             System.out.println("44");
			
                        String text3 = t3.getText();
                        int m2 =0;
                            try
                            {
                    Class.forName("com.mysql.jdbc.Driver");
                           Connection con2=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql2 = "select * from customer_complaints where consumer_no = '"+text3+"'";
                           System.out.println("2");
                          PreparedStatement ps2 = con2.prepareStatement(sql2);
                          ResultSet rs2 = ps2.executeQuery();
                          
                            
			if(rs2.next())
	        {
                            rs2.getString(1);
                            m2++;
                }
                             
                        if(m2 <1)
			{
                         
                             JOptionPane.showMessageDialog(null, "Complaint not Found!","Error",JOptionPane.ERROR_MESSAGE);   
                       }
                        
                        else if(m2 ==1)
			{JOptionPane.showMessageDialog(null, "Record Found ","Success",JOptionPane.INFORMATION_MESSAGE);
                        int a = JOptionPane.showConfirmDialog(null, "You want to Delete Complaint?","Complaint",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                            try
                       {    
//                          String dat=t6.getDate().toString();
//                           String BD = (new java.text.SimpleDateFormat("MM/dd/yyyy")).format(l19.getDate());
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1="delete from customer_complaints where consumer_no ='"+text3+"'";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
//                           pstmt.setString(1, t3.getText());
//                           System.out.println("3");
//                           pstmt.setString(2,s4.toString());
//                           System.out.println("4");
//                           pstmt.setString(3, t5.getText());
//                           System.out.println("5");
//                           pstmt.setString(4, l19.getText());
//                           System.out.println("6");
//                           pstmt.setString(5, r3.getText());
//                           System.out.println("7");
//                           pstmt.setString(6, BD);
//                           System.out.println("8");
//                           pstmt.setString(7, t7.getText());
//                           System.out.println("9");
//                           pstmt.setString(8, t8.getText());
//                           System.out.println("10");
                          
                        pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
                          // b=a;
//                        b3.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Complaint Resolved Successfully ","Success",JOptionPane.INFORMATION_MESSAGE);
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }
//                            JOptionPane.showMessageDialog(null, "Complaint Already Register!","Failed",
//						JOptionPane.ERROR_MESSAGE);
//                            l11.setText("Id is Already Exist");
                                System.out.println("4");
                        }}
                        else
			{
				System.out.println(m2+" Records Found");
                                System.out.println("6");
			}
                            }
                        
                     catch(Exception q)
                       {
                           q.printStackTrace();
                       }
                        }
                            
                       
                        
                       }
                            catch(Exception q)
                       {
                           q.printStackTrace();
                       }
                       }}
                        
                        }
                    });
               b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent se) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           b4 = (JButton)se.getSource();
           showtabledata();
           System.out.println("1");
            }
        });
               b5.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent clear) {
                           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        t3.setText(null);c4.setSelectedItem(null);t5.setText(null);
            j1.setModel(new DefaultTableModel());
                        l18.setText(null);
                        }
                    });
                b9.addActionListener(new ActionListener() {

                 @Override
                 public void actionPerformed(ActionEvent el) {
                     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 
                 
                 if(el.getSource()==b9)
                 {
                     usersuccess l1=new usersuccess();
                     l1.setVisible(true);
                     l1.setLocationRelativeTo(null);
                     dispose();
                 }
                 
                 
                 }
             });
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
j1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
//j1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

		 scroll = new JScrollPane(j1);
		scroll.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll.setBounds(550, 260, 700, 175);
               //add(scroll);
              
                String text1 = "";
		String text2= "";
		String text3= "";
		String text4 = "";
//                String text5 ="";
//                String text6 = "";
//                String text7 = "";
//                String text8 = "";
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from customer_complaints";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			while(rs.next())
	        {
				text1= rs.getString("consumer_no");
				text2 = rs.getString("type");
				text3= rs.getString("description");
                                text4= rs.getString("da");
                                
                                model.addRow(new Object[]{text1,text2,text3,text4});
				i++;	
                                System.out.println("3");
                                
	        }
                        add(scroll);
//			if(i <1)
//			{
//				JOptionPane.showMessageDialog(null, "No Record Found","Error",
//						JOptionPane.ERROR_MESSAGE);
//                                System.out.println("4");
//			}
//                        else if(i ==1)
//			{
//                            JOptionPane.showMessageDialog(null, "Record Found","Success",
//						JOptionPane.INFORMATION_MESSAGE);
//			System.out.println(i+" Record Found");System.out.println("5");
//                        add(scroll);
//			}
//			else
//			{
//				System.out.println(i+" Records Found");
//                                System.out.println("6");
//			}
//		
                }
                catch(Exception m)
                {
                    m.printStackTrace();
                }}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[] )
    {
        new complaints();
    }
    public void t5KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern="[a-zA-z0-9\\s\\W]{5,75}$";
                //"^[a-zA-z0-9\\s]{0,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t5.getText());
        if(!match.matches() )
        {
           l18.setText("Enter Description");
        }
        else
        {
            l18.setText(null);
        }
    }     
}
