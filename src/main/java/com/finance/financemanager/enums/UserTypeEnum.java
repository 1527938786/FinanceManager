package com.finance.financemanager.enums;

import lombok.Getter;

@Getter
public enum UserTypeEnum {
    //0员工 1财务人员 2经理 3 管理员
    EMPLOYEE(0),
    FINANCE(1),
    MANAGER(2),
    ADMIN(3);
    private Integer code;

    UserTypeEnum(Integer code) {
        this.code = code;
    }
}
