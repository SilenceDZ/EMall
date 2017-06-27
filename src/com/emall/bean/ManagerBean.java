package com.emall.bean;

import java.sql.Date;

public class ManagerBean {
	private int mid;
	private String musername;
	private String mpassword;
	private String msex;
	private int mlevel;
	private Date mdate;
	public ManagerBean() {
		super();
	}
	public ManagerBean(int mid, String musername, String mpassword,
			String msex, int mlevel, Date mdate) {
		super();
		this.mid = mid;
		this.musername = musername;
		this.mpassword = mpassword;
		this.msex = msex;
		this.mlevel = mlevel;
		this.mdate = mdate;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMusername() {
		return musername;
	}
	public void setMusername(String musername) {
		this.musername = musername;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMsex() {
		return msex;
	}
	public void setMsex(String msex) {
		this.msex = msex;
	}
	public int getMlevel() {
		return mlevel;
	}
	public void setMlevel(int mlevel) {
		this.mlevel = mlevel;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	
}
