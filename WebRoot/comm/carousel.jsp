<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--轮播组件-->
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="padding-top: -10px">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <!--这里是轮播组件下面的序列点,注意序列从0开始-->
            <!--里面的data-slide-to属性对应显示设置了class值为item的div-->
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>
        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="http://img.mukewang.com/5412ad400001e52014280484.jpg" alt="MacBook Air">
                <div class="carousel-caption">
                    <!--这里设置图片中的文字,可以添加标签去修饰-->
                    <p>11 英寸 MacBook Air 充电一次可运行长达 9 小时，而 13 英寸机型则可运行长达 12 小时。</p>
                </div>
            </div>
            <div class="item">
                <img src="http://img.mukewang.com/5412ad7c0001d2eb10880541.jpg" alt="Intel HD Graphics 5000">
                <div class="carousel-caption">
                    <p>无论是什么任务，配备 Intel HD Graphics 5000 图形处理器的第四代 Intel Core 处理器都能应对自如。</p>
                </div>
            </div>
            <div class="item">
                <img src="http://img.mukewang.com/5412ae5c0001653b12800644.jpg" alt="MacBook Air">
                <div class="carousel-caption">
                    <p>有了新一代 802.11ac 技术，MacBook Air 令 Wi-Fi 速度超越极限。</p>
                </div>
            </div>
        </div>
        <!-- Controls 左右的按键-->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="false"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="false"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <!--end 轮播组件-->
</html>

