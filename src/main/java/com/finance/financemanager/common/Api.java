package com.finance.financemanager.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Api<T> {
    private Integer code;
    private String msg;

    private T data;


    public static Api ok() {
        return new Api(200, null, null);
    }

    public static <T> Api ok(T t) {
        return new Api<>(200, null, t);
    }

    public static Api error(String msg) {
        return new Api(404, msg, null);
    }
}
