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
		<meta name="viewport" content="width=device-width,initial-sacle=1" />
		<link rel="stylesheet" href="../css/bootstrap.min.css" />
		<link rel="stylesheet" href="../css/adminComm.css" />
		<title>EMall后台管理</title>
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
					<h2 class="page-header" id="pageName">管理控制台首页</h2>
					<div class="page-header">
						<button class="btn btn-success"><span class="glyphicon glyphicon-plus"></span>添加</button>
						<div class="col-lg-4 pull-right">
							<div class="input-group">
								<input type="text" class="form-control" placeholder="Search for...">
								<span class="input-group-btn">
					        <button class="btn btn-default" type="button">搜索</button>
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
						<tr>
							<td><input type="checkbox"></td>
							<td>1</td>
							<td>计算机</td>
							<td>电子</td>
							<td><button class="btn btn-info">删除</button><button class="btn btn-info">修改</button></td>
						</tr>
						<tr>
							<td><input type="checkbox"></td>
							<td>1</td>
							<td>计算机</td>
							<td>电子</td>
							<td><button class="btn btn-info">删除</button><button class="btn btn-info">修改</button></td>
						</tr>
						<tr>
							<td><input type="checkbox"></td>
							<td>1</td>
							<td>计算机</td>
							<td>电子</td>
							<td><button class="btn btn-info">删除</button><button class="btn btn-info">修改</button></td>
						</tr>
						<tr>
							<td><input type="checkbox"></td>
							<td>1</td>
							<td>计算机</td>
							<td>电子</td>
							<td><button class="btn btn-info">删除</button><button class="btn btn-info">修改</button></td>
						</tr>
					</table>
					<div class="btn-toolbar ">
						<div class="btn-group">
						<button class="btn btn-default"><span class="glyphicon glyphicon-triangle-left"></span></button>
						</div>
						<div class="btn-group">
						<button class="btn btn-default">1</button>
						<button class="btn btn-default">2</button>
						<button class="btn btn-default">3</button>
						<button class="btn btn-default">...</button>
						<button class="btn btn-default">4</button>
						<button class="btn btn-default">5</button>
						<button class="btn btn-default">6</button>
						</div>
						<div class="btn-group">
						<button class="btn btn-default"><span class="glyphicon glyphicon-triangle-right"></span></button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
		<script type="text/javascript" src="../js/bootstrap.min.js"></script>
	</body>

</html>