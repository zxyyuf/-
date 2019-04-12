package yycg.base.dao.mapper;

import yycg.base.pojo.po.Sysuser;

public interface SysuserCustomMapper {
	//查询用户
	public Sysuser findSysuserById(String id)throws Exception;

}
