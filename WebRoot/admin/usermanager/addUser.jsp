<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<base href="<%=basePath%>">
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width,initial-sacle=1" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/adminComm.css" />
		<title>添加用户</title>
	</head>

	<body>
	<!--@include file="topNavbar.jsp" --%>  
	<!--jsp:include page="../admin/topNavbar.jsp"> 注意两者的区别 -->
	
		<%@include file="../comm/topNavbar.jsp" %>
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
					<h2 class="page-header" id="pageName">添加用户</h2>
					<!-- 主体内容 -->
				<div class="row col-md-8 col-md-offset-1">
				<form class="form-horizontal" action="UserManager?action=addUser" id="addMcForm">
                <div class="form-group">
                    <label for="username" class="control-label col-sm-4">用户名</label>
                    <div class="col-sm-8">
                    <input type="text" class="form-control" id="username" name="mcname" placeholder="用户名">
                    </div>
                </div>
               
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">密码</label>
                    <div class="col-sm-8">
                    <input type="password" class="form-control" id="username" name="mcname" placeholder="密码">
                    </div>
					
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">真实姓名</label>
                    <div class="col-sm-8">
                    <input type="text" class="form-control" id="username" name="username" placeholder="真实姓名">
                    </div>
                </div>
                <div class="form-group">
                    <label for="birthday" class="control-label col-sm-4">性别</label>
                    <div class="col-sm-8">
                    <select class="form-control" id="usersex" name="usersex" >
					  <option>男</option>
					  <option>女</option>
					</select>
                    </div>
                    
                </div>
                <div class="form-group">
                    <label for="email" class="control-label col-sm-4">出生日期</label>
                    <div class="col-sm-8"><input type="date" class="form-control" id="birthday" name="birthday" placeholder="出生日期"></div>
                </div>
                <div class="form-group">
                	<label for="repwd" class="control-label col-sm-4">E-Mail</label>                    
				    <div class=" col-sm-8" >
				      <input type="text" class="form-control " id="email" name="email" placeholder="E-Mail">
				    </div>
                </div>
                <div class="form-group">
                    <label for="exampleInputFile" class="control-label col-sm-4">电话</label>
    				<div class="col-sm-8"><input type="text" class="form-control " id="phoneno" name="phoneno"  placeholder="电话"></div>    				
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">地址</label>
                    <div class="col-sm-8"><input type="text" class="form-control " id="address" name="address"  placeholder="地址"></div>
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-sm-4">邮政编码</label>
                    <div class="col-sm-8"><input type="text" class="form-control " id="postcade" name="postcade"  placeholder="邮政编码"></div>
                </div> 
                        
                <button class="btn btn-success col-sm-2 col-sm-offset-3" type="submit">确定</button>
                <button class="btn btn-success col-sm-2 col-sm-offset-5" type="reset">重置</button>
            </form>
				</div>
				
						
				</div>	
							
			</div>
		</div>
		<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
	</body>

</html>