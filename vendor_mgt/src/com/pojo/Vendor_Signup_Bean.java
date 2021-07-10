// pojo class used to map to vendor table columns
package com.pojo;

public class Vendor_Signup_Bean {
private String id;
public Vendor_Signup_Bean() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Vendor: [id=" + id + ", name=" + name + ", address=" + address + ", mob=" + mob + ", pin=" + pin
			+ ", status=" + status + ", liSt_items=" + liSt_items + "]";
}
private String name;
String address;
String mob;
String pin;
String status;
String liSt_items;
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getLiSt_items() {
	return liSt_items;
}
public void setLiSt_items(String liSt_items) {
	this.liSt_items = liSt_items;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
// declare all other properties
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
