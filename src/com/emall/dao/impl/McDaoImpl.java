package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.emall.bean.McBean;
import com.emall.dao.IMcDao;
import com.emall.utils.BaseDao;
import com.emall.utils.PageModel;
import com.emall.utils.WebUtils;

public class McDaoImpl implements IMcDao {

	@Override
	public int add(McBean mc) {
		String sql="insert into T_MC(mcid,mcname,mcdecx,price,pic,flag,smalltypeid,createdate,quantity) values(seq_t_mc.nextVal,?,?,?,?,?,?,?,?) ";
		List<Object>  params=new ArrayList<>();
		params.add(mc.getMcname());
		params.add(mc.getMcdecx());
		params.add(mc.getPrice());
		params.add(mc.getPic());
		params.add(mc.getFlag());
		params.add(mc.getSmalltypeid());
		params.add(mc.getCreatedate());
		params.add(mc.getQuantity());
		return BaseDao.baseUpdate(sql, params.toArray());
	}

	@Override
	public int delete(McBean mc) {
		String sql="delete from T_MC where mcid=?";
		List<Object>  params=new ArrayList<>();
		params.add(mc.getMcid());
		return BaseDao.baseUpdate(sql,params.toArray() );
	}

	@Override
	public int update(McBean mc) {
		String sql="update T_MC set mcname=?,mcdecx=?,price=?,pic=?,flag=?,smalltypeid=?,createdate=?,quantity=? where mcid=?";
		List<Object>  params=new ArrayList<>();
		params.add(mc.getMcname());
		params.add(mc.getMcdecx());
		params.add(mc.getPrice());
		params.add(mc.getPic());
		params.add(mc.getFlag());
		params.add(mc.getSmalltypeid());
		params.add(mc.getCreatedate());
		params.add(mc.getQuantity());
		params.add(mc.getMcid());
		return BaseDao.baseUpdate(sql, params.toArray());
	}

	@Override
	public McBean queryForSingle(int mcid) {
		String sql="select * from T_MC where mcid=?";		
		return BaseDao.queryForSingle(sql, McBean.class, mcid);
	}

	@Override
	public List<McBean> query(McBean mc) {
		String sql="select * from T_MC where 1=1 ";
		List<Object>  params=new ArrayList<>();
		if(mc!=null){			
			if(!WebUtils.isEmpty(mc.getMcname()) ){
				sql+="and %"+mc.getMcname()+"%";
				params.add(mc.getMcname());
			}
		}
		return BaseDao.baseQuery(sql, McBean.class, params.toArray());
	}

	@Override
	public PageModel<McBean> queryPageModel(McBean mc, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		McDaoImpl mcd=new McDaoImpl();
		McBean mc=mcd.queryForSingle(1);
		System.out.println(mc);
	}
}
