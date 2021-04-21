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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
public class billratesemp extends JFrame implements ActionListener,ItemListener{
JLabel l1,l2,l22,l17,l18;
 JTextField t2;

JButton b1,b2,b3,b4;
String[] columnNames = {"Unit","Rates"};
boolean a;
JPanel jp;
Object s3;
DefaultTableModel model ;
JComboBox c1;
JTable j1;
JScrollPane scroll;
billratesemp()
{
    setSize(1000,350);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                setTitle("Bill Unit Rates");
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
 
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l18=new JLabel("Electricity Bill Unit Rates");
                l18.setFont(new Font("arial",Font.BOLD,30));
                l18.setForeground(Color.BLACK);
                l18.setBackground(Color.BLACK);
                l18.setBounds(350,5,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\changerates.png");
                l17=new JLabel(icon2);
                l17.setBounds(250, 10,100, 80);
                
		 DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
                j1=new JTable();
                j1.setModel(model);		
		j1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
               j1.setRowSelectionAllowed(true);
		
                //j1.setBounds(50, 250, 1200, 300);
		 scroll = new JScrollPane(j1);
		scroll.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll.setBounds(200, 125, 600, 103);
                add(l18);add(l17);add(scroll);
              
              String text1 = "";
		String text2= "";
		
                try
                {
                Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from billrates";
                           System.out.println("2");
                          Statement ps = con.createStatement();
                          ResultSet rs = ps.executeQuery(sql);
                          
                          int i =0;
			while(rs.next())
	        {
				text1= rs.getString("unit");
				text2 = rs.getString("rate");
				
                                model.addRow(new Object[]{text1,text2});
				i++;	
                                System.out.println("3");
	        }
			
                }
                catch(Exception m)
                {
                    m.printStackTrace();
                }
}
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
   {
       new billratesemp();
   }
}
