<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>购物车</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/commstyle.css" rel="stylesheet"/>
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <style type="text/css">
    .formtable table td p
    {
    	padding-top:45px;
    }
    .formtable table td div
    {
    	padding-top:45px;
    }
    </style>
  </head>
  
  <body>
    <jsp:include page="comm/topNavbar.jsp"></jsp:include>
  <div class="container" style="background-color: #F1F8FE;height:1000px;">
        <div class="row col-md-8 col-md-offset-2" style="background-color: #fff9e7;">
        <h2 class="text-center">我的购物车</h2>
            <form action="#" class="formtable">
            	<table class="table table-hover">
            	<tr>
            		<th>略缩图</th>
            		<th>商品名</th>
            		<th>商品单价</th>
            		<th>购买数量</th>
            		<th>商品小计</th>
            		<th>操作</th>
            	</tr>
            	<tr>
            		<td>
            		<a href="#" class="thumbnail">
				      <img src="image/lenson.jpg" alt="..." style="width:100px;height:100px">
				    </a>
				    </td>
            		<td><div>ThinkPad E431</div></td>
            		<td><div>$5500.00</div></td>
            		<td>
            		<div><input class="form-control" type="text" style="width:80px"></div>
            		</td>
            		<td><div>$5500.00</div></td>
            		<td><div><button class="btn btn-success">移出购物车</button></div></td>
            	</tr>
            	<tr>
            		<td>
            		<a href="#" class="thumbnail">
				      <img src="image/lenson.jpg" alt="..." style="width:100px;height:100px">
				    </a>
				    </td>
            		<td><div>ThinkPad E431</div></td>
            		<td><div>$5500.00</div></td>
            		<td>
            		<div><input class="form-control" type="text" style="width:80px"></div>
            		</td>
            		<td><div>$5500.00</div></td>
            		<td><div><button class="btn btn-success" onclick="" type="button">移出购物车</button></div></td>
            	</tr>
            	</table>
            	<!-- 购物车功能条 -->
            	<div >
            		
            	</div>
            	<!-- end购物车功能条 -->
            </form>
        </div>
    </div>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>
