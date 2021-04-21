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
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import static project.start.viewuser.j1;
public class billcalculator extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
//JTextField t1,t2,t3;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
JComboBox t1,t2,t3;
Object s1,s2,s3;
DefaultTableModel model ;
JTable j1;
JScrollPane scroll;
String[] columnNames = {"Appliance","Per Appliance Rate"};
JPanel p1;
JTextArea ta;
billcalculator()
{
                setSize(1300,650);
                setLocationRelativeTo(null);
                
                setLayout(new FlowLayout());
                setResizable(false);
                
               // setLayout(new BorderLayout());
                setContentPane(new JLabel(new ImageIcon("D:\\prologos\\prologo3.png")));      
                setVisible(true);
                setTitle("Biling Calculator");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                l1=new JLabel("Bill Calculator");
                l1.setFont(new Font("arial",Font.BOLD,30));
                l1.setForeground(Color.BLACK);
                l1.setBackground(Color.BLACK);
                l1.setBounds(600,10,800,80);
                Icon icon=new ImageIcon("D:\\prologos\\calculator.png");
                l2=new JLabel(icon);
                l2.setBounds(500, 10,80, 80);
                
                l3=new JLabel();
                l3.setFont(new Font("arial",Font.BOLD,30));
//                l3.setForeground(Color.BLACK);
//                l3.setBackground(Color.BLACK);
//                l3.setBounds(600,10,800,80);
                DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columnNames);
               
                j1=new JTable();
                j1.setModel(model);		
		j1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
               j1.setRowSelectionAllowed(true);
               j1.setRowHeight(75);
               JTableHeader tableHeader = j1.getTableHeader();
             // Font tb=tableHeader.setFont(new Font("TimesRoman",Font.BOLD,20));
               Font headerFont = new Font("arial", Font.BOLD, 14);
              tableHeader.setFont( headerFont);
		//j1.setBackground(Color.yellow);
                //j1.setBounds(50, 250, 1200, 300);
                Font font = new Font("arial", Font.PLAIN, 14);
      j1.setFont(font);
      
      DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
rightRenderer.setHorizontalAlignment(SwingConstants.CENTER);
j1.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
j1.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
//j1.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
j1.setPreferredScrollableViewportSize(j1.getPreferredSize());
		
                //j1.setBounds(50, 250, 1200, 300);
		 scroll = new JScrollPane(j1);
		scroll.setHorizontalScrollBarPolicy(
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scroll.setBounds(70, 120, 354, 465);
                
                
                String text2 = "Bulb";
		String text3= "<html>[25 Watts]=1 Unit/hour<br>[40 Watts]=1 Unit/hour<br>[60 Watts]=2 Unit/hour<br>[100 Watts]=3 Unit/hour</html>";
                
                
                String text5 = "Tube Light";
		String text6="<html>[20 Watts]=2 Unit/hour<br>[40 Watts]=2 Unit/hour</html>" ;
                
                String text8 = "Fan";
		String text9="<html>[30 Watts]=1 Unit/hour<br>[50 Watts]=2 Unit/hour</html>" ;
                
                String text11 = "Iron";
		String text12="<html>[550 Watts]=17 Unit/hour<br>[750 Watts]=22 Unit/hour</html>" ;
                
                String text14 = "Air Conditioner";
		String text15="<html>[1 Ton]=31 Unit/hour<br>[1.5 Ton]=45 Unit/hour<br>[2 Ton]=60 Unit/hour</html>" ;
               
                String text17 = "Refrigerator";
		String text18="<html>[200 Watts]=6 Unit/hour<br>[300 Watts]=9 Unit/hour</html>" ;
               
                String text20 = "Washing Machine";
		String text21="<html>[200 Watts]=6 Unit/hour<br>[400 Watts]=12 Unit/hour</html>" ;
               
                String text23 = "Mixer";
		String text24="<html>[200 Watts]=6 Unit/hour<br>[300 Watts]=9 Unit/hour</html>" ;
               
                String text26 = "Television";
		String text27="<html>[150 Watts]=5 Unit/hour<br>[200 Watts]=7 Unit/hour</html>" ;
               
                
                String text29 = "Computer/Laptop";
		String text30="<html>[200 Watts]=6 Unit/hour<br>[300 Watts]=9 Unit/hour</html>" ;
                
                
                
                model.addRow(new Object[]{text2,text3});
                model.addRow(new Object[]{text5,text6});
                model.addRow(new Object[]{text8,text9});
                model.addRow(new Object[]{text11,text12});
                model.addRow(new Object[]{text14,text15});
                model.addRow(new Object[]{text17,text18});
                model.addRow(new Object[]{text20,text21});
                model.addRow(new Object[]{text23,text24});
                model.addRow(new Object[]{text26,text27});
                model.addRow(new Object[]{text29,text30});
                
//                Border blackline = BorderFactory.createLineBorder(Color.black);
//                
//                p1=new JPanel();
//                p1.setBounds(700, 120,500, 450);
//                p1.setBorder(blackline);
//                p1.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
//                l4=new JLabel("Calculator");
//                l4.setFont(new Font("TimesRoman",Font.BOLD,25));
//                l4.setForeground(Color.BLACK);
//                l4.setBackground(Color.BLACK);
//                l4.setBounds(700,120,100,80);
//                
//                
//                ta=new JTextArea();
//                ta.setFont(new Font("TimesRoman",Font.BOLD,30));
//                ta.setForeground(Color.BLACK);
//                ta.setBackground(Color.BLACK);
//                ta.setBounds(750,400,200,30);
//                ta.setBackground(Color.WHITE);
//                ta.setLineWrap(true);
//                add(l4);add(ta);
//                p1.add(l4);p1.add(ta);
                b1=new JButton("Calculate");
                b1.setFont(new Font("arial",Font.BOLD,25));
                b1.setBounds(850,120,250,50);
                b1.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent btn1) {
                       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                    if(btn1.getSource()==b1)
                        {
                           Calculator as= new  Calculator();
      //  as.setVisible(true);
//                          dispose(); 
        
                        }
                    
                    }
                });
                add(l1);add(l2);add(scroll);add(b1);
//                calculator cr=new calculator();
//                cr.setVisible(true);
//                cr.setBounds(850, 120, 354, 465);
//                add(cr);
               
//                add(p1);
//                NewClass nj=new NewClass();
//                nj.setVisible(true);
//                nj.setBounds(850, 120, 354, 465);
//                add(nj);
}                
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String args[])
    {
        new billcalculator().setVisible(true);
        
    }
    
 
}
