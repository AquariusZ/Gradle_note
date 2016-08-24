package com.zhong.note2.util;

import org.junit.Test;

/**
 * Created by Aquarius on 2016/8/17.
 */
public class MD5UtilTest {
    @Test
    public void encode() throws Exception {
        String mess = "123456";
        String en =   MD5Util.encode(mess);
        System.out.println("加密前的：" + mess);
        System.out.println("加密后的：" + en);
    }

}