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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
public class viewcustomer extends JFrame implements ActionListener,ItemListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
static JTextField t1,t2,t3;

JButton b1,b2,b3;
static JTable j1; 
JScrollPane scroll;
String[] columnNames = {"Consumer Number","First Name","Middle Name","Last Name","Gender","Contact Number","Email-Id","Address","Landmark","Billing Unit","Customer Photo","Aadhar card"};
JPanel jp;
DefaultTableModel model ; 
viewcustomer()
{
    setSize(1300,650);
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());
               setResizable(false);
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
 
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setTitle("Search Customer ");
                l10=new JLabel("Search Customer Details");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(480,0,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\buyer.png");
                l9=new JLabel(icon2);
                l9.setBounds(400, 10,60, 60);
                l1=new JLabel("Enter Consumer Number:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(380,100,300,50);
                
                
                l2=new JLabel();
                l2.setFont(new Font("arial",Font.BOLD,20));
                l2.setForeground(Color.BLACK);
                //l2.setBounds(0,0,5,5);
                l2.setSize(100,100);
                
                l3=new JLabel();
                l3.setFont(new Font("arial",Font.BOLD,20));
                l3.setForeground(Color.BLACK);
//                l3.setBounds(0,0,5,5);
                l3.setSize(100,100);
                
//                l11=new JLabel();
//                l11.setFont(new Font("TimesRoman",Font.BOLD,12));
//                l11.setForeground(Color.RED);
//                l11.setBounds(830,110,150,30);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(640,110,200,30);
                b1=new JButton("Search");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(450,190,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(650,190,150,30);
//                t1.addKeyListener(new java.awt.event.KeyAdapter() {
//            public void keyReleased(java.awt.event.KeyEvent evt) {
//                t1KeyReleased(evt);
//            }});
                 l11=new JLabel();
//                l11.setFont(new Font("arial",Font.BOLD,30));
//                l11.setForeground(Color.BLACK);
//                l11.setBackground(Color.BLACK);
//                l11.setBounds(400,400);
    add(l10);add(l9);add(l1);add(t1);add(b1);add(b2);
    
    
    //add(l2);add(l3);
    b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent l) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           b1 = (JButton)l.getSource();
           showtabledata();
           System.out.println("1");
           
           
            }
        });
                b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            t1.setText(null);
            j1.setModel(new DefaultTableModel());
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
              j1.selectAll();
		//j1.setBackground(Color.yellow);
              JTableHeader tableHeader = j1.getTableHeader();
             // Font tb=tableHeader.setFont(new Font("TimesRoman",Font.BOLD,20));
               Font headerFont = new Font("TimesRoman", Font.BOLD,14);
              tableHeader.setFont( headerFont);
		//j1.setBackground(Color.yellow);
                //j1.setBounds(50, 250, 1200, 300);
                Font font = new Font("TimesRoman", Font.PLAIN, 14);
      j1.setFont(font);
      DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
j1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);

                j1.setBounds(50, 250, 1200, 300);
                j1.setRowHeight(100);
		scroll = new JScrollPane(j1);
		scroll.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll.setBounds(50, 300, 1200, 120);
               //add(scroll);
              
                String text1 = t1.getText();
		String text2= "";
		String text3= "";
		String text4 = "";
                String text5 ="";
                String text6 = "";
                String text7 = "";
                String text8 = "";
                String text9 = "";
                String text10 = "";
               
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
				text1= rs.getString("consumer_no");
				text2 = rs.getString("fname");
				text3= rs.getString("mname");
                                text4= rs.getString("lname");
                                text5= rs.getString("gender");
                                text6= rs.getString("contact");
                                text7= rs.getString("email");
                                text8= rs.getString("address");
                                text9= rs.getString("landmark");
                                text10= rs.getString("bu");
//                                text11= rs.getString("photo");
//                                text12= rs.getString("aadhar");
                                byte[] img=rs.getBytes("photo");//"+t1.getText()+"'
                        ImageIcon image=new ImageIcon(img);
                        java.awt.Image in=image.getImage();
                        java.awt.Image myImg=in.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
                        ImageIcon newImage=new ImageIcon(myImg);
                        l2.setIcon(newImage);
