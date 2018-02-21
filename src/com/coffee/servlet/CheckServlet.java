package com.coffee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coffee.entity.User;
import com.coffee.service.CheckUserService;

public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private CheckUserService cku=new CheckUserService();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("userName");
		String passwd = request.getParameter("password");

		RequestDispatcher rd = null;
		String forward = null;
		if (uname == null || passwd == null) {
			request.setAttribute("msg", "用户名或密码为空！");
			rd = request.getRequestDispatcher("/Servlet/err.jsp");
			rd.forward(request, response);
		}else {
			User user=new User();
			user.setName(uname);
			user.setPassword(passwd);
			boolean bool=cku.check(user);
			
			if (bool) {
				forward="/Servlet/sucess.jsp";
			}else {
				request.setAttribute("msg", "用户名或密码输入错误！");
				forward="/Servlet/err.jsp";
			}
			
			rd=request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}

	}

}
