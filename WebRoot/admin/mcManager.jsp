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
		<link rel="stylesheet" href="css/adminComm.css" />
		<title>商品管理</title>
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
					<h2 class="page-header" id="pageName">商品管理</h2>
					<div class="page-header">
						<button class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>添加</button>
						<div class="col-lg-4 pull-right">
							<div class="input-group">
								<input type="text" class="form-control" placeholder="Search for...">
								<span class="input-group-btn">
					        <button class="btn btn-default" type="button">search</button>
					      </span>
							</div>
							<!-- /input-group -->
						</div>
						<!-- /.col-lg-6 -->
					</div>
					
					<!-- 主体内容 -->
					<table class="table table-hover ">
						<tr>
							<th>选择</th>
							<th>类别编号</th>
							<th>类别名称</th>
							<th>所属父类</th>
							<th>操作</th>
						</tr>
						<c:forEach var="mcType" items="${list }">
						<tr>
							<td><input type="checkbox"></td>
							<td>${mcType.typeid }</td>							
							<c:if test="${mcType.fatherid>0}">
								<td ><p class="pull-right">${mcType.typename }</p></td>
							</c:if>
							<c:if test="${mcType.fatherid==0}">
								<td>${mcType.typename }</td>
							</c:if>
							<td>${mcType.fatherid}</td>
							<td>&nbsp;&nbsp;&nbsp;&nbsp;<button class="btn btn-info">修改</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button class="btn btn-danger">删除</button></td>
						</tr>
						</c:forEach>
					</table>
					<!-- 分页条 -->
					<div class="btn-toolbar" style="padding-left:350px">
						<div class="btn-group">
						<a class="btn btn-default"><span class="glyphicon glyphicon-triangle-left"></span></a>
						</div>
						<div class="btn-group">
						<button class="btn btn-default" name="firstPage">首页</button>
						<button class="btn btn-default">1</button>
						<button class="btn btn-default">2</button>
						<button class="btn btn-default" name="currentPage">...</button>
						<button class="btn btn-default">3</button>
						<button class="btn btn-default">4</button>
						<button class="btn btn-default" name="endPage">末页</button>
						</div>
						<div class="btn-group">
						<a class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span></a>
						</div>
						<div class="col-lg-2 ">
						<div class="input-group">
							<input type="text" class="form-control" placeholder="go">
							<span class="input-group-btn"><button class="btn btn-default" type="button">转到</button> </span>
						</div>
							<!-- /input-group -->
					</div>
					</div>			
				</div>					
			</div>
		</div>
		<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
	</body>

</html>