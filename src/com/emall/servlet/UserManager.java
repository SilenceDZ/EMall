package com.emall.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.emall.bean.UserBean;
import com.emall.service.IUserService;
import com.emall.service.impl.UserServiceImpl;
import com.emall.utils.WebUtils;
@WebServlet("/UserManager")
public class UserManager extends HttpServlet {

	/**
	 * 序列化编号
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UserManager() {
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
		doPost(request, response);
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
		String action=request.getParameter("action");
		if(action!=null){
			switch(action){
			case "login":{
				login(request, response);
				break;
				}
			case "logout":{
				logout(request, response);
				break;
				}
			case "register":{
				register(request, response);
				break;
			}
			case "registercheck":{
				break;
			}
			default :{
				break;
			}
			}
		}else{
			System.out.println("action is null");
		}		
		out.flush();
		out.close();
	}
	public void registercheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
	}
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		IUserService dao=new UserServiceImpl();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserBean user=dao.login(username, password);
		if(user!=null){			
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("index.jsp");
		}		
	}
	public void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		HttpSession session=request.getSession();
		session.removeAttribute("user");
		response.sendRedirect("index.jsp");
	}
	
	public void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		IUserService dao=new UserServiceImpl();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String sex=request.getParameter("sex");		
		String truename=request.getParameter("realname");
		String bday=request.getParameter("birthday");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String address=request.getParameter("address");
		String postcade=request.getParameter("postcade");
		
		long date=System.currentTimeMillis();
		java.sql.Date regdate=new Date(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date temp=null;
		java.sql.Date birthday=null;
		try {
			temp = sdf.parse(bday);
			birthday=new Date(temp.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		char usersex;
		if(sex.equals("男")){
			 usersex='0';
		}else{
			usersex='1';
		}
		UserBean user=new UserBean(-1, username, password, truename, usersex, birthday, email,phoneno, postcade, address, regdate, '0', regdate, 0);
		dao.add(user);
		UserBean userLogin=dao.login(username, password);
		if(userLogin!=null){			
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("index.jsp");
		}	
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
