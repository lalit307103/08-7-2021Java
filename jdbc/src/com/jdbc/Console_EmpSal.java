
package com.jdbc; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jdbc.oracle.util.GetMyOracleConnection;
import oracle.jdbc.pool.OracleDataSource;

public class Console_EmpSal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement prp;
		String qry = "insert into student values(?,?)";
		OracleDataSource ods;
		try {
			/*
			 * //create an object for ODS ods = new OracleDataSource(); //injecting the
			 * appropriate values ods.setUser("system"); ods.setPassword("test");
			 * ods.setPortNumber(1521); ods.setDriverType("thin");
			 * ods.setServerName("localhost"); ods.setDatabaseName("xe");
			 * con=ods.getConnection();//get the connection
			 */
			con = GetMyOracleConnection.getMyOracleConn();
			prp = con.prepareStatement(qry);
			// setting the IN parameters
			prp.setInt(1, Integer.parseInt(args[0]));
			prp.setString(2, args[1]);
			int row = prp.executeUpdate();// execute the query
			if (row > 0)
				System.out.println("success");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
