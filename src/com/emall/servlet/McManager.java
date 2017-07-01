package com.emall.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emall.bean.McBean;
import com.emall.bean.McTypeBean;
import com.emall.bean.PageModel;
import com.emall.service.IMcService;
import com.emall.service.IMcTypeService;
import com.emall.service.impl.McServiceImpl;
import com.emall.service.impl.McTypeServiceImpl;
import com.emall.utils.WebUtils;


@WebServlet("/McManager")
public class McManager extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor of the object.
	 */
	public McManager() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("McManager.doGet()");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action=request.getParameter("action");
		switch(action){
		case "mcManage" :{//查询
			mcManage(request, response);
			break;
		}
		case "editInfo":{//编辑
			editInfo(request, response);
			break;
		}
		case "addMc" :{//增加
			addMc(request, response);
			break;
		}
		case "delMc":{
			
			break;
		}		
			default:break;
		}		
		out.flush();
		out.close();
	}
	/**
	 * @Title:mcTypeManage
	 * @Description:商品查询
	 * @param request 
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws
	 */
	public void mcManage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		IMcService dao=new McServiceImpl();
		IMcTypeService typeDao=new McTypeServiceImpl();
		int currentPage=WebUtils.getCurrentPage(request, 1);
		int pageSize=WebUtils.getPageSize(request, 5);
		PageModel<McBean> pageModel=dao.queryPageModel(null, currentPage, pageSize);
		List<String> type=new ArrayList<String>();
		McTypeBean mcType=new McTypeBean(); 
		for (McBean mc : pageModel.getResult()) {
			System.out.println(mc.getSmalltypeid());
			mcType=typeDao.queryForSingle(mc.getSmalltypeid());
			System.out.println(mcType);
			System.out.println(type);
			type.add(mcType.getTypename());
		}	
		request.setAttribute("pageModel", pageModel);
		request.setAttribute("typeList", type);
		request.getRequestDispatcher("admin/mcManager.jsp").forward(request, response);
	}
	/**
	 * @Title:editInfo
	 * @Description:编辑商品信息
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws
	 */
	public void editInfo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IMcService dao=new McServiceImpl();
		List<McBean> list=dao.query(null);
		request.setAttribute("list", list);
		request.getRequestDispatcher("admin/mcInfoManage.jsp").forward(request, response);
	}
	/**
	 * @Title:addMc
	 * @Description:增加商品
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws
	 */
	public void addMc(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.getRequestDispatcher("admin/addMc.jsp").forward(request, response);
	}
	
	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("McManager.doPost()");
		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
