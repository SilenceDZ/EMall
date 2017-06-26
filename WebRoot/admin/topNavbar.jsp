<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--
        	作者：offline
        	时间：2017-06-16
        	描述：导航条
        -->
    <nav class="navbar navbar-default  navbar-fixed-top" role="navigation">
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
                <h3 class="navbar-text " >EMall</h3>
            </div>
            <!--下面是导航栏的链接.当上面的自适应图标显示时-->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-left">
                    <li class="active">
                        <a href="#">首页<span class="sr-only"></span></a>
                    </li>   
                    <li >
                        <p class="navbar-text" id="usermsg">您好！<span id="username">管理员</span></p>
                    </li>                 
                </ul>                
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
</html>
