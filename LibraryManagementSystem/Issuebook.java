package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import com.toedter.calendar.JDateChooser;
import java.sql.*;

public class Issuebook extends JFrame implements ActionListener
{
	private JPanel contentpane;
	JDateChooser datechooser;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	private JButton b1,b2,b3,b4;
	
	public static void main(String[] args) 
	{
	
		new Issuebook().setVisible(true);

	}
	
	public Issuebook()
	{
		setBounds(300,100,1000,500);
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setBackground(Color.WHITE);
		contentpane.setLayout(null);
		
		JLabel l1 = new JLabel("Book_id");
		l1.setFont(new Font("Tahoma",Font.BOLD,11));
		l1.setForeground(Color.black);
		l1.setBounds(47, 67, 100, 20);
		contentpane.add(l1);
		
		JLabel l2 = new JLabel("Name");
		l2.setFont(new Font("Tahoma",Font.BOLD,11));
		l2.setForeground(Color.black);
		l2.setBounds(47, 100, 100, 20);
		contentpane.add(l2);
		
		JLabel l3 = new JLabel("ISBN");
		l3.setFont(new Font("Tahoma",Font.BOLD,11));
		l3.setForeground(Color.black);
		l3.setBounds(47, 135, 100, 20);
		contentpane.add(l3);
		
		JLabel l4 = new JLabel("Publisher");
		l4.setFont(new Font("Tahoma",Font.BOLD,11));
		l4.setForeground(Color.black);
		l4.setBounds(47, 170, 100, 20);
		contentpane.add(l4);
		
		JLabel l5 = new JLabel("Edition");
		l5.setFont(new Font("Tahoma",Font.BOLD,11));
		l5.setForeground(Color.black);
		l5.setBounds(47, 205, 100, 20);
		contentpane.add(l5);
		
		JLabel l6 = new JLabel("Price");
		l6.setFont(new Font("Tahoma",Font.BOLD,11));
		l6.setForeground(Color.black);
		l6.setBounds(47, 240, 100, 20);
		contentpane.add(l6);
		
		JLabel l7 = new JLabel("Pages");
		l7.setFont(new Font("Tahoma",Font.BOLD,11));
		l7.setForeground(Color.black);
		l7.setBounds(47, 275, 100, 20);
		contentpane.add(l7);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLACK);
		t1.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t1.setBounds(150, 66, 120, 20);
		contentpane.add(t1);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLACK);
		t2.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t2.setBounds(150, 100, 300, 20);
		t2.setColumns(10);
		t2.setEditable(false);
		contentpane.add(t2);
		
		t3 = new JTextField();
		t3.setForeground(Color.BLACK);
		t3.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t3.setBounds(150, 135, 300, 20);
		t3.setColumns(10);
		t3.setEditable(false);
		contentpane.add(t3);
		
		t4 = new JTextField();
		t4.setForeground(Color.BLACK);
		t4.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t4.setBounds(150, 170, 300, 20);
		t4.setColumns(10);
		t4.setEditable(false);
		contentpane.add(t4);
		
		t5 = new JTextField();
		t5.setForeground(Color.BLACK);
		t5.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t5.setBounds(150, 205, 300, 20);
		t5.setColumns(10);
		t5.setEditable(false);
		contentpane.add(t5);
		
		t6 = new JTextField();
		t6.setForeground(Color.BLACK);
		t6.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t6.setBounds(150, 240, 300, 20);
		t6.setColumns(10);
		t6.setEditable(false);
		contentpane.add(t6);
		
		t7 = new JTextField();
		t7.setForeground(Color.BLACK);
		t7.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t7.setBounds(150, 280, 300, 20);
		t7.setColumns(10);
		t7.setEditable(false);
		contentpane.add(t7);
		
		b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(300,60,100,25);
		contentpane.add(b1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(102,102,102),2),"Issue Book",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(102,0,153)));
		panel.setBounds(10,38,500,288);
		panel.setBackground(Color.WHITE);
		contentpane.add(panel);
		
		JLabel l8 = new JLabel("Student_id");
		l8.setFont(new Font("Tahoma",Font.BOLD,11));
		l8.setForeground(Color.black);
		l8.setBounds(550, 67, 100, 20);
		contentpane.add(l8);
		
		JLabel l9 = new JLabel("Name");
		l9.setFont(new Font("Tahoma",Font.BOLD,11));
		l9.setForeground(Color.black);
		l9.setBounds(550, 100, 100, 20);
		contentpane.add(l9);
		
		JLabel l10 = new JLabel("Father's Name");
		l10.setFont(new Font("Tahoma",Font.BOLD,11));
		l10.setForeground(Color.black);
		l10.setBounds(550, 135, 100, 20);
		contentpane.add(l10);
		
		JLabel l11 = new JLabel("Course");
		l11.setFont(new Font("Tahoma",Font.BOLD,11));
		l11.setForeground(Color.black);
		l11.setBounds(550, 170, 100, 20);
		contentpane.add(l11);
		
		JLabel l12 = new JLabel("Branch");
		l12.setFont(new Font("Tahoma",Font.BOLD,11));
		l12.setForeground(Color.black);
		l12.setBounds(550, 205, 100, 20);
		contentpane.add(l12);
		
		JLabel l13 = new JLabel("Year");
		l13.setFont(new Font("Tahoma",Font.BOLD,11));
		l13.setForeground(Color.black);
		l13.setBounds(550, 240, 100, 20);
		contentpane.add(l13);
		
		JLabel l14 = new JLabel("Semester");
		l14.setFont(new Font("Tahoma",Font.BOLD,11));
		l14.setForeground(Color.black);
		l14.setBounds(550, 275, 100, 20);
		contentpane.add(l14);
		
		t8 = new JTextField();
		t8.setForeground(Color.BLACK);
		t8.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t8.setBounds(680, 67, 120, 20);
		t8.setColumns(10);
		contentpane.add(t8);
		
		t9 = new JTextField();
		t9.setForeground(Color.BLACK);
		t9.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t9.setBounds(680, 100, 270, 20);
		t9.setColumns(10);
		t9.setEditable(false);
		contentpane.add(t9);
		
		t10 = new JTextField();
		t10.setForeground(Color.BLACK);
		t10.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t10.setBounds(680, 135, 270, 20);
		t10.setEditable(false);
		t10.setColumns(10);
		contentpane.add(t10);
		
		t11 = new JTextField();
		t11.setForeground(Color.BLACK);
		t11.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t11.setBounds(680, 170, 270, 20);
		t11.setColumns(10);
		t11.setEditable(false);
		contentpane.add(t11);
		
		t12 = new JTextField();
		t12.setForeground(Color.BLACK);
		t12.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t12.setBounds(680, 205, 270, 20);
		t12.setColumns(10);
		t12.setEditable(false);
		contentpane.add(t12);
		
		t13 = new JTextField();
		t13.setForeground(Color.BLACK);
		t13.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t13.setBounds(680, 240, 270, 20);
		t13.setColumns(10);
		t13.setEditable(false);
		contentpane.add(t13);
		
		t14 = new JTextField();
		t14.setForeground(Color.BLACK);
		t14.setFont(new Font("Trebuchet MS",Font.BOLD,10));
		t14.setBounds(680, 280, 270, 20);
		t14.setColumns(10);
		t14.setEditable(false);
		contentpane.add(t14);
		
		b2 = new JButton("Search");
		b2.addActionListener(this);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(815,63,100,25);
		contentpane.add(b2);
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(new Color(153,102,0),2),"Student Details",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51,153,255)));
		panel1.setBounds(515,38,450,350);
		panel1.setBackground(Color.WHITE);
		contentpane.add(panel1);
		
		JLabel l15 = new JLabel("Date of Issue : ");
		l15.setForeground(Color.black);
		l15.setFont(new Font("Trebuchet MS",Font.BOLD,14));
		l15.setBounds(20, 350, 118, 26);
		contentpane.add(l15);
		
		datechooser = new JDateChooser();
		datechooser.setBorder(new LineBorder(new Color(0,0,0),1,true));
		datechooser.setForeground(Color.black);
		datechooser.setBounds(137, 347, 200, 29);
		contentpane.add(datechooser);
		
		b3 = new JButton("Issue");
		b3.addActionListener(this);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(47,390,110,33);
		contentpane.add(b3);
		
		b4 = new JButton("Back");
		b4.addActionListener(this);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(200,390,110,33);
		contentpane.add(b4);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
			Conn con = new Conn();
			if(ae.getSource() == b1)
			{
				String sql = "select * from book where book_id=?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t1.getText());
				ResultSet rs = st.executeQuery();
				
				while(rs.next())
				{
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("isbn"));
					t4.setText(rs.getString("publisher"));
					t5.setText(rs.getString("edition"));
					t6.setText(rs.getString("price"));
					t7.setText(rs.getString("pages"));
				}
				st.close();
				rs.close();
				
			}
			
			if(ae.getSource() == b2)
			{
				String sql = "select * from student where student_id=?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t8.getText());
				ResultSet rs = st.executeQuery();
				
				while(rs.next())
				{
					t9.setText(rs.getString("name"));
					t10.setText(rs.getString("father_name"));
					t11.setText(rs.getString("course"));
					t12.setText(rs.getString("branch"));
					t13.setText(rs.getString("year"));
					t14.setText(rs.getString("semester"));
					
				}
				st.close();
				rs.close();
			}
			
			if(ae.getSource() == b3)
			 {
				try
				{
					String sql = "insert into issuebook(book_id, student_id, bname, sname, course, branch, date_of_issue) values(?,?,?,?,?,?,?)";
					PreparedStatement st = con.c.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, t8.getText());
					st.setString(3, t2.getText());
					st.setString(4, t9.getText());
					st.setString(5, t11.getText());
					st.setString(6, t12.getText());
					st.setString(7, ((JTextField) datechooser.getDateEditor().getUiComponent()).getText());
					
					int i =st.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
					}
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				if(ae.getSource() == b4)
				{
					this.setVisible(false);
					Home hm = new Home();
					hm.setVisible(true);
				}
				con.c.close();
			}
		}catch(Exception e)
		{
			
		}
		}
	}
