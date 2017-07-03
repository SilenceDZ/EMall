package com.emall.servlet;
import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/McTypeManager")
public class McTypeManager extends HttpServlet {

	/**
	 * @fields serialVersionUID:TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public McTypeManager() {
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action=request.getParameter("action");
		switch(action){
		case "mcTypeManage" :{//查询
			mcTypeManage(request, response);
			break;
		}
		case "mcTypeInfoManage":{
			mcTypeInfoManage(request, response);
			break;
		}
		case "addMcType":{
			addMcType(request, response);
			break;
		}
			default:break;
		}		
		out.flush();
		out.close();
	}
	/**
	 * @Title:mcTypeManage
	 * @Description:商品类别管理
	 * @param request 
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws
	 */
	public void mcTypeManage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		IMcTypeService dao=new McTypeServiceImpl();
		int currentPage=WebUtils.getCurrentPage(request, 1);
		int pageSize=WebUtils.getPageSize(request, 5);
		PageModel<McTypeBean> pageModel=dao.queryPageModel(null, currentPage, pageSize);
		request.setAttribute("pageModel", pageModel);
		request.getRequestDispatcher("admin/mcmanager/mcTypeManager.jsp").forward(request, response);
	}
	/**
	 * @Title:mcInfoManage
	 * @Description:商品信息管理
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws
	 */
	public void mcTypeInfoManage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	/**
	 * @Title:addMcType
	 * @Description:增加商品类别
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 * @throws
	 */
	public void addMcType(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.getRequestDispatcher("admin/mcmanager/addMcType.jsp").forward(request, response);
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
