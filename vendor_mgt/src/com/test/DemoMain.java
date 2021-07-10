package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pojo.Vendor_Signup_Bean;
import com.utility.VendorJdbcConnection;
import com.utility.displaymsg.DisplayMessage;
import com.utility.input.console.ReadData_Console;

import vendor_id_genrate.GengerateID;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String qry = "insert into vendor values(?,?,?,?,?,?,?)";
		
		Connection conn;
		PreparedStatement prp;
		ReadData_Console rd = new ReadData_Console();
		Vendor_Signup_Bean pojo=new Vendor_Signup_Bean();
GengerateID gId = new GengerateID();
gId.readCurrentId();
gId .get_Id_Increament();
		
		
DisplayMessage.displayMessage("id");

//pojo.setId(Integer.parseInt(rd.getDataFromConsole()));
//pojo.setId(id);

DisplayMessage.displayMessage("name");

String name=rd.getDataFromConsole();
DisplayMessage.displayMessage("mobile");

String mob=rd.getDataFromConsole();
DisplayMessage.displayMessage("items list");

String items=rd.getDataFromConsole();
DisplayMessage.displayMessage("address");

String addr=rd.getDataFromConsole();
DisplayMessage.displayMessage("pin");

String pin=rd.getDataFromConsole();
String status="A";

// get the connection object
conn = VendorJdbcConnection.getVendorConnection();
// embed the qry
try {
prp=conn.prepareStatement(qry);
//prp.setInt(1,id);
//prp.setInt(1, pojo.getId());
prp.setString(2,name);
prp.setInt(3, Integer.parseInt(mob));
prp.setString(4, items);
prp.setString(5,addr);
prp.setInt(6, Integer.parseInt(pin));
prp.setString(7, status);
int row=prp.executeUpdate();
if(row > 0) {
	System.out.println("sucess");
	System.out.println("your id is "+pojo.getId());

}


//System.out.println(name);
//System.out.println("enter mobile no");
String mob1 =rd.getDataFromConsole();
System.out.println(mob1 );
DisplayMessage.displayMessage("address");
System.out.println(rd.getDataFromConsole());
	}
catch(Exception e) {
	e.printStackTrace();
}

}
}




// injecting pojos into collection

/*class A{
	POJO p;
	A(){
		
		AL<POJO> al = new AL<POJO>();
	}
}
void disp() {
	rs=PreparedStatement.executeQuery();
	while(rs.next()) {
		p = new POJO();
		pojo.setId(rs.getInt(1));
		// repeat
	al.add(p);
		
	}
	for(POJO p1:al) {
		if(p1.getId()==2) {
			
		}
	}
}*/