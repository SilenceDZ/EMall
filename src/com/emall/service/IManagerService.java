package com.emall.service;

import java.util.List;

import com.emall.bean.ManagerBean;
import com.emall.utils.PageModel;

public interface IManagerService {
	/**
	 * @Title:add
	 * @Description:添加一个管理员
	 * @param manager 要添加的管理员对象
	 * @return int
	 * @throws
	 */
	public int add(ManagerBean manager);
	/**
	 * @Title:delete
	 * @Description:删除一个管理员
	 * @param manager 要删除的管理员对象
	 * @return int
	 * @throws
	 */
	public int delete(ManagerBean manager);
	/**
	 * @Title:update
	 * @Description:更新一个管理员的信息
	 * @param manager 要更新的管理员对象
	 * @return int
	 * @throws
	 */
	public int update(ManagerBean manager);
	/**
	 * @Title:queryForSingle
	 * @Description:根据管理员id查询管理员信息
	 * @param managerid 管理员id
	 * @return 管理员对象
	 * @throws
	 */
	public ManagerBean queryForSingle(int managerid);
	/**
	 * @Title:query
	 * @Description:查询管理员集合
	 * @param manager 传递参数的一个管理员对象
	 * @return List<ManagerBean>
	 * @throws
	 */
	public List<ManagerBean> query(ManagerBean manager);
	/**
	 * @Title:login
	 * @Description:管理员登录
	 * @param username 管理员登录名
	 * @param password 管理员登录密码
	 * @return boolean
	 * @throws
	 */
	public boolean login(String username ,String password);
	public PageModel<ManagerBean> queryPageModel(ManagerBean manager,int currentPage,int pageSize);
}
