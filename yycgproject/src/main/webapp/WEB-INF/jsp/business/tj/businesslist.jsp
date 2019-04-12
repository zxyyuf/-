<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>交易明细查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">



//工具栏

var toolbar = [ /*{
	id : 'resultexport',
	text : '导出',
	iconCls : 'icon-add',
	handler : resultexport
	}*/ ];

var frozenColumns;

var columns = [ [
 {
	field : 'useryymc',
	title : '医院名称',
	width : 100,
	formatter:function (value,row,index){
		//如果从json中取不出useryymc则显示成总计两个字
		if(value){
			return value;
		}else{
			return "总计";
		}
	}  

},{
	field : 'yycgdbm',
	title : '采购单号',
	width : 80
}, {
	field : 'usergysmc',
	title : '供货商',
	width : 100
},{
	field : 'bm',
	title : '流水号',
	width : 50
},{
	field : 'mc',
	title : '通用名',
	width : 100
},{
	field : 'jx',
	title : '剂型',
	width : 70
},{
	field : 'gg',
	title : '规格',
	width : 70
},{
	field : 'zhxs',
	title : '转换系数',
	width : 30
},{
	field : 'jyjg',
	title : '交易价',
	width : 50
},{
	field : 'cgl',
	title : '采购量',
	width : 50,
	formatter:function(value,row,index){
		if(row.id){//如果有药品信息id表示不是总计行
			return '<input type="text" name="yycgdmxCustoms['+index+'].cgl" value="'+(value?value:"")+'" />';
		}else{
			return value;
		}
		//return '<input type="text" name="yycgdmxCustoms['+index+'].cgl" value="'+(value?value:"")+'" />';  
	}
},{
	field : 'cgje',
	title : '采购金额',
	width : 50
},{
	field : 'rkl',
	title : '入库量',
	width : 50
},{
	field : 'rkje',
	title : '入库金额',
	width : 50
},{
	field : 'thl',
	title : '退货量',
	width : 50
},{
	field : 'thje',
	title : '退货金额',
	width : 50
},{
	field : 'jsl',
	title : '结算量',
	width : 50
},{
	field : 'jsje',
	title : '结算金额',
	width : 50
},{
	field : 'cgztmc',
	title : '采购状态',
	width : 50
}]];

function initGrid(){
	
	
	$('#businesslist').datagrid({
		title : '交易明细',
		//nowrap : false,
		showFooter:true,//是否显示列表尾部区域
		striped : true,
		//collapsible : true,
		url : '${baseurl}/tj/businesslist_result.action',
		queryParams:{
			year:'${year}'
		},
		//sortName : 'code',
		//sortOrder : 'desc',
		//remoteSort : false,
		idField : 'yycgdmxid',//采购药品明细id
		//frozenColumns : frozenColumns,
		columns : columns,
		autoRowHeight:true,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100],
		onClickRow : function(index, field, value) {
					$('#businesslist').datagrid('unselectRow', index);
				}
		});

	}
	$(function() {
		initGrid();
		
	});

	function businesslistquery() {
		var formdata = $("#businesslistForm").serializeJson();
		//alert(formdata);
		$('#businesslist').datagrid('unselectAll');
		$('#businesslist').datagrid('load', formdata);
	}
	$(function(){
		//加载年
		businessyearlist('year');
		//加载采购状态
		getDictinfoCodelist('011','yycgdmxCustom_cgzt');
	});
</script>
</HEAD>
<BODY>
    <form id="businesslistForm" name="businesslistForm" method="post" >
			<input type="hidden" name="indexs" id="indexs" />
			<TABLE  class="table_search">
				<TBODY>
					<TR>
						<TD class="left">年份(如2019)：</TD>
						<td >
						<select id="year" name="year">
						
						</select>
						</td>
						<TD class="left">医院名称：</TD>
						<td ><INPUT type="text" name="useryyCustom.mc" /></td>
						<TD class="left">供货商：</TD>
						<td ><INPUT type="text" name="usergysCustom.mc" /></td>
						<TD class="left">采购单号：</td>
						<td><INPUT type="text"  name="yycgdCustom.bm" /></TD>
						
						
					</TR>
					<TR>
					   <TD class="left">流水号：</TD>
						<td ><INPUT type="text" name="ypxxCustom.bm" /></td>
					   <TD class="left">通用名：</td>
					    <td><INPUT type="text"  name="ypxxCustom.mc" />
						 </TD>
						<TD class="left">采购时间：</TD>
						<td >
						 <INPUT id="yycgdCustom.cjtime_start"
							name="yycgdCustom.cjtime_start" 
							 onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})" style="width:80px"/>--
					 <INPUT id="yycgdCustom.cjtime_end" 
							name="yycgdCustom.cjtime_end"
							 onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})" style="width:80px"/>
							
						</td>
						<TD class="left">采购状态：</TD>
						<td >
							<select id="yycgdmxCustom_cgzt" name="yycgdmxCustom.cgzt" style="width:150px">
							
							</select>
							<a id="btn" href="#" onclick="businesslistquery()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
							
						</td>
						
						
					</tr>
					
					
				</TBODY>
			</TABLE>
	   
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="businesslist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		 </form>

</BODY>
</HTML>

