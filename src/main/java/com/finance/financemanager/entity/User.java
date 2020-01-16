package com.finance.financemanager.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {
    @Id
    private String id;

    @Column(name = "user_account")
    private String userAccount;

    @Column(name = "user_pass")
    private String userPass;

    private String phone;

    private Integer type;

    private Integer sex;

    private String addr;
}
