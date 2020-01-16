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

    @Column(name = "user_name")
    private String userName;
}
