package me.wanq.wadmin.common.rest;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import me.wanq.wadmin.common.enums.ErrorInfo;
import me.wanq.wadmin.common.enums.ResultCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {

    private boolean success;

    private ResultError error;
    private Object result;


    public boolean isSuccess() {
        return success;
    }

    public Result setSuccess() {
        this.success = true;
        return this;
    }

    public Result setError(ResultError error) {
        this.error = error;
        return this;
    }

    public Result setError(Integer code, String message) {
        return this.setError(new ResultError(code, message));
    }

    public Result setError(ErrorInfo error) {
        return this.setError(error.getCode(), error.getInfo());
    }

    public ResultError getError() {
        return error;
    }

    public Result setResult(Object result) {
        this.result = result;
        return this;
    }

    public Object getResult() {
        return result;
    }
}
