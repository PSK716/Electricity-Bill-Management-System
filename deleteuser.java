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
public class deleteuser extends JFrame implements ActionListener{
JLabel l10,l1,l2;
JTextField t1;
JButton b1,b2,b3;
deleteuser()
{
    setSize(1000,500);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
//                setVisible(true);
                setTitle("Remove Employee");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l10=new JLabel("Delete Employee Details");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(350,0,800,80);
                
                l1=new JLabel("Enter ID:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(350,100,100,50);
                Icon icon2=new ImageIcon("D:\\prologos\\delete.png");
                l2=new JLabel(icon2);
                l2.setBounds(270, 10,60, 60);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(450,110,150,30);
                b1=new JButton("Search");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(300,180,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(500,180,150,30);
                b3=new JButton("Delete Employee");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(350,250,250,30);
                add(l10);add(l1);add(t1);add(b1);add(b2);add(l2);add(b3);b3.setVisible(false);
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
                        b3.setVisible(true);
                       
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
        
        
        
        
        }
    });
                b2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        t1.setText(null);
        b3.setVisible(false);
        }
    });
                b3.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent d) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(d.getSource()==b3)
                        {
                            String text1 = t1.getText();
                            int a = JOptionPane.showConfirmDialog(null, "Are you sure You want to Remove Employee?","Remove Employee",JOptionPane.INFORMATION_MESSAGE);
                // JOptionPane.setRootFrame(null);
                if (a == JOptionPane.YES_OPTION) {
                            try
                        {
                            
                        
                            Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1 = "delete from user1 where id = '"+text1+"'";
                           System.out.println("2");
                          PreparedStatement ps1 = con1.prepareStatement(sql1);
                         // ps1.setString(1, t1.getText());
                          ps1.executeUpdate();
                          ps1.close();con1.close();
                          JOptionPane.showMessageDialog(null, "Successfully Deleted","Success",
						JOptionPane.INFORMATION_MESSAGE);
                        }
                          catch(Exception mm)
                {
                    mm.printStackTrace();
                }  
                        }
                
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
        new deleteuser();
    }
}
