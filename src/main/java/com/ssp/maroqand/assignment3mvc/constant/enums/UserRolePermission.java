package com.ssp.maroqand.assignment3mvc.constant.enums;

public enum UserRolePermission {

    READ("read"),
    WRITE("write");

    private final String permission;

    UserRolePermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
