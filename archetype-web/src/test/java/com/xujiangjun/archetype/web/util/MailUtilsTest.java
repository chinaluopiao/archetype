package com.xujiangjun.archetype.web.util;

import com.xujiangjun.archetype.biz.util.MailUtils;
import com.xujiangjun.archetype.web.base.BaseTest;
import org.junit.Test;

import java.util.UUID;

/**
 * 邮件发送测试类
 *
 * @author xujiangjun
 * @date 2017-07-25 13:06
 */
public class MailUtilsTest extends BaseTest {

    @Test
    public void testSendActivateMail(){
        String code = UUID.randomUUID().toString().replace("-", "");
        MailUtils.sendActivateMail("xujiangjun@163.com", code);
    }
}
