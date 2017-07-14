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
<div  class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>基本信息</strong></div>
  <div class="body-content">
  	
  	<!--系统主面板-->
  	<!--基本信息-->
      <div class="form-group">
        <div class="label">
          <label>档案号：</label>
        </div>
        <div class="field">
          <label>123456789</label>
          <div class="tips"></div>
        </div>
      </div>        
      <div class="form-group">
        <div class="label">
          <label>内部编号：</label>
        </div>
        <div class="field">
         <label>09873626</label>
        </div>
      </div>
            <div class="form-group">
        <div class="label">
          <label>完结情况：</label>
        </div>
        <div class="field">
         <label>已经完结</label>
        </div>
      </div>
            <div class="form-group">
        <div class="label">
          <label>备注：</label>
        </div>
        <div class="field">
         <label>尾款未结算</label>
        </div>
      </div>
      
      
      
      <div class="form-group">
        <div class="label">
          <label>外贸合同号：</label>
        </div>
        <div class="field">
         <label>111111234</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>内贸合同号：</label>
        </div>
        <div class="field">
         <label>000948493</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>购货方：</label>
        </div>
        <div class="field">
         <label>格力</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>商品名称：</label>
        </div>
        <div class="field">
         <label>格力GB123空调</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>型号：</label>
        </div>
        <div class="field">
         <label>家用型</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>数量：</label>
        </div>
        <div class="field">
         <label>1111台</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>外贸金额：</label>
        </div>
        <div class="field">
         <label>123456元</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>代理商价：</label>
        </div>
        <div class="field">
         <label>1234元</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>销售金额：</label>
        </div>
        <div class="field">
         <label>5234元</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>汇比：</label>
        </div>
        <div class="field">
         <label>0.012</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>清关口岸：</label>
        </div>
        <div class="field">
         <label>郑州航空港</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>HS编码：</label>
        </div>
        <div class="field">
         <label>HS466546</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>预计货期：</label>
        </div>
        <div class="field">
         <label>2017-09-12</label>
        </div>
      </div>
  </div>
</div>

<div  class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>投招标&办证</strong></div>
  <div class="body-content">
  	
  	<!--基本信息-->
      <div class="form-group">
        <div class="label">
          <label>招标编号：</label>
        </div>
        <div class="field">
          <label>123456789</label>
          <div class="tips"></div>
        </div>
      </div>        
      <div class="form-group">
        <div class="label">
          <label>招标业主：</label>
        </div>
        <div class="field">
         <label>李先生</label>
        </div>
      </div>
            <div class="form-group">
        <div class="label">
          <label>开标日期：</label>
        </div>
        <div class="field">
         <label>2017—12—31</label>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>中标日期：</label>
        </div>
        <div class="field">
         <label>2018—01—04</label>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>机电证编号：</label>
        </div>
        <div class="field">
         <label>JD134534534</label>
        </div>
      </div>
  </div>
</div>

