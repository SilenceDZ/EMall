package com.emall.bean;

public class OrderDetail {
	private int detailid;
	private String orderid;
	private int mcid;
	private int buynum;
	public OrderDetail() {
		super();
	}
	public OrderDetail(int detailid, String orderid, int mcid, int buynum) {
		super();
		this.detailid = detailid;
		this.orderid = orderid;
		this.mcid = mcid;
		this.buynum = buynum;
	}
	public int getDetailid() {
		return detailid;
	}
	public void setDetailid(int detailid) {
		this.detailid = detailid;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public int getMcid() {
		return mcid;
	}
	public void setMcid(int mcid) {
		this.mcid = mcid;
	}
	public int getBuynum() {
		return buynum;
	}
	public void setBuynum(int buynum) {
		this.buynum = buynum;
	}
	
}
