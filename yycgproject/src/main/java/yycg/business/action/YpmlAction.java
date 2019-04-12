package yycg.business.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yycg.base.pojo.po.Dictinfo;
import yycg.base.pojo.vo.ActiveUser;
import yycg.base.pojo.vo.PageQuery;
import yycg.base.process.context.Config;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.process.result.ExceptionResultInfo;
import yycg.base.process.result.ResultInfo;
import yycg.base.process.result.ResultUtil;
import yycg.base.process.result.SubmitResultInfo;
import yycg.base.service.SystemConfigService;
import yycg.business.pojo.po.GysypmlControl;
import yycg.business.pojo.vo.GysypmlCustom;
import yycg.business.pojo.vo.GysypmlQueryVo;
import yycg.business.pojo.vo.YpxxCustom;
import yycg.business.service.YpmlService;

/**
 * 
 * 供货商药品目录
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/ypml")
public class YpmlAction {
	@Autowired
	private YpmlService ypmlService;
	
	@Autowired
	private SystemConfigService systemConfigService;
	//查询页面
	@RequestMapping("/querygysypml")
	public String querygysypml(Model model)throws Exception{
		//药品类别
		List<Dictinfo> yplblist=systemConfigService.findDictinfoByType("001");
		model.addAttribute("yplblist", yplblist);
		
		//交易状态
		List<Dictinfo> jyztlist=systemConfigService.findDictinfoByType("003");
		model.addAttribute("jyztlist", jyztlist);
		
		//质量层次
		List<Dictinfo> zlcclist=systemConfigService.findDictinfoByType("004");
		model.addAttribute("zlcclist", zlcclist);
		
		//供货状态
		List<Dictinfo> controllist=systemConfigService.findDictinfoByType("008");
		model.addAttribute("controllist", controllist);
		
		return "/business/ypml/querygysypml";
	}
	//查询结果集展示,json数据
	@RequestMapping("/querygysypml_result")
	public @ResponseBody DataGridResultInfo querygysypml_result(HttpSession session,
			GysypmlQueryVo gysypmlQueryVo,
			int page,
			int rows)throws Exception{
		//当前用户
		ActiveUser activeUser=(ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
		//用户所属的单位
		String usergysId=activeUser.getSysid();//单位id
		//列表总数
		int total=ypmlService.findGysypmlCount(usergysId, gysypmlQueryVo);
		//分页参数
		PageQuery pageQuery=new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		gysypmlQueryVo.setPageQuery(pageQuery);//设置分页参数
		
		//分页查询列表
		List<GysypmlCustom> list=ypmlService.findGysypmlList(usergysId, gysypmlQueryVo);
		
		
		
		DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	
	//查询页面
		@RequestMapping("/queryaddgysypml")
		public String queryaddgysypml(Model model)throws Exception{
			
			//药品类别
			List<Dictinfo> yplblist=systemConfigService.findDictinfoByType("001");
			model.addAttribute("yplblist", yplblist);
			
			//交易状态
			List<Dictinfo> jyztlist=systemConfigService.findDictinfoByType("003");
			model.addAttribute("jyztlist", jyztlist);
			
			//质量层次
			List<Dictinfo> zlcclist=systemConfigService.findDictinfoByType("004");
			model.addAttribute("zlcclist", zlcclist);
			return "/business/ypml/queryaddgysypml";
		}
		//查询结果集展示,json数据
		@RequestMapping("/queryaddgysypml_result")
		public @ResponseBody DataGridResultInfo queryaddgysypml_result(HttpSession session,
				GysypmlQueryVo gysypmlQueryVo,
				int page,
				int rows)throws Exception{
			//当前用户
			ActiveUser activeUser=(ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
			//用户所属的单位
			String usergysId=activeUser.getSysid();//单位id
			//列表总数
			int total=ypmlService.findAddGysypmlCount(usergysId, gysypmlQueryVo);
			//分页参数
			PageQuery pageQuery=new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			gysypmlQueryVo.setPageQuery(pageQuery);//设置分页参数
			
			//分页查询列表
			List<GysypmlCustom> list=ypmlService.findAddGysypmlList(usergysId, gysypmlQueryVo);
			
			
			
			DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
			dataGridResultInfo.setTotal(total);
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
		
		//供货商药品目录添加提交
		@RequestMapping("/addgysypmlsubmit")
		public @ResponseBody SubmitResultInfo addgysypmlsubmit(
			HttpSession session,	
			int[] indexs,//接收页面选中的行序号
			GysypmlQueryVo gysypmlQueryVo)throws Exception{
			ActiveUser activeUser=(ActiveUser)session.getAttribute(Config.ACTIVEUSER_KEY);
			
			//供货商的id
			String usergysid=activeUser.getSysid();
			//要处理的数据总数
			int total=indexs.length;
			
			//页面提交的数据(多个),要处理的业务数据
			List<YpxxCustom> list=gysypmlQueryVo.getYpxxCustoms();
			
			//处理成功的数目
			int count_sucess=0;
			//处理失败的数目
			int count_error=0;
			//处理失败的原因
			List<ResultInfo> msg_error=new ArrayList<ResultInfo>();
			for(int i=0;i<total;i++){
				ResultInfo resultInfo=null;
				
				//根据选中行的序号获取要处理的业务数据(单个)
				YpxxCustom ypxxCustom=list.get(indexs[i]);
				String ypxxid=ypxxCustom.getId();
				try{
					ypmlService.insertGysypml(usergysid, ypxxid);
				}catch(Exception e){
					e.printStackTrace();
					//进行异常解析
					if(e instanceof ExceptionResultInfo){
						resultInfo=((ExceptionResultInfo)e).getResultInfo();
					}else{
						//构造未知错误异常
						resultInfo=ResultUtil.createFail(Config.MESSAGE, 900, null);
					}
						
				}
				//如果出现异常,则说明处理失败
				if(resultInfo==null){
					//说明成功
					count_sucess++;
				}else{
					count_error++;
					msg_error.add(resultInfo);
					
				}
			}
			
			//return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[]{count_sucess,count_error}));
	
			//改成返回详细信息
			return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[]{
					count_sucess,
					count_error
			}), msg_error);
		
		}
		
		//供货商药品目录删除
		@RequestMapping("/deletegysypmlsubmit")
		public @ResponseBody SubmitResultInfo deletegysypmlsubmit(
			HttpSession session,	
			int[] indexs,//接收页面选中的行序号
			GysypmlQueryVo gysypmlQueryVo)throws Exception{
			ActiveUser activeUser=(ActiveUser)session.getAttribute(Config.ACTIVEUSER_KEY);
					
					//供货商的id
					String usergysid=activeUser.getSysid();
					//要处理的数据总数
					int total=indexs.length;
					
					//页面提交的数据(多个),要处理的业务数据
					List<YpxxCustom> list=gysypmlQueryVo.getYpxxCustoms();
					
					//处理成功的数目
					int count_sucess=0;
					//处理失败的数目
					int count_error=0;
					//处理失败的原因
					List<ResultInfo> msg_error=new ArrayList<ResultInfo>();
					for(int i=0;i<total;i++){
						ResultInfo resultInfo=null;
						
						//根据选中行的序号获取要处理的业务数据(单个)
						YpxxCustom ypxxCustom=list.get(indexs[i]);
						String ypxxid=ypxxCustom.getId();
						try{
							ypmlService.deleteGysypml(usergysid, ypxxid);
						}catch(Exception e){
							e.printStackTrace();
							//进行异常解析
							if(e instanceof ExceptionResultInfo){
								resultInfo=((ExceptionResultInfo)e).getResultInfo();
							}else{
								//构造未知错误异常
								resultInfo=ResultUtil.createFail(Config.MESSAGE, 900, null);
							}
								
						}
						//如果出现异常,则说明处理失败
						if(resultInfo==null){
							//说明成功
							count_sucess++;
						}else{
							count_error++;
							msg_error.add(resultInfo);
							
						}
					}
					
					
					//改成返回详细信息
					return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[]{
							count_sucess,
							count_error
					}), msg_error);
				
				}
		
		//供货商药品目录控制表查询页面
				@RequestMapping("/querygysypmlcontrol")
				public String querygysypmlcontrol(Model model)throws Exception{
					
					//药品类别
					List<Dictinfo> yplblist=systemConfigService.findDictinfoByType("001");
					model.addAttribute("yplblist", yplblist);
					
					//交易状态
					List<Dictinfo> jyztlist=systemConfigService.findDictinfoByType("003");
					model.addAttribute("jyztlist", jyztlist);
					
					//供货状态
					List<Dictinfo> controllist=systemConfigService.findDictinfoByType("008");
					model.addAttribute("controllist", controllist);
					return "/business/ypml/querygysypmlcontrol";
				}
				//查询结果集展示,json数据
				@RequestMapping("/querygysypmlcontrol_result")
				public @ResponseBody DataGridResultInfo querygysypmlcontrol_result(HttpSession session,
						GysypmlQueryVo gysypmlQueryVo,
						int page,
						int rows)throws Exception{
					
					//列表总数
					int total=ypmlService.findGysypmlControlCount(gysypmlQueryVo);
					//分页参数
					PageQuery pageQuery=new PageQuery();
					pageQuery.setPageParams(total, rows, page);
					gysypmlQueryVo.setPageQuery(pageQuery);//设置分页参数
					
					//分页查询列表
					List<GysypmlCustom> list=ypmlService.findGysypmlControlList(gysypmlQueryVo);
					
					
					
					DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
					dataGridResultInfo.setTotal(total);
					dataGridResultInfo.setRows(list);
					return dataGridResultInfo;
				}
				
				//供货商药品目录控制提交
				@RequestMapping("/gysypmlcontrolsubmit")
				public @ResponseBody SubmitResultInfo gysypmlcontrolsubmit(
					HttpSession session,	
					int[] indexs,//接收页面选中的行序号
					GysypmlQueryVo gysypmlQueryVo)throws Exception{
					
							//要处理的数据总数
							int total=indexs.length;
							
							//页面提交的数据(多个),要处理的业务数据
							List<GysypmlControl> list=gysypmlQueryVo.getGysypmlControls();
							
							//处理成功的数目
							int count_sucess=0;
							//处理失败的数目
							int count_error=0;
							//处理失败的原因
							List<ResultInfo> msg_error=new ArrayList<ResultInfo>();
							for(int i=0;i<total;i++){
								ResultInfo resultInfo=null;
								
								//根据选中行的序号获取要处理的业务数据(多个)
								GysypmlControl gysypmlControl=list.get(indexs[i]);
								String usergysid=gysypmlControl.getUsergysid();
								String ypxxid=gysypmlControl.getYpxxid();
								String control=gysypmlControl.getControl();
								String advice=gysypmlControl.getAdvice();
								try{
									ypmlService.updateGysypmlControl(usergysid, ypxxid, control, advice);
								}catch(Exception e){
									e.printStackTrace();
									//进行异常解析
									if(e instanceof ExceptionResultInfo){
										resultInfo=((ExceptionResultInfo)e).getResultInfo();
									}else{
										//构造未知错误异常
										resultInfo=ResultUtil.createFail(Config.MESSAGE, 900, null);
									}
										
								}
								//如果出现异常,则说明处理失败
								if(resultInfo==null){
									//说明成功
									count_sucess++;
								}else{
									count_error++;
									msg_error.add(resultInfo);
									
								}
							}
							
							
							//改成返回详细信息
							return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[]{
									count_sucess,
									count_error
							}), msg_error);
						
						}
		
}
