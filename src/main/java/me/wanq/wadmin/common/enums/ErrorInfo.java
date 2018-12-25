package me.wanq.wadmin.common.enums;

public enum ErrorInfo {
    LoginError(1001, "登录失败，账号或密码错误");

    private Integer code;
    private String info;

    private ErrorInfo(Integer code, String info) {
        this.code = code;
        this.info = info;
    }

    public Integer getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
