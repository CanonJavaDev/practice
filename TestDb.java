package com.dss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		// TODO Auto-generated method stub
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection connection=DriverManager.getConnection("jdbc:odbc:ritesh","system","ritesh");
		Statement statement=connection.createStatement();  
		//table creation
		String q1="create table emp(eid number,ename varchar2(30),esal number)";
		int a = statement.executeUpdate(q1);
		System.out.println("table is created successfully = "+a);
		
		//Inserting data
		String q2= "insert into emp values (111,'first',2000)"; 
		String q3= "insert into emp values (222,'second',3000)"; 
		String q4= "insert into emp values (111,'third',4000)";
		statement.executeUpdate(q2);
		statement.executeUpdate(q3);
		statement.executeUpdate(q4);
		System.out.println("values are inserted successfully");
		 
		//retrieve the values
		String q5 = "Select * from emp";
		ResultSet set = statement.executeQuery(q5);
		
		while(set.next())
		{
			System.out.println(set.getInt(1)+"---------"+set.getString("ename")+"-----------"+set.getFloat(3));
			
		}
		
		System.out.println("data printing is completed");
		
		//update the data
		String q6= "update emp set esal=esal+2000 where esal<3000";
		int x = statement.executeUpdate(q6);
		System.out.println("number of records are updated="+x);
		
		Thread.sleep(10000); // 10 sec sleep
		
		//drop the table
		String q7 = "drop table emp";
		int y= statement.executeUpdate(q7);
		System.out.println("table dropped successfully"+y);
		
		connection.close();
	}

}
