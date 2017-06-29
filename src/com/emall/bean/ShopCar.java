package com.emall.bean;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;


public class ShopCar {
	
	/**
	 * @fields list:购物车中的商品集合
	 */
	private List<McBean> list;
	private int totalCount;
	private int typeCount;
	private double totalPrice;
	
	public ShopCar() {
		super();
		this.totalCount=0;
		this.typeCount=0;
		this.totalPrice=0.0;
		this.list=new ArrayList<McBean>();
	}
	
	/**
	 * @Title:getShopCar
	 * @Description:获取购物车对象
	 * @param session 将购物车保存到session中
	 * @return 一个购物车对象
	 * @throws
	 */
	public static  ShopCar getShopCar(HttpSession session){
		ShopCar shopCar=(ShopCar) session.getAttribute("SHOP_CAR");
		//每个用户只能有一个购物车对象
		if(shopCar==null){
			shopCar=new ShopCar();
			//将购物车对象保存到session中
			session.setAttribute("SHOP_CAR", shopCar);
		}
		return shopCar;
	}
	
	/**
	 * @Title:add
	 * @Description:添加商品
	 * @param mc 要添加的商品
	 * @throws
	 */
	public void add(McBean mc){
		boolean flag=true;
		//购物车已经有这个商品
		for (McBean mb : list) {
			if(mc.getMcid()==mb.getMcid()){
				mb.setCount(mb.getCount()+1);
				flag=false;
				break;
			}
		}
		//购物车中没有要添加的商品
		if(flag){
			mc.setCount(1);
			list.add(mc);
			this.typeCount=list.size();
		}
	}
	
	/**
	 * @Title:remove
	 * @Description:移除商品
	 * @param mcid 要移除商品的id
	 * @throws
	 */
	public void remove(int mcid){
		for (McBean mc : list) {
			if(mc.getMcid()==mcid){
				list.remove(mc);
				break;
			}
		}
		this.typeCount=list.size();
	}
	/**
	 * @Title:clear
	 * @Description:清空购物车
	 * @throws
	 */
	public void clear(){
		this.list.clear();
		this.typeCount=list.size();
	}
	public List<McBean> getList() {
		return list;
	}
	/**
	 * @Title:getTotalCount
	 * @Description:获取商品总件数
	 * @return 商品总件数
	 * @throws
	 */
	public int getTotalCount() {
		for (McBean mc : list) {
			this.totalCount+=mc.getCount();
		}
		return totalCount;
	}
	public int getTypeCount() {
		//typeCount可以不做操作,直接返回list.size()也是类别个数
		//return list.size();
		return typeCount;
	}
	public double getTotalPrice() {
		for (McBean mc : list) {
			this.totalPrice+=mc.getTotalPrice();
		}
		return totalPrice;
	}
	
}
