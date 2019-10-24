package com.asiainfo.vpn.mapper;

import com.asiainfo.vpn.bean.Enumeration;
import com.asiainfo.vpn.bean.EnumerationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnumerationMapper {
    long countByExample(EnumerationExample example);

    int deleteByExample(EnumerationExample example);

    int deleteByPrimaryKey(String enumId);

    int insert(Enumeration record);

    int insertSelective(Enumeration record);

    List<Enumeration> selectByExample(EnumerationExample example);

    Enumeration selectByPrimaryKey(String enumId);

    int updateByExampleSelective(@Param("record") Enumeration record, @Param("example") EnumerationExample example);

    int updateByExample(@Param("record") Enumeration record, @Param("example") EnumerationExample example);

    int updateByPrimaryKeySelective(Enumeration record);

    int updateByPrimaryKey(Enumeration record);
}