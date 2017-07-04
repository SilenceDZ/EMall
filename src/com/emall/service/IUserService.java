package com.emall.service;

import java.util.List;

import com.emall.bean.PageModel;
import com.emall.bean.UserBean;

public interface IUserService {
	/**
	 * @Title:add
	 * @Description:添加一个商品实体
	 * @param user 商品实体类
	 * @return int
	 * @throws
	 */
	public int add(UserBean user);
	/**
	 * @Title:delete
	 * @Description:删除一个商品实体类
	 * @param user 商品实体类对象
	 * @return int
	 * @throws
	 */
	public int delete(UserBean user);
	/**
	 * @Title:update
	 * @Description:更新一个商品实体类
	 * @param user 跟新的商品实体类对象
	 * @return int
	 * @throws
	 */
	public int update(UserBean user);
	/**
	 * @Title:queryForSingle
	 * @Description:根据商品id查询一个商品实体类
	 * @param mcid 商品id
	 * @return 商品实体类对象
	 * @throws
	 */
	public UserBean queryForSingle(int userid);
	/**
	 * @Title:query
	 * @Description:查询商品类集合
	 * @param user 商品实体类
	 * @return
	 * @throws
	 */
	public List<UserBean> query(UserBean user);
	/**
	 * @Title:login
	 * @Description:登录
	 * @param username
	 * @param password
	 * @return
	 * @throws
	 */
	public UserBean login(String username ,String password);
	/**
	 * @Title:queryPageModel
	 * @Description:分页查询
	 * @param user
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @throws
	 */
	public PageModel<UserBean> queryPageModel(UserBean user,int currentPage,int pageSize);
	
	public boolean registerCheck(UserBean user);
}
