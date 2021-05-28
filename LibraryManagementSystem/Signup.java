package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.sql.*;

public class Signup extends JFrame implements ActionListener 
{
	private JPanel contentpane;
	private JTextField tf1,tf2,tf3,tf4;
	private JButton b1,b2;
	private JComboBox combobox;
	
	public static void main(String[] args) 
	{
	
		new Signup().setVisible(true);
	}
	
	public Signup()
	{
		setBounds(400,150,606,406);
		contentpane = new JPanel();
		//contentpane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentpane);
		//setUndecorated(true);
		contentpane.setBackground(Color.white);
		contentpane.setLayout(null);
		
		JLabel username = new JLabel("Username : ");
		username.setForeground(Color.DARK_GRAY);
		username.setFont(new Font("Tahoma",Font.BOLD,13));
		username.setBounds(99, 70, 92, 26);
		contentpane.add(username);
		
		JLabel name = new JLabel("Name : ");
		name.setForeground(Color.DARK_GRAY);
		name.setFont(new Font("Tahoma",Font.BOLD,13));
		name.setBounds(99, 110, 92, 26);
		contentpane.add(name);
		
		JLabel password = new JLabel("Password : ");
		password.setForeground(Color.DARK_GRAY);
		password.setFont(new Font("Tahoma",Font.BOLD,13));
		password.setBounds(99, 150, 92, 26);
		contentpane.add(password);
		
		JLabel sq = new JLabel("Security Question : ");
		sq.setForeground(Color.DARK_GRAY);
		sq.setFont(new Font("Tahoma",Font.BOLD,13));
		sq.setBounds(99, 195, 150, 26);
		contentpane.add(sq);
		
		JLabel answer = new JLabel("Answer : ");
		answer.setForeground(Color.DARK_GRAY);
		answer.setFont(new Font("Tahoma",Font.BOLD,13));
		answer.setBounds(99, 235, 150, 26);
		contentpane.add(answer);
		
		tf1 = new JTextField();
		tf1.setBounds(270, 75, 175, 20);
		contentpane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(270, 115, 175,20);
		contentpane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(270, 155, 175, 20);
		contentpane.add(tf3);
		tf3.setColumns(10);
		
		combobox = new JComboBox();
		combobox.setModel(new DefaultComboBoxModel(new String[] {"Your NickName?","Your Lucky Number?","Your Child SuperHero?","Your Favourite Singer"}));
		combobox.setBounds(270,200 ,175, 20);
		combobox.setBackground(Color.white);
		contentpane.add(combobox);
		
		tf4 = new JTextField();
		tf4.setBounds(270, 240, 175, 20);
		contentpane.add(tf4);
		tf4.setColumns(10);
		
		b1 = new JButton("Create");
		b1.addActionListener(this);
		b1.setFont(new Font("Tahoma",Font.BOLD,11));
		b1.setBounds(140, 289, 120, 30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		contentpane.add(b1);
		
		b2 = new JButton("Back");
		b2.addActionListener(this);
		b2.setFont(new Font("Tahoma",Font.BOLD,11));
		b2.setBounds(305, 289, 120, 30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		contentpane.add(b2);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0,255,1));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(155,102,0),2),"Create-Account",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34,139,34)));
		panel.setBounds(31, 30, 500, 325);
		panel.setBackground(Color.white);
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
				
				String sql = "insert into account(username, name, password, sec_q, sec_ans) values(?,?,?,?,?)";
				PreparedStatement st = con.c.prepareStatement(sql);
				
				st.setString(1,tf1.getText());
				st.setString(2, tf2.getText());
				st.setString(3, tf3.getText());
				st.setString(4, (String)combobox.getSelectedItem());
				st.setString(5, tf4.getText());
				
				int i = st.executeUpdate();
				
				if(i>0)
				{
				JOptionPane.showMessageDialog(null,"Successfully Created");
				}
				
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
			}
			
			if(ae.getSource() == b2)
			{
				this.setVisible(false);
				new Login().setVisible(true);
			}
		}catch(Exception e)
		{
			//e.printStackTrace();
		}
		
	}

}
