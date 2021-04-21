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
public class billrates extends JFrame implements ActionListener,ItemListener{
 JLabel l1,l2,l22,l17,l18;
 JTextField t2;

JButton b1,b2,b3,b4,b9;
String[] columnNames = {"Unit","Rates"};
boolean a;
JPanel jp;
Object s3;
DefaultTableModel model ;
JComboBox c1;
JTable j1;
JScrollPane scroll;
 billrates()
    {
        setSize(1300,650);
                setLocationRelativeTo(null);
//                
//                setLayout(new FlowLayout());
                setResizable(false);
//                
//               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Bill Unit Rates");
// 
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                l18=new JLabel("Electricity Bill Unit Rates");
                l18.setFont(new Font("arial",Font.BOLD,30));
                l18.setForeground(Color.BLACK);
                l18.setBackground(Color.BLACK);
                l18.setBounds(480,5,800,80);
                Icon icon2=new ImageIcon("D:\\prologos\\changerates.png");
                l17=new JLabel(icon2);
                l17.setBounds(350, 10,100, 80);
                
		 b1=new JButton("Change Bill Unit Rates");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(450,240,350,30);
                c1=new JComboBox();
                c1.setFont(new Font("arial",Font.BOLD,15));
                c1.setForeground(Color.BLACK);
                c1.setBounds(600,325,150,30);
                c1.addItem("0-100");
                c1.addItem("101-300");
                c1.addItem("301-500");
                c1.addItem("501-1000");
                c1.addItem(">1000");
                
                c1.setSelectedIndex(-1);
                l1=new JLabel("Select Rate:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(430,315,250,50);
                l2=new JLabel();
                l2.setFont(new Font("arial",Font.BOLD,18));
                l2.setForeground(Color.BLACK);
                l2.setBounds(430,400,250,30);
                t2=new JTextField();
                t2.setFont(new Font("arial",Font.BOLD,15));
                t2.setForeground(Color.BLACK);
                t2.setBounds(600,400,150,30);
                t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }});
                l22=new JLabel();
                l22.setFont(new Font("arial",Font.BOLD,13));
                l22.setForeground(Color.RED);
                l22.setBounds(760,400,250,30);
 c1.addItemListener(new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent e1) {
            if(e1.getSource()==c1)
            {
                s3=(Object)c1.getSelectedItem();
                
                l2.setText((String) c1.getSelectedItem()+":");
            }}});
  
                b2=new JButton("Change Rates");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(400,500,200,30);
                b3=new JButton("Clear");
                b3.setFont(new Font("arial",Font.BOLD,20));
                b3.setBounds(650,500,150,30);
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
                scroll.setBounds(325, 125, 600, 103);
               Icon icon=new ImageIcon("D:\\prologos\\backlogo.png");
               b9=new JButton(icon);
               b9.setBounds(1170,500,100,100);
              add(l18);add(l17);add(scroll);add(b1);add(c1);add(l1);
              add(t2);add(b2);add(b3);
              add(l22);add(l2);add(b9);
              
              
             c1.setVisible(false); l1.setVisible(false); t2.setVisible(false); b2.setVisible(false);
               l2.setVisible(false); l22.setVisible(false);b3.setVisible(false);
               
               
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
                b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent bill) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(bill.getSource()==b1)
                        {
                            c1.setVisible(true); l1.setVisible(true); t2.setVisible(true); b2.setVisible(true);
               l2.setVisible(true); l22.setVisible(true);b3.setVisible(true);
               
               
                        }
            }
        });
                b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent rate) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(rate.getSource()==b2)
                        {
                            
                if(l22.getText()==null)
                        {
                 if(t2.getText().trim().isEmpty())
                                    
                        {
                            JOptionPane.showMessageDialog(null, "Please Enter New Bill Rates","Error",JOptionPane.WARNING_MESSAGE);
                            
                        }
		else
                        {
                            
                        
                try
                {
                        Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1 = "update billrates set rate=? where unit='"+s3+"'";
                           System.out.println("55");
                          PreparedStatement ps1 = con1.prepareStatement(sql1);
                         // ResultSet rs1 = ps1.executeQuery(sql1);
                          
                         
			
				ps1.setString(1,t2.getText());
                               
				
                                System.out.println("6");
                                ps1.executeUpdate();
                                
                                JOptionPane.showMessageDialog(null, "Successfully Updated","Success",JOptionPane.INFORMATION_MESSAGE);
                                
                }
                        catch(Exception mmm)
                {
                    mmm.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Something Went Wrong Please try again","Failed",JOptionPane.ERROR_MESSAGE);
                }}
                        }
                        }
                        }
            
            
        });
                b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent clear) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
            if(clear.getSource()==b3)
                        {
                            c1.setSelectedItem(null);
                            l2.setText(null);
                            t2.setText(null);
                            l22.setText(null);
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
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public static void main(String args[])
   {
       new billrates();
   }
   public void t2KeyReleased(java.awt.event.KeyEvent evt) {

        String pattern ="^[0-9.]{0,6}";


        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t2.getText());
        if(!match.matches() )
        {
           l22.setText("Enter Proper Bill Unit Rates ");
        }
        else
        {
            l22.setText(null);
        }

}



    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
