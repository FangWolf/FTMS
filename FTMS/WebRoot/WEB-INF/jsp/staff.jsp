<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>员工管理</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
	<form method="post" action="">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 员工管理</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search">
					<li><a class="button border-main icon-plus-square-o"
						href="User_add"> 添加员工</a></li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th>账号</th>
					<th>姓名</th>
					<th>电话</th>
					<th>上次登录IP</th>
					<th>上次登录时间</th>
					<th>权限</th>
					<th>备注</th>
					<th>操作</th>
				</tr>
				<s:iterator value="person" status="indexs">
					<tr>
						<td>${userName }</td>
						<td>${name }</td>
						<td>${phone }</td>
						<td>${loginIp }</td>
						<td>${loginTime }</td>
						<td>${role.name }</td>
						<td>${info }</td>
						<td>
							<div class="button-group">
								<a class="button border-red" href="javascript:void(0)" onclick="return del(${id})"><span class="icon-trash-o"></span>删除</a> 
								<a class="button border-blue" href="User_update?id=${id }"><span class="icon-edit"></span> 修改</a>
							</div>
						</td>
					</tr>
				</s:iterator>
				<tr>
					<td colspan="8"><div class="pagelist">
							<a href="">上一页</a> <span class="current">1</span><a href="">2</a><a
								href="">3</a><a href="">下一页</a><a href="">尾页</a>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</form>
		<script type="text/javascript">
			function del(id){
				if(confirm("您确定要删除吗?")){
					onclick=window.location="User_delById?id="+id;
				}
			}
		</script>
	</body>
</html>