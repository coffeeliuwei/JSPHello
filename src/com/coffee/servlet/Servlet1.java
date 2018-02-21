package com.coffee.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Servlet1 extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init");
		//super.init();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(servletconfig)");
		super.init(config);
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
System.out.println("service");
		PrintWriter pWriter=resp.getWriter();
		pWriter.println("coffeeliu");
		pWriter.close();
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
		super.destroy();
	}



}
