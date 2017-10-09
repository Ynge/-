package com.bean;

import com.common.DbHandle;
import com.vo.News;

public class AddNewsBean {
	public boolean addNews(News news){
		DbHandle db = new DbHandle();
		String sql = "insert into news(title,content,username,pubtime) values('"
		+news.getTitle().replaceAll("'", "''")+"','"+news.getContent().replaceAll("'", "''")+"','"+news.getUsername().replaceAll("'", "''")+"','"
				+news.getPubtime()+"')";
		int ret = db.executeUpdate(sql);
		db.close();
		if(ret>0){
			return true;
		}else{
			return false;
		}
	}
}
