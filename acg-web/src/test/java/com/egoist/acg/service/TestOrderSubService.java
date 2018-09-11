package com.egoist.acg.service;

import com.alibaba.fastjson.JSONObject;
import com.egoist.parent.pojo.dto.EgoistResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestOrderSubService {

    @Autowired
    private OrderSubService orderSubService;

    @Test
    public void testQueryByIdx() {
        EgoistResult result = orderSubService.queryByIdx(10000020L);
        System.out.println(JSONObject.toJSONString(result));
    }
}
