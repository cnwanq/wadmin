package me.wanq.wadmin.common.rest;

import me.wanq.wadmin.common.enums.ResultCode;

public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result().setSuccess();
    }

    public static Result genSuccessResult(Object data) {
        return new Result().setResult(data).setSuccess();
    }

    public static Result genFailResult(Integer code, String message) {
        return new Result().setError(code, message);
    }
}
