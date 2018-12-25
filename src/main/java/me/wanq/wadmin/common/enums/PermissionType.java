package me.wanq.wadmin.common.enums;

public enum PermissionType {
    MENU("菜单", 0),
    page("页面", 1);

    private String description;
    private Integer value;

    private PermissionType(String description, int value) {
        this.description = description;
        this.value = value;
    }
}