//                       
                        
                        byte[] img1=rs.getBytes("aadhar");//"+t1.getText()+"'
                        ImageIcon image1=new ImageIcon(img1);
                        java.awt.Image in1=image1.getImage();
                        java.awt.Image myImg1=in1.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
                        ImageIcon newImage1=new ImageIcon(myImg1);
                        l3.setIcon(newImage1);        
                                model.addRow(new Object[]{text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,l2,l3});
				j1.getColumn("Customer Photo").setCellRenderer(new Labelrender());
                                j1.getColumn("Aadhar card").setCellRenderer(new Labelrender());
                                
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
                        add(scroll);
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
    
    
    
    j1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent aa)
     {
 
int colIndex=j1.getSelectedColumn();

if(colIndex==10){
//int ri=rowIndex;
byte[] img=null;
String aadharpath="";
String text=t1.getText();
try
{			
Class.forName("com.mysql.jdbc.Driver");		
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
String sql = "select photo from customer where consumer_no='"+text+"'";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i5=0;
if(rs.next())
{
img=rs.getBytes("photo");
byte[] img1=img;
System.out.println(img1);
//System.out.println("rowIndex"+rowIndex);
if(img==img1) {				//model.getValueAt(r, 10)!=null
JFrame fu=new JFrame();
fu.setBounds(0,0,0,0);
ImageIcon image=new ImageIcon(img);
java.awt.Image in=image.getImage();
 ImageIcon newImage=new ImageIcon(in);
JLabel lab1=new JLabel(newImage);
//java.awt.Image myImg=in.getScaledInstance(l11.getWidth(),l11.getHeight(),java.awt.Image.SCALE_SMOOTH);
//ImageIcon newImage1=new ImageIcon(myImg);
//l11.setIcon(newImage1);
fu.getContentPane().add(lab1);
fu.pack();
fu.setVisible(true);
//add(fu);
}
else {
JOptionPane.showMessageDialog(null, "No Image Found","Error",
JOptionPane.ERROR_MESSAGE);
	}
	i5++;
  }		
	}
catch(Exception e1)		{
									  e1.printStackTrace();
	 }
}
if(colIndex==11){
//int ri=rowIndex;
byte[] img=null;
String aadharpath="";
String text=t1.getText();
try
{			
Class.forName("com.mysql.jdbc.Driver");		
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
String sql = "select aadhar from customer where consumer_no='"+text+"'";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i5=0;
if(rs.next())
{
img=rs.getBytes("aadhar");
byte[] img1=img;
System.out.println(img1);
//System.out.println("rowIndex"+rowIndex);
if(img==img1) {				//model.getValueAt(r, 10)!=null
JFrame fu=new JFrame();
fu.setBounds(0,0,0,0);
ImageIcon image=new ImageIcon(img);
java.awt.Image in=image.getImage();
 ImageIcon newImage=new ImageIcon(in);
JLabel lab1=new JLabel(newImage);
//java.awt.Image myImg=in.getScaledInstance(l11.getWidth(),l11.getHeight(),java.awt.Image.SCALE_SMOOTH);
//ImageIcon newImage1=new ImageIcon(myImg);
//l11.setIcon(newImage1);
fu.getContentPane().add(lab1);
fu.pack();
fu.setVisible(true);
fu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//add(fu);
}
else {
JOptionPane.showMessageDialog(null, "No Image Found","Error",
JOptionPane.ERROR_MESSAGE);
	}
	i5++;
  }		
	}
catch(Exception e1)		{
									  e1.printStackTrace();
	 }
}
     }
            });
            
            }
    
    

    
    
    

    
    
                

    @Override
    public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String arggs[])
    {
        new viewcustomer();
    }
 class Labelrender implements TableCellRenderer
 {

        

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return (Component) value;
        }
     
 }
 
 




}
