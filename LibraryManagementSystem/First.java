package LibraryManagementSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class First extends JFrame implements ActionListener
{
	
	public First()
	{
		//setSize(1050,390);
		setBounds(250,200,1050,390);
		setLayout(null);
		//setLocation(250,200);
		
		JLabel l1 = new JLabel("");
		JButton b1 = new JButton("Next");
		b1.addActionListener(this);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setBounds(800, 250, 160, 50);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("LibraryManagementSystem/first.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1050,390,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l1 = new JLabel(i3);
		l1.setBounds(0, 0, 1050, 390);
		l1.add(b1);
		add(l1);
		
	}

	public static void main(String[] args) 
	{
	
		new First().setVisible(true);

	}


	public void actionPerformed(ActionEvent ae) 
	{
		this.setVisible(false);
		new Login().setVisible(true);
		
		
		
	}

}
