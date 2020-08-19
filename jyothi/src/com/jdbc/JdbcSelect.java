package com.jdbc;
import java.sql.*;

public class JdbcSelect {

	public static void main(String[] args) {
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
	System.out.println("Connected:");
	Statement stat=con.createStatement();
	System.out.println("stmt create:");
	ResultSet rset=stat.executeQuery("SELECT * FROM Employee");
	while(rset.next())
	{
		System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getFloat(3));
	}
	}
	catch(Exception e) { e.printStackTrace();}
	}

}