<div  class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>银行和资金</strong></div>
  <div class="body-content">
  	
      	<!--收付款-->
      	<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>收付款</strong></div>
  				<div class="body-content">
  					 
  					 	  	<!--基本信息-->
			      <div class="form-group">
			        <div class="label">
			          <label>应收付款日期：</label>
			        </div>
			        <div class="field">
			          <label>2018-02-09</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      <div class="form-group">
			        <div class="label">
			          <label>应收付款金额：</label>
			        </div>
			        <div class="field">
			         <label>3541元</label>
			        </div>
			      </div>
			            <div class="form-group">
			        <div class="label">
			          <label>实际收付款日期：</label>
			        </div>
			        <div class="field">
			         <label>2017—12—31</label>
			        </div>
			      </div>
			      <div class="form-group">
			        <div class="label">
			          <label>实际收付款金额：</label>
			        </div>
			        <div class="field">
			         <label>4123元</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>收款合计：</label>
			        </div>
			        <div class="field">
			         <label>132元</label>
			        </div>
			      </div>
  					<div class="form-group">
			        <div class="label">
			          <label>尾款金额：</label>
			        </div>
			        <div class="field">
			         <label>11132元</label>
			        </div>
			      </div>
  					 
 				 	</div>
				</div>
				
				<!--信用证-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>信用证</strong></div>
  				<div class="body-content">
  					 
  					 	  	<!--基本信息-->
			      <div class="form-group">
			        <div class="label">
			          <label>信用证号：</label>
			        </div>
			        <div class="field">
			         <label>3541342</label>
			        </div>
			      </div>
			      <div class="form-group">
			        <div class="label">
			          <label>开证日期：</label>
			        </div>
			        <div class="field">
			         <label>2017—12—31</label>
			        </div>
			      </div>
			      <div class="form-group">
			        <div class="label">
			          <label>押汇类型：</label>
			        </div>
			        <div class="field">
			         <label>汇款</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>押汇币种：</label>
			        </div>
			        <div class="field">
			         <label>人民币</label>
			        </div>
			      </div>
			      
 				 	</div>
				</div>
				
				
				<!--付汇使用资金-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">付汇使用资金</span></strong></div>
  				<div class="body-content">
  					 	  	<!--基本信息-->
			      <div class="form-group">
			        <div class="label">
			          <label>付汇日期：</label>
			        </div>
			        <div class="field">
			          <label>2018-02-09</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      <div class="form-group">
			        <div class="label">
			          <label>付汇汇率：</label>
			        </div>
			        <div class="field">
			         <label>0.123</label>
			        </div>
			      </div>
			            <div class="form-group">
			        <div class="label">
			          <label>付汇美元：</label>
			        </div>
			        <div class="field">
			         <label>2934892</label>
			        </div>
			      </div>
			      <div class="form-group">
			        <div class="label">
			          <label>折合人名币金额：</label>
			        </div>
			        <div class="field">
			         <label>132323</label>
			        </div>
			      </div>
 				 	</div>
				</div>
				
				<!--进口交税情况-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">进口交税情况</span></strong></div>
  				<div class="body-content">
  					 	  	<!--基本信息-->
			      <div class="form-group">
			        <div class="label">
			          <label>交税日期：</label>
			        </div>
			        <div class="field">
			          <label>2018-02-09</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      <div class="form-group">
			        <div class="label">
			          <label>关税金额：</label>
			        </div>
			        <div class="field">
			         <label>323123</label>
			        </div>
			      </div>
			            <div class="form-group">
			        <div class="label">
			          <label>消费税金额：</label>
			        </div>
			        <div class="field">
			         <label>2934892</label>
			        </div>
			      </div>
			      <div class="form-group">
			        <div class="label">
			          <label>增值税金额：</label>
			        </div>
			        <div class="field">
			         <label>132323</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>回票日期：</label>
			        </div>
			        <div class="field">
			         <label>20117-12-23</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>报关单：</label>
			        </div>
			        <div class="field">
			         <label><a href="#">查看详情</a></label>
			        </div>
			      </div>
 				 	</div>
				</div>
				
				
				<!--内贸采购-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">内贸采购</span></strong></div>
  				<div class="body-content">
			      <div class="form-group">
			        <div class="label">
			          <label>采购日期：</label>
			        </div>
			        <div class="field">
			          <label>2018-02-09</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      <div class="form-group">
			        <div class="label">
			          <label>单位回票：</label>
			        </div>
			        <div class="field">
			         <label><a href="#">查看详情</a></label>
			        </div>
			      </div>
 				 	</div>
				</div>
				
				<!--发票开局情况-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">发票开局情况</span></strong></div>
  				<div class="body-content">
			      <div class="form-group">
			        <div class="label">
			          <label>发票日期：</label>
			        </div>
			        <div class="field">
			          <label>2018-02-09</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      <div class="form-group">
			        <div class="label">
			          <label>发票金额：</label>
			        </div>
			        <div class="field">
			         <label>112323</label>
			        </div>
			      </div>
 				 	</div>
				</div>
				
				<!--直接费用明细情况-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">直接费用明细情况</span></strong></div>
  				<div class="body-content">
			      <div class="form-group">
			        <div class="label">
			          <label>开证/电汇费：</label>
			        </div>
			        <div class="field">
			          <label>21232434</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      <div class="form-group">
			        <div class="label">
			          <label>清关杂项：</label>
			        </div>
			        <div class="field">
			         <label>杂项信息</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>商检费：</label>
			        </div>
			        <div class="field">
			         <label>24243</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>仓储费：</label>
			        </div>
			        <div class="field">
			         <label>3254</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>招标费：</label>
			        </div>
			        <div class="field">
			         <label>4534</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>服务费：</label>
			        </div>
			        <div class="field">
			         <label>45343</label>
			        </div>
			      </div>
			      
 				 	</div>
				</div>
				
				<!--货物库存情况-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">货物库存情况</span></strong></div>
  				<div class="body-content">
			      <div class="form-group">
			        <div class="label">
			          <label>入库时间：</label>
			        </div>
			        <div class="field">
			          <label>2017-03-24</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      <div class="form-group">
			        <div class="label">
			          <label>出库时间：</label>
			        </div>
			        <div class="field">
			         <label>2017-08-03</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>仓库地址：</label>
			        </div>
			        <div class="field">
			         <label>仓库码头</label>
			        </div>
			      </div>
			      
			      <div class="form-group">
			        <div class="label">
			          <label>联系电话：</label>
			        </div>
			        <div class="field">
			         <label>159000000000</label>
			        </div>
			      </div>
 				 	</div>
				</div>
				
				<!--发票开具情况-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">货物库存情况</span></strong></div>
  				<div class="body-content">
			      <div class="form-group">
			        <div class="label">
			          <label>发票日期：</label>
			        </div>
			        <div class="field">
			          <label>2017-03-24</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      
			      <div class="form-group">
			        <div class="label">
			          <label>发票金额：</label>
			        </div>
			        <div class="field">
			         <label>159324</label>
			        </div>
			      </div>
 				 	</div>
				</div>
				
				<!--商检信息-->
				<div  class="panel admin-panel margin-top">
  				<div class="panel-head" id="add"><strong><span class="icon-pencil-square-o">商检信息</span></strong></div>
  				<div class="body-content">
			      <div class="form-group">
			        <div class="label">
			          <label>报检/分局：</label>
			        </div>
			        <div class="field">
			          <label>上海质检分局</label>
			          <div class="tips"></div>
			        </div>
			      </div>        
			      
			      <div class="form-group">
			        <div class="label">
			          <label>验收出证：</label>
			        </div>
			        <div class="field">
			         <label><a href="#">查看详情</a></label>
			        </div>
			      </div>
 				 	</div>
				</div>
				
				
  </div>
</div>


</body></html>