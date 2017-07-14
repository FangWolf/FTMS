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
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>提交工作 </strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="project_review.html">  
      
      <div class="form-group">
        <div class="label">
          <label>关税金额：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="title" data-validate="required:请输入关税金额" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>外汇汇率：</label>
        </div>
        <div class="field">
           <input type="tel" class="input w50" value="" name="title" data-validate="required:请输入外汇汇率" />
          <div class="tips"></div>
        </div>
      </div>
     
	     <div class="form-group">
	        <div class="label">
	          <label>描述信息：</label>
	        </div>
	          <div class="field">
	          <textarea name="content" class="input" style="height:450px; border:1px solid #ddd;"></textarea>
	          <div class="tips"></div>
	        </div>
	      </div>
     	
     	
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
</html>