package com.lcn.demo1.dao;

import com.lcn.demo1.po.Bank2Tb;
import com.lcn.demo1.po.Bank2TbExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface Bank2TbMapper {
    int countByExample(Bank2TbExample example);

    int deleteByExample(Bank2TbExample example);

    int deleteByPrimaryKey(Long bankId);

    int insert(Bank2Tb record);

    int insertSelective(Bank2Tb record);

    List<Bank2Tb> selectByExample(Bank2TbExample example);

    Bank2Tb selectByPrimaryKey(Long bankId);

    int updateByExampleSelective(@Param("record") Bank2Tb record, @Param("example") Bank2TbExample example);

    int updateByExample(@Param("record") Bank2Tb record, @Param("example") Bank2TbExample example);

    int updateByPrimaryKeySelective(Bank2Tb record);

    int updateByPrimaryKey(Bank2Tb record);
}