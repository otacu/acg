package com.egoist.acg.dao;

import com.egoist.acg.pojo.po.OrderSub;
import com.egoist.acg.pojo.po.OrderSubExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderSubMapper {
    long countByExample(OrderSubExample example);

    int deleteByExample(OrderSubExample example);

    int deleteByPrimaryKey(Long idx);

    int insert(OrderSub record);

    int insertSelective(OrderSub record);

    List<OrderSub> selectByExample(OrderSubExample example);

    OrderSub selectByPrimaryKey(Long idx);

    int updateByExampleSelective(@Param("record") OrderSub record, @Param("example") OrderSubExample example);

    int updateByExample(@Param("record") OrderSub record, @Param("example") OrderSubExample example);

    int updateByPrimaryKeySelective(OrderSub record);

    int updateByPrimaryKey(OrderSub record);
}