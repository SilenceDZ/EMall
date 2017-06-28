package com.emall.dao.impl;

import java.util.List;

import com.emall.bean.McBean;
import com.emall.dao.IMcDao;
import com.emall.utils.PageModel;

public class McDaoImpl implements IMcDao {

	@Override
	public int add(McBean mc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(McBean mc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(McBean mc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public McBean queryForSingle(int mcid) {
		String sql="select * from T_MC where mcid=?";
		return null;
	}

	@Override
	public List<McBean> query(McBean mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageModel<McBean> queryPageModel(McBean mc, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
