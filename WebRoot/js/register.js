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
function valUsername(){
	
}
function valPassword(){
	
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
