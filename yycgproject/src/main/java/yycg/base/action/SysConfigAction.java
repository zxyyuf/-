package yycg.base.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import yycg.base.process.context.Config;
import yycg.util.ResourcesUtil;
import yycg.util.Vcom_3DES;

@Controller
@RequestMapping("/sysconfig")
public class SysConfigAction {
	//sysmanagerurl_modulelist=http://localhost:8080/sysmanager/module/show.do?loginkeyString=
	/**
	 * 操作模块管理
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/modulelist")
	public String modulelist()throws Exception{
		//生成加密的串
		//最多24个字节，最少？
		String key = "yycg12345678901234567890";// 密钥
		// 待加密串
		String oldstring = "test" + "#" + "test" + "#" + System.currentTimeMillis();
		System.out.println("原始串=" + oldstring);
		// 进行3des加密，1表示加密，key：密钥
		Vcom_3DES tempDesEn = new Vcom_3DES(1, oldstring, key);
		// 加密后的串
		String strTemp = tempDesEn.Vcom3DESChiper();
		
		//组织接口地址
		//从配置文件中获取接口地址
		//获取模块管理的接口地址
		String module_url=ResourcesUtil.getValue(Config.SYSCONFIG, "sysmanagerurl_modulelist");
		
		//将加密的串追加到接口地址后
		String url=module_url+strTemp;
		return View.redirect(url);
	}
}
