package com.emall.dao;

import java.util.List;

import com.emall.bean.McBean;
import com.emall.utils.PageModel;

public interface IMcDao {
	public int add(McBean mc);
	public int delete(McBean mc);
	public int update(McBean mc);
	public McBean queryForSingle(int mcid);
	public List<McBean> query(McBean mc);
	public PageModel<McBean> queryPageModel(McBean mc,int currentPage,int pageSize);
}
