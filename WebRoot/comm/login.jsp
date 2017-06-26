<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--登录框-->
    <div class="modal fade" id="login" name="userlogin">
        <div class="modal-dialog">
            <div class="modal-content">
                <!--上面3个div实现了弹出框的遮罩效果和中间内容效果-->
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                    </button>
                    <h4 class="modal-title">用户登录</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal"  action="">
                        <div class="form-group ">
                            <label for="username" class="control-label col-sm-2">用户名</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="Username" name="username" placeholder="Username">
                            </div>
                        </div>
                        <div class="form-group ">
                            <label for="pwd" class="control-label col-sm-2">密码</label>
                            <div class="col-sm-10">
                                <input type="password" class="form-control" id="Pwd" name="password" placeholder="Password">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="checkcode" class="control-label col-sm-2">检验码</label>
                            <div class="col-sm-10">
                                <input type="text" class="form-control" id="checkcode" name="checkcode">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <!--data-dismiss="modal" 点击是关闭这个弹出框-->
                    <p class="text-center">
                        <button type="submit" class="btn btn-success" data-dismiss="modal">登录</button>
                    </p>
                </div>
            </div>
        </div>
    </div>
</html>

