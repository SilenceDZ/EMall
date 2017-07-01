<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width,initial-sacle=1" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<script src="jquery/jquery.js"></script>
		<link rel="stylesheet" href="css/adminComm.css" />
		<script type="text/javascript" src="js/pageBar.js"></script>
		<title>添加商品</title>
	</head>
	<body>
	
	
	 
		<jsp:include page="topNavbar.jsp"></jsp:include>
		<!--
        	作者：offline
        	时间：2017-06-16
        	描述：自适应布局
        -->
		<div class="container-fluid">
			<div class="row">
				<jsp:include page="sideBar.jsp"></jsp:include>
				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2  main msgright">
					<!--右侧显示内容-->
					<h2 class="page-header" id="pageName">添加商品</h2>
					<!-- 输入表单 -->
				<div class="row col-md-6 col-md-offset-3">
				<form class="form-horizontal" action="McManager?action=addMc" id="registerForm">
                <div class="form-group">
                    <label for="username" class="control-label col-sm-2">商品名</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Username" name="username" placeholder="Username"></div>
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-2">商品描述</label>
                    <textarea class="form-control" rows="3"></textarea>
                </div>
                <div class="form-group">
                    <label for="repwd" class="control-label col-sm-2">价格</label>
                    <div class="col-sm-10"><input type="password" class="form-control" id="Repwd" name="repassword" placeholder="RepeatPassword"></div>
                </div>
                <div class="form-group">
                    <label for="sex" class="control-label col-sm-2">略缩图</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Sex" name="sex" placeholder="Sex"></div>
                    
                </div>
                <div class="form-group">
                    <label for="realname" class="control-label col-sm-2">商品小类别</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Realname" name="realname" placeholder="Realname"></div>
                </div>
                <div class="form-group">
                    <label for="birthday" class="control-label col-sm-2">上架时间</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Birthday" name="birthday" placeholder="Birthday"></div>
                </div>
                <div class="form-group">
                    <label for="email" class="control-label col-sm-2">库存数量</label>
                    <div class="col-sm-10"><input type="text" class="form-control" id="Email" name="email" placeholder="Email"></div>
                </div>
                
                <button class="btn btn-success col-sm-2 col-sm-offset-2" type="submit">提交</button>
                <button class="btn btn-success col-sm-2 col-sm-offset-4" type="reset">重置</button>
            </form>
				</div>
				
					
					
					<!-- 主体内容 -->
					
				</div>					
			</div>
		</div>
		
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
	</body>

</html>