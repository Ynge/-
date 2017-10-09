package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.bean.QueryNewsBean;
import com.vo.News;

/**
 * Servlet implementation class FindPageServlet
 */
public class FindPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindPageServlet() {
        super();
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
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		QueryNewsBean qnb = new QueryNewsBean();
		int curPage = Integer.parseInt(request.getParameter("curPage"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize")); 
		int total=0;
		List<News> newsList = null;
		try {
			total =qnb.getTotal();
			newsList = qnb.findPage(curPage, pageSize);
			JSONObject jsb= new JSONObject();
			jsb.put("total",total);
			jsb.put("curPage", curPage);
			jsb.put("totalPage", total%pageSize==0?total/pageSize:total/pageSize+1);
			jsb.put("newsList", newsList);
			out.print(jsb);
			out.flush();
			out.close();
		} catch (SQLException e) {
			System.out.println("获取新闻信息失败"+total+newsList+curPage+pageSize);
			e.printStackTrace();
		}
	}

}
 