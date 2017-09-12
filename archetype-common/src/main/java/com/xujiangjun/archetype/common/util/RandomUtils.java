package com.xujiangjun.archetype.common.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机数工具类
 *
 * @author xujiangjun
 * @date 2017-06-26 11:22
 */
public class RandomUtils {

    public static final ThreadLocalRandom THREAD_LOCAL_RANDOM = ThreadLocalRandom.current();

    /**
     * 生成六位短信验证码
     *
     * @return 六位短信验证码
     */
    public static int getAuthCode(){
        return THREAD_LOCAL_RANDOM.nextInt(100000, 1000000);
    }

}
