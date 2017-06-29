package com.emall.dao;

import java.util.List;

import com.emall.bean.McTypeBean;
import com.emall.utils.PageModel;

public interface IMcTypeDao {
	/**
	 * @Title:add
	 * @Description:添加一个商品实体
	 * @param mcType 商品类别实体类
	 * @return int
	 * @throws
	 */
	public int add(McTypeBean mcType);
	/**
	 * @Title:delete
	 * @Description:删除一个商品实体类
	 * @param mcType 商品类别实体类对象
	 * @return int
	 * @throws
	 */
	public int delete(McTypeBean mcType);
	/**
	 * @Title:update
	 * @Description:更新一个商品类别实体类
	 * @param mcType 更新的商品类别实体类对象
	 * @return int
	 * @throws
	 */
	public int update(McTypeBean mcType);
	/**
	 * @Title:queryForSingle
	 * @Description:根据商品类别id查询一个商品实体类
	 * @param mcid 商品类别id
	 * @return 商品类别实体类对象
	 * @throws
	 */
	public McTypeBean queryForSingle(int typeid);
	/**
	 * @Title:query
	 * @Description:查询商品类别集合
	 * @param mcType 商品类别实体类
	 * @return List<McTypeBean>
	 * @throws
	 */
	public List<McTypeBean> query(McTypeBean mcType);
	public PageModel<McTypeBean> queryPageModel(McTypeBean mcType,int currentPage,int pageSize);
}
