package com.egoist.acg.service.impl;

import com.egoist.acg.dao.OrderItemMapper;
import com.egoist.acg.pojo.po.OrderItem;
import com.egoist.acg.pojo.po.OrderItemExample;
import com.egoist.acg.service.OrderItemService;
import com.egoist.parent.common.constants.EgoistErrorMsgConstant;
import com.egoist.parent.common.constants.EgoistResultStatusConstants;
import com.egoist.parent.common.enums.EgoistTableRecordStatusEnum;
import com.egoist.parent.common.utils.collection.EgoistCollectionUtil;
import com.egoist.parent.pojo.dto.EgoistResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public EgoistResult queryByIdx(Long idx) {
        OrderItemExample orderItemExample = new OrderItemExample();
        OrderItemExample.Criteria criteria = orderItemExample.createCriteria();
        criteria.andIdxEqualTo(idx);
        criteria.andStatusEqualTo(EgoistTableRecordStatusEnum.NORMAL);
        List<OrderItem> list = orderItemMapper.selectByExample(orderItemExample);
        if (EgoistCollectionUtil.isEmpty(list)) {
            return new EgoistResult(EgoistResultStatusConstants.STATUS_400, EgoistErrorMsgConstant.MESSAGE_QUERY_ERROR, null);
        }
        return EgoistResult.ok(list.get(0));
    }

    @Override
    public EgoistResult queryBySubOrderNo(String subOrderNo) {
        OrderItemExample orderItemExample = new OrderItemExample();
        OrderItemExample.Criteria criteria = orderItemExample.createCriteria();
        criteria.andSubOrderNoEqualTo(subOrderNo);
        criteria.andStatusEqualTo(EgoistTableRecordStatusEnum.NORMAL);
        List<OrderItem> list = orderItemMapper.selectByExample(orderItemExample);
        if (EgoistCollectionUtil.isEmpty(list)) {
            return new EgoistResult(EgoistResultStatusConstants.STATUS_400, EgoistErrorMsgConstant.MESSAGE_QUERY_ERROR, null);
        }
        return EgoistResult.ok(list);
    }

}
