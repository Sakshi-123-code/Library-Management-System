package LibraryManagementSystem;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener 
{
	
	private JPanel contentpane;
	private JButton b1,b2,b3,b4,b5,b6;
	
	public static void main(String[] args) 
	{
	
		new Home().setVisible(true);

	}
	
	public Home()
	{
		setBounds(380,100,900,610);
		contentpane = new JPanel();
		setContentPane(contentpane);
		contentpane.setLayout(null);
		contentpane.setBackground(Color.WHITE);
		//setUndecorated(true);
		
		JMenuBar menubar = new JMenuBar();
		menubar.setBackground(Color.CYAN);
		menubar.setBounds(0,0,1000,30);
		contentpane.add(menubar);
		
		JMenu record  = new JMenu("Record");
		record.setFont(new Font("Trebuchet MS",Font.BOLD,11));
		menubar.add(record);
		
		JMenuItem bookdetails = new JMenuItem("Book Details");
		bookdetails.addActionListener(this);
		bookdetails.setBackground(new Color(211,211,211));
		bookdetails.setForeground(Color.DARK_GRAY);
		record.add(bookdetails);
		
		JMenuItem studentdetails = new JMenuItem("Student Details");
		studentdetails.setBackground(new Color(211,211,211));
		studentdetails.addActionListener(this);
		studentdetails.setForeground(Color.DARK_GRAY);
		record.add(studentdetails);
		
		JMenu help = new JMenu("Help");
		help.setFont(new Font("Trebuchet MS",Font.BOLD,11));
		menubar.add(help);
		
		JMenuItem aboutus = new JMenuItem("About Us");
		aboutus.setBackground(new Color(211,211,211));
		aboutus.setForeground(Color.DARK_GRAY);
		aboutus.addActionListener(this);
		help.add(aboutus);
		
		JMenu exit = new JMenu("Exit");
		exit.setFont(new Font("Trebuchet MS",Font.BOLD,11));
		menubar.add(exit);
		
		JMenuItem logout = new JMenuItem("Logout");
		logout.setBackground(new Color(211,211,211));
		logout.setForeground(Color.DARK_GRAY);
		logout.addActionListener(this);
		exit.add(logout);
		
		
		JMenuItem mExit = new JMenuItem("Exit");
		mExit.setBackground(new Color(211,211,211));
		mExit.setForeground(Color.DARK_GRAY);
		mExit.addActionListener(this);
		exit.add(mExit);
		
		JLabel l1 = new JLabel("Library Management System ");
		l1.setForeground(new Color(255,51,51));
		l1.setFont(new Font("Segoe UI Semilight",Font.BOLD,20));
		l1.setBounds(268, 20, 701, 80);
		contentpane.add(l1);
		
		JLabel l2 = new JLabel("");
		//l2.setVerticalAlignment(SwingConstants.TOP);;
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/second.png"));
		Image i2 = i1.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l2 = new JLabel(i3);
		l2.setBounds(30, 80, 159, 152);
		contentpane.add(l2);
		
		b1 = new JButton("Add Book");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(50, 220, 100, 30);
		b1.addActionListener(this);
		contentpane.add(b1);
		
		JLabel l3 = new JLabel("");
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/third.png"));
		Image i5 = i4.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		l3 = new JLabel(i6);
		l3.setBounds(290, 80, 159, 152);
		contentpane.add(l3);
		
		b2 = new JButton("Statistics");
		b2.addActionListener(this);
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setBounds(320, 220, 100, 30);
		contentpane.add(b2);
		
		JLabel l4 = new JLabel("");
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/fourth.png"));
		Image i8 = i7.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		l4 = new JLabel(i9);
		l4.setBounds(570, 80, 159, 152);
		contentpane.add(l4);
		
		b3 = new JButton("Add Student");
		b3.addActionListener(this);
		b3.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setBounds(590, 220, 110, 30);
		contentpane.add(b3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255,102,0),2),"Operation",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,0,0)));
		panel.setBounds(20,80,730,200);
		panel.setBackground(Color.WHITE);
		contentpane.add(panel);
		
		JLabel l5 = new JLabel("");
		ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/fifth.png"));
		Image i11 = i10.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		l5 = new JLabel(i12);
		l5.setBounds(30, 325, 159, 152);
		contentpane.add(l5);
		
		JLabel l6 = new JLabel("");
		ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/sixth.png"));
		Image i14 = i13.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
		ImageIcon i15 = new ImageIcon(i14);
		l6 = new JLabel(i15);
		l6.setBounds(310,325,159,152);
		contentpane.add(l6);
		
		JLabel l7 = new JLabel("");
		ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/seventh.png"));
		Image i17 = i16.getImage().getScaledInstance(100, 90 ,Image.SCALE_DEFAULT);
		ImageIcon i18 = new ImageIcon(i17);
		l7 = new JLabel(i18);
		l7.setBounds(570, 325, 159, 152);
		contentpane.add(l7);
		
		b4 = new JButton("Issue Book");
		b4.addActionListener(this);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(55, 470, 110, 30);
		contentpane.add(b4);
		
		b5 = new JButton("Return Book");
		b5.addActionListener(this);
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.setBounds(331,470,110,30);
		contentpane.add(b5);
		
		b6 = new JButton("About Us");
		b6.addActionListener(this);
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.WHITE);
		b6.setBounds(581,470,110,30);
		contentpane.add(b6);
		
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new TitledBorder(new LineBorder(new Color(255,102,0),2),"Action",TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255,0,0)));
		panel1.setBounds(20,330,730,200);
		panel1.setBackground(Color.WHITE);
		contentpane.add(panel1);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
	
		String msg = ae.getActionCommand();
		if(msg.equals("Logout"))
		{
			setVisible(false);
			new Login().setVisible(true);
		}
		
		else if(msg.equals("Exit"))
		{
			System.exit(ABORT);
		}
		
		else if(msg.equals("About Us"))
		{
			setVisible(false);
			new About().setVisible(true);
		}
		else if(msg.equals("Book Details"))
		{
			setVisible(false);
			new Bookdetails().setVisible(true);
		}
		else if(msg.equals("Student Details"))
		{
			setVisible(false);
			new Studentdetails().setVisible(true);
		}
		
		if(ae.getSource() == b1)
		{
			this.setVisible(false);
			new Addbook().setVisible(true);
		}
		if(ae.getSource() == b2)
		{
			this.setVisible(false);
			new Statistics().setVisible(true);
		}
		if(ae.getSource() == b3)
		{
			this.setVisible(false);
			new Addstudent().setVisible(true);
		}
		if(ae.getSource() == b4)
		{
			this.setVisible(false);
			new Issuebook().setVisible(true);
		}
		if(ae.getSource() == b5)
		{
			this.setVisible(false);
			new Returnbook().setVisible(true);
		}
		/*if(ae.getSource() == b6)
		{
			this.setVisible(false);
			new Aboutus().setVisible(true);
		}*/
		
		
	}

}
