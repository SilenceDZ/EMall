package com.emall.service;

import java.util.List;

import com.emall.bean.McTypeBean;
import com.emall.bean.PageModel;

public interface IMcTypeService {
	/**
	 * @Title:add
	 * @Description:添加一个商品实体
	 * @param mc 商品实体类
	 * @return int
	 * @throws
	 */
	public int add(McTypeBean mcType);
	/**
	 * @Title:delete
	 * @Description:删除一个商品实体类
	 * @param mc 商品实体类对象
	 * @return int
	 * @throws
	 */
	public int delete(McTypeBean mcType);
	/**
	 * @Title:update
	 * @Description:更新一个商品实体类
	 * @param mc 跟新的商品实体类对象
	 * @return int
	 * @throws
	 */
	public int update(McTypeBean mcType);
	/**
	 * @Title:queryForSingle
	 * @Description:根据商品id查询一个商品实体类
	 * @param mcid 商品id
	 * @return 商品实体类对象
	 * @throws
	 */
	public McTypeBean queryForSingle(int typeid);
	/**
	 * @Title:query
	 * @Description:查询商品类集合
	 * @param mc 商品实体类
	 * @return
	 * @throws
	 */
	public List<McTypeBean> query(McTypeBean mcType);
	public PageModel<McTypeBean> queryPageModel(McTypeBean mcType,int currentPage,int pageSize);
}
