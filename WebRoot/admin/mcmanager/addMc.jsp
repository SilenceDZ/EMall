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
					<h2 class="page-header" id="pageName">添加商品</h2>
					<!-- 输入表单 -->
				<div class="row col-md-8 col-md-offset-1">
			<form class="form-horizontal" action="McManager?action=addMc" id="addMcForm">
                <div class="form-group">
                    <label for="username" class="control-label col-sm-4">商品名称</label>
                    <div class="col-sm-8"><input type="text" class="form-control" id="mcname" name="mcname" placeholder="商品名"></div>
                </div>
               
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">所属大类</label>
                    <div class="col-sm-8">
                    <select class="form-control">
					  <option>--选择大类--</option>
					  <option>2</option>
					  <option>3</option>
					  <option>4</option>
					  <option>5</option>
					</select>
					</div>
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">所属小类</label>
                    <div class="col-sm-8">
                    <select class="form-control">
					  <option>--选择小类--</option>
					  <option>2</option>
					  <option>3</option>
					  <option>4</option>
					  <option>5</option>
					</select>
					</div>
                </div>
                <div class="form-group">
                    <label for="birthday" class="control-label col-sm-4">上架时间</label>
                    <div class="col-sm-8"><input type="date" class="form-control" id="createdate" name="createdate" placeholder="上架时间"></div>
                </div>
                <div class="form-group">
                    <label for="email" class="control-label col-sm-4">库存数量</label>
                    <div class="col-sm-8"><input type="text" class="form-control" id="count" name="count" placeholder="库存数量"></div>
                </div>
                <div class="form-group">
                	<label for="repwd" class="control-label col-sm-4">价格</label>                    
				    <div class="input-group col-sm-8" style="padding-left:15px;">
				      <input type="text" class="form-control " id="exampleInputAmount" placeholder="价格">
				      <div class="input-group-addon">￥</div>
				    </div>
                </div>
                <div class="form-group">
                    <label for="exampleInputFile" class="control-label col-sm-4">图片</label>
    				<div class="col-sm-8"><input type="file" id="mcpicpath"></div>    				
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">商品描述</label>
                    <div class="col-sm-8"><textarea class="form-control " rows="3"></textarea></div>
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