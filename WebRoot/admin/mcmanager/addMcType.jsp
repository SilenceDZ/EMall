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
		<title>添加商品类别</title>
	</head>
	<body>
	
	
	 
		<jsp:include page="../comm/topNavbar.jsp"></jsp:include>
		
		<!--
        	作者：offline
        	时间：2017-06-16
        	描述：自适应布局
        -->
		<div class="container-fluid">
			<div class="row"> 
				<jsp:include page="../comm/sideBar.jsp"></jsp:include>
				<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2  main msgright">
					<!--右侧显示内容-->
					<h2 class="page-header" id="pageName">添加商品类别</h2>
					<!-- 输入表单 -->
				<div class="row col-md-8 col-md-offset-1">
			<form class="form-horizontal" action="McTypeManager?action=addMcType" id="addMcTypeForm">
                <div class="form-group">
                    <label for="username" class="control-label col-sm-4">类别名称</label>
                    <div class="col-sm-8"><input type="text" class="form-control" id="typename" name="typename" placeholder="类别名称"></div>
                </div>
               
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">所属大类</label>
                    <div class="col-sm-8">
                    <select class="form-control" id="fatherid" name="fatherid">
					  <option>--选择大类--</option>
					  <option>2</option>
					  <option>3</option>
					  <option>4</option>
					  <option>5</option>
					</select>
					</div>
                </div>
                              
                <button class="btn btn-success col-sm-2 col-sm-offset-3" type="submit">确定</button>
                <button class="btn btn-success col-sm-2 col-sm-offset-5" type="reset">重置</button>
            </form>
				</div>
				
					
					
					<!-- 主体内容 -->
					
				</div>					
			</div>
		</div>
		
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
	</body>

</html>