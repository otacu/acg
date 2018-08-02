package com.egoist.acg.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试表主键生成类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TableKeyGeneratorTests {
    @Autowired
    private TableKeyGenerator tableKeyGenerator;

    @Test
    public void testSet() {
        tableKeyGenerator.set("acg:tablekey:table1", 1);
    }

    @Test
    public void testGenerate() {
        long key = tableKeyGenerator.generate("acg:tablekey:table1");
        System.out.println("#################### key: " + key);
    }

}
