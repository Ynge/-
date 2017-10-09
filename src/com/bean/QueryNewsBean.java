package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.common.DbHandle;
import com.vo.News;

public class QueryNewsBean {
	public List<News> findPage(int curPage,int pageSize) throws SQLException{
		List<News> newsList = new ArrayList<News>();
		ResultSet rs = null;
		DbHandle db = new DbHandle();
		String sql = "select * from news order by pubtime desc limit "+((curPage-1)*pageSize)+","+pageSize;
		rs = db.executeQuery(sql);
		while(rs.next()){
			News news = new News();
			news.setId(rs.getInt("id"));
			news.setTitle(rs.getString("title"));
			news.setContent(rs.getString("content"));
			news.setUsername(rs.getString("username"));
			news.setPubtime(rs.getString("pubtime"));
			newsList.add(news);
		}
		db.close();
		return newsList;
	}
	
	public int getTotal() throws SQLException{
		DbHandle db = new DbHandle();
		String sql = "select count(id) from news";
		ResultSet rs = db.executeQuery(sql);
		if(rs.next()){
			int total = rs.getInt(1);
			db.close();
			return total;
		}else{
			return -1;
		}
		
	}
	
}
