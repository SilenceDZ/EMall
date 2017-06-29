package com.emall.service.impl;

import java.util.List;

import com.emall.bean.UserBean;
import com.emall.dao.IUserDao;
import com.emall.dao.impl.UserDaoImpl;
import com.emall.service.IUserService;
import com.emall.utils.PageModel;

public class UserServiceImpl implements IUserService {
	private IUserDao dao=new UserDaoImpl();

	@Override
	public int add(UserBean user) {
		return dao.add(user);
	}

	@Override
	public int delete(UserBean user) {
		return dao.delete(user);
	}

	@Override
	public int update(UserBean user) {
		return dao.update(user);
	}

	@Override
	public UserBean queryForSingle(int userid) {
		return dao.queryForSingle(userid);
	}

	@Override
	public List<UserBean> query(UserBean user) {
		return dao.query(user);
	}

	@Override
	public boolean login(String username, String password) {
		return dao.login(username, password);
	}

	@Override
	public PageModel<UserBean> queryPageModel(UserBean user, int currentPage,
			int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
