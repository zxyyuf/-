package yycg.business.service;

import java.util.List;

import yycg.business.pojo.po.Gysypml;
import yycg.business.pojo.po.GysypmlControl;
import yycg.business.pojo.vo.GysypmlCustom;
import yycg.business.pojo.vo.GysypmlQueryVo;

public interface YpmlService {
	//供货商药品目录查询列表
	public List<GysypmlCustom> findGysypmlList(String usergysId,GysypmlQueryVo gysypmlQueryVo) throws Exception;
	public int findGysypmlCount(String usergysId,GysypmlQueryVo gysypmlQueryVo) throws Exception;

	//供货商添加药品目录查询列表
	public List<GysypmlCustom> findAddGysypmlList(String usergysId,GysypmlQueryVo gysypmlQueryVo) throws Exception;
	public int findAddGysypmlCount(String usergysId,GysypmlQueryVo gysypmlQueryVo) throws Exception;

	// 供货商药品目录添加
	public void insertGysypml(String usergysid, String ypxxid) throws Exception;
	// 根据供货商id和药品id查询供货商药品目录
	public Gysypml findGysypmlByUsergysidAndYpxxid(String usergysid,
				String ypxxid) throws Exception;

	// 根据供货商id和药品id查询供货商药品目录控制表记录
	public GysypmlControl findGysypmlControlByUsergysidAndYpxxid(
				String usergysid, String ypxxid) throws Exception;
	//根据供货商id和药品id删除供货商药品目录
	public void deleteGysypml(String usergysid,String ypxxid)throws Exception;

	//供货商药品目录控制表
	public List<GysypmlCustom> findGysypmlControlList(GysypmlQueryVo gysypmlQueryVo) throws Exception;
	public int findGysypmlControlCount(GysypmlQueryVo gysypmlQueryVo) throws Exception;
	
	//根据供货商id和药品信息id更新药品目录控制表的控制状态和意见
	public void updateGysypmlControl(String usergysid,String ypxxid,String control,String advice )throws Exception;
}
