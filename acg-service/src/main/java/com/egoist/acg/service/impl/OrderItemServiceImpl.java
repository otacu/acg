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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public EgoistResult packageIndexDoc(Long subOrderIdx, String subOrderNo) {
        EgoistResult queryResult = this.queryBySubOrderNo(subOrderNo);
        if (queryResult.getStatus() != EgoistResultStatusConstants.STATUS_200) {
            return new EgoistResult(EgoistResultStatusConstants.STATUS_400, EgoistErrorMsgConstant.MESSAGE_QUERY_ERROR, null);
        }
        List<OrderItem> list = (List<OrderItem>) queryResult.getData();
        List<Map<String, Object>> resultList = new ArrayList<>();
        for (OrderItem orderItem : list) {
            Map<String, Object> properties = convertToDoc(subOrderIdx, orderItem);
            resultList.add(properties);
        }
        return EgoistResult.ok(resultList);
    }

    private Map<String, Object> convertToDoc(Long subOrderIdx, OrderItem orderItem) {
        Map<String, Object> properties = new HashMap<>();
        properties.put("idx", orderItem.getIdx());
        properties.put("subOrderNo", orderItem.getSubOrderNo());
        properties.put("itemIdxCode", orderItem.getItemIdxCode());
        properties.put("itemNo", orderItem.getItemNo());
        properties.put("barcode", orderItem.getBarcode());
        properties.put("realFee", orderItem.getRealFee());
        Map<String, Object> joinField = new HashMap<>();
        joinField.put("name", "order_item");
        joinField.put("parent", "orderSub" + subOrderIdx);
        properties.put("join_field", joinField);
        return properties;
    }
}
