package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
public class Addbook extends JFrame implements ActionListener
{
	private JPanel contentpane;
	private JTextField t1,t2,t3,t4,t5,t6;
	private JButton b1,b2;
    JComboBox combobox;
  
    public static void main(String[] args) 
    {
    	new Addbook().setVisible(true);
    	
	}
    public void random()
    {
    	Random rd = new Random();
    	t1.setText(""+rd.nextInt(1000+1));
    }
    
    public Addbook()
    {
    	setBounds(600,150,518,450);
    	contentpane = new JPanel();
    	setContentPane(contentpane);
    	contentpane.setLayout(null);
    	contentpane.setBackground(Color.white);
    	
    	JLabel l1 = new JLabel("Book_id");
    	l1.setForeground(Color.BLACK);
    	l1.setFont(new Font("Tahoma",Font.BOLD,12));
    	l1.setBounds(73, 53, 90, 22);
    	contentpane.add(l1);
    	
    	JLabel l2 = new JLabel("Name");
    	l2.setForeground(Color.BLACK);
    	l2.setFont(new Font("Tahoma",Font.BOLD,12));
    	l2.setBounds(73, 90, 90, 22);
    	contentpane.add(l2);
    	
    	JLabel l3 = new JLabel("ISBN");
    	l3.setForeground(Color.BLACK);
    	l3.setFont(new Font("Tahoma",Font.BOLD,12));
    	l3.setBounds(73, 130, 90, 22);
    	contentpane.add(l3);
    	
    	JLabel l4 = new JLabel("Publisher");
    	l4.setForeground(Color.BLACK);
    	l4.setFont(new Font("Tahoma",Font.BOLD,12));
    	l4.setBounds(73, 170, 90, 22);
    	contentpane.add(l4);
    	
    	JLabel l5 = new JLabel("Price");
    	l5.setForeground(Color.BLACK);
    	l5.setFont(new Font("Tahoma",Font.BOLD,12));
    	l5.setBounds(73, 250, 90, 22);
    	contentpane.add(l5);
    	
    	JLabel l7 = new JLabel("Pages");
    	l7.setForeground(Color.BLACK);
    	l7.setFont(new Font("Tahoma",Font.BOLD,12));
    	l7.setBounds(73, 290, 90, 22);
    	contentpane.add(l7);
    	
    	JLabel l6 = new JLabel("Edition");
    	l6.setForeground(Color.BLACK);
    	l6.setFont(new Font("Tahoma",Font.BOLD,12));
    	l6.setBounds(73, 210, 90, 22);
    	contentpane.add(l6);

    	t1 = new JTextField();
    	t1.setForeground(Color.BLACK);
    	t1.setFont(new Font("Trebuchet MS",Font.BOLD,12));
    	t1.setBounds(172, 55, 250, 20);
    	t1.setColumns(10);
    	contentpane.add(t1);
    	
    	t2 = new JTextField();
    	t2.setForeground(Color.black);
    	t2.setFont(new Font("Trebuchet MS",Font.BOLD,12));
    	t2.setBounds(172, 90, 250, 20);
    	t2.setColumns(10);
    	contentpane.add(t2);
    	
    	t3 = new JTextField();
    	t3.setForeground(Color.BLACK);
    	t3.setFont(new Font("Trebuchet MS",Font.BOLD,12));
    	t3.setBounds(172, 130, 250, 20);
    	t3.setColumns(10);
    	contentpane.add(t3);
    	
    	t4 = new JTextField();
    	t4.setForeground(Color.black);
    	t4.setFont(new Font("Trebuchet MS",Font.BOLD,12));
    	t4.setBounds(172, 170, 250, 20);
    	t4.setColumns(10);
    	contentpane.add(t4);
    	
    	combobox = new JComboBox();
    	combobox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
    	combobox.setBounds(172, 210, 250, 20);
    	combobox.setBackground(Color.WHITE);
    	contentpane.add(combobox);
    	
    	t5 = new JTextField();
    	t5.setForeground(Color.black);
    	t5.setFont(new Font("Trebuchet MS",Font.BOLD,12));
    	t5.setBounds(172, 250, 250, 20);
    	t5.setColumns(10);
    	contentpane.add(t5);
    	
    	t6 = new JTextField();
    	t6.setForeground(Color.black);
    	t6.setFont(new Font("Trebuchet MS",Font.BOLD,12));
    	t6.setBounds(172, 290, 250, 20);
    	t6.setColumns(10);
    	contentpane.add(t6);
    	
    	b1 = new JButton("Add");
    	b1.setForeground(Color.WHITE);
    	b1.setBackground(Color.BLACK);
    	b1.addActionListener(this);
    	b1.setBounds(140, 330,100,30);
    	contentpane.add(b1);
    	
    	b2 = new JButton("Back");
    	b2.setForeground(Color.WHITE);
    	b2.setBackground(Color.BLACK);
    	b2.addActionListener(this);
    	b2.setBounds(250, 330,100,30);
    	contentpane.add(b2);
    	
    	JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(102,0,153),2),"Add Books",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,0,255)));
		panel.setBounds(10,29,450,350);
		panel.setBackground(Color.WHITE);
		contentpane.add(panel);
		random();
		
		
    }
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
	
		try
		{
			Conn con = new Conn();
			if(ae.getSource() == b1)
			{
				String sql = "insert into book(book_id, name, isbn, publisher, edition, price, pages) values(?,?,?,?,?,?,?)";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, t1.getText());
				st.setString(2, t2.getText());
				st.setString(3, t3.getText());
				st.setString(4, t4.getText());
				st.setString(5, (String) combobox.getSelectedItem());
				st.setString(6, t5.getText());
				st.setString(7, t6.getText());
				
				int rs = st.executeUpdate();
				if(rs>0)
				{
					JOptionPane.showMessageDialog(null, "Successfully Added");
					
				
				}
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				
				st.close();
			}
			if(ae.getSource() == b2)
			{
				this.setVisible(false);
				new Home().setVisible(true);
			}
			con.c.close();
		}catch(Exception e)
		{
			
		}
		
	}

}
