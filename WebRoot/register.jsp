<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width,initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="css/bootstrap.min.css" />
    <title>用户注册</title>
    <style type="text/css">
        body{
            padding-bottom: 20px;
        }
    </style>
</head>

<body>
	<jsp:include page="comm/topNavbar.jsp"></jsp:include>
    <div class="container" style="background-color: #F1F8FE;height:1000px;">
        <div class="row col-md-6 col-md-offset-3">
        <h2><p class="text-center">用户注册</p></h2>
            <form class="form-horizontal" action="" id="registerForm">
                <div class="form-group">
                    <label for="username" class="control-label col-sm-2">用户名</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Username" placeholder="Username"></div>
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-2">密码</label>
                    <div class="col-sm-10"><input type="password" class="form-control" id="Pwd" placeholder="Password"></div>
                </div>
                <div class="form-group">
                    <label for="repwd" class="control-label col-sm-2">确认密码</label>
                    <div class="col-sm-10"><input type="password" class="form-control" id="Repwd" placeholder="RepeatPassword"></div>
                </div>
                <div class="form-group">
                    <label for="sex" class="control-label col-sm-2">性别</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Sex" placeholder="Sex"></div>
                    
                </div>
                <div class="form-group">
                    <label for="realname" class="control-label col-sm-2">真实姓名</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Realname" placeholder="Realname"></div>
                </div>
                <div class="form-group">
                    <label for="birthday" class="control-label col-sm-2">出生日期</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Birthday" placeholder="Birthday"></div>
                </div>
                <div class="form-group">
                    <label for="email" class="control-label col-sm-2">电子邮箱</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Email" placeholder="Email"></div>
                </div>
                <div class="form-group">
                    <label for="tel" class="control-label col-sm-2">电话号码</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Tel" placeholder="Tel"></div>
                </div>
                <div class="form-group">
                    <label for="address" class="control-label col-sm-2">地址</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Address" placeholder="Address"></div>
                </div>
                <div class="form-group">
                    <label for="post" class="control-label col-sm-2">邮编</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Post" placeholder="Post"></div>
                </div>
                <button class="btn btn-success col-sm-2 col-sm-offset-2" type="submit">提交</button>
                <button class="btn btn-success col-sm-2 col-sm-offset-4" type="reset">重置</button>
            </form>
        </div>
    </div>
    <jsp:include page="comm/login.jsp"></jsp:include>
    <!--尾部版权-->
    <jsp:include page="comm/copyright.jsp"></jsp:include>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>
