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
import com.emall.service.IMcService;
import com.emall.service.IMcTypeService;
import com.emall.service.impl.McServiceImpl;
import com.emall.service.impl.McTypeServiceImpl;


@WebServlet("/McServlet")
public class McServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor of the object.
	 */
	public McServlet() {
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
		case "mcTypeManage" :{
			mcTypeManage(request, response);
			break;
		}
		case "mcInfoManage":{
			mcInfoManage(request, response);
			break;
		}
		case "addMc" :{
			addMcType(request, response);
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
	public void mcTypeManage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		IMcTypeService dao=new McTypeServiceImpl();
		List<McTypeBean> list=dao.query(null);
		request.setAttribute("list", list);
		request.getRequestDispatcher("admin/mcManager.jsp").forward(request, response);
	}
	public void mcInfoManage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		IMcService dao=new McServiceImpl();
		List<McBean> list=dao.query(null);
		request.setAttribute("list", list);
		request.getRequestDispatcher("admin/mcInfoManage.jsp").forward(request, response);
	}
	public void addMc(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.getRequestDispatcher("admin/addMc.jsp").forward(request, response);
	}
	public void addMcType(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.getRequestDispatcher("admin/addMcType.jsp").forward(request, response);
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
