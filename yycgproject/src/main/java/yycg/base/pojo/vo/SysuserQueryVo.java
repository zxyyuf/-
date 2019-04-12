package yycg.base.pojo.vo;
/***
 * 
 * 包装类,用于页面向action传递参数,将参数传递到mybatis
 * @author Administrator
 *
 */
public class SysuserQueryVo {
	//分页参数
	private PageQuery pageQuery;
	
	
	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	//用户的查询条件
	private SysuserCustom sysuserCustom;
	//还可以扩展多个查询条件
	//...

	public SysuserCustom getSysuserCustom() {
		return sysuserCustom;
	}

	public void setSysuserCustom(SysuserCustom sysuserCustom) {
		this.sysuserCustom = sysuserCustom;
	}
}
