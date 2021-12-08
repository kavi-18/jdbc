package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//1 connection creation
			Connection mycon=DriverManager.getConnection("jdbc:MySQL://localhost:3306/mydb", "root", "root");
			// create statement
			Statement mystate=(Statement) mycon.createStatement();
			//query execute
			ResultSet  rs=mystate.executeQuery("SELECT *from employee");
			while(rs.next())
			{
				System.out.println(rs.getNString("empname")+" "+rs.getNString("empsalary"));
			}
		}catch(Exception e)
	
		{
			e.printStackTrace();
		}

	}

}
