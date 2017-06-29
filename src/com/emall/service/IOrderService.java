package com.emall.service;

import java.util.List;

import com.emall.bean.OrderBean;
import com.emall.bean.PageModel;

public interface IOrderService {
public int add(OrderBean order);
	
	public int delete(OrderBean order);
	
	public int update(OrderBean order);
	
	public OrderBean queryForSingle(String orderid);
	
	public List<OrderBean> query(OrderBean order);
	
	public PageModel<OrderBean> queryPageModel(OrderBean order,int currentPage,int pageSize);
}
