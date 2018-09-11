package com.egoist.acg.service;

import com.egoist.parent.pojo.dto.EgoistResult;

public interface OrderItemService {
    EgoistResult queryByIdx(Long idx);

    EgoistResult queryBySubOrderNo(String subOrderNo);

    EgoistResult packageIndexDoc(Long subOrderIdx, String subOrderNo);
}
