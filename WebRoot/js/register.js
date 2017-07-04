/**
 * 用户注册
 */

function valForm(){
	if(valRepassword()&&validateUsername($("#susername").val())&&valPassword($("#password").val())&&valEmail($("#email").val())){
		return true;
	}else{
		false;
	}
}
function valRepassword(){
	var repwd=$("#repassword").val();
	var pwd=$("#password").val();
	if(pwd!=repwd){
		$("#repasswordmsg").html("确认密码错误");
		return false;
	}else{
		$("#repasswordmsg").html("");
		return true;
	}
}

function validateUsername(value){
	if(valUsername(value)&& checkuser()){
		return true;
	}else{
		return false;
	}
}
function valUsername(value){
	if(value.length<3 ||value.length>15){
		$("#usernamemsg").html("");
		$("#usernamemsg").removeClass("text-success text-danger");
		$("#usernamemsg").addClass("text-danger");
		$("#usernamemsg").html("长度必须在3-15个字符");
	}else{
		$("#usernamemsg").html("");
	}
	var userReg=/^([a-zA-Z0-9])([a-zA-Z0-9_-]{2,14})/;
	if(!userReg.test(value)){
		$("#usernamemsg").html("格式错误,建议由数字和字母组成.不能以下划线和减号开头");
		return false;
	}else{
		$("#usernamemsg").html("");
		return true;
	}
}


function valPassword(value){
	if(value.length<6||value.length>20){
		$("#passwordmsg").html("长度必须在6-18个字符");
		return false;
	}else{
		$("#passwordmsg").html("");
		return true;
	}
}
function valEmail(value){	
	//^n-->匹配任何开头为 n 的字符串。
	var emailReg=/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-]){1,5}/ ;
	if(!emailReg.test(value)){
		$("#emailmsg").html("邮箱格式错误");
		return false;
	}else{
		$("#emailmsg").html("");
		return true;
	}
}
function checkuser(){
	alert("checkuser()");
	alert($("#username").val());
	$.ajax({		
		type:"get",
		url:"UserManager?action=registercheck&uname="+$("#username").val(),		
		dateType:"json",
		success:function(data){		
			var bo=data.success.toString();
			if(bo=="true"){
				$("#usernamemsg").html("");
				$("#usernamemsg").html("用户名可使用");
				$("#usernamemsg").removeClass("text-danger text-success");
				$("#usernamemsg").addClass("text-success");
				return true;
			}else{
				$("#usernamemsg").html("");
				$("#usernamemsg").html("请重新填写:"+data.msg);
				$("#usernamemsg").removeClass("text-success text-danger");
				$("#usernamemsg").addClass("text-danger");
				return false;
			}
		},
		error:function(jsXHR){
			alert("出现错误:"+jqXHR.status);
			return false;
		}
	});
}
