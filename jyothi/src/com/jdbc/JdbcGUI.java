package com.jdbc;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.*;

public class JdbcGUI extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3;
    JButton b1,b2;
    public JdbcGUI() {
    l1= new JLabel("Enter ID");
    l2= new JLabel("Enter Name");
    l3= new JLabel("Enter Salary");
    l4= new JLabel();
    t1= new JTextField(10);
    t2= new JTextField(10);
    t3= new JTextField(10);
    b1= new JButton("Submit");
    b2= new JButton("Cancel");
    b1.addActionListener(this);
    setLayout(new FlowLayout());
    add(l1);add(t1);
    add(l2);add(t2);
    add(l3);add(t3);
    add(b1);add(b2);add(l4);
    setVisible(true);
    setSize(250,500);
     }
	public static void main(String[] args) {
		JdbcGUI j= new JdbcGUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		System.out.println("Connected:");
		System.out.println("stmt create:");
		PreparedStatement ps= con.prepareStatement("insert into Employee values(?,?,?)");
		ps.setInt(1,Integer.parseInt(t1.getText()));
		ps.setString(2,t2.getText());
		ps.setFloat(3,Float.parseFloat(t3.getText()));
		ps.executeUpdate();		
		t1.setText("");
		t2.setText("");
		t3.setText("");
		l4.setText("Data Inserted Successfully");
		}
		catch(Exception e1) {e1.printStackTrace();}
	}

}
