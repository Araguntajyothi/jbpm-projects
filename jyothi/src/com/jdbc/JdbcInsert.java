package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.*;

public class JdbcInsert {

	public static void main(String[] args) {
	
	try
	{
    Class.forName("com.mysql.jdbc.Driver");
    
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
	
	PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?)");	
    
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Name");
	String name=sc.nextLine();
	System.out.println("Enter ID");
	int id=sc.nextInt();
	System.out.println("Enter Salary");
	float sal=sc.nextFloat();
	
	ps.setInt(1,id);
	ps.setString(2,name);
	ps.setFloat(3,sal);
	
	ps.executeUpdate();
	
	System.out.println("data inserted !");
	
	}
	catch(Exception e) {e.printStackTrace();}
	}
}
