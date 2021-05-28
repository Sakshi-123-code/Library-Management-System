package LibraryManagementSystem;
import java.awt.*;
import javax.swing.*;




public class About extends JFrame 
{
	private JPanel contentpane;
	

	public static void main(String[] args) 
	{
		new About().setVisible(true);

	}
	
	public About()
	{
		super("About Us - Coding Technology");
		setBounds(300,150,700,500);
		
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setLayout(null);
		
		JLabel l1 = new JLabel("New label");
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/logo.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l1 = new JLabel(i3);
		l1.setBounds(500, 40, 100, 100);
		contentpane.add(l1);
		
		JLabel l2 = new JLabel("Library");
		l2.setForeground(new Color(102,0,153));
		l2.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,25));
		l2.setBounds(160, 40, 100, 100);
		contentpane.add(l2);
		
		JLabel l3 = new JLabel("Management System");
		l3.setForeground(new Color(102,51,0));
		l3.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,25));
		l3.setBounds(75, 90, 500, 55);
		contentpane.add(l3);
		
		JLabel l4 = new JLabel("v5.2");
		l4.setForeground(new Color(0,0,153));
		l4.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,17));
		l4.setBounds(185, 140, 90, 21);
		contentpane.add(l4);
		
		JLabel l5 = new JLabel("Developed By : Coding Technology");		
		l5.setFont(new Font("Trebuchet MS",Font.BOLD,15));
		l5.setBounds(70, 198, 600, 34);
		contentpane.add(l5);
		
		JLabel l6 = new JLabel("Subscribe me on Youtube : Coding Technology");		
		l6.setFont(new Font("Trebuchet MS",Font.BOLD,15));
		l6.setBounds(70, 220, 600, 34);
		contentpane.add(l6);
		
		JLabel l7 = new JLabel("Follow me on Instagram : Coding Technology");		
		l7.setFont(new Font("Trebuchet MS",Font.BOLD,15));
		l7.setBounds(70, 240, 600, 34);
		contentpane.add(l7);
		
		JLabel l8 = new JLabel("**If you like this project then follow me on my Youtube channel**");
		//l8.setForeground(new Color(0,0,153));
		l8.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,13));
		l8.setBounds(70, 400, 600, 34);
		contentpane.add(l8);
		
		contentpane.setBackground(Color.white);
		
		
	}

}
