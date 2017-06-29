package com.emall.bean;

import java.sql.Date;

public class McBean {
	private int mcid;
	private String mcname;
	private String mcdecx;
	private double price;
	private String pic;
	private char flag;
	private int smalltypeid;
	private Date createdate ;
	private int quantity;//库存
	private int count;//购买数量
	public McBean() {
		super();
	}
	public McBean(int mcid, String mcname, String mcdecx, double price,
			String pic, char flag, int smalltypeid, Date createdate,
			int quantity) {
		super();
		this.mcid = mcid;
		this.mcname = mcname;
		this.mcdecx = mcdecx;
		this.price = price;
		this.pic = pic;
		this.flag = flag;
		this.smalltypeid = smalltypeid;
		this.createdate = createdate;
		this.quantity = quantity;
	}
	public double getTotalPrice(){
		return this.price*this.count;
	}
	@Override
	public String toString() {
		return "McBean [mcid=" + mcid + ", mcname=" + mcname + ", mcdecx="
				+ mcdecx + ", price=" + price + ", pic=" + pic + ", flag="
				+ flag + ", smalltypeid=" + smalltypeid + ", createdate="
				+ createdate + ", quantity=" + quantity + "]";
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getMcid() {
		return mcid;
	}
	public void setMcid(int mcid) {
		this.mcid = mcid;
	}
	public String getMcname() {
		return mcname;
	}
	public void setMcname(String mcname) {
		this.mcname = mcname;
	}
	public String getMcdecx() {
		return mcdecx;
	}
	public void setMcdecx(String mcdecx) {
		this.mcdecx = mcdecx;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public char getFlag() {
		return flag;
	}
	public void setFlag(char flag) {
		this.flag = flag;
	}
	public int getSmalltypeid() {
		return smalltypeid;
	}
	public void setSmalltypeid(int smalltypeid) {
		this.smalltypeid = smalltypeid;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
