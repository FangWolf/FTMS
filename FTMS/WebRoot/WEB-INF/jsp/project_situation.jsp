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
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<!--主界面-->
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 项目列表</strong></div>
  
  <!--表格-->
  <table class="table table-hover text-center">
    <tr>
			<th>档案号</th>
      <th>内部编号</th>
      <th>项目名称</th>
      <th>申报日期</th>
      <th>进度</th>
      <th>执行人</th>
      <th>负责人</th>
      <th width="10%">操作</th>
    </tr>
    <tr>
      <td>1234</td>
      <td>321</td>
      <td>格力空调引进</td>
      <td>2017-6-27</td>
      <td>正在清关</td>
      <td>李生</td>
      <td>尾款待结算</td>
      <td><div class="button-group"> <a class="button border-main" href="project_desc.html"><span class="icon-edit"></span> 详情</a> </div></td>
    </tr>
    <tr>
     <td>1234</td>
      <td>321</td>
      <td>格力空调引进</td>
      <td>2017-6-27</td>
      <td>已完成</td>
      <td>进口</td>
      <td>尾款待结算</td>
      <td><div class="button-group"> <a class="button border-main" href="project_desc.html"><span class="icon-edit"></span> 详情</a></div></td>
    </tr>
    
    <!--分页-->
      <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
  </table>
</div>

</body>
</html>