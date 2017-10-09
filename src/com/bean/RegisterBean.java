package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.common.DbHandle;
import com.vo.User;

public class RegisterBean {
	public boolean registerUser(User user) throws SQLException{
		int ret = -1;
		DbHandle db = new DbHandle();
		String sql = "select * from user where username='"+user.getUsername()+"'";
		ResultSet rs = db.executeQuery(sql);
		if(!rs.next()){
			sql = "insert into user(username,password,sex,profession,favourite,note) "+
			"values ('"+user.getUsername()+"','"+user.getPassword()+"','"+user.getSex()+
			"','"+user.getProfession()+"','"+user.getFavourite()+"','"+user.getNote()+"')";
			ret = db.executeUpdate(sql);
			db.close();
		}
		if(ret>0){
			return true;
		}
		else{
			return false;
		}
	}
}
