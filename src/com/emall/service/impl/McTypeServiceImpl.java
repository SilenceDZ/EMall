package com.emall.service.impl;

import java.util.List;

import com.emall.bean.McTypeBean;
import com.emall.dao.IMcTypeDao;
import com.emall.dao.impl.McTypeImpl;
import com.emall.service.IMcTypeService;
import com.emall.utils.PageModel;

public class McTypeServiceImpl implements IMcTypeService {
	private IMcTypeDao dao=new McTypeImpl();
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
		// TODO Auto-generated method stub
		return null;
	}

}
