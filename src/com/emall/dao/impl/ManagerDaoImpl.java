package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;


import com.emall.bean.ManagerBean;
import com.emall.bean.PageModel;
import com.emall.dao.IManagerDao;
import com.emall.utils.BaseDao;
import com.emall.utils.WebUtils;

public class ManagerDaoImpl extends BaseDao implements IManagerDao {
	
	@Override
	public int add(ManagerBean manager) {
		String sql="insert into t_manager(mid,musername,mpassword,mtruename,msex,mlevel,mdate) values(seq_t_manager.nextVal,"
				+ "?,?,?,?,?,?)";
		/*String sql="insert into t_manager(mid,musername,mpassword,mtruename,msex,mlevel,mdate) values(?,"
				+ "?,?,?,?,?,?)";*/
		List<Object>  params=new ArrayList<>();
//		params.add(manager.getMid());
		params.add(manager.getMusername());
		params.add(manager.getMpassword());
		params.add(manager.getMtruename());
		params.add(manager.getMsex());
		params.add(manager.getMlevel());
		params.add(manager.getMdate());
		return BaseDao.baseUpdate(sql, params.toArray());
	}

	@Override
	public int delete(ManagerBean manager) {
		String sql="delete from t_manager where mid=?";
		return super.baseUpdate(sql, manager.getMid());
	}

	@Override
	public int update(ManagerBean manager) {
		String sql="update t_manager set musername=?,mpassword=?,mtruename=?,msex=?,mlevel=?,mdate=? where mid=?";
		List<Object>  params=new ArrayList<>();
		params.add(manager.getMusername());
		params.add(manager.getMpassword());
		params.add(manager.getMtruename());
		params.add(manager.getMsex());
		params.add(manager.getMlevel());
		params.add(manager.getMdate());
		params.add(manager.getMid());
		return BaseDao.baseUpdate(sql, params.toArray());
	}

	@Override
	public ManagerBean queryForSingle(int managerid) {
		String sql="select * from t_manager where mid=?";
		return super.queryForSingle(sql, ManagerBean.class, managerid);
	}

	@Override
	public List<ManagerBean> query(ManagerBean manager) {
		String sql="select * from t_manager where 1=1 ";
		List<Object>  params=new ArrayList<>();
		if(manager!=null){			
			if(!WebUtils.isEmpty(manager.getMusername()) ){
				sql+="and musername like ?";
				params.add("%"+manager.getMusername()+"%");
			}
		}
		return super.baseQuery(sql, ManagerBean.class, params.toArray());
	}

	@Override
	public boolean login(String username, String password) {
		String sql="select * from t_manager where musername=? and mpassword=?";
		if(super.queryForCount(sql, username,password)==1)return true;
		else return false;
	}

	@Override
	public PageModel<ManagerBean> queryPageModel(ManagerBean manager,
			int currentPage, int pageSize) {
		StringBuffer querySql = new StringBuffer(" select * from t_manager ");
		StringBuffer whereSql = new StringBuffer(" where 1=1 ");
		StringBuffer countSql = new StringBuffer(" select count(1) from t_manager");
		List<Object>  params = new ArrayList<>();
		if(manager!=null){
			if(!WebUtils.isEmpty(manager.getMusername())){
				whereSql.append(" and musername like ? ");
				params.add("%"+manager.getMusername()+"%");
			}
		}
		return super.queryPageModel(querySql, countSql, whereSql, null, ManagerBean.class, currentPage, pageSize, params);
	}
	public static void main(String[] args) {
		ManagerDaoImpl dao=new ManagerDaoImpl();
		ManagerBean man=new ManagerBean();
		man=dao.queryForSingle(2);
		System.out.println(man);
		System.out.println(dao.login("admin", "admin"));
		/*man.setMid(11);
		dao.delete(man);*/
		/*java.sql.Date da=new Date(System.currentTimeMillis());
		man.setMdate(da);
		dao.update(man);*/
		/*for(int i=11;i<=11;i++){
			man.setMid(i);
			man.setMusername("manager"+i);
			man.setMpassword("manager"+i);
			man.setMtruename("manager");
			man.setMsex("男");
			man.setMlevel(1);
			java.sql.Date da=new Date(System.currentTimeMillis()+1000);
			man.setMdate(da);
			dao.add(man);
		}*/
		
	}
}
