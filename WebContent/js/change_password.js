/**
 * 
 */
function on_submit(){
	var oldpwd = $("input[name='oldpwd']").val();
	var newpwd = $("input[name='newpwd']").val();
	var renewpwd = $("input[name='renewpwd']").val();
	if(oldpwd != newpwd){
		if(newpwd == renewpwd){
			if(newpwd.length > 5 && newpwd.length<19){
				return true;
			}else{

				$("center p").html("修改失败，密码长度必须6-18位！");
				return false;
			}

		}else{
			$("center p").html("修改失败，新密码两次输入不一致！");
			return false;
		}
	}else{
		$("center p").html("修改失败新密码与旧密码相同！")
		return false;
	}
}