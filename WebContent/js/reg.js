/**
 * 注册页面脚本
 */
function f1_submit_check(){
	var f1 = document.f1;
	var flag1 = false;
	var flag2 = false;
	//验证密码长度
	if(f1.password1.value.length<6||f1.password1.value.length>18){
		alert("密码的长度必须为6-18位");
		return false;
	}
	//验证两次密码是否相同
	if(f1.password1.value!=f1.password2.value){
		alert("两次密码必须相同！");
		return false;
	}
	if(f1.sex != null){  
	    var msglen=f1.sex.length;  
	    for(i=0;i<msglen;i++){  
	      if(f1.sex[i].checked==true){  
	        flag1 = true;  
	      }  
	    }  
	}
	if(f1.favourite != null){
		var msglen=f1.favourite.length;
		 for(i=0;i<msglen;i++){  
		      if(f1.favourite[i].checked==true){  
		        flag2 = true;  
		      } 
	}
	if(flag2 == false){
		alert("对不起，请选择爱好！");
		return false;
	}
	}
	if (flag1 == false)  
	{  
	    alert("对不起，请选择性别！"); 
	    return false;  
	}
	return true;
	
}