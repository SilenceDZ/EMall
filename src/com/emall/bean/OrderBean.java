package com.emall.bean;

import java.sql.Date;

public class OrderBean {
	private String orderid;
	private int userid;
	private int quantity;
	private int alltype;
	private double totalprice;
	private String paytype;
	private String receivedtype;
	private String username;
	private String address;
	private String postcode;
	private String phoneno;
	private String email;
	private Date orderdate;
	private char status;
	private String approveduser;
	private Date approveddate;
	private String msg;
	public OrderBean() {
		super();
	}
	public OrderBean(String orderid, int userid, int quantity, int alltype,
			double totalprice, String paytype, String receivedtype,
			String username, String address, String postcode, String phoneno,
			String email, Date orderdate, char status, String approveduser,
			Date approveddate, String msg) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.quantity = quantity;
		this.alltype = alltype;
		this.totalprice = totalprice;
		this.paytype = paytype;
		this.receivedtype = receivedtype;
		this.username = username;
		this.address = address;
		this.postcode = postcode;
		this.phoneno = phoneno;
		this.email = email;
		this.orderdate = orderdate;
		this.status = status;
		this.approveduser = approveduser;
		this.approveddate = approveddate;
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return "OrderBean [orderid=" + orderid + ", userid=" + userid
				+ ",\n quantity=" + quantity + ", alltype=" + alltype
				+ ",\n totalprice=" + totalprice + ", paytype=" + paytype
				+ ",\n receivedtype=" + receivedtype + ", username=" + username
				+ ",\n address=" + address + ", postcode=" + postcode
				+ ",\n phoneno=" + phoneno + ", email=" + email + ", orderdate="
				+ orderdate + ", status=" + status + ", approveduser="
				+ approveduser + ", approveddate=" + approveddate + ", msg="
				+ msg + "]";
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAlltype() {
		return alltype;
	}
	public void setAlltype(int alltype) {
		this.alltype = alltype;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getReceivedtype() {
		return receivedtype;
	}
	public void setReceivedtype(String receivedtype) {
		this.receivedtype = receivedtype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getApproveduser() {
		return approveduser;
	}
	public void setApproveduser(String approveduser) {
		this.approveduser = approveduser;
	}
	public Date getApproveddate() {
		return approveddate;
	}
	public void setApproveddate(Date approveddate) {
		this.approveddate = approveddate;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
