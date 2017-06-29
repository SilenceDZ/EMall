package com.emall.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.emall.bean.McBean;
import com.emall.bean.PageModel;
import com.emall.dao.IMcDao;
import com.emall.utils.BaseDao;
import com.emall.utils.WebUtils;

public class McDaoImpl extends BaseDao implements IMcDao {

	@Override
	public int add(McBean mc) {
		String sql="insert into T_MC(mcid,mcname,mcdecx,price,pic,flag,smalltypeid,createdate,quantity) values(seq_t_mc.nextVal,?,?,?,?,?,?,?,?) ";
		List<Object>  params=new ArrayList<>();
		params.add(mc.getMcname());
		params.add(mc.getMcdecx());
		params.add(mc.getPrice());
		params.add(mc.getPic());
		params.add(String.valueOf(mc.getFlag()));
		params.add(mc.getSmalltypeid());
		params.add(mc.getCreatedate());
		params.add(mc.getQuantity());
		return super.baseUpdate(sql, params.toArray());
	}

	@Override
	public int delete(McBean mc) {
		String sql="delete from T_MC where mcid=?";
		List<Object>  params=new ArrayList<>();
		params.add(mc.getMcid());
		return super.baseUpdate(sql,params.toArray() );
	}

	@Override
	public int update(McBean mc) {
		String sql="update T_MC set mcname=?,mcdecx=?,price=?,pic=?,flag=?,SMALLTYPEID=?,CREATEDATE=?,QUANTITY=? where mcid=?";
		List<Object>  params=new ArrayList<>();
		params.add(mc.getMcname());
		params.add(mc.getMcdecx());
		params.add(mc.getPrice());
		params.add(mc.getPic());
		//在使用的过程中也需要注意,由于Flag时char类型,在转换成sql语句时需要String类型
		params.add(String.valueOf(mc.getFlag()));
		params.add(mc.getSmalltypeid());
		params.add(mc.getCreatedate());
		params.add(mc.getQuantity());
		params.add(mc.getMcid());
		return super.baseUpdate(sql, params.toArray());	
	}

	@Override
	public McBean queryForSingle(int mcid) {
		String sql="select * from T_MC where mcid=?";		
		return super.queryForSingle(sql, McBean.class, mcid);
	}

	@Override
	public List<McBean> query(McBean mc) {
		String sql="select * from T_MC where 1=1 ";
		List<Object>  params=new ArrayList<>();
		if(mc!=null){			
			if(!WebUtils.isEmpty(mc.getMcname()) ){
				sql+="and mcname like ?";
				params.add("%"+mc.getMcname()+"%");
			}
		}
		return super.baseQuery(sql, McBean.class, params.toArray());
	}

	/* (non-Javadoc)
	 * @see com.emall.dao.IMcDao#queryPageModel(com.emall.bean.McBean, int, int)
	 * <p>Title:queryPageModel</p>
	 * <p>Description:</p>
	 * @param mc
	 * @param currentPage
	 * @param pageSize
	 * @return
	 * @see com.emall.dao.IMcDao#queryPageModel(com.emall.bean.McBean, int, int)
	 */
	@Override
	public PageModel<McBean> queryPageModel(McBean mc, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		McDaoImpl mcd=new McDaoImpl();
		McBean mc=mcd.queryForSingle(1);
		mc.setMcid(25);
		System.out.println(mcd.delete(mc));
		/*mc.setMcname("测试用电脑2");
		mc.setPrice(2300.0);
		mc.setMcdecx("爱买买,不买滚!!!");
		mcd.add(mc);*/
	}
}
