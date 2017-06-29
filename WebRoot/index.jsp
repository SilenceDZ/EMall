<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    <title>欢迎来到EMall！</title>
    <!--
            作者：offline
            时间：2017-06-15
            描述：Bootstrape,引用下载的Bootstrap文件
        -->
    <link href="css/bootstrap.min.css" rel="stylesheet" />
    <link href="css/commstyle.css" rel="stylesheet"/>
    
</head>

<body>
    <jsp:include page="comm/topNavbar.jsp"></jsp:include>
    <jsp:include page="comm/carousel.jsp"></jsp:include>
    <%@include file="comm/searchBar.jsp" %>
    <!-- 网页主体 -->
    <div class="container ">
        <div class="row">
        	<!--侧边栏-->
        	<div class="col-sm-3 col-md-2 col-md-offset-1 ">
            <h3>商品导航</h3>
            <ul class="nav nav-sidebar">
                <li>
                    <a data-toggle="collapse" href="#computer" aria-expanded="false" aria-controls="computer">
                        <span class="glyphicon glyphicon-shopping-cart" aria-hidden="false"></span>计算机</a>
                    <div class="collapse" id="computer">
                        <ul class="nav nav-sidebar-subitem ">
                            <li>
                                <a href="#">
                                    <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>戴尔</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>联想</a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li>
                    <a data-toggle="collapse" href="#book" aria-expanded="true" aria-controls="book">
                        <span class="glyphicon glyphicon-pencil " aria-hidden="true"></span>书籍</a>
                    <div class="collapse" id="book">
                        <ul class="nav nav-sidebar-subitem ">
                            <li>
                                <a href="#">
                                    <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>人文社科</a>
                            </li>
                            <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>经济管理</a></li>
                        </ul>
                    </div>
                </li>
                <li>
                    <a data-toggle="collapse" href="#messageManager" aria-expanded="false" aria-controls="messageManager">
                        <span class="glyphicon glyphicon-user" aria-hidden="true"></span>生活用品</a>
                    <div class="collapse" id="messageManager">
                        <ul class="nav nav-sidebar-subitem ">
                            <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>服饰</a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>家电</a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>家具</a></li>
                        </ul>
                    </div>
                </li>
                <li>
                    <a data-toggle="collapse" href="#orderManager" aria-expanded="false" aria-controls="orderManager">
                        <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>运动器械</a>
                    <div class="collapse" id="orderManager">
                        <ul class="nav nav-sidebar-subitem ">
                            <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>乒乓球</a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>羽毛球</a></li>
                            <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>健身</a></li>
                        </ul>
                    </div>
                </li>
            </ul>            
        </div><!--end侧边栏-->
        	
        	<!-- 网页内容商品信息 -->
            <div class="col-sm-8 col-md-8 ">
            	
            </div>
        </div><!-- end row -->
    </div><!-- end container -->
    
    <!-- 包含登录框 -->
    <jsp:include page="comm/login.jsp"></jsp:include>
    <!-- 通用提示框 -->
    <jsp:include page="comm/commMsgBox.jsp"></jsp:include>
    <div>
    <!--网页尾部 版权部分-->
    <%@ include file="comm/copyright.jsp" %>
    </div>
    
    
    
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>
