package com.egoist.acg.service.impl;

import com.egoist.acg.dao.OrderSubMapper;
import com.egoist.acg.pojo.po.OrderSub;
import com.egoist.acg.pojo.po.OrderSubExample;
import com.egoist.acg.service.OrderSubService;
import com.egoist.parent.common.constants.EgoistErrorMsgConstant;
import com.egoist.parent.common.constants.EgoistResultStatusConstants;
import com.egoist.parent.common.enums.EgoistTableRecordStatusEnum;
import com.egoist.parent.common.utils.collection.EgoistCollectionUtil;
import com.egoist.parent.pojo.dto.EgoistResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSubServiceImpl implements OrderSubService {

    @Autowired
    OrderSubMapper orderSubMapper;

    @Override
    public EgoistResult queryByIdx(Long idx) {
        OrderSubExample orderSubExample = new OrderSubExample();
        OrderSubExample.Criteria criteria = orderSubExample.createCriteria();
        criteria.andIdxEqualTo(idx);
        criteria.andStatusEqualTo(EgoistTableRecordStatusEnum.NORMAL);
        List<OrderSub> list = orderSubMapper.selectByExample(orderSubExample);
        if (EgoistCollectionUtil.isEmpty(list)) {
            return new EgoistResult(EgoistResultStatusConstants.STATUS_400, EgoistErrorMsgConstant.MESSAGE_QUERY_ERROR, null);
        }
        return EgoistResult.ok(list.get(0));
    }
}
