package yycg.business.pojo.vo;

import java.util.List;

import yycg.base.pojo.po.Usergys;
import yycg.base.pojo.vo.PageQuery;
import yycg.business.pojo.po.GysypmlControl;

public class GysypmlQueryVo {
	
	public Usergys usergys;//供货商信息
	
	//添加页面批量提交 
	private List<YpxxCustom> ypxxCustoms;
	
	//供货商控制记录批量提交
	private List<GysypmlControl> gysypmlControls;
	
	
	public List<YpxxCustom> getYpxxCustoms() {
		return ypxxCustoms;
	}

	public void setYpxxCustoms(List<YpxxCustom> ypxxCustoms) {
		this.ypxxCustoms = ypxxCustoms;
	}

	private GysypmlCustom gysypmlCustom;
	
	private YpxxCustom ypxxCustom;
	
	public YpxxCustom getYpxxCustom() {
		return ypxxCustom;
	}

	public void setYpxxCustom(YpxxCustom ypxxCustom) {
		this.ypxxCustom = ypxxCustom;
	}

	private PageQuery pageQuery;

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public GysypmlCustom getGysypmlCustom() {
		return gysypmlCustom;
	}

	public void setGysypmlCustom(GysypmlCustom gysypmlCustom) {
		this.gysypmlCustom = gysypmlCustom;
	}
	
	public Usergys getUsergys() {
		return usergys;
	}

	public void setUsergys(Usergys usergys) {
		this.usergys = usergys;
	}

	public List<GysypmlControl> getGysypmlControls() {
		return gysypmlControls;
	}

	public void setGysypmlControls(List<GysypmlControl> gysypmlControls) {
		this.gysypmlControls = gysypmlControls;
	}

}
