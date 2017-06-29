package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.emall.bean.OrderDetailBean;
import com.emall.bean.PageModel;
import com.emall.dao.IOrderDetailDao;
import com.emall.utils.BaseDao;

public class OrderDetailDaoImpl extends BaseDao implements IOrderDetailDao{

	@Override
	public int add(OrderDetailBean orderdetail) {
		String sql="insert into T_ORDERDETAIL(DETAILID,ORDERID,MCID,BUYNUM) values(?,?,?,?)";
		List<Object> params=new ArrayList<>();
		params.add(orderdetail.getDetailid());
		params.add(orderdetail.getOrderid());
		params.add(orderdetail.getMcid());
		params.add(orderdetail.getBuynum());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public int delete(OrderDetailBean orderdetail) {
		String sql="delete from T_ORDERDETAIL where detailid=?";
		return super.baseUpdate(sql, orderdetail);
	}

	@Override
	public int update(OrderDetailBean orderdetail) {
		String sql="update T_ORDERDETAIL set orderid=?,mcid=?,buynum=? where detailid=?";
		List<Object> params=new ArrayList<>();
		params.add(orderdetail.getOrderid());
		params.add(orderdetail.getMcid());
		params.add(orderdetail.getBuynum());
		params.add(orderdetail.getDetailid());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public OrderDetailBean queryForSingle(String detailid) {
		String sql="select * from T_ORDERDETAIL where detailid=?";
		return super.queryForSingle(sql,OrderDetailBean.class , detailid);
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
