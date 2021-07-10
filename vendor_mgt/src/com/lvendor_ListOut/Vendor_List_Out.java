package com.lvendor_ListOut;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pojo.Vendor_Signup_Bean;
import com.utility.VendorJdbcConnection;

public class Vendor_List_Out {
	Vendor_Signup_Bean pBean;
	ArrayList<Vendor_Signup_Bean> al;
	
	
	public Vendor_List_Out() {
		// TODO Auto-generated constructor stub
		al=new ArrayList<Vendor_Signup_Bean>();
		
	}
	public void get_VendorList(String query) {
		PreparedStatement prp;
		ResultSet rs;
		Connection con;
		con=VendorJdbcConnection.getVendorConnection();
		try {
			prp=con.prepareStatement(query);
			rs=prp.executeQuery();
			while(rs.next()) {
				pBean=new Vendor_Signup_Bean();
				pBean.setId(rs.getString(1));
				pBean.setName(rs.getString(2));
				pBean.setMob(rs.getString(3));
				pBean.setLiSt_items(rs.getString(4));
				pBean.setAddress(rs.getString(5));
				pBean.setPin(rs.getString(6));
				pBean.setStatus(rs.getString(7));
				
				al.add(pBean);	
			}
			System.out.println("The ACTIVE Vendor Details : ");
			System.out.println("============================================");
			
			for(Vendor_Signup_Bean p1:al) {
				//if(p1.getStatus()=="A") 
				{
					
					System.out.println(p1);
					
				}
					
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
