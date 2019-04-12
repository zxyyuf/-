package yycg.business.dao.mapper;

import java.util.List;

import yycg.business.pojo.vo.YycgdQueryVo;
import yycg.business.pojo.vo.YycgdmxCustom;

public interface YybusinessMapperCustom {
   //交易明细查询
	public List<YycgdmxCustom> findYybusinessList(YycgdQueryVo yycgdQueryVo) throws Exception;
	public int findYybusinessCount(YycgdQueryVo yycgdQueryVo) throws Exception;
	
	//交易明细查询总计(采购量,采购金额,,入库量,入库金额,退货量,退货金额,结算量,结算金额)
	public List<YycgdmxCustom> findYybusinessListSum(YycgdQueryVo yycgdQueryVo) throws Exception;
	
	//按药品分类 统计
	public List<YycgdmxCustom> findYybusinessGroupbyYpxxList(YycgdQueryVo yycgdQueryVo) throws Exception;
	public int findYybusinessGroupbyYpxxCount(YycgdQueryVo yycgdQueryVo) throws Exception;
}