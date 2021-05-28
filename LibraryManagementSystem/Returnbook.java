package LibraryManagementSystem;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Returnbook extends JFrame implements ActionListener
{
	private JPanel contentpane;
	private JTextField t,t1,t2,t3,t4,t5,t6;
	private JButton b1,b2,b3;
	private JDateChooser datechooser;
	
	public static void main(String[] args) 
	{
	
		new Returnbook().setVisible(true);

	}
	public void delete()
	{
		try
		{
			Conn con = new Conn();
			String sql = "delete from issuebook where book_id=?";
			PreparedStatement st = con.c.prepareStatement(sql);
			st.setString(1, t.getText());
			int i = st.executeUpdate();
			
			if(i>0)
			{
				JOptionPane.showConfirmDialog(null, "Book Returned");
				
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Error in Deleting");
				
			}
		}catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
	}
	
	public Returnbook()
	{
		setBounds(450,200,620,363);
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setBackground(Color.white);
		contentpane.setLayout(null);
		
		JLabel l1 = new JLabel("Book_id");
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("Tahoma",Font.BOLD,11));
		l1.setBounds(52, 46, 87, 24);
		contentpane.add(l1);
		
		JLabel l2 = new JLabel("Book");
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Tahoma",Font.BOLD,11));
		l2.setBounds(52, 85, 87, 24);
		contentpane.add(l2);
		
		JLabel l3 = new JLabel("Course");
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("Tahoma",Font.BOLD,11));
		l3.setBounds(52, 125, 87, 24);
		contentpane.add(l3);
		
		JLabel l4 = new JLabel("Date of Issue");
		l4.setForeground(Color.BLACK);
		l4.setFont(new Font("Tahoma",Font.BOLD,11));
		l4.setBounds(52, 165, 87, 24);
		contentpane.add(l4);
		
		JLabel l5 = new JLabel("Date of Return");
		l5.setForeground(Color.BLACK);
		l5.setFont(new Font("Tahoma",Font.BOLD,11));
		l5.setBounds(52, 210, 87, 24);
		contentpane.add(l5);
		
		JLabel l6 = new JLabel("Student_id");
		l6.setForeground(Color.BLACK);
		l6.setFont(new Font("Tahoma",Font.BOLD,11));
		l6.setBounds(52, 250, 87, 24);
		contentpane.add(l6);
		
		JLabel l7 = new JLabel("Name");
		l7.setForeground(Color.BLACK);
		l7.setFont(new Font("Tahoma",Font.BOLD,11));
		l7.setBounds(360, 46, 87, 24);
		contentpane.add(l7);
		
		JLabel l8 = new JLabel("Branch");
		l8.setForeground(Color.BLACK);
		l8.setFont(new Font("Tahoma",Font.BOLD,11));
		l8.setBounds(360, 85, 87, 24);
		contentpane.add(l8);
		
		t = new JTextField();
		t.setForeground(Color.black);
		t.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		t.setBounds(150, 46, 100, 20);
		t.setColumns(10);
	    contentpane.add(t);
		
		t1 = new JTextField();
		t1.setForeground(Color.black);
		t1.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		t1.setBounds(150, 85, 200, 20);
		t1.setColumns(10);
		t1.setEditable(false);
		contentpane.add(t1);
		
		t2 = new JTextField();
		t2.setForeground(Color.black);
		t2.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		t2.setBounds(150, 125, 200, 20);
		t2.setColumns(10);
		t2.setEditable(false);
		contentpane.add(t2);
		
		t3 = new JTextField();
		t3.setForeground(Color.black);
		t3.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		t3.setBounds(150, 165, 200, 20);
		t3.setColumns(10);
		t3.setEditable(false);
		contentpane.add(t3);
		
		t4 = new JTextField();
		t4.setForeground(Color.black);
		t4.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		t4.setBounds(150,251, 100, 20);
		t4.setColumns(10);
		contentpane.add(t4);
		
		t5 = new JTextField();
		t5.setForeground(Color.black);
		t5.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		t5.setBounds(405,48,160,20);
		t5.setColumns(10);
		t5.setEditable(false);
		contentpane.add(t5);
		
		t6 = new JTextField();
		t6.setForeground(Color.black);
		t6.setFont(new Font("Trebuchet MS",Font.BOLD,12));
		t6.setBounds(405,85,160,20);
		t6.setColumns(10);
		t6.setEditable(false);
		contentpane.add(t6);
		
		datechooser = new JDateChooser();
		datechooser.setBorder(new LineBorder(new Color(0,0,0),1,true));
		datechooser.setForeground(Color.black);
		datechooser.setBounds(150,212,160,20);
		contentpane.add(datechooser);
	
		
		b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setBounds(280,250,100,25);
		contentpane.add(b1);
		
		b2 = new JButton("Return");
		b2.addActionListener(this);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLACK);
		b2.setBounds(400,120,150,25);
	    contentpane.add(b2);
		
	    b3 = new JButton("Back");
		b3.addActionListener(this);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setBounds(400,160,150,25);
		contentpane.add(b3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255,102,0),2),"Return Book",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,0,0)));
		panel.setBounds(10,24,572,275);
		panel.setBackground(Color.WHITE);
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
				String sql = "select * from issuebook where student_id = ? and book_id = ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t4.getText());
				st.setString(2, t.getText());
				ResultSet rs = st.executeQuery();
				
				while(rs.next())
				{
					t1.setText(rs.getString("bname"));
					t5.setText(rs.getString("sname"));
					t2.setText(rs.getString("course"));
					t6.setText(rs.getString("branch"));
					t3.setText(rs.getString("date_of_issue"));
				}
				
				st.close();
				rs.close();
			}
			
			if(ae.getSource() == b2)
			{
				String sql = "insert into returnbook1(book_id,student_id, bname, sname, course, branch, date_of_issue, date_of_return) values(?,?,?,?,?,?,?,?)";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t.getText());
				st.setString(2, t4.getText());
				st.setString(3, t1.getText());
				st.setString(4, t5.getText());
				st.setString(5, t2.getText());
				st.setString(6, t6.getText());
				st.setString(7, t3.getText());
				
				st.setString(8,((JTextField) datechooser.getDateEditor().getUiComponent()).getText());
				
				int i = st.executeUpdate();
				if(i>0)
				{
					JOptionPane.showMessageDialog(null, "Processing...");
					delete();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Error");
					
				}
				
			}
			if(ae.getSource() == b3)
			{
				this.setVisible(false);
				new Home().setVisible(true);
			}
		}catch(Exception e)
		{
			
		}
		
		
	}

}
