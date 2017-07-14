<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
	<!--主界面-->
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder"> 项目管理</strong>
		</div>

		<!--添加 项目-->


		<!--表格-->
		<table class="table table-hover text-center">
			<tr>
				<th>序号</th>
				<th>内部编号</th>
				<th>购货方</th>
				<th>用户</th>
				<th>品名</th>
				<th>完结情况</th>
				<th>品牌类型</th>
				<th>备注</th>
				<th>操作</th>
			</tr>
			<s:iterator value="projects.project">
				<tr>
					<td>${p_id }</td>
					<td>${message }</td>
					<td>${viewCounts }</td>
					<td>${packNum }</td>
					<td>${dates }</td>
					<td>${friend.pickName }</td>
					<td>
						<div class="button-group">
							<a class="button border-main" href="project_desc.html"><span
								class="icon-bars"></span> 详情</a> <a class="button border-green"
								href="project_desc.html"><span class="icon-edit"></span> 修改</a>
						</div>
					</td>
				</tr>
			</s:iterator>
			<tr>
				<td>1234</td>
				<td>321</td>
				<td>格力空调引进</td>
				<td>2017-6-27</td>
				<td>已完成</td>
				<td>进口</td>
				<td>品牌A</td>
				<td>尾款待结算</td>
				<td><div class="button-group">
						<a class="button border-main" href="project_desc.html"><span
							class="icon-bars"></span> 详情</a> <a class="button border-green"
							href="project_desc.html"><span class="icon-edit"></span> 修改</a>
					</div></td>
			</tr>
			<tr>
				<td>11111234</td>
				<td>3211111</td>
				<td>格力空调卖出</td>
				<td>2017-6-27</td>
				<td>未完成</td>
				<td>出口</td>
				<td>品牌A</td>
				<td>已完成</td>
				<td>
					<div class="button-group">
						<a class="button border-main" href="project_desc.html"><span
							class="icon-bars"></span> 详情</a> <a class="button border-green"
							href="project_desc.html"><span class="icon-edit"></span> 修改</a>
					</div>
				</td>
			</tr>
			<!--分页-->
			<tr>
				<td colspan="12"><div class="pagelist">
						<a href="">上一页</a> <span class="current">1</span><a href="">2</a><a
							href="">3</a><a href="">下一页</a><a href="">尾页</a>
					</div></td>
			</tr>
		</table>
	</div>
</body>
</html>