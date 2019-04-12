<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>供货商药品目录添加查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

 var gysypmladd = function(){
	//_confirm询问是否继续操作？
	_confirm('您确定要將选择药品添加至药品目录吗?',null,
	//执行添加函数
	  function(){
		//定义一个数组，准备存放选中行的序号
		var indexs=[];
		//获取数据列表中所有选中的行(数组)
		var rows = dataGrid_obj.datagrid('getSelections');
		//便利所有选中的行
		for(var i=0;i<rows.length;i++){
			
			//alert(dataGrid_obj.datagrid('getRowIndex',rows[i]));
			//将返回的选中行的序号加到indexs数组中
			var index = dataGrid_obj.datagrid('getRowIndex',rows[i]);//选中行的下标
			//将选中行的序号设置到数组indexs中
			indexs.push(index);
			//alert(dataGrid_obj.datagrid('getRowIndex',rows[i]));
		}
		//判断如果存在选中的行，indexs数组里边有选中行的序号
		if(rows.length>0){//如果存在选中的行则将indexs数组中的序号格式化为逗号分隔的并赋给indexs控件
			
			$("#indexs").val(indexs.join(","));//将indexs数组的元素在中间加逗号拼接成一个字符串
		    //提交form，提交数据包括药品信息id(每条记录都 有)，indexs（hidden）
			jquerySubByFId('gysypmladdqueryForm',gysypmladd_callback, null);
		}else{
			//如果没有选中行则提示
			alert_warn("请选择要添加的药品");
		}
		
	  } 
	  
	)
	
	
	
}; 



function gysypmladd_callback(data) {
	//message_alert(data);
	//改为可以提示错误信息明细
	var result = getCallbackData(data);
	_alert(result);//输出信息
	
	
	//刷新页面重新查询
	gysypmladdquery();
	
	//添加刷新父窗口代码
	parent.gysypmlquery();
}


//工具栏

var toolbar = [ {
	id : 'gysypmladd',
	text : '确认添加',
	iconCls : 'icon-add',
	handler : gysypmladd
	}];

var frozenColumns;

var columns = [ [{
	field : 'check',
	title : '选择',
	checkbox : true//显示成checkbox
},{
	field : 'id',
	hidden:true,
	formatter:function(value, row, index){//index是每行的序号,ypxxCustoms是action中接收的list集合对象名称，id是list中对象的属性名
		return '<input type="hidden" name="ypxxCustoms['+index+'].id" value="'+value+'" />';
	}
},{
	field : 'bm',
	title : '流水号',
	width : 80
},{
	field : 'mc',
	title : '通用名',
	width : 130
},{
	field : 'jx',
	title : '剂型',
	width : 80
},{
	field : 'gg',
	title : '规格',
	width : 100
},{
	field : 'zhxs',
	title : '转换系数',
	width : 50
},{
	field : 'scqymc',
	title : '生产企业',
	width : 180
},{
	field : 'spmc',
	title : '商品名称',
	width : 150
},{
	field : 'zbjg',
	title : '中标价',
	width : 50
},{
	field : 'jyztmc',
	title : '交易状态',
	width : 60
}
]];

var dataGrid_obj;//datagrid的对象


	$(function() {
		dataGrid_obj = $('#gysypmladdlist');
		
		dataGrid_obj.datagrid({
			title : '供应药品列表',
			//nowrap : false,
			striped : true,
			//collapsible : true,
			url : '${baseurl}ypml/queryaddgysypml_result.action',
			//sortName : 'code',
			//sortOrder : 'desc',
			//remoteSort : false,
			idField : 'id',//结果集主键,设置错误影响获取选中行的操作，比如getSelections执行
			//frozenColumns : frozenColumns,
			columns : columns,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg:"",
			pageList:[15,30,50,100],
			//点击行时取消选中行，因为jqueryeasyui在点击行的时候默认选中行
			 onClickRow : function(index, field, value) {
				dataGrid_obj.datagrid('unselectRow', index);
			}, 
			//当加载成功时：清除所有选中的行，解决分页数据传到action为-1问题
			onLoadSuccess:function(){
				dataGrid_obj.datagrid('clearSelections');
			} 
			});
		
	});

	function gysypmladdquery() {
 
		var formdata = $("#gysypmladdqueryForm").serializeJson();
		//alert(formdata);
		//取消所有选中的 行
		dataGrid_obj.datagrid('unselectAll'); 
		dataGrid_obj.datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>
<div id="ypxxquery_div">
    <form id="gysypmladdqueryForm" name="gysypmladdqueryForm" action="${baseurl}ypml/addgysypmlsubmit.action" method="post">
			<!-- indexs中存储就是选中的行的序号中间以逗号分隔 -->
			<input type="hidden" name="indexs" id="indexs" />
			<TABLE  class="table_search">
				<TBODY>
					<TR>
						
						<TD class="left">通用名：</td>
						<td><INPUT type="text"  name="ypxxCustom.mc" /></TD>
						<TD class="left">剂型：</TD>
						<td ><INPUT type="text" name="ypxxCustom.jx" /></td>
						<TD class="left">规格：</TD>
						<td ><INPUT type="text" name="ypxxCustom.gg" /></td>
						<TD class="left">转换系数：</TD>
						<td ><INPUT type="text" name="ypxxCustom.zhxs" /></td>
					</TR>
					<TR>
						<TD class="left">流水号：</TD>
						<td ><INPUT type="text" name="ypxxCustom.bm" /></td>
						<TD class="left">生产企业：</TD>
						<td ><INPUT type="text" name="ypxxCustom.scqymc" /></td>
						<TD class="left">商品名称：</TD>
						<td ><INPUT type="text" name="ypxxCustom.spmc" /></td>
						 <td class="left">价格范围：</td>
				  		<td>
				      		<INPUT id="ypxxCustom.zbjglower" name="ypxxCustom.zbjglower" style="width:70px"/>
							至
							<INPUT id="ypxxCustom.zbjgupper" name="ypxxCustom.zbjgupper" style="width:70px"/>
							
				 		 </td>
					</tr>
					<tr>
					  
						<TD class="left">药品类别：</TD>
						<td >
							<select id="ypxxCustom.lb" name="ypxxCustom.lb" style="width:150px">
								<option value="">全部</option>
								<c:forEach items="${yplblist}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
							</select>
						</td>
						<TD class="left">交易状态：</TD>
						<td >
							<select id="ypxxCustom.jyzt" name="ypxxCustom.jyzt" style="width:150px">
								<option value="">全部</option>
								<c:forEach items="${jyztlist}" var="value">
									<option value="${value.dictcode}">${value.info}</option>
								</c:forEach>
							</select>
							
						</td>
						
				 		 <td class="left" height="25">质量层次：</td>
				  		<td>
				  		<select id="ypxxCustom.zlcc" name="ypxxCustom.zlcc" style="width:150px">
								<option value="">全部</option>
								<c:forEach items="${zlcclist}" var="value">
									<option value="${value.id}">${value.info}</option>
								</c:forEach>
						</select>
					
				  		</td>
				  		<td colspan=2>
						<a id="btn" href="#" onclick="gysypmladdquery()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
	    
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="gysypmladdlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		</form>
	</div>

</BODY>
</HTML>

