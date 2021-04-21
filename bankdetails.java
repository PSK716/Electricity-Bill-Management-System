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
public class bankdetails extends JFrame implements ActionListener,ItemListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
JTextField t1,t4;
JComboBox t2,t3;
JRadioButton r1,r2,r3;
JButton b1,b2,b3,b4; 
Object s3,s4;
bankdetails()
{
    setSize(1300,650);
                setLocationRelativeTo(null);
                setResizable(false);
                setLayout(new FlowLayout());
                //setResizable(false);
                setTitle("Employee Bank Details");
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l10=new JLabel("Employee Bank Details");
                l10.setFont(new Font("arial",Font.BOLD,30));
                l10.setForeground(Color.BLACK);
                l10.setBackground(Color.BLACK);
                l10.setBounds(500,20,800,80);
                l1=new JLabel("Enter ID:");
                l1.setFont(new Font("arial",Font.BOLD,20));
                l1.setForeground(Color.BLACK);
                l1.setBounds(400,150,100,50);
                t1=new JTextField();
                t1.setFont(new Font("arial",Font.BOLD,15));
                t1.setForeground(Color.BLACK);
                t1.setBounds(600,160,200,30);
                
                t1.setText(newuser.t1.getText());
                t1.setEditable(false);
                Icon icon9=new ImageIcon("D:\\prologos\\bank.png");
                l9=new JLabel(icon9);
                l9.setBounds(400, 10,80, 90);
                l2=new JLabel("Select Bank Name:");
                l2.setFont(new Font("arial",Font.BOLD,20));
                l2.setForeground(Color.BLACK);
                l2.setBounds(400,250,200,50);
                t2=new JComboBox();
                t2.setFont(new Font("arial",Font.BOLD,15));
                t2.setForeground(Color.BLACK);
                t2.setBounds(600,260,200,30);
                t2.addItem("State Bank of India");
                t2.addItem("Bank of India");
                t2.addItem("Axis Bank");
                t2.addItem("HDFC Bank");
                t2.addItem("ICICI Bank");
                t2.addItem("Kotak Mahindra Bank");
                t2.addItem("Union Bank");
                t2.addItem("Induslnd Bank");
                t2.addItem("IDBI Bank");
                t2.addItem("IDFC Bank");
                
                t2.setSelectedIndex(-1);
 
        t2.addItemListener(new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent e1) {
            if(e1.getSource()==t2)
            {
                s3=(Object)t2.getSelectedItem();
                
                
            }}});
                l3=new JLabel("Select Bank Branch:");
                l3.setFont(new Font("arial",Font.BOLD,20));
                l3.setForeground(Color.BLACK);
                l3.setBounds(400,350,200,50);
                t3=new JComboBox();
                t3.setFont(new Font("arial",Font.BOLD,15));
                t3.setForeground(Color.BLACK);
                t3.setBounds(600,360,200,30);
                t3.addItem("Borivali");
                t3.addItem("Andheri");
                t3.addItem("Virar");
                t3.addItem("Vasai");
                t3.addItem("Dadar");
                t3.setSelectedIndex(-1);
 
 t3.addItemListener(new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent e1) {
            if(e1.getSource()==t3)
            {
                s4=(Object)t3.getSelectedItem();
                
            }}});
                l4=new JLabel("Account Number:");
                l4.setFont(new Font("arial",Font.BOLD,20));
                l4.setForeground(Color.BLACK);
                l4.setBounds(400,450,200,50);
                t4=new JTextField();
                t4.setFont(new Font("arial",Font.BOLD,15));
                t4.setForeground(Color.BLACK);
                t4.setBounds(600,460,200,30);
                t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t4KeyReleased(evt);
            }});
                l14=new JLabel();
                l14.setFont(new Font("arial",Font.BOLD,13));
                l14.setForeground(Color.RED);
                l14.setBounds(820,460,200,30);
                 
                b1=new JButton("Submit");
                b1.setFont(new Font("arial",Font.BOLD,20));
                b1.setBounds(400,560,150,30);
                b2=new JButton("Clear");
                b2.setFont(new Font("arial",Font.BOLD,20));
                b2.setBounds(650,560,150,30);
                add(l10);add(l1);add(l9);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);add(b1);add(b2);add(l14);
                b1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent a) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(a.getSource()==b1)
                        {
                            
                            
       if(t1.getText().trim().isEmpty() ||t2.getSelectedItem()==null||t3.getSelectedItem()==null||t4.getText().trim().isEmpty())
                                    
                        {
                            JOptionPane.showMessageDialog(null, "Please Fill All the Details","Error",JOptionPane.WARNING_MESSAGE);
                            
                        }
                        else{
                                
                            int m =0;
                            String text1 = t1.getText();
                            try
                            {
                            Class.forName("com.mysql.jdbc.Driver");
                           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql = "select * from user1 where id = '"+text1+"'";
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
                            JOptionPane.showMessageDialog(null, "Invalid Id","Failed",
						JOptionPane.ERROR_MESSAGE);
                         
                        }
                        
                     
                        
                            else if(m ==1)
			{
                            
//                            l11.setText("Id is Already Exist");
                                System.out.println("4");
                                
                                if(l14.getText()==null)
                        {
                                      try
                       {    
//                          
                           Class.forName("com.mysql.jdbc.Driver");
                           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/pratik","root","system");
                           String sql1="insert into user2 (id,bankname,bankbranch,accountno) values(?,?,?,?)";
                           System.out.println("2");
                           
                           PreparedStatement pstmt=con1.prepareStatement(sql1);
                           pstmt.setString(1, t1.getText());
                           pstmt.setString(2, s3.toString());
                           pstmt.setString(3, s4.toString());
                           pstmt.setString(4, t4.getText());
                           pstmt.executeUpdate();
                        
                        pstmt.close();
                        con1.close();
                          JOptionPane.showMessageDialog(null, "Successfully Registred","Success",JOptionPane.INFORMATION_MESSAGE);
                        
                          // b=a;
                        
                       }
                             catch(Exception ex)
                       {
                           ex.printStackTrace();
                       }       
                      }
                        else
                        {
                         JOptionPane.showMessageDialog(null, "Please Fill the Proper Information","Failed",
						JOptionPane.ERROR_MESSAGE);   
                        }}}
                        catch(Exception q)
                       {
                           q.printStackTrace();
                       }}
        
                        }
        
        }
    });
                    b2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       // t1.setText(null);
        t2.setSelectedItem(null);t3.setSelectedItem(null);t4.setText(null);
        
        
        
        
        }
    });
        
 }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new bankdetails();
    }
    public void t4KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        String pattern ="^[[0-9]{0,9}]{15}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(t4.getText());
        if(!match.matches() )
        {
           l14.setText("Enter Account Number");
        }
        else
        {
            l14.setText(null);
        }}
}
