package com.emall.service.impl;

import java.util.List;

import com.emall.bean.OrderBean;
import com.emall.dao.IOrderDao;
import com.emall.dao.impl.OrderDaoImpl;
import com.emall.service.IOrderService;
import com.emall.utils.PageModel;

public class OrderServiceImpl implements IOrderService {
	private IOrderDao dao=new OrderDaoImpl();
	@Override
	public int add(OrderBean order) {
		return dao.add(order);
	}

	@Override
	public int delete(OrderBean order) {
		return dao.delete(order);
	}

	@Override
	public int update(OrderBean order) {
		return dao.update(order);
	}

	@Override
	public OrderBean queryForSingle(String orderid) {
		return dao.queryForSingle(orderid);
	}

	@Override
	public List<OrderBean> query(OrderBean order) {
		return dao.query(order);
	}

	@Override
	public PageModel<OrderBean> queryPageModel(OrderBean order,
			int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
