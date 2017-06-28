package com.emall.dao;

import java.util.List;

import com.emall.bean.McBean;
import com.emall.utils.PageModel;

public interface IMcDao {
	/**
	 * @Title:add
	 * @Description:添加一个商品实体
	 * @param mc 商品实体类
	 * @return int
	 * @throws
	 */
	public int add(McBean mc);
	/**
	 * @Title:delete
	 * @Description:删除一个商品实体类
	 * @param mc 商品实体类对象
	 * @return int
	 * @throws
	 */
	public int delete(McBean mc);
	/**
	 * @Title:update
	 * @Description:更新一个商品实体类
	 * @param mc 跟新的商品实体类对象
	 * @return int
	 * @throws
	 */
	public int update(McBean mc);
	/**
	 * @Title:queryForSingle
	 * @Description:根据商品id查询一个商品实体类
	 * @param mcid 商品id
	 * @return 商品实体类对象
	 * @throws
	 */
	public McBean queryForSingle(int mcid);
	/**
	 * @Title:query
	 * @Description:查询商品类集合
	 * @param mc 商品实体类
	 * @return
	 * @throws
	 */
	public List<McBean> query(McBean mc);
	public PageModel<McBean> queryPageModel(McBean mc,int currentPage,int pageSize);
}
