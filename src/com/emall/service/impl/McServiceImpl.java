package com.emall.service.impl;

import java.util.List;

import com.emall.bean.McBean;
import com.emall.bean.PageModel;
import com.emall.dao.IMcDao;
import com.emall.dao.impl.McDaoImpl;
import com.emall.service.IMcService;

public class McServiceImpl implements IMcService {
	private IMcDao mcDao=new McDaoImpl();
	@Override
	public int add(McBean mc) {
		return mcDao.add(mc);
	}

	@Override
	public int delete(McBean mc) {
		return mcDao.delete(mc);
	}

	@Override
	public int update(McBean mc) {
		return mcDao.update(mc);
	}

	@Override
	public McBean queryForSingle(int mcid) {
		return mcDao.queryForSingle(mcid);
	}

	@Override
	public List<McBean> query(McBean mc) {
		return mcDao.query(mc);
	}
	
	@Override
	public PageModel<McBean> queryPageModel(McBean mc, int currentPage,
			int pageSize) {
		return mcDao.queryPageModel(mc, currentPage, pageSize);
	}

}
