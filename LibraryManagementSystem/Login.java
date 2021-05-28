package LibraryManagementSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame implements ActionListener  
{
 
	private JPanel panel;
	private JTextField textfield;
	private JPasswordField passwordfield;
	private JButton b1,b2,b3;
	public Login()
	{
		getContentPane().setBackground(Color.cyan);
		setBounds(400,200,600,390);
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		setContentPane(panel);
		//setUndecorated(true);
		panel.setLayout(null);
		JLabel l1 = new JLabel("Username : ");
		l1.setBounds(124, 89, 95, 24);
		panel.add(l1);
		
		JLabel l2 = new JLabel("Password : ");
		l2.setBounds(124, 124, 95, 24);
		panel.add(l2);
		
		JLabel l3 = new JLabel("Trouble in Login?");
		l3.setForeground(Color.RED);
		l3.setBounds(50, 250,160, 20);
		//Font font = new Font("Verdana", Font.BOLD, 12);
        l3.setFont(new Font("Verdana", Font.BOLD, 12));
		panel.add(l3);
		
		textfield = new JTextField();
		textfield.setBounds(210, 93, 157, 20);
		panel.add(textfield);
		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(210, 128, 157, 20);
		panel.add(passwordfield);
		
		b1 = new JButton("Login");
		b1.setForeground(new Color(46,139,87));
		b1.setBackground(new Color(255,255,153));
		b1.setBounds(149, 190, 113, 39);
		b1.addActionListener(this);
		panel.add(b1);
		
		b2 = new JButton("SignUp");
		b2.setForeground(new Color(255,51,51));
		b2.setBackground(new Color(255,255,153));
		b2.setBounds(300, 190, 113, 39);
		b2.addActionListener(this);
		panel.add(b2);
		
		b3 = new JButton("Forgot Password");
		b3.setForeground(new Color(255,0,0));
		b3.setBackground(Color.pink);
		b3.setBounds(190, 240, 200, 39);
		b3.addActionListener(this);
		panel.add(b3);
		
		
		
		//setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == b1)
		{
			Boolean status = false;
			try
			{
				Conn con = new Conn();
				String sql = "select * from account where username = ? and password = ?";
				PreparedStatement st = con.c.prepareStatement(sql);
				st.setString(1,textfield.getText());
				st.setString(2, passwordfield.getText());
				
				ResultSet rs = st.executeQuery();//resultset = data match and row to row jump 
				if(rs.next())
				{
					this.setVisible(false);
					new Loading().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login!");
				
				}
			}catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
     	if(ae.getSource() == b2)
		{
			setVisible(false);
			Signup su = new Signup();
			su.setVisible(true);
		}
		if(ae.getSource() == b3)
		{
			setVisible(false);
			Forgot ft = new Forgot();
			ft.setVisible(true);
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		new Login().setVisible(true);

	}
}
