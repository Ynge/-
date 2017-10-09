package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.common.DbHandle;
import com.vo.User;

public class LoginBean {
	public User login(String username,String password) throws SQLException{
		DbHandle db = new DbHandle();
		String sql = "select * from user where username='"+username+"' and password='"+password+"'";
		ResultSet rs = db.executeQuery(sql);
		User user = new User();
		if(rs.next()){
			int userid = rs.getInt("id");
			String sex = rs.getString("sex");
			String profession = rs.getString("profession");
			String favourite = rs.getString("favourite");
			String type = rs.getString("type");
			String note = rs.getString("note");
			
			user.setId(userid);
			user.setUsername(username);
			user.setPassword(password);
			user.setFavourite(favourite);
			user.setSex(sex);
			user.setProfession(profession);
			user.setNote(note);
			user.setType(type);
			
			db.close();
			return user;
		}
		else{
			db.close();
			return null;
		}
	}
}
