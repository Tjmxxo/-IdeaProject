package com.lcn.demo1.dao;

import com.lcn.demo1.po.BankTb;
import com.lcn.demo1.po.BankTbExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BankTbMapper {
    int countByExample(BankTbExample example);

    int deleteByExample(BankTbExample example);

    int insert(BankTb record);

    int insertSelective(BankTb record);

    List<BankTb> selectByExample(BankTbExample example);

    int updateByExampleSelective(@Param("record") BankTb record, @Param("example") BankTbExample example);

    int updateByExample(@Param("record") BankTb record, @Param("example") BankTbExample example);
}