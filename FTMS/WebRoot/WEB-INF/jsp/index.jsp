<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>后台管理中心</title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
	
<!--头部-->	
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1>河南易则鑫贸易有限公司业务信息管理中心</h1>
  </div>
  	<a href="Index_out" style="margin-top: 28px;margin-right: 5px; float: right; color: white;"> 退出登陆</a>
	<h2  style="margin-top: 22px;margin-right: 5px; float: right; color: white;">欢迎光临：${admins.name } &nbsp;</h2>
</div>

<!--菜单列表-->
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-pencil-square-o"></span>项目管理</h2>
  <ul style="display:block">
    <li><a href="Index_situation" target="right"><span class="icon-caret-right"></span>项目动态</a></li>
    <!--<li><a href="project_review.html" target="right"><span class="icon-caret-right"></span>立项审核</a></li>-->
    <li><a href="Index_my" target="right"><span class="icon-caret-right"></span>我的项目</a></li> 
  	<!--<li><a href="project_apply.html" target="right"><span class="icon-caret-right"></span>项目申请</a></li>-->
    <li><a href="Index_histry" target="right"><span class="icon-caret-right"></span>完结项目</a></li>  
    <li><a href="Index_manger" target="right"><span class="icon-caret-right"></span>项目管理</a></li>  
    <li><a href="Index_brand" target="right"><span class="icon-caret-right"></span>品牌管理</a></li>  
  </ul>   
  <h2><span class="icon-user"></span>基本设置</h2>
  <ul style="display:block">
    <li><a href="Index_staff" target="right"><span class="icon-caret-right"></span>员工管理</a></li>
    <li><a href="Index_person" target="right"><span class="icon-caret-right"></span>个人设置</a></li>
  </ul>  
</div>

<!--js点击效果-->
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>

<!--主界面-->
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="Index_situation" name="right" width="100%" height="99%"></iframe>
</div>

	<!--版权声明
	<div>
 		<center>
  			<p>
  				<font size="-1">Copyright&nbsp;&nbsp;© 2017. Designed by JiaQi. </font>
  				<br>
  				<font size="-1">Made In Zhengzhou University of Light Industry Software Collage.</font>
  			</p>
		</center>
	</div>
	-->
</body>
</html>