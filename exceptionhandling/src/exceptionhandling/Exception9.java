package exceptionhandling;
import java.sql.*;
import java.io.*;

class ExceptionChaining
{
	private void method1() throws SQLException
	{
	   throw new SQLException("This is SQL exception");
	}
	
	public void method2() throws IOException
	{
		try{
			method1();
		}
		catch(SQLException sql){ 
			throw new IOException("This is io exception",sql);
		}
	}	
}

class Exception9 {
	
	public static void main(String args[])
	{
		ExceptionChaining ec = new ExceptionChaining();
		try
		{
			ec.method2();
		}
		catch(IOException exp)
		{
		  exp.printStackTrace();
		}
	}
}
