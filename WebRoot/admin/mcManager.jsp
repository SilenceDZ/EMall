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
		<title>商品管理</title>
		<script >
			//$(document).ready 的作用是等页面的文档（document）中的节点都加载完毕后，
			//再执行后续的代码
			$(document).ready(function(){
				initPageBar();		
				
			});
			function initPageBar(){			
				var currentPage=$("#pageNow").html();
				if(currentPage==1){
					$("#prePage2").hide();
					$("#prePage").hide();
				}
				else if(currentPage<=2){
					//$("#prePage2").hide();
					$("#prePage2").hide();
					$("#prePage").html("1");
				}				
				var pageCount=$("#pageCount").val();
				if($("#nextPage").text()>pageCount){
					$("#nextPage").hide();
				}
				if($("#nextPage2").text()>pageCount){
					$("#nextPage2").hide();
				}
			}			
			function goPage(){
				var pageNum=parseInt($("#goPage").val());
				var count=parseInt($("#pageCount").val());
				if(pageNum<=count){
					$("#currentPage").val(pageNum);
				}
				pageFormSubmit();
			}
			function changePageSize(sizeValue){				
				$("#pageSize").val(sizeValue);
				$("#currentPage").val(1);
			}
			function pageFormSubmit(){
				$("#pageForm").submit();
			}
			function firstPage(){
				$("#currentPage").val(1);
				$("#pageForm").submit();
			}
			function endPage(){
				$("#currentPage").val(parseInt($("#pageCount").val()));
				$("#pageForm").submit();
			}
			function prePage(num){
				var curPage=$("#currentPage").val();				
				if((parseInt(curPage)-parseInt(num))>0){
					$("#currentPage").val(parseInt(curPage)-parseInt(num));
				}else{
					$("#currentPage").val(1);
				}
				$("#pageForm").submit();
			}
			function nextPage(num){
				var curPage=$("#currentPage").val();
				var pageCount=$("#pageCount").val();				
				if((parseInt(curPage)+parseInt(num))<pageCount){
					$("#currentPage").val(parseInt(curPage+num));
				}else{
					$("#currentPage").val(parseInt(pageCount));
				}
				$("#pageForm").submit();
			}
		</script>
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
							<th><input type="checkbox">选择</th>
							<th>类别编号</th>
							<th>类别名称</th>
							<th>所属父类</th>
							<th>操作</th>
						</tr>
						<c:forEach var="mcType" items="${pageModel.result }">
						<tr>
							<td><input type="checkbox"></td>
							<td>${mcType.typeid }</td>							
							<c:if test="${mcType.fatherid>0}">
								<td ><p class="text-center">${mcType.typename }</p></td>
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
					
					<div class="input-group pull-left col-lg-2">
							<span class="input-group-btn"><button class="btn btn-default"  type="button" onclick="pageFormSubmit()">每页显示数量</button> </span>
							<input class="form-control" id="selectPageSize"  onblur="changePageSize(this.value)" 
							type="number" value="${pageModel.pageSize }" min="3" max="${pageModel.totalCount }"/>
					</div>					
					<div class="btn-toolbar" style="padding-left:350px">						
						<div class="btn-group">
						<a class="btn btn-default" href="javascript:prePage(1);"><span class="glyphicon glyphicon-triangle-left"></span></a>
						</div>
						<div class="btn-group">
						<button class="btn btn-default"  id="firstPage" onclick="firstPage()">首页</button>
						<button class="btn btn-default" id="prePage2" onclick="prePage(2)">${pageModel.currentPage-2 }</button>
						<button class="btn btn-default" id="prePage" onclick="prePage(1)">${pageModel.currentPage-1 }</button>
						<button class="btn btn-info"  id="pageNow" >${pageModel.currentPage }</button>
						<button class="btn btn-default" id="nextPage" onclick="nextPage(1)">${pageModel.currentPage+1 }</button>
						<button class="btn btn-default"  id="nextPage2" onclick="nextPage(2)">${pageModel.currentPage+2 }</button>
						<button class="btn btn-default"  id="endPage" onclick="endPage()">末页</button>
						</div>
						<div class="btn-group">
						<a class="btn btn-default" href="javascript:nextPage(1);"><span class="glyphicon glyphicon-triangle-right"></span></a>
						</div>
						<div class="col-lg-2 ">
						<div class="input-group">
							<input type="text" class="form-control" name="goPage" id="goPage" placeholder="go">
							<span class="input-group-btn">
							<button class="btn btn-default" type="button" onclick="goPage()">转到</button> </span>
						</div>
							<!-- /input-group -->						
						</div><!-- /col_lg_2 -->						
					</div>	
					<input type="hidden" id="pageCount" value="${pageModel.pageCount }"/>
					<form action="McServlet?action=mcTypeManage" method="post" id="pageForm">
						<input type="hidden" id="pageSize" name="pageSize" value="${pageModel.pageSize }"/>
						<input type="hidden" id="currentPage" name="currentPage" value="${pageModel.currentPage }"/>
					</form>
				</div>					
			</div>
		</div>
		
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
	</body>

</html>