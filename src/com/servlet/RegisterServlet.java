package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.RegisterBean;
import com.vo.User;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String password2 = request.getParameter("password2");
		String sex = request.getParameter("sex");
		String profession = request.getParameter("profession");
		String[] temp = request.getParameterValues("favourite");
		String favourite="";
		for(int i=0;i<temp.length;i++){
			if(i==0){
				favourite = temp[0];
			}else{
				favourite += ","+temp[i];
			}
		}
		String note = request.getParameter("note");
		List<String> errorList = new ArrayList<String>();
		if(username == null || username.equals("")){
			errorList.add("用户名不能为空！");
		}
		if(password1 == null || password1.length()<6 || password1.length()>18){
			errorList.add("密码必须在6-18位之间！");
		}
		if(password2 == null || password2.length()<6 || password2.length()>18){
			errorList.add("确认的密码必须在6-18位之间！");
		}
		if(password1 != null && password2 != null && !password1.equals(password2)){
			errorList.add("密码和确认密码必须相等!");
		}
		if(!errorList.isEmpty()){
			request.setAttribute("errorList",errorList);
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}else{
			User user = new User();
			user.setUsername(username);
			user.setPassword(password1);
			user.setSex(sex);
			user.setProfession(profession);
			user.setFavourite(favourite);
			user.setNote(note);
			RegisterBean register = new RegisterBean();
			boolean flag = false;
			try {
				flag = register.registerUser(user);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(flag){
				request.getRequestDispatcher("register/reg_success.jsp").forward(request,response);
			}else{
				errorList.add("注册失败！用户名已存在！");
				request.setAttribute("errorList", errorList);
				request.getRequestDispatcher("error.jsp").forward(request,response);
			}
		}
	}

}
