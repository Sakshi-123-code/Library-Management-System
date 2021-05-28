package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.sql.*;
public class Forgot extends JFrame implements ActionListener
{
	private JPanel contentpane;
	private JTextField t1,t2,t3,t4,t5;
	private JButton b1,b2,b3;
	private JLabel l1,l2,l3,l4,l5;
	public static void main(String[] args) 
	{
	
		new Forgot().setVisible(true);

	}
	
	public Forgot()
	{
		setBounds(400,150,606,406);
		contentpane = new JPanel();
		//contentpane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentpane);
		//setUndecorated(true);
		contentpane.setBackground(Color.WHITE);
		contentpane.setLayout(null);
		
		l1 = new JLabel("Username : ");
		l1.setFont(new Font("Tahoma",Font.BOLD,12));
		l1.setBounds(90, 83, 87, 29);
		contentpane.add(l1);
		
		l2 = new JLabel("Name : ");
		l2.setFont(new Font("Tahoma",Font.BOLD,12));
		l2.setBounds(90, 120, 87, 29);
		contentpane.add(l2);
		
		l3 = new JLabel("Your Security Question : ");
		l3.setFont(new Font("Tahoma",Font.BOLD,12));
		l3.setBounds(90, 160, 200, 29);
		contentpane.add(l3);
		
		l4 = new JLabel("Answer : ");
		l4.setFont(new Font("Tahoma",Font.BOLD,12));
		l4.setBounds(90, 200, 200, 29);
		contentpane.add(l4);
		
		l5 = new JLabel("Password : ");
		l5.setFont(new Font("Tahoma",Font.BOLD,12));
		l5.setBounds(90, 240, 200, 29);
		contentpane.add(l5);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma",Font.BOLD,10));
		t1.setForeground(Color.BLACK);
		t1.setBounds(277, 88, 155, 20);
		contentpane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma",Font.BOLD,10));
		t2.setForeground(Color.BLACK);
		t2.setBounds(277, 124, 155, 20);
		t2.setEditable(false);
		contentpane.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma",Font.BOLD,10));
		t3.setForeground(Color.BLACK);
		t3.setBounds(277, 162, 200, 20);
		t3.setEditable(false);
		contentpane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setFont(new Font("Tahoma",Font.BOLD,10));
		t4.setForeground(Color.BLACK);
		t4.setBounds(277, 205, 155, 20);
		contentpane.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setFont(new Font("Tahoma",Font.BOLD,10));
		t5.setForeground(Color.BLACK);
		t5.setBounds(277, 245, 155, 20);
		t5.setEditable(false);
		contentpane.add(t5);
		t5.setColumns(10);
		
		b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setBounds(440,85,85,25);
		contentpane.add(b1);
		
		b2 = new JButton("Retreive");
		b2.addActionListener(this);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setBounds(440,200,85,25);
		contentpane.add(b2);
		
		b3 = new JButton("Back");
		b3.addActionListener(this);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setBounds(200, 300, 90, 25);
		contentpane.add(b3);
				
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255,0,0));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(155,102,0),2),"Forgot-Panel",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34,139,34)));
		panel.setBackground(Color.white);
		panel.setBounds(31, 30, 520, 325);
		contentpane.add(panel);
		}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
			Conn con = new Conn();
			if(ae.getSource() == b1)
			{
				String sql = "select * from account where username=?";
				PreparedStatement st = con.c.prepareStatement(sql);
				
				st.setString(1, t1.getText());
				ResultSet rs = st.executeQuery();
				
				while(rs.next())
				{
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("sec_q"));
				}
			}
			
			if(ae.getSource() == b2)
			{
				String sql = "select * from account where sec_ans=?";
				PreparedStatement st = con.c.prepareStatement(sql);
				
				st.setString(1, t4.getText());
				ResultSet rs = st.executeQuery();
				
				while(rs.next())
				{
					t5.setText(rs.getString("password"));
				}
			}
			
			if(ae.getSource() == b3)
			{
				this.setVisible(false);
				new Login().setVisible(true);
			}
		}catch(Exception e)
		{
			
		}
	
		
		
	}

}
