package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHandle {
	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	
	/**
	 * 数据库连接
	 */
	public void getConnection(){
		final String URL = "jdbc:mysql://127.0.0.1:3306/news_db?characterEncoding=utf-8";
		final String DBDRIVER = "com.mysql.jdbc.Driver";
		final String USER = "root";
		final String PWD = "xsy19960626";
		
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(URL,USER,PWD);
		 } catch (ClassNotFoundException e) {
				System.out.println("数据库驱动加载失败！");
				e.printStackTrace();
			}catch (SQLException e) {
				System.out.println("数据库连接失败！");
				e.printStackTrace();
			}
		}
	
	/**
	 * 数据库查询
	 * @param sql
	 */
	public ResultSet executeQuery(String sql){
		try {
			if(conn == null){
				getConnection();
			}
			if(st == null){
				st = conn.createStatement();
			}
			rs = st.executeQuery(sql);
		} catch (Exception e) {
			System.out.println("执行数据库查询出错："+sql);
			e.printStackTrace();
		}
		return rs;
		
	}
	
	
	/**
	 * 数据库增删改
	 * @param sql
	 * @return >0执行成功
	 */
	public int executeUpdate(String sql){
		int ret;
		try {
			if(conn == null){
				getConnection();
			}
			if(st == null){
				st = conn.createStatement();
			}
			ret = st.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("执行executeUpdate(sql)方法出错："+sql);
			e.printStackTrace();
			ret=-1;
		}
		return ret;
		
	}
	
	/**
	 * 关闭数据库
	 */
	public void close(){
		try {
			if(rs != null){
				rs.close();
			}
			if(st != null){
				st.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("执行close()方法出错！");
			e.printStackTrace();
		}
	}
}
