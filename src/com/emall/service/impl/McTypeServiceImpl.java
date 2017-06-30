package com.emall.service.impl;

import java.util.List;

import com.emall.bean.McTypeBean;
import com.emall.bean.PageModel;
import com.emall.dao.IMcTypeDao;
import com.emall.dao.impl.McTypeDaoImpl;
import com.emall.service.IMcTypeService;

public class McTypeServiceImpl implements IMcTypeService {
	private IMcTypeDao dao=new McTypeDaoImpl();
	@Override
	public int add(McTypeBean mcType) {
		return dao.add(mcType);
	}

	@Override
	public int delete(McTypeBean mcType) {
		return dao.delete(mcType);
	}

	@Override
	public int update(McTypeBean mcType) {
		return dao.update(mcType);
	}

	@Override
	public McTypeBean queryForSingle(int typeid) {
		return dao.queryForSingle(typeid);
	}

	@Override
	public List<McTypeBean> query(McTypeBean mcType) {
		return dao.query(mcType);
	}

	@Override
	public PageModel<McTypeBean> queryPageModel(McTypeBean mcType, int currentPage,
			int pageSize) {
		return dao.queryPageModel(mcType, currentPage, pageSize);
	}

}
