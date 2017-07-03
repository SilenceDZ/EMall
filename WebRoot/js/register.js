/**
 * 用户注册
 */
/*$(document).ready(function(){
	
});*/
/*$(document).ready(function(){
	$.ajax({
		type:"POST",
		url:"UserManager?action=registercheck",
		data:{
			username:$("#username").val(),
			password:$("#password").val(),
			sex:$("#sex").val(),
			realname:$("#realname").val(),
			birthday:$("#birthday").val(),
			email:$("#email").val(),
			phoneno:$("#phoneno").val(),
			address:$("#address").val(),
			postcade:$("#postcade").val()
		},
		dateType:"json",
		success:function(){
			if(data.success){
				$("#").html(data.msg);
			}else{
				$("#").html("出现错误:"+data.msg);
			}
		},
		error:function(jsXHR){
			alert("出现错误:"+jqXHR.status);
		}
	});
}
);*/
function valRepassword(){
	var repwd=$("#repassword").val();
	var pwd=$("#password").val();
	if(pwd!=repwd){
		$("#repasswordmsg").html("确认密码错误");
	}else{
		$("#repasswordmsg").html("");
	}
}
function valUsername(value){
	if(value.length<3 ||value.length>15){
		$("#usernamemsg").html("长度必须在3-15个字符");
		return ;
	}else{
		$("#usernamemsg").html("");
	}
	var userReg=/^([a-zA-Z0-9])([a-zA-Z0-9_-]{2,14})/;
	if(!userReg.test(value)){
		$("#usernamemsg").html("格式错误,建议由数字和字母组成.不能以下划线和减号开头");
	}else{
		$("#usernamemsg").html("");
	}
}
function valPassword(value){
	if(value.length<6||value.length>20){
		$("#passwordmsg").html("长度必须在6-18个字符");
	}else{
		$("#passwordmsg").html("");
	}
}
function valEmail(value){	
	//^n-->匹配任何开头为 n 的字符串。
	var emailReg=/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-]){1,5}/ ;
	if(!emailReg.test(value)){
		$("#emailmsg").html("邮箱格式错误");
	}else{
		$("#emailmsg").html("");
	}
}
function checkuser(){
	$.ajax({
		type:"POST",
		url:"UserManager?action=registercheck",
		data:{
			username:$("#username").val()
		},
		dateType:"json",
		success:function(){
			if(data.success){
				$("#usernamemsg").html(data.msg);
			}else{
				$("#usernamemsg").html("出现错误:"+data.msg);
			}
		},
		error:function(jsXHR){
			alert("出现错误:"+jqXHR.status);
		}
	});
}
