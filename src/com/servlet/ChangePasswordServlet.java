package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ChangePasswordBean;
import com.vo.User;

/**
 * Servlet implementation class ChangePasswordServlet
 */
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		ChangePasswordBean cpb = new ChangePasswordBean();
		User user = (User)request.getSession().getAttribute("user");
		String username = user.getUsername();
		boolean flag = cpb.changePaasword(username, request.getParameter("oldpwd"), request.getParameter("newpwd"));
		if(flag){
			out.print("<p style='text-align:center;margin-top:200px font-size:25px'>修改成功<a href='index.jsp'>返回重新登录</a></p>");
		}else{
			out.print("<p style='text-align:center;margin-top:200px font-size:25px'>修改失败，数据库错误<a href='javascript:history.back(-1)'>返回</a></p>");
		}
	}

}
