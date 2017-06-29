package com.emall.dao;

import java.util.List;

import com.emall.bean.UserBean;
import com.emall.utils.PageModel;

public interface IUserDao {
	/**
	 * @Title:add
	 * @Description:添加一个用户
	 * @param user 要添加的 用户对象
	 * @return int
	 * @throws
	 */
	public int add(UserBean user);
	/**
	 * @Title:delete
	 * @Description:删除一个用户
	 * @param user 要删除的 用户对象
	 * @return int
	 * @throws
	 */
	public int delete(UserBean user);
	/**
	 * @Title:update
	 * @Description:更新一个用户信息
	 * @param user 要更新的用户对象
	 * @return int
	 * @throws
	 */
	public int update(UserBean user);
	/**
	 * @Title:queryForSingle
	 * @Description:根据用户id查询一个用户
	 * @param userid 用户id
	 * @return 用户实体类对象
	 * @throws
	 */
	public UserBean queryForSingle(int userid);
	/**
	 * @Title:query
	 * @Description:查询用户集合
	 * @param user 用户对象,用来传递查询参数
	 * @return List<UserBean>
	 * @throws
	 */
	public List<UserBean> query(UserBean user);
	/**
	 * @Title:login
	 * @Description:前台用户登录
	 * @param username 用户名
	 * @param password 登录密码
	 * @return boolean
	 * @throws
	 */
	public boolean login(String username ,String password);
	public PageModel<UserBean> queryPageModel(UserBean user,int currentPage,int pageSize);
}
