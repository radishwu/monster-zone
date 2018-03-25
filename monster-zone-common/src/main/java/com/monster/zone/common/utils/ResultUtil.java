package com.monster.zone.common.utils;

import com.monster.zone.common.entity.Result;
import com.sun.istack.internal.NotNull;

public class ResultUtil {

    public static <T> Result success(T data) {

        Result<T> result = new Result<>();
        result.setCode(0);
        result.setData(data);

        return result;
    }

    public static Result error(int code, @NotNull String msg) {

        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }
}