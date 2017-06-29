package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.emall.bean.OrderBean;
import com.emall.dao.IOrderDao;
import com.emall.utils.BaseDao;
import com.emall.utils.PageModel;
import com.emall.utils.WebUtils;

public class OrderDaoImpl extends BaseDao implements IOrderDao {

	@Override
	public int add(OrderBean order) {
		String sql="insert into T_ORDERS(ORDERID,USERID,QUANTITY,ALLTYPE,TOTALPRICE,PAYTYPE,RECEIVEDTYPE,USERNAME,"
				+ "ADDRESS,POSTCODE,PHONENO,EMAIL,ORDERDATE,STATUS,APPROVEDUSER,APPROVEDDATE,MSG) values(?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?)";
		List<Object>  params=new ArrayList<>();
		params.add(order.getOrderid());
		params.add(order.getUserid());
		params.add(order.getQuantity());
		params.add(order.getAlltype());
		params.add(order.getTotalprice());
		params.add(order.getPaytype());		
		params.add(order.getReceivedtype());
		params.add(order.getUsername());
		params.add(order.getAddress());
		params.add(order.getPostcode());
		params.add(order.getPhoneno());
		params.add(order.getEmail());		
		params.add(order.getOrderdate());
		params.add(String.valueOf(order.getStatus()));
		params.add(order.getApproveduser());
		params.add(order.getApproveddate());
		params.add(order.getMsg());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public int delete(OrderBean order) {
		String sql="delete from T_ORDERS where orderid=?";
		return super.baseUpdate(sql, order.getOrderid());
	}

	@Override
	public int update(OrderBean order) {
		String sql="update  T_ORDERS set USERID=?,QUANTITY=?,ALLTYPE=?,TOTALPRICE=?,PAYTYPE=?,RECEIVEDTYPE=?,USERNAME=?,"
				+ "ADDRESS=?,POSTCODE=?,PHONENO=?,EMAIL=?,ORDERDATE=?,STATUS=?,APPROVEDUSER=?,APPROVEDDATE=?,MSG=? where ORDERID=?";
		List<Object>  params=new ArrayList<>();
		params.add(order.getUserid());
		params.add(order.getQuantity());
		params.add(order.getAlltype());
		params.add(order.getTotalprice());
		params.add(order.getPaytype());		
		params.add(order.getReceivedtype());
		params.add(order.getUsername());
		params.add(order.getAddress());
		params.add(order.getPostcode());
		params.add(order.getPhoneno());
		params.add(order.getEmail());		
		params.add(order.getOrderdate());
		params.add(String.valueOf(order.getStatus()));
		params.add(order.getApproveduser());
		params.add(order.getApproveddate());
		params.add(order.getMsg());
		params.add(order.getOrderid());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public OrderBean queryForSingle(String orderid) {
		String sql="select * from T_ORDERS where orderid=?";
		return super.queryForSingle(sql, OrderBean.class, orderid);
	}

	@Override
	public List<OrderBean> query(OrderBean order) {
		String sql="select * from T_ORDERS where 1=1 ";
		List<Object>  params=new ArrayList<>();
		if(order!=null){			
			if(!WebUtils.isEmpty(order.getUsername()) ){
				sql+="and musername like ?";
				params.add("%"+order.getUsername()+"%");
			}
		}
		return super.baseQuery(sql, OrderBean.class, params.toArray());
	}

	
	@Override
	public PageModel<OrderBean> queryPageModel(OrderBean order,
			int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		OrderBean order=new OrderBean();
		OrderDaoImpl dao=new OrderDaoImpl();
		order=dao.queryForSingle("130917205949004");
		System.out.println(order);
		/*order.setMsg("快快快,快发货");
		System.out.println(dao.update(order));
		order=dao.queryForSingle("130917205949004");
		System.out.println(order);*/
		order.setOrderid("130917205659004");
		dao.add(order);
	}
}
