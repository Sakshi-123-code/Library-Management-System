package LibraryManagementSystem;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;
public class Statistics extends JFrame
{

	private JPanel contentpane;
	private JTable table;
	private JTable table1;
	
	public static void main(String[] args) 
	{
	
		new Statistics().setVisible(true);

	}
	
	public void issuebook()
	{
		try
		{
			Conn con = new Conn();
			String sql = "select * from issuebook";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
			
		}catch(Exception e)
		{
			
		}
	}
	
	public void returnbook()
	{
		try
		{
			Conn con = new Conn();
			String sql ="select * from returnbook1";
			PreparedStatement st =con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			table1.setModel(DbUtils.resultSetToTableModel(rs));
			
			
		}catch(Exception e)
		{
			
		}
	}
	

	public Statistics()
	{
		setBounds(400,100,810,594);
		contentpane = new JPanel();
		contentpane.setBackground(Color.WHITE);
		setContentPane(contentpane);
		contentpane.setLayout(null);
		
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(40,51,708,217);
		//scrollpane.setBackground(Color.WHITE);
		contentpane.add(scrollpane);
		
		table = new JTable();
		table.setBackground(Color.white);
		table.setForeground(Color.BLACK);
		table.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		scrollpane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0,0,0),2),"Issue-Book-Details",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51,204,255)));
		panel.setBounds(26,36,737,240);
		panel.setBackground(Color.WHITE);
		contentpane.add(panel);
		
		JLabel l1 = new JLabel("Back");
		l1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent arg0)
			{
				setVisible(false);
				new Home().setVisible(true);
			}
		});
	
		l1.setForeground(Color.red);
		l1.setFont(new Font("Tahoma",Font.BOLD,13));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/tenth.png"));
		Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l1.setIcon(i3);
		l1.setBounds(690, 13, 96, 27);
		contentpane.add(l1);
		
		JScrollPane scrollpane1 = new JScrollPane();
		scrollpane1.setBounds(40, 316, 717, 217);
		contentpane.add(scrollpane1);
		
		table1 = new JTable();
		table1.setBackground(Color.white);
		table1.setForeground(Color.BLACK);
		table1.setFont(new Font("Sitka Small",Font.BOLD,14));
		scrollpane1.setViewportView(table1);
		
		JPanel panel1= new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(new Color(0,0,0),2),"Issue-Book-Details",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51,204,255)));
		panel1.setBounds(26,36,737,240);
		panel1.setBackground(Color.WHITE);
		contentpane.add(panel1);
		
		issuebook();
		returnbook();
		

		
		
		
		
		
		
	}
	
}
