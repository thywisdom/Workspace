package Ty.ryy.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Dbconnect {
	Connection con=null;
	public void connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","root");
			System.out.println(con);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void createtable()
	{
		try
		{
			connect();
			PreparedStatement pst=con.prepareStatement("create table user(id int,name varchar(100))");
			pst.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	


}
