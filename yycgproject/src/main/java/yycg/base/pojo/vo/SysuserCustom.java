package yycg.base.pojo.vo;

import yycg.base.pojo.po.Sysuser;

public class SysuserCustom extends Sysuser{
	//单位名称
	private String sysmc;
	
	//用户类型名称
	private String groupname;

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getSysmc() {
		return sysmc;
	}

	public void setSysmc(String sysmc) {
		this.sysmc = sysmc;
	}
}
