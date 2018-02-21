package com.coffee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget method");
	doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost method");
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		
		System.out.println("user:"+userName);
		System.out.println("password:"+password);
		
		String forward=null;
		if (userName.equals("coffee")&&password.equals("111")) {
			
			forward="/Servlet/sucess.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			//http://www.baidu.com
			//resp.sendRedirect(req.getContextPath()+"/Servlet/sucess.jsp");
		}else {
			forward="/Servlet/err.jsp";
			RequestDispatcher rd=req.getRequestDispatcher(forward);
			rd.forward(req, resp);
			
			//resp.sendRedirect(req.getContextPath()+"/Servlet/err.jsp");
		}
		
	}
				
	private static final long serialVersionUID = -6253390729108039751L;

//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	
//		String userName=req.getParameter("userName");
//		String password=req.getParameter("password");
//		
//		System.out.println("user:"+userName);
//		System.out.println("password:"+password);
//	}

}
