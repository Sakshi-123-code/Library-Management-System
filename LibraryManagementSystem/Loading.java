package LibraryManagementSystem;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable 
{

	private JPanel panel1;
	private JProgressBar progressbar;
	Connection conn;
	int s;
	Thread th;
	
	public static void main(String[] args) 
	{
	
		new Loading().setVisible(true);
	}

	public void setUploading()
	{
		th.start();
		
	}
	public void run()
	{
		try
		{

			for(int i=0;i<200;i++)
			{
				s = s+1;
				int m = progressbar.getMaximum();
				int v = progressbar.getValue();
				if(v<m)
				{
					progressbar.setValue(progressbar.getValue()+1);
					
				}
				else
				{
					i = 201;
					this.setVisible(false);
					new Home().setVisible(true);
					
				}
				Thread.sleep(50);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public Loading()
	{
		super("Loading");
		th = new Thread((Runnable) this);
		
		setBounds(400,200,600,390);
		panel1 = new JPanel();
		setContentPane(panel1);
		//setUndecorated(true);

		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		
		JLabel LibraryManagement = new JLabel("Smart Library v2.1");
		LibraryManagement.setForeground(new Color(51,204,255));
		LibraryManagement.setFont(new Font("Trebuchet MS",Font.BOLD,30));
		LibraryManagement.setBounds(150, 46, 500, 35);
		panel1.add(LibraryManagement);
		
		progressbar = new JProgressBar();
		progressbar.setFont(new Font("Tahoma",Font.BOLD,12));
		progressbar.setStringPainted(true);
		progressbar.setBounds(150, 135, 260, 25);
		panel1.add(progressbar);
		
		JLabel lb = new JLabel("Please Wait...");
		lb.setFont(new Font("Verdana",Font.BOLD,15));
		lb.setForeground(new Color(153,102,0));
		lb.setBounds(210, 165, 150, 20);
		panel1.add(lb);
		
		setUploading();
		
		}
}
