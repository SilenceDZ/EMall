package com.emall.service.impl;

import java.util.List;

import com.emall.bean.OrderDetailBean;
import com.emall.dao.IOrderDetailDao;
import com.emall.dao.impl.OrderDetailDaoImpl;
import com.emall.service.IOrderDetailService;
import com.emall.utils.PageModel;

public class OrderDetailServiceImpl implements IOrderDetailService{
	private IOrderDetailDao dao=new OrderDetailDaoImpl();
	@Override
	public int add(OrderDetailBean orderdetail) {
		return dao.add(orderdetail);
	}

	@Override
	public int delete(OrderDetailBean orderdetail) {
		return dao.delete(orderdetail);
	}

	@Override
	public int update(OrderDetailBean orderdetail) {
		return dao.update(orderdetail);
	}

	@Override
	public OrderDetailBean queryForSingle(String detailid) {
		return dao.queryForSingle(detailid);
	}

	@Override
	public List<OrderDetailBean> query(OrderDetailBean orderdetail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageModel<OrderDetailBean> queryPageModel(OrderDetailBean order,
			int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
