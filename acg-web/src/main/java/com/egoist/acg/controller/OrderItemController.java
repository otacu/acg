package com.egoist.acg.controller;

import com.egoist.acg.service.OrderItemService;
import com.egoist.parent.pojo.dto.EgoistResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * springcloud一定要用 @RestController
 */
@RequestMapping("orderItem")
@RestController
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;

    @GetMapping("getByIdx")
    public EgoistResult getOrderItemByIdx(@RequestParam(value = "idx") Long idx) {
        return orderItemService.queryByIdx(idx);
    }

    @GetMapping("getBySubOrderNo")
    public EgoistResult getOrderItemBySubOrderNo(@RequestParam(value = "subOrderNo") String subOrderNo) {
        return orderItemService.queryBySubOrderNo(subOrderNo);
    }

    @GetMapping("packageIndexDoc")
    public EgoistResult packageIndexDocBySubOrderNo(@RequestParam(value = "subOrderIdx") Long subOrderIdx,
                                                    @RequestParam(value = "subOrderNo") String subOrderNo) {
        return orderItemService.packageIndexDoc(subOrderIdx, subOrderNo);
    }
}
