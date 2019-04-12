package yycg.base.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yycg.base.pojo.po.Dictinfo;
import yycg.base.pojo.vo.PageQuery;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;
import yycg.base.process.context.Config;
import yycg.base.process.result.DataGridResultInfo;
import yycg.base.process.result.ExceptionResultInfo;
import yycg.base.process.result.ResultInfo;
import yycg.base.process.result.ResultUtil;
import yycg.base.process.result.SubmitResultInfo;
import yycg.base.service.SystemConfigService;
import yycg.base.service.UserService;

/**
 * 
 * 系统用户管理
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private UserService userService;
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	//用户查询页面
	@RequestMapping("/queryuser")
	public String queryuser(Model model)throws Exception{
		//将页面所需的数据取出,传到页面
		//用户类型
		List<Dictinfo> groupList=systemConfigService.findDictinfoByType("s01");
		model.addAttribute("groupList", groupList);
		return "/base/user/queryuser";
	}
	
	//用户查询的结果集
	//最终DataGridResultInfo通过@ResponseBody将java转成josn对象
	@RequestMapping("/queryuser_result")
	public @ResponseBody DataGridResultInfo queryuser_result(SysuserQueryVo sysuserQueryVo,int page,int rows)throws Exception{
		//非空校验
 				sysuserQueryVo = sysuserQueryVo!=null?sysuserQueryVo:new SysuserQueryVo();
				
				//查询列表的总数
				int total = userService.findSysuserCount(sysuserQueryVo);
				
				PageQuery pageQuery = new PageQuery();
				pageQuery.setPageParams(total, rows, page);
				
				sysuserQueryVo.setPageQuery(pageQuery);
				
				//分页查询，向sysuserQueryVo中传入pageQuery
				List<SysuserCustom> list = userService.findSysuserList(sysuserQueryVo);
				
				DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
				//填充 total
				dataGridResultInfo.setTotal(total);
				//填充  rows
				dataGridResultInfo.setRows(list);
				
				return dataGridResultInfo;
	}
	
	//添加用户页面
	@RequestMapping("/addsysuser")
	public String addsysuser(Model model)throws Exception{
		//向页面传数据
		
		return "/base/user/addsysuser";
	}
	
	//添加用户提交
	//提交结果转josn输出到页面
	//提交表单数据统一使用包装类
	@RequestMapping("/addsysusersubmit")
	public @ResponseBody SubmitResultInfo addsysusersubmit(SysuserQueryVo sysuserQueryVo)throws Exception{
		
		//提示用户信息
		
//		String message = "操作成功！！";
//		int type=0;//成功
		
//		ResultInfo resultInfo=new ResultInfo();
//		resultInfo.setType(ResultInfo.TYPE_RESULT_SUCCESS);
//		resultInfo.setMessage("操作成功！！");
		/*try {
			//调用service执行用户添加
			userService.insertSysuser(sysuserQueryVo.getSysuserCustom());
		} catch (Exception e) {
			//输出异常信息
			e.printStackTrace();
			//对应异常信息进行解析
			//message = e.getMessage();
			//type=1;//失败
			//解析系统自定义异常
			if(e instanceof ExceptionResultInfo){
				//抛出的异常是系统自定义的异常
				resultInfo=((ExceptionResultInfo)e).getResultInfo();
			}else{
				//重新构造未知错误异常
				resultInfo=new ResultInfo();
				resultInfo.setType(ResultInfo.TYPE_RESULT_FAIL);
				resultInfo.setMessage("未知错误!!");
			}
			
		}*/
		
		//使用全局异常处理器后，在actoin不用进行try/catch捕获
		userService.insertSysuser(sysuserQueryVo.getSysuserCustom());
		
		
		
		//将执行结果返回页面
		
//		Map<String, Object> result_map = new HashMap<String, Object>();
//		result_map.put("type", type);
//		result_map.put("message", message);
//		SubmitResultInfo submitResultInfo=new SubmitResultInfo(resultInfo);
//		return submitResultInfo;
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	//删除用户
	@RequestMapping("/deletesysuser")
	public @ResponseBody SubmitResultInfo deletesysuser(String id)throws Exception{
		//调用service
		userService.deleteSysuser(id);
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,906, null));
	}
	
	
	//修改用户页面
	@RequestMapping("/editsysuser")
	public String editsysuser(Model model,String id)throws Exception{
		
		//通过id取出用户信息
		SysuserCustom sysuserCustom=userService.findSysuserById_1(id);
		model.addAttribute("sysuserCustom", sysuserCustom);
		return "/base/user/editsysuser";
	}
	
	//修改用户提交
	@RequestMapping("/editsysusersubmit")
	public @ResponseBody SubmitResultInfo editsysusersubmit(String id,SysuserQueryVo sysuserQueryVo)throws Exception{
		
		userService.updateSysuser(id, sysuserQueryVo.getSysuserCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,906, null));
	}
	
}
