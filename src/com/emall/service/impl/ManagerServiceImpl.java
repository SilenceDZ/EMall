package com.emall.service.impl;

import java.util.List;

import com.emall.bean.ManagerBean;
import com.emall.bean.PageModel;
import com.emall.dao.IManagerDao;
import com.emall.dao.impl.ManagerDaoImpl;
import com.emall.service.IManagerService;

public class ManagerServiceImpl implements IManagerService {
	private IManagerDao dao=new ManagerDaoImpl();
	@Override
	public int add(ManagerBean manager) {
		return dao.add(manager);
	}

	@Override
	public int delete(ManagerBean manager) {
		return dao.delete(manager);
	}

	@Override
	public int update(ManagerBean manager) {
		return dao.update(manager);
	}

	@Override
	public ManagerBean queryForSingle(int managerid) {
		return dao.queryForSingle(managerid);
	}

	@Override
	public List<ManagerBean> query(ManagerBean manager) {
		return dao.query(manager);
	}

	@Override
	public boolean login(String username, String password) {
		return dao.login(username, password);
	}

	@Override
	public PageModel<ManagerBean> queryPageModel(ManagerBean manager,
			int currentPage, int pageSize) {
		return dao.queryPageModel(manager, currentPage, pageSize);
	}

}
