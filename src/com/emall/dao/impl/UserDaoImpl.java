package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.emall.bean.PageModel;
import com.emall.bean.UserBean;
import com.emall.dao.IUserDao;
import com.emall.utils.BaseDao;
import com.emall.utils.WebUtils;

public class UserDaoImpl extends BaseDao implements IUserDao {
	
	@Override
	public int add(UserBean user) {
		String sql="insert into T_USER (userid,username,password,truename,usersex,birthday,email,phoneno,postcade,address,"
				+ "regdate,lockstate,lastaccess,login) values(seq_t_user.nextVal,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<Object>  params=new ArrayList<>();
		params.add(user.getUsername());
		params.add(user.getPassword());
		params.add(user.getTruename());
		params.add(String.valueOf(user.getUsersex()));
		params.add(user.getBirthday());
		params.add(user.getEmail());
		params.add(user.getPhoneno());
		params.add(user.getPostcade());
		params.add(user.getAddress());
		params.add(user.getRegdate());
		params.add(String.valueOf(user.getLockstate()));
		params.add(user.getLastaccess());
		params.add(user.getLogin());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public int delete(UserBean user) {
		String sql="delete from t_user where userid=?";
		return super.baseUpdate(sql, user.getUserid());
	}

	@Override
	public int update(UserBean user) {
		String sql="update t_user set username=?,password=?,truename=?,usersex=?,birthday=?,email=?,phoneno=?,postcade=?,address=?,"
				+ "regdate=?,lockstate=?,lastaccess=?,login=? where userid=?";
		List<Object>  params=new ArrayList<>();
		params.add(user.getUsername());
		params.add(user.getPassword());
		params.add(user.getTruename());
		params.add(String.valueOf(user.getUsersex()));
		params.add(user.getBirthday());
		params.add(user.getEmail());
		params.add(user.getPhoneno());
		params.add(user.getPostcade());
		params.add(user.getAddress());
		params.add(user.getRegdate());
		params.add(String.valueOf(user.getLockstate()));
		params.add(user.getLastaccess());
		params.add(user.getLogin());
		params.add(user.getUserid());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public UserBean queryForSingle(int userid) {
		String sql="select * from t_user where userid=?";
		return super.queryForSingle(sql, UserBean.class, userid);
	}

	@Override
	public List<UserBean> query(UserBean user) {
		String sql="select * from t_user where 1=1 ";
		List<Object>  params=new ArrayList<>();
		if(user!=null){			
			if(!WebUtils.isEmpty(user.getUsername()) ){
				sql+="and username like ?";
				params.add("%"+user.getUsername()+"%");
			}
		}
		return super.baseQuery(sql, UserBean.class, params.toArray());
	}
	
	@Override
	public UserBean login(String username, String password) {
		String sql="select * from t_user where username=? and password=?";		
		List<Object>  params=new ArrayList<>();
		params.add(username);
		params.add(password);
		return super.queryForSingle(sql, UserBean.class, params.toArray());
	}
	
	@Override
	public PageModel<UserBean> queryPageModel(UserBean user, int currentPage,
			int pageSize) {
		StringBuffer querySql = new StringBuffer(" select * from t_user ");
		StringBuffer whereSql = new StringBuffer(" where 1=1 ");
		StringBuffer countSql = new StringBuffer(" select count(1) from t_user");
		List<Object>  params = new ArrayList<>();
		if(user!=null){
			if(!WebUtils.isEmpty(user.getUsername())){
				whereSql.append(" and username like ? ");
				params.add("%"+user.getUsername()+"%");
			}
		}
		return super.queryPageModel(querySql, countSql, whereSql, null, UserBean.class, currentPage, pageSize, params);
	}
	public static void main(String[] args) {
		UserDaoImpl dao=new UserDaoImpl();
		UserBean user=new UserBean();
		user.setUsername("Test");
		System.out.println(dao.registerCheck(user));
		/*UserBean user=dao.login("Test","888888");
		System.out.println(user);
		PageModel<UserBean> page=dao.queryPageModel(null, 1, 3);
		List<UserBean> list=page.getResult();
		for (UserBean md : list) {
			System.out.println(md);
		}*/
		/*System.out.println(dao.login("a00001", "123456"));
		user.setPassword("zhong");
		dao.update(user);*/
		/*user.setUsername("test3");
		user.setPassword("1111111");
		dao.add(user);
		user.setUserid(20);
		dao.delete(user);*/
		/*List<UserBean> li=new ArrayList<UserBean>();
		user.setUsername("a");
		li=dao.query(user);
		for (Object u : li) {
			System.out.println(u);
		}*/
		
	}

	@Override
	public boolean registerCheck(UserBean user) {
		String sql="select count(1) from t_user where username=?";
		if(super.queryForCount(sql, user.getUsername())==1)return true;
		return false;
	}
	
	
}
