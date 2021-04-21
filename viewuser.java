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
import static java.awt.FlowLayout.CENTER;
import static java.awt.Font.BOLD;
import java.awt.event.*;
import javax.sql.*;
import java.sql.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
public class viewuser extends JFrame implements ActionListener
{
JLabel l10,l1,l2;
JTextField t1;
JButton b1,b2;
static JTable j1,j11; 
JScrollPane scroll,scroll1;
String[] columnNames = {"Id","Name","Email-Id","Contact Number","Gender","Date of Birth","Address","Password"};
String[] columnNames1 = {"Id","Name","Email-Id","Contact Number","Gender","Date of Birth","Address","Password"};
JPanel jp;
DefaultTableModel model,model1 ;
    viewuser()
    {
                setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Search Employee");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l10=new JLabel("Search Employee Details");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(490,0,800,80);
                
                l1=new JLabel("Enter ID:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(850,100,100,50);
                Icon icon2=new ImageIcon("D:\\prologos\\buyer.png");
                l2=new JLabel(icon2);
                l2.setBounds(400, 10,60, 60);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(950,110,150,30);
                b1=new JButton("Search");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(850,180,100,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(1000,180,100,30);
//                jp=new JPanl();
//                jp.setBounds(50, 250, 1200, 350);
//                jp.setBackground(Color.red);
                 add(l10);add(l1);add(t1);add(b1);add(b2);add(l2);
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
j1.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
		 scroll = new JScrollPane(j1);
		scroll.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll.setBounds(20, 100, 650, 500);
               //add(scroll);
              
                String text1 = t1.getText();
		String text2= "";
		String text3= "";
		String text4 = "";
                String text5 ="";
                String text6 = "";
                String text7 = "";
                String text8 = "";
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
//                           String sql = "select * from user1 where id = '"+text1+"'";
                            String sql = "select * from user1 ";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			while(rs.next())
	        {
				text1= rs.getString("id");
				text2 = rs.getString("name");
				text3= rs.getString("email");
                                text4= rs.getString("contact");
                                text5= rs.getString("gender");
                                text6= rs.getString("dob");
                                text7= rs.getString("address");
                                text8= rs.getString("password");
                                model.addRow(new Object[]{text1,text2,text3,text4,text5,text6,text7,text8});
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
//                        add(scroll);
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
    }
    
    
    
    
    public void showtabledata1()
    {
        DefaultTableModel model1 = new DefaultTableModel();
		model1.setColumnIdentifiers(columnNames);
                
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
//                j11.setBounds(550, 450, 500, 300);
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
j11.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
		 scroll1 = new JScrollPane(j11);
		scroll1.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll1.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll1.setBounds(720, 300, 550, 100);
               //add(scroll);
              
                String text1 = t1.getText();
		String text2= "";
		String text3= "";
		String text4 = "";
                String text5 ="";
                String text6 = "";
                String text7 = "";
                String text8 = "";
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from user1 where id = '"+text1+"'";
//                            String sql = "select * from user1 ";
                           System.out.println("2");
                          PreparedStatement ps = con.prepareStatement(sql);
                          ResultSet rs = ps.executeQuery();
                          
                          int i =0;
			if(rs.next())
	        {
				text1= rs.getString("id");
				text2 = rs.getString("name");
				text3= rs.getString("email");
                                text4= rs.getString("contact");
                                text5= rs.getString("gender");
                                text6= rs.getString("dob");
                                text7= rs.getString("address");
                                text8= rs.getString("password");
                                model1.addRow(new Object[]{text1,text2,text3,text4,text5,text6,text7,text8});
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
                        add(scroll1);
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
    }
    public static void main(String args[])
    {
        new viewuser();
    }
    
}
