package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;






import com.emall.bean.McTypeBean;
import com.emall.bean.PageModel;
import com.emall.dao.IMcTypeDao;
import com.emall.utils.BaseDao;
import com.emall.utils.WebUtils;

public class McTypeDaoImpl extends BaseDao implements IMcTypeDao {

	@Override
	public int add(McTypeBean mcType) {
		String sql="insert into T_MCTYPE(typeid,typename,fatherid) values(seq_t_mctype.nextVal,?,?)";
		List<Object>  params=new ArrayList<>();
		params.add(mcType.getTypename());
		params.add(mcType.getFatherid());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public int delete(McTypeBean mcType) {
		String sql="delete from T_MCTYPE where typeid=?";		
		return super.baseUpdate(sql, mcType.getTypeid());
	}

	@Override
	public int update(McTypeBean mcType) {
		String sql="update T_MCTYPE set typename=?,fatherid=? where typeid=?";
		List<Object>  params=new ArrayList<>();
		params.add(mcType.getTypename());
		params.add(mcType.getFatherid());
		params.add(mcType.getTypeid());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public McTypeBean queryForSingle(int typeid) {
		String sql="select * from T_MCTYPE where typeid=?";
		return super.queryForSingle(sql, McTypeBean.class, typeid);
	}

	@Override
	public List<McTypeBean> query(McTypeBean mcType) {
		String sql="select * from T_MCTYPE where 1=1 ";
		List<Object>  params=new ArrayList<>();
		//如果传入的参数为null则查询所有的数据
		if(mcType!=null){			
			if(!WebUtils.isEmpty(mcType.getTypename()) ){
				sql+="and typename like ?";
				params.add("%"+mcType.getTypename()+"%");
			}
		}
		return super.baseQuery(sql, McTypeBean.class, params.toArray());
	}

	@Override
	public PageModel<McTypeBean> queryPageModel(McTypeBean mcType, int currentPage,
			int pageSize) {
		StringBuffer querySql = new StringBuffer(" select * from T_MCTYPE ");
		StringBuffer whereSql = new StringBuffer(" where 1=1 ");
		StringBuffer countSql = new StringBuffer(" select count(1) from T_MCTYPE");
		List<Object>  params = new ArrayList<>();
		if(mcType!=null){
			if(!WebUtils.isEmpty(mcType.getTypename())){
				whereSql.append(" and typename like ? ");
				params.add("%"+mcType.getTypename()+"%");
			}
		}
		return super.queryPageModel(querySql, countSql, whereSql, null, McTypeBean.class, currentPage, pageSize, params);
	}
	public static void main(String[] args) {
		/*McTypeDaoImpl dao=new McTypeDaoImpl();
		McTypeBean type=dao.queryForSingle(1);
		PageModel<McTypeBean> page=dao.queryPageModel(null, 1, 3);
		List<McTypeBean> list=page.getResult();
		for (McTypeBean md : list) {
			System.out.println(md);
		}*/
		/*System.out.println(type);
		type.setFatherid(0);
		type.setTypename("测试类别1");
		System.out.println(dao.add(type));
		type.setTypeid(9);
		System.out.println(dao.delete(type));*/
		/*List<McTypeBean> li=new ArrayList<McTypeBean>();
		type.setTypename("机");
		li=dao.query(type);
		for (Object obj : li) {
			System.out.println(obj);
		}*/
	}
}
