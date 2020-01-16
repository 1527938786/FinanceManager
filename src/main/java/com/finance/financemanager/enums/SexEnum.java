package com.finance.financemanager.enums;

import lombok.Getter;

@Getter
public enum SexEnum {
    MAN(0),
    WOMAN(1);

    private Integer code;

    SexEnum(Integer code) {
        this.code = code;
    }
}
