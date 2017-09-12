package com.xujiangjun.archetype.domain.enums;

import lombok.Getter;

/**
 * 通用枚举类(针对是与否的字段)
 *
 * @author xujiangjun
 * @date 2017-09-12 10:27
 */
@Getter
public enum GeneralEnum {
    YES(1, "是"),
    NO(0, "否");

    private int key;

    private String value;

    GeneralEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
}
