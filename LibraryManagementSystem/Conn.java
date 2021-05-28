package LibraryManagementSystem;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn 
{

	Connection c;
	Statement s;
	public Conn()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
		s = c.createStatement();
	}catch(Exception e)
		{
		System.out.println(e);
		}

	}
}
