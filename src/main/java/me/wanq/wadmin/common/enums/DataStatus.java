package me.wanq.wadmin.common.enums;

public enum DataStatus {
    NORMAL("默认", 1),
    VALID("有效", 2),
    INVALID("无效", 0),
    DELETED("逻辑删除", -1);


    private String description;
    private Integer value;

    private DataStatus(String description, int value) {
        this.description = description;
        this.value = value;
    }
}
