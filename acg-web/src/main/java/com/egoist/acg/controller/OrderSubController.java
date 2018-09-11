package com.egoist.acg.controller;

import com.egoist.acg.service.OrderSubService;
import com.egoist.parent.pojo.dto.EgoistResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * springcloud一定要用 @RestController
 */
@RequestMapping("orderSub")
@RestController
public class OrderSubController {

    @Autowired
    private OrderSubService orderSubService;

    @GetMapping("getByIdx")
    public EgoistResult getOrderSubByIdx(@RequestParam(value = "idx") Long idx) {
        return orderSubService.queryByIdx(idx);
    }

    @GetMapping("packageIndexDocByIdx")
    public EgoistResult packageIndexDocByIdx(@RequestParam(value = "idx") Long idx) {
        return orderSubService.packageIndexDocByIdx(idx);
    }
}
