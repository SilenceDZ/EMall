package com.emall.bean;

public class OrderDetailBean {
	private int detailid;
	private String orderid;
	private int mcid;
	private int buynum;
	
	/**
	 * @fields order:订单详情对应一个订单,获得订单详情就可以获得订单 
	 */
	private OrderBean order;
	//视图新增字段
	private String mcname;
	private String pic;
	private double prive;//
	private double totalprice;//
	/*
	 * 
	 */
	public OrderDetailBean() {
		super();
	}
	public OrderDetailBean(int detailid, String orderid, int mcid, int buynum) {
		super();
		this.detailid = detailid;
		this.orderid = orderid;
		this.mcid = mcid;
		this.buynum = buynum;
	}
	
	public OrderBean getOrder() {
		return order;
	}
	public void setOrder(OrderBean order) {
		this.order = order;
	}
	public String getMcname() {
		return mcname;
	}
	public void setMcname(String mcname) {
		this.mcname = mcname;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public double getPrive() {
		return prive;
	}
	public void setPrive(double prive) {
		this.prive = prive;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
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
