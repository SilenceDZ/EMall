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
    <!--
        	作者：offline
        	时间：2017-06-16
        	描述：导航条
        -->
    <nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container-fluid ">
            <!--.container （固定宽度）或 .container-fluid （100% 宽度）-->
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <!--下面是自适应时,当屏幕右上角变小时会出现的一个图标按钮,是把导航条折叠之后的开启按钮-->
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">EMall</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <!--下面是导航栏的链接.当上面的自适应图标显示时-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li class="active">
                        <a href="#">首页<span class="sr-only"></span></a>
                    </li>                    
                </ul>                
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    <!--
        	作者：offline
        	时间：2017-06-16
        	描述：自适应布局
        -->
    <div class="container-fluid">
        <div class="row">
            <!--“col-sm-offset-2 col-sm-10”的意思就是当前div往右偏移col-sm-2，然后再占位col-sm-10。-->
            <div class="col-sm-3 col-md-2 sidebar ">
                <!--左侧管理栏-->
                <ul class="nav nav-sidebar">
                    <li class="active">
                        <a href="#" class="active">首页<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
                <ul class="nav nav-sidebar">
                    <li>
                        <a data-toggle="collapse" href="#commodityManager" aria-expanded="false" aria-controls="commodityManager">
                            <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>商品管理</a>
                        <div class="collapse" id="commodityManager">
                            <ul class="nav nav-sidebar-subitem ">
                                <li>
                                    <a href="#">
                                        <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>商品类别管理</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>商品信息管理</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a data-toggle="collapse" href="#userManager" aria-expanded="false" aria-controls="userManager">
                            <span class="glyphicon glyphicon-pencil " aria-hidden="true"></span>用户管理</a>
                        <div class="collapse" id="userManager">
                            <ul class="nav nav-sidebar-subitem ">
                                <li>
                                    <a href="#">
                                        <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>注册用户管理</a>
                                </li>
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>系统用户管理</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a data-toggle="collapse" href="#messageManager" aria-expanded="false" aria-controls="messageManager">
                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span>个人资料管理</a>
                        <div class="collapse" id="messageManager">
                            <ul class="nav nav-sidebar-subitem ">
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>显示个人资料</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>个人资料修改</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>密码修改</a></li>
                            </ul>
                        </div>
                    </li>
                    <li>
                        <a data-toggle="collapse" href="#orderManager" aria-expanded="false" aria-controls="orderManager">
                            <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>订单管理</a>
                        <div class="collapse" id="orderManager">
                            <ul class="nav nav-sidebar-subitem ">
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>订单管理</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
                <ul class="nav nav-sidebar">
                    <li>
                        <a href="#"><span class="glyphicon glyphicon-off" aria-hidden="true"></span>安全退出</a>
                    </li>
                </ul>
            </div>
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2  main msgright">
                <!--右侧信息栏-->
                <h1 class="page-header" id="pageName">管理控制台首页</h1>
                <!--
                	作者：offline
                	时间：2017-06-16
                	描述：第一行面板
                -->
                <div class="row">
                    <div class="col-md-6 ">
                        <div class="panel panel-primary" ">
                            <div class="panel-heading">
                                <h3 class="panel-title">最新提醒</h3></div>
                            <div class="panel-body">
                                <div class="alert alert-warning alert-dismissible" role="alert">
                                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <strong>Warning!</strong> Better check yourself, you're not looking too good.
                                </div>
                                <div class="alert alert-success"><strong>提示:</strong>您的订单（2014001）已经审批通过！</div>
                                <div class="alert alert-danger"><strong>提示:</strong>您的订单（2014002）被打回！</div>
                                <div class="alert alert-warning"><strong>提示:</strong>您的订单（2013001）客户付款延迟！</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">最新订单</h3></div>
                            <div class="panel-body">
                                <table class="table table-striped">
                                    <tr>
                                        <th>#</th>
                                        <th>产品</th>
                                        <th>数量</th>
                                        <th>总金额</th>
                                        <th>业务员</th>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>Apple Macbook air</td>
                                        <td>10</td>
                                        <td>80000</td>
                                        <td>王小贱</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Apple iPad air</td>
                                        <td>20</td>
                                        <td>65000</td>
                                        <td>尹开花</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Apple Macbok pro</td>
                                        <td>5</td>
                                        <td>50000</td>
                                        <td>刘老根</td>
                                    </tr>
                                </table>
                                <p>
                                    <a class="btn btn-primary" href="#" role="button">查看详情&raquo;</a>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
      <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
      <script type="text/javascript" src="../js/bootstrap.min.js"></script>
</body>

</html>


