package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverManager_InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con; //get the connection
String qry="insert into student values(9,'java')";
Statement st;
String driName="oracle.jdbc.driver.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:xe";

//load and register the db driver
try {
	Class.forName(driName);
	
	//get the connection interface type object
	con= DriverManager.getConnection(url,"system","test");  //now con refers to the specific db
	//here system is sys-admin and test is password set at the time of installation of oracle(jdbc)
	
	//get the statement object from above connection
	st=con.createStatement();
	
	//inject the sql qry and execute the qry
	int row=st.executeUpdate(qry);
	if (row>0)  //checking for the success of the qry
		System.out.println("sucess,row inserted "+row);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
catch(SQLException sqle) {
	sqle.printStackTrace();
}

	}

}
