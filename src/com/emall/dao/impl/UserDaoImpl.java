package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.emall.bean.UserBean;
import com.emall.dao.IUserDao;
import com.emall.utils.BaseDao;
import com.emall.utils.PageModel;
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
	public boolean login(String username, String password) {
		String sql="select * from t_user where username=? and password=?";
		if(super.queryForCount(sql, username,password)==1)return true;
		else return false;
	}
	
	@Override
	public PageModel<UserBean> queryPageModel(UserBean user, int currentPage,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		UserDaoImpl dao=new UserDaoImpl();
		UserBean user=dao.queryForSingle(1);
		System.out.println(user);
		System.out.println(dao.login("a00001", "123456"));
		user.setPassword("zhong");
		dao.update(user);
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
	
	
}
