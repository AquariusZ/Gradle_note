package com.zhong.note2.basetest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Aquarius on 2016/8/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BaseTest {
    @Test
    public void test(){
        System.out.println("BaseTest Start");
    }

}
