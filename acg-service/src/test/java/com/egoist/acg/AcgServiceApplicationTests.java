package com.egoist.acg;

import com.alibaba.fastjson.JSONObject;
import com.egoist.acg.dao.CartMapper;
import com.egoist.acg.pojo.Cart;
import com.egoist.parent.common.utils.http.EgoistOkHttp3Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcgServiceApplicationTests {

    @Autowired
    CartMapper cartMapper;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testHttp() {
        String url = "https://blog.csdn.net/ghost_chou/phoenix/comment/list/78056852?page=1&tree_type=1";
        Map<String, Object> map = new HashMap<>();
        try {
            JSONObject json = EgoistOkHttp3Util.post(url, map);
            System.out.println("##########" + json.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMybatis() {
        Cart cart = cartMapper.selectByPrimaryKey(25L);
        System.out.println("##########" + JSONObject.toJSONString(cart));
    }

}
