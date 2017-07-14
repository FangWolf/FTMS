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
<title>个人管理</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 个人设置</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="User_userUpdate">
    <input name="id" value="${user.id }" type="hidden">
      <div class="form-group">
        <div class="label">
          <label for="sitename">帐号：</label>
        </div>
        <div class="label">
          <label for="sitename">${user.userName }</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">姓名：</label>
        </div>
        <div class="label">
          <label for="sitename">${user.name }</label>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>电话：</label>
        </div>
        <div class="field">
           <input type="tel" class="input w50" value="${user.phone }" name="phone" data-validate="required:请输入电话" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>密码：</label>
        </div>
        <div class="field">
           <input type="password" class="input w50" value="${user.password }" name="password" data-validate="required:请输入初始密码" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
           <input type="text" class="input w50" value="${user.info }" name="info" data-validate="required:请输入员工备注" />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>员工类型：</label>
        </div>
        <div class="field">
          <select name="" class="input" onchange="changesearch()"  style="width:100px; line-height:17px;display:inline-block">
            <option value="">立项人</option>
            <option value="">招标人</option>
            <option value="">商务厅人</option>
            <option value="">银行人</option>
            <option value="">清关人</option>
            <option value="">商检人</option>
            <option value="">保险人</option>
          </select>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit">确认修改</button>   
        </div>
      </div>      
    </form>
  </div>
</div>
</body>
</html>