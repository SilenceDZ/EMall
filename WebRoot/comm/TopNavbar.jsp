<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--导航条-->
    <nav class="navbar navbar-default  " role="navigation" style="margin-bottom: 0px;">
        <div class="container">
            <!--container:此样式为把导航栏的连接居中,container-fluid:流布局-->
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <!--下面是自适应时,当屏幕右上角变小时会出现的一个图标按钮,是把导航条折叠之后的开启按钮-->
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">EShop</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <!--下面是导航栏的链接.当上面的自适应图标显示时-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav ">
                    <li >
                        <p class="navbar-text" id="usermsg">您好！欢迎来到EShop</p>
                    </li>
                    <li>
                        <a href="#" data-toggle="modal" data-target="#login">用户登录</a>
                    </li>
                    <li>
                        <a href="register.jsp">用户注册</a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">我的订单</a></li>
                    <li><a href="#">我的购物车</a></li>
                    <li><a href="#">个人中心</a></li>
                    <li><a href="#">联系客服</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
</html>
