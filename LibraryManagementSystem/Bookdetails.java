package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import net.proteanit.sql.DbUtils;
import java.sql.*;
public class Bookdetails extends JFrame implements ActionListener 
{
	private JPanel contentpane;
	private JTable table;
	private JTextField search;
	private JButton b1,b2,b3;
	

	public static void main(String[] args) 
	{
	
		new Bookdetails().setVisible(true);

	}
	public void Book()
	{
		try
		{
			Conn con = new Conn();
			String sql = "select * from book";
			PreparedStatement st = con.c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			table.setModel(DbUtils.resultSetToTableModel(rs));
			rs.close();
			st.close();
			con.c.close();
		}catch(Exception e)
		{
			
		}
	}
	
	public Bookdetails()
	{
		setBounds(350,150,890,475);
		contentpane = new JPanel();
		contentpane.setBackground(Color.white);
		setContentPane(contentpane);
		contentpane.setLayout(null);
		
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setBounds(70, 150, 789, 270);
		scrollpane.setBackground(Color.WHITE);
		contentpane.add(scrollpane);
		
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() 
		{
		public void mouseClicked(MouseEvent arg0)
		{
			int row = table.getSelectedRow();
			search.setText(table.getModel().getValueAt(row, 1).toString());
			
			
		}
		});
		
		table.setBackground(Color.white);
		table.setForeground(Color.DARK_GRAY);
		table.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		scrollpane.setViewportView(table);
		
		JButton b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setBorder(new LineBorder(new Color(102,0,153),2,true));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/eight.png"));
		Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		b1.setIcon(i3);
		b1.setForeground(new Color(102,0,153));
		b1.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b1.setBounds(564, 89, 138, 33);
		contentpane.add(b1);
		
		JButton b2 = new JButton("Delete");
		b2.addActionListener(this);
		b2.setBorder(new LineBorder(new Color(102,0,153),2,true));
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/nineth.png"));
		Image i5 = i4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		b2.setIcon(i6);
		b2.setForeground(new Color(102,0,153));
		b2.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		b2.setBounds(712, 89, 138, 33);
		contentpane.add(b2);
		
		JLabel l1 = new JLabel("Book Details");
		l1.setForeground(new Color(0,204,0));
		l1.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,28));
		l1.setBounds(350, 15, 400, 47);
		contentpane.add(l1);
		
		search = new JTextField();
		search.setBackground(new Color(255,240,245));
		search.setBorder(new LineBorder(new Color(255,105,180),2,true));
		search.setForeground(new Color(47,79,79));
		search.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,15));
		search.setBounds(189, 89, 357, 33);
		contentpane.add(search);
		search.setColumns(10);
		
		JLabel l2 = new JLabel("Back");
		l2.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				setVisible(false);
				new Home().setVisible(true);
			}
			
		});
		
		l2.setForeground(Color.GRAY);
		l2.setFont(new Font("Trebuchet MS",Font.BOLD,16));
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/tenth.png"));
		Image i8 = i7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		l2.setIcon(i9);
		l2.setBounds(97,89,72,33);
		contentpane.add(l2);
		
	
				
	    JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(51,153,255),2),"Book-Details",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0,255,1)));
		panel.setBounds(67,54,793,368);
		panel.setBackground(Color.WHITE);
		contentpane.add(panel);
		Book();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
			Conn con = new Conn();
			if(ae.getSource() == b1)
			{
				String sql = "select * from book where concat(name,book_id) like ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1, "%" + search.getText() + "%");
				ResultSet rs = st.executeQuery();
				
				table.setModel(DbUtils.resultSetToTableModel(rs));
				rs.close();
				st.close();
			}
			
			if(ae.getSource() == b2)
			{
				String sql = "delete from book where name = '" + search.getText() + "'";
				PreparedStatement st = con.c.prepareStatement(sql);
				JDialog.setDefaultLookAndFeelDecorated(true);
				int response = JOptionPane.showConfirmDialog(null,"Do you want to continue?","Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				/*if(response == JOptionPane.NO_OPTION)
				{
					
				}
				*/
				if(response==JOptionPane.YES_OPTION)
				{
					int rs = st.executeUpdate();
					JOptionPane.showMessageDialog(null,"Deleted !!");
					
				}
			
				/*else if(response == JOptionPane.CLOSED_OPTION)
				{
					
				}
				*/
				st.close();
			}
			
			con.c.close();
		}catch(Exception e)
		{
			
		}
	
		
	}

}
