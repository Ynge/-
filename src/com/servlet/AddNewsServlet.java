package com.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AddNewsBean;
import com.vo.News;
import com.vo.User;

/**
 * Servlet implementation class AddNewsServlet
 */
public class AddNewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewsServlet() {
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
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String pubtime = sdf.format(date);
		User user = (User)request.getSession().getAttribute("user");
		String username = user.getUsername();
		News news = new News();
		news.setTitle(title);
		news.setContent(content);
		news.setPubtime(pubtime);
		news.setUsername(username);
		
		//服务器端验证
		List<String> errorList = new ArrayList<String>();
		if(title == null || "".equals(title)){
			errorList.add("新闻标题不能为空！");
		}
		if(!errorList.isEmpty()){
			request.setAttribute("errorList", errorList);
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		
		//调用业务处理类保存新闻
		AddNewsBean addNewsBean = new AddNewsBean();
		boolean flag = addNewsBean.addNews(news);
		if(flag){
			request.getRequestDispatcher("news/add_success.jsp").forward(request, response);
		}else{
			errorList.add("服务器插入数据库操作失败！");
			request.setAttribute("errorList", errorList);
			request.getRequestDispatcher("error.jsp").forward(request,response);
		}
		
	}

}
