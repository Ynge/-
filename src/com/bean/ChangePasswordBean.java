package com.bean;

import com.common.DbHandle;

public class ChangePasswordBean {
	public boolean changePaasword(String username,String oldpwd,String newpwd){
		DbHandle db = new DbHandle();
		System.out.println(username+oldpwd+newpwd);
		String sql ="update user set password='"+newpwd+"' where username='"
				+username+"' and password='"+oldpwd+"'";
		int ret = db.executeUpdate(sql);
		db.close();
		if(ret>0){
			return true;
		}else{
			return false;
		}
	}

}
