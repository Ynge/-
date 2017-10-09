package test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.common.DbHandle;

public class test {
	public static void main(String[] args) throws SQLException {
		DbHandle dbh = new DbHandle();
		ResultSet rs = dbh.executeQuery("select * from user");
		while(rs.next()){
			System.out.println(rs.getInt("id"));
		}
		System.out.println();
	}
}
