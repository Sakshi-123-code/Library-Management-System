package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.sql.*;
import java.util.*;

public class Addstudent extends JFrame implements ActionListener
{
	
	private JPanel contentpane;
	private JTextField t1,t2,t3;
	private JComboBox cb1,cb2,cb3,cb4;
	JButton b1,b2;
	
	public static void main(String[] args) 
	{
	
		new Addstudent().setVisible(true);

	}
	public void random()
	{
		Random rd = new Random();
		t1.setText("" + rd.nextInt(1000+1));
	}
	
	public Addstudent()
	{
		setBounds(500,100,550,450);
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setLayout(null);
		contentpane.setBackground(Color.WHITE);
		
		JLabel l1 = new JLabel("Student_id");
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("Tahoma",Font.BOLD,12));
		l1.setBounds(64, 63, 102, 22);
		contentpane.add(l1);
		
		JLabel l2 = new JLabel("Name");
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Tahoma",Font.BOLD,12));
		l2.setBounds(64, 100, 102, 22);
		contentpane.add(l2);
		
		
		JLabel l3 = new JLabel("Father's Name");
		l3.setForeground(Color.BLACK);
		l3.setFont(new Font("Tahoma",Font.BOLD,12));
		l3.setBounds(64, 137, 102, 22);
		contentpane.add(l3);
		
		JLabel l4 = new JLabel("Course");
		l4.setForeground(Color.BLACK);
		l4.setFont(new Font("Tahoma",Font.BOLD,12));
		l4.setBounds(64, 187, 102, 22);
		contentpane.add(l4);
		
		JLabel l5 = new JLabel("Branch");
		l5.setForeground(Color.BLACK);
		l5.setFont(new Font("Tahoma",Font.BOLD,12));
		l5.setBounds(64, 225, 102, 22);
		contentpane.add(l5);
		
		JLabel l6 = new JLabel("Year");
		l6.setForeground(Color.BLACK);
		l6.setFont(new Font("Tahoma",Font.BOLD,12));
		l6.setBounds(64, 263, 102, 22);
		contentpane.add(l6);
		
		JLabel l7 = new JLabel("Semester");
		l7.setForeground(Color.BLACK);
		l7.setFont(new Font("Tahoma",Font.BOLD,12));
		l7.setBounds(64, 300, 102, 22);
		contentpane.add(l7);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLACK);
		t1.setFont(new Font("Trebuchet MS",Font.BOLD,11));
		t1.setColumns(10);
		t1.setBounds(190,67,200,20);
		contentpane.add(t1);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLACK);
		t2.setFont(new Font("Trebuchet MS",Font.BOLD,11));
		t2.setColumns(10);
		t2.setBounds(190,102,200,20);
		contentpane.add(t2);
		
		t3 = new JTextField();
		t3.setForeground(Color.BLACK);
		t3.setFont(new Font("Trebuchet MS",Font.BOLD,11));
		t3.setColumns(10);
		t3.setBounds(190,140,200,20);
		contentpane.add(t3);
		
		cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] { "B.E", "B.Tech", "M.Tech", "MBA", "BCA", "BBA", "MCA","B.Com" ,"M.Com","Other"}));
		cb1.setForeground(Color.black);
		cb1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		cb1.setBounds(190, 190, 200, 20);
		cb1.setBackground(Color.white);
		contentpane.add(cb1);

		cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] { "Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
		cb2.setForeground(Color.black);
		cb2.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		cb2.setBounds(190, 230, 200, 20);
		cb2.setBackground(Color.white);
	    contentpane.add(cb2);

	    cb3 = new JComboBox();
	    cb3.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Other" }));
		cb3.setForeground(Color.black);
		cb3.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		cb3.setBounds(190, 268, 200, 20);
		cb3.setBackground(Color.white);
		contentpane.add(cb3);
		
		cb4 = new JComboBox();
		cb4.setModel(new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th"}));
		cb4.setForeground(Color.black);
		cb4.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		cb4.setBounds(190, 300, 200, 20);
		cb4.setBackground(Color.white);
		contentpane.add(cb4);
		
	    b1 = new JButton("Add");
		b1.addActionListener(this);
		b1.setForeground(Color.white);
		b1.setBackground(Color.BLACK);
		b1.setBounds(80,340,111,30);
		contentpane.add(b1);
		
		b2 = new JButton("Back");
		b2.addActionListener(this);
		b2.setForeground(Color.white);
		b2.setBackground(Color.BLACK);
		b2.setBounds(220,340,111,30);
		contentpane.add(b2);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(51,153,255),2),"Add Student",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,204,0)));
		panel.setBounds(10,38,500,348);
		panel.setBackground(Color.WHITE);
		contentpane.add(panel);
		random();
		

	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
	
		try
		{
			if(ae.getSource() == b1)
			{
				try
				{
					Conn con= new Conn();
					String sql = "insert into student(student_id, name ,father_name, course, branch, year, semester) values(?,?,?,?,?,?,?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1,t1.getText());
					st.setString(2,t2.getText());
					st.setString(3,t3.getText());
					st.setString(4,(String) cb1.getSelectedItem());
					st.setString(5,(String) cb2.getSelectedItem());
					st.setString(6,(String) cb3.getSelectedItem());
					st.setString(7,(String) cb4.getSelectedItem());
					
					int i = st.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(null, "Successfully Added");
						//this.setVisible(false);
						//new Home().setVisible(true);
					}
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				
			if(ae.getSource() == b2)
			{
				this.setVisible(false);
				new Home().setVisible(true);
			}
		}catch(Exception e)
		{
			
		}
	}

}

