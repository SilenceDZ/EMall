<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width,initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <title>用户注册</title>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/register.js"></script>
    <style type="text/css">
        body{
            padding-bottom: 20px;
        }
    </style>
    
</head>

<body>
	<jsp:include page="comm/topNavbar.jsp"></jsp:include>
    <div class="container" style="background-color: #F1F8FE;height:1000px;">
        <div class="row col-md-7 col-md-offset-3">
        <h2 class="text-center page-header" style="padding-right: 35px;">用户注册</h2>
            <form class="form-horizontal" method="post" action="UserManager?action=register" id="registerForm">
                <div class="form-group">
                    <label for="username" class="control-label col-sm-2">用户名</label>
                    <div class="col-sm-7"><input type="text" class="form-control" id="username" name="username" placeholder="Username"></div>
                    <p class="text-danger col-sm-3" id="usernamemsg"></p>
                </div>
                <div class="form-group">
                    <label for="password" class="control-label col-sm-2">密码</label>
                    <div class="col-sm-7"><input type="password" class="form-control" id="password" name="password" placeholder="Password"></div>
                    <p class="text-danger col-sm-3" id="passwordmsg"></p>
                </div>
                <div class="form-group">
                    <label for="repassword" class="control-label col-sm-2">确认密码</label>
                    <div class="col-sm-7"><input type="password" class="form-control" onblur="valRepassword()" id="repassword" name="repassword" placeholder="RepeatPassword"></div>
                	<p class="text-danger col-sm-3" id="repasswordmsg"></p>
                </div>
                <div class="form-group">
                    <label for="sex" class="control-label col-sm-2">性别</label>
                    <div class="col-sm-7">
                    <select class="form-control" id="sex" name="sex" >
					  <option>男</option>
					  <option>女</option>
					</select>
                    </div> 
                    <p class="text-danger col-sm-3" id="sexmsg"></p>                  
                </div>
                <div class="form-group">
                    <label for="realname" class="control-label col-sm-2">真实姓名</label>
                    <div class="col-sm-7"><input type="text" class="form-control" id="realname" name="realname" placeholder="Realname"></div>
               		<p class="text-danger col-sm-3" id="realnamemsg"></p>
                </div>
                <div class="form-group">
                    <label for="birthday" class="control-label col-sm-2">出生日期</label>
                    <div class="col-sm-7">
                    <input type="date" class="form-control" id="birthday" name="birthday" placeholder="Birthday">
                    </div>
                    <p class="text-danger col-sm-3" id="birthday"></p>
                </div>
                <div class="form-group">
                    <label for="email" class="control-label col-sm-2">电子邮箱</label>
                    <div class="col-sm-7"><input type="text" onblur="valEmail(this.value)" class="form-control" id="email" name="email" placeholder="Email"></div>
                    <p class="text-danger col-sm-3" id="emailmsg"></p>
                </div>
                <div class="form-group">
                    <label for="tel" class="control-label col-sm-2">电话号码</label>
                    <div class="col-sm-7"><input type="text" class="form-control" id="phoneno" name="phoneno" placeholder="Tel"></div>
                    <p class="text-danger col-sm-3" id="phonenomsg"></p>
                </div>
                <div class="form-group">
                    <label for="address" class="control-label col-sm-2">地址</label>
                    <div class="col-sm-7"><input type="text" class="form-control" id="address" name="address" placeholder="Address"></div>
                    <p class="text-danger col-sm-3" id="addressmsg"></p>
                </div>
                <div class="form-group">
                    <label for="postcade" class="control-label col-sm-2">邮编</label>
                    <div class="col-sm-7"><input type="text" class="form-control" id="postcade" name="postcade" placeholder="Post"></div>
                    <p class="text-danger col-sm-3" id="postcademsg"></p>
                </div>
                <button class="btn btn-success col-sm-2 col-sm-offset-2" type="submit">提交</button>
                <button class="btn btn-success col-sm-2 col-sm-offset-3" type="reset">重置</button>
            </form>
        </div>
    </div>
    <jsp:include page="comm/login.jsp"></jsp:include>
    <!--尾部版权-->
    <jsp:include page="comm/copyright.jsp"></jsp:include>
    
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>
