package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.LoginBean;
import com.vo.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		 User user = new User();
		 try {
			user = loginBean.login(username, password);
			if(user != null){
				request.getSession().setMaxInactiveInterval(60*60);
				request.getSession().setAttribute("user",user);
				response.sendRedirect("main.jsp");
			}else{
				request.setAttribute("loginFalse","true");
				request.getRequestDispatcher("index.jsp").forward(request,response);
			}
		} catch (SQLException e) {
			out.print("<p style='text-align:center;margin-top:200px font-size:25px'>登录时访问数据库失败<a href='index.jsp'>返回重新登录</a></p>");
			e.printStackTrace();
		}
		 
	}

}
