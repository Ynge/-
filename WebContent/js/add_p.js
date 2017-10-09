/**
 * 添加段落
 */
$(document).ready(function(){
	$("#btn_add_p").click(function(){
		var str = $("#content_text").val();
		$("#content_text").val(str+"<p>新段落</p>");
	});
	
});