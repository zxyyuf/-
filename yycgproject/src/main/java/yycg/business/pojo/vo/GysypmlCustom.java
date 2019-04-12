package yycg.business.pojo.vo;

public class GysypmlCustom  extends YpxxCustom{

	private String gysypmlid;//结果集唯一约束
	private String ypxxid;
	private String usergysid;
	private String usergysmc;
	private String controlmc;
	private String control;
	private String advice;//审核意见
	
	
	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getGysypmlid() {
		return gysypmlid;
	}

	public void setGysypmlid(String gysypmlid) {
		this.gysypmlid = gysypmlid;
	}

	public String getYpxxid() {
		return ypxxid;
	}

	public void setYpxxid(String ypxxid) {
		this.ypxxid = ypxxid;
	}

	public String getUsergysid() {
		return usergysid;
	}

	public void setUsergysid(String usergysid) {
		this.usergysid = usergysid;
	}

	public String getUsergysmc() {
		return usergysmc;
	}

	public void setUsergysmc(String usergysmc) {
		this.usergysmc = usergysmc;
	}

	
	public String getControlmc() {
		return controlmc;
	}

	public void setControlmc(String controlmc) {
		this.controlmc = controlmc;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}
}
