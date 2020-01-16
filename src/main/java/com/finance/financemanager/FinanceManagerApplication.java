package com.finance.financemanager;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.finance.financemanager.mapper")
public class FinanceManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceManagerApplication.class, args);
    }

}
