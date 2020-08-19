package com.jdbc;
import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;

public class JdbcDelete {
	public static void main(String[] args) {
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
	System.out.println("Connected:");
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Id to delete data");
	int id=sc.nextInt();
	
	PreparedStatement ps=con.prepareStatement("delete from Employee where id=?");
	
	ps.setInt(1,id);
	
	ps.executeUpdate();
	
	System.out.println("data deleted !");
	
	
	}
	catch(Exception e) {e.printStackTrace();}
	}
}


