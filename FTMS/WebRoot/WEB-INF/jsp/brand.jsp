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
  <div class="panel-head"><strong class="icon-reorder"> 品牌管理</strong></div>
  <!--添加品牌-->
      <div class="padding border-bottom">
      <ul class="search">
        <li>
          <a class="button border-main icon-plus-square-o" href="person_add.html"> 添加品牌</a>
        </li>
      </ul>
    </div>
  
  <!--表格-->
  <table class="table table-hover text-center">
    <tr>
      <th>品牌名称</th>
      <th>品牌负责人</th>
      <th>项目数</th>
      <th>创建日期</th>
      <th>备注</th>
      <th>操作</th>
    </tr>
    <tr>
      <td>1234</td>
      <td>321</td>
      <td>格力空调引进</td>
      <td>2017-6-27</td>
      <td>已完成</td>
      <td>
      	<div class="button-group"> 
      		<a class="button border-red" href="javascript:void(0)" onclick="return del(1)"><span class="icon-trash-o"></span> 删除</a> 
      		<a class="button border-main" href="project_desc.html"><span class="icon-edit"></span> 修改</a> 
      		<a class="button border-green" href="project_desc.html"><span class="icon-edit"></span> 项目</a> 
      	</div>
      </td>
    </tr>
    
    <!--分页-->
      <tr>
        <td colspan="8"><div class="pagelist"> <a href="">上一页</a> <span class="current">1</span><a href="">2</a><a href="">3</a><a href="">下一页</a><a href="">尾页</a> </div></td>
      </tr>
  </table>
</div>

<!--删除提示-->
<script type="text/javascript">
function del(id){
	if(confirm("您确定要删除吗?")){
		
	}
}
</script>
</body>
</html>