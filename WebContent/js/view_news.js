/**
 * 
 */
function ajaxPage(num) {  
    $.ajax({  
        type: "post",  
        url: "../FindPageServlet",  
        data: {  
            curPage: num,   
            pageSize: "10"
        },  
        dataType: "json",  
        success: function(result) {  
            $("#sumdata").html(result.total);  
            $("#nowpage").html(result.curPage);  
            $("#sumpage").html(result.totalPage);  
            $("#mainTable").empty();  
            $("#mainTable").append(  
                    "<tr><th class='id'>id</th><th class='title'>标题</th><th class='userid'>发布人</th><th class='pubtime'>发布时间</th></tr>"  
            );  
            $.each(result.newsList, function(i,obj) {  
                $("#mainTable").append(  
                        "<tr><td class='id'>"+obj.id+"</td><td class='title'>"+obj.title+"</td><td class='userid'>"+obj.username+"</td>"  
                        +"<td class='pubtime'>"+obj.pubtime+"</td></tr>"
                        ); 
               
            });
            
            $("tr:has(td)").click(function(){
            	$(window).attr("location","../NewsDetailServlet?newsid="+$(this).children(".id").text());
            });
        },
        error: function() {
        	alert("异常");
        }
        
    });  
}


$(document).ready(function(){  
    ajaxPage(1);  
  
        $("#btn_firstpage").click(function() {  
        ajaxPage(1);  
    });  
      
    $("#btn_previouspage").click(function() {  
        if($("#nowpage").html() != 1) {  
            ajaxPage((parseInt($("#nowpage").html()) - 1));  
        }  
    });  
      
    $("#btn_nextpage").click(function() {  
        var now_page = parseInt($("#nowpage").html());  
        var sum_page = parseInt($("#sumpage").html());  
        if(now_page < sum_page) {  
            ajaxPage((now_page + 1));  
        }  
    });  
      
    $("#btn_lastpage").click(function() {  
        ajaxPage($("#sumpage").html());  
    }); 
    
});