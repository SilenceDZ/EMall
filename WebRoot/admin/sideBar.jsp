<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <!--“col-sm-offset-2 col-sm-10”的意思就是当前div往右偏移col-sm-2，然后再占位col-sm-10。-->
            <div class="col-sm-3 col-md-2 sidebar ">
                <!--左侧管理栏-->
                <ul class="nav nav-sidebar">
                    <li class="active">
                        <a href="index.jsp" class="active">首页<span class="sr-only">(current)</span></a>
                    </li>
                </ul>
                <ul class="nav nav-sidebar">
                    <li>
                        <a data-toggle="collapse" href="#commodityManager" aria-expanded="false" aria-controls="commodityManager">
                            <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>商品管理</a>
                        <div class="collapse" id="commodityManager">
                            <ul class="nav nav-sidebar-subitem ">
                                <li>
                                    <a href="commodityMana.jsp">
                                        <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>商品类别管理</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>商品信息管理</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>添加商品</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>添加商品类别</a>
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
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>添加用户</a></li>
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
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>订单信息管理</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>修改订单信息</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>订单信息</a></li>
                                <li><a href="#"><span class="glyphicon glyphicon-triangle-right" aria-hidden="true"></span>订单审核</a></li>
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
            
</html>

