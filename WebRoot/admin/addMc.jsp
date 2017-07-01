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
					
					
					<!-- 主体内容 -->
					
				</div>					
			</div>
		</div>
		
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
	</body>

</html>