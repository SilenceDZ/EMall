package com.emall.service;

import java.util.List;

import com.emall.bean.OrderDetailBean;
import com.emall.bean.PageModel;

public interface IOrderDetailService {
	public int add(OrderDetailBean orderdetail);
	
	public int delete(OrderDetailBean orderdetail);
	
	public int update(OrderDetailBean orderdetail);
	
	public OrderDetailBean queryForSingle(String detailid);
	
	public List<OrderDetailBean> query(OrderDetailBean orderdetail);
	
	public PageModel<OrderDetailBean> queryPageModel(OrderDetailBean order,int currentPage,int pageSize);
}
