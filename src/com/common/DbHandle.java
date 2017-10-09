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
	 * ���ݿ�����
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
				System.out.println("���ݿ���������ʧ�ܣ�");
				e.printStackTrace();
			}catch (SQLException e) {
				System.out.println("���ݿ�����ʧ�ܣ�");
				e.printStackTrace();
			}
		}
	
	/**
	 * ���ݿ��ѯ
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
			System.out.println("ִ�����ݿ��ѯ����"+sql);
			e.printStackTrace();
		}
		return rs;
		
	}
	
	
	/**
	 * ���ݿ���ɾ��
	 * @param sql
	 * @return >0ִ�гɹ�
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
			System.out.println("ִ��executeUpdate(sql)��������"+sql);
			e.printStackTrace();
			ret=-1;
		}
		return ret;
		
	}
	
	/**
	 * �ر����ݿ�
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
			System.out.println("ִ��close()��������");
			e.printStackTrace();
		}
	}
}
