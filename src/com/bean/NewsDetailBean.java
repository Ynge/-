package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.common.DbHandle;
import com.vo.News;
import com.vo.User;

/*
 * 用来获取当前新闻详情和作者全部信息
 */
public class NewsDetailBean {
public List<Object> getDetail(String newsid) throws SQLException{
	DbHandle db = new DbHandle();
	String sql = "select * from news where id="+newsid;
	ResultSet rs = db.executeQuery(sql);
	if(rs.next()){
		News news = new News();
		news.setId(rs.getInt("id"));
		news.setTitle(rs.getString("title"));
		news.setContent(rs.getString("content"));
		news.setUsername(rs.getString("username"));
		news.setPubtime(rs.getString("pubtime"));
		//创建List传递数据
		List<Object> list = new ArrayList<Object>();
		list.add(news);
		sql="select * from user where username='"+news.getUsername()+"'";
		rs = db.executeQuery(sql);
		if(rs.next()){
			User author = new User();
			author.setId(rs.getInt("id"));
			author.setUsername(rs.getString("username"));
			author.setSex(rs.getString("sex"));
			author.setProfession(rs.getString("profession"));
			author.setFavourite(rs.getString("favourite"));
			author.setNote(rs.getString("note"));
			author.setType(rs.getString("type"));
			list.add(author);
			db.close();
			return list;
		}else{
			return null;
		}
	}else{
		return null;
	}
}
}
