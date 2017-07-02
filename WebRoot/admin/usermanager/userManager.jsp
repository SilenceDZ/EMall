<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width,initial-sacle=1" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/adminComm.css" />
<title>注册用户管理</title>
</head>

<body>
	<!--@include file="topNavbar.jsp" --%>  
	<!--jsp:include page="../admin/topNavbar.jsp"> 注意两者的区别 -->

	<%@include file="../comm/topNavbar.jsp"%>
	<!--
        	作者：offline
        	时间：2017-06-16
        	描述：自适应布局
        -->
	<div class="container-fluid">
		<div class="row">
			<jsp:include page="../comm/sideBar.jsp"></jsp:include>
			<div
				class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2  main msgright">
				<!--右侧显示内容-->
				<h2 class="page-header" id="pageName">注册用户管理</h2>

				<!-- 主体内容 -->
				<table class="table table-hover ">
					<tr>
						<th><input type="checkbox">选择</th>
						<th>用户名</th>
						<th>用户密码</th>
						<th>真实姓名</th>
						<th>性别</th>
						<th>出生日期</th>
						<th>E-Mail</th>
						<th>联系电话</th>
						<th>邮政编码</th>
						<th>地址</th>
						<th>账号状态</th>
						<th>注册日期</th>
						<th>登录次数</th>
						<th>最后登录</th>
						<th>操作</th>
					</tr>
					
					<!-- 分页条 -->
				</table>
					<div class="input-group pull-left col-lg-2">
						<span class="input-group-btn"><button
								class="btn btn-default" type="button" onclick="pageFormSubmit()">每页显示数量</button>
						</span> <input class="form-control" id="selectPageSize"
							onblur="changePageSize(this.value)" type="number"
							value="${pageModel.pageSize }" min="3"
							max="${pageModel.totalCount }" />
					</div>
					
					<div class="btn-toolbar" style="padding-left:350px">
						<div class="btn-group">
							<a class="btn btn-default" href="javascript:prePage(1);"><span
								class="glyphicon glyphicon-triangle-left"></span></a>
						</div>
						<div class="btn-group">
							<button class="btn btn-default" id="firstPage"
								onclick="firstPage()">首页</button>
							<button class="btn btn-default" id="prePage2"
								onclick="prePage(2)">${pageModel.currentPage-2 }</button>
							<button class="btn btn-default" id="prePage" onclick="prePage(1)">${pageModel.currentPage-1 }</button>
							<button class="btn btn-info" id="pageNow">${pageModel.currentPage }</button>
							<button class="btn btn-default" id="nextPage"
								onclick="nextPage(1)">${pageModel.currentPage+1 }</button>
							<button class="btn btn-default" id="nextPage2"
								onclick="nextPage(2)">${pageModel.currentPage+2 }</button>
							<button class="btn btn-default" id="endPage" onclick="endPage()">末页</button>
						</div>
						<div class="btn-group">
							<a class="btn btn-default" href="javascript:nextPage(1);"><span
								class="glyphicon glyphicon-triangle-right"></span></a>
						</div>
						<div class="col-lg-2 ">
							<div class="input-group">
								<input type="text" class="form-control" name="goPage"
									id="goPage" placeholder="go"> <span
									class="input-group-btn">
									<button class="btn btn-default" type="button"
										onclick="goPage()">转到</button>
								</span>
							</div>
							<!-- /input-group -->
						</div>
						<!-- /col_lg_2 -->
					</div>
					<input type="hidden" id="pageCount" value="${pageModel.pageCount }" />
					<form action="McManager?action=mcManage" method="post"
						id="pageForm">
						<input type="hidden" id="pageSize" name="pageSize"
							value="${pageModel.pageSize }" /> <input type="hidden"
							id="currentPage" name="currentPage"
							value="${pageModel.currentPage }" />
					</form>
				</table>
			</div>
		</div>
	</div>
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>

</html>