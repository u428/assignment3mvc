package com.ssp.maroqand.assignment3mvc.constant.enums;


import com.google.common.collect.Sets;

import java.util.Set;
import java.util.stream.Collectors;


public enum UserRole {
    USER(Sets.newHashSet(UserRolePermission.READ)),

    ADMIN(Sets.newHashSet(UserRolePermission.READ, UserRolePermission.WRITE));

    private final Set<UserRolePermission> permissions;

    UserRole(Set<UserRolePermission> permissions) {
        this.permissions = permissions;
    }

    public Set<UserRolePermission> getPermissions() {
        return permissions;
    }


    public Set<String> getGrantedAuthorities() {
        Set<String> permissions = getPermissions().stream()
                .map(UserRolePermission::getPermission)
                .collect(Collectors.toSet());
        return permissions;
    }

}
