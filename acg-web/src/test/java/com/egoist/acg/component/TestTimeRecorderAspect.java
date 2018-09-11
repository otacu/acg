package com.egoist.acg.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试计时切面
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTimeRecorderAspect {

    @Test
    public void testGenerate() throws Exception {
        // 在这里调用加了@EgoistTimeRecorder注解的 public 方法，不能是TestTimeRecorderAspect类里面的方法
    }
}
