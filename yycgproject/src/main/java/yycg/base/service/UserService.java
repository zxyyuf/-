package yycg.base.service;

import java.util.List;

import yycg.base.pojo.po.Sysuser;
import yycg.base.pojo.po.Usergys;
import yycg.base.pojo.po.Userjd;
import yycg.base.pojo.po.Useryy;
import yycg.base.pojo.vo.ActiveUser;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;

public interface UserService {
	//校验用户信息
	public ActiveUser checkUserInfo(String userid,String pwd)throws Exception; 
	
	//查询用户信息
	public Sysuser findSysuserById(String id) throws Exception;
	//查询用户列表
	public List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo)throws Exception;
	//查询总数
	public int findSysuserCount(SysuserQueryVo sysuserQueryVo) throws Exception;
	
	// 根据用户账号查询用户信息
	public Sysuser findSysuserByUserid(String userId) throws Exception;
	// 根据单位名称 查询单位信息
	public Userjd findUserjdByMc(String mc) throws Exception;
	public Useryy findUseryyByMc(String mc) throws Exception;
	public Usergys findUsergysByMc(String mc) throws Exception;
	//用户添加
	public void insertSysuser(SysuserCustom sysuserCustom)throws Exception;
	
	//删除用户
	public void deleteSysuser(String id)throws Exception;
	
	//修改用户
	public void updateSysuser(String id,SysuserCustom sysuserCustom)throws Exception;
	
	//根据id查询用户信息
	public SysuserCustom findSysuserById_1(String id)throws Exception;
	
	
}
