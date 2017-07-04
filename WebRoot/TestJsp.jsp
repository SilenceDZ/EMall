<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'TestJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="stylesheet" href="css/bootstrap.min.css" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/register.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript">
	function checkuser(){
	alert("checkuser()");
	alert($("#username").val());
	$.ajax({		
		type:"get",
		url:"UserManager?action=registercheck&uname="+$("#username").val(),		
		dateType:"json",
		success:function(data){
			if(data.success=="false"){
				$("#usernamemsg").html("");
				alert("data.success---->"+data.success);
				$("#usernamemsg").html("用户名可使用");
				$("#usernamemsg").removeClass("text-danger");
				$("#usernamemsg").addClass("text-success");
				return true;
			}if(data.success=="true"){
				$("#usernamemsg").html("");
				alert("else---->"+data.success);
				$("#usernamemsg").html("请重新填写:"+data.msg);
				$("#usernamemsg").removeClass("text-success");
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
	
	</script>
  </head>
  
  <body>
	
	<form class="form-horizontal" method="post"
		action="UserManager?action=register" id="registerForm">
		<div class="form-group">
			<label for="username" class="control-label col-sm-2">用户名</label>
			<div class="col-sm-7">
				<input type="text" class="form-control" id="username"
					onblur="checkuser()" name="username" placeholder="Username">
			</div>
			<p class="text-danger col-sm-3" id="usernamemsg"></p>
		</div>
	</form>
</body>
</html>
