package com.jdbc;
import java.sql.*;
import java.util.Scanner;

public class JdbcUpdate {

	public static void main(String[] args) {
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","root");
	System.out.println("Connected:");
    PreparedStatement ps=con.prepareStatement("update Employee set Name=?,Salary=? where Id=?");	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the ID to Update ");
	int id=sc.nextInt();
    sc=new Scanner(System.in);
	System.out.println("Enter New Name");
	String name=sc.nextLine();
	System.out.println("Enter New Salary");
	float sal=sc.nextFloat();
	
	ps.setString(1,name);
	ps.setFloat(2,sal);
	ps.setInt(3,id);
	
	ps.executeUpdate();
	
	System.out.println("data updated !");
	
	}
	catch(Exception e) { e.printStackTrace();}
	}

}

