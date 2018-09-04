package com.gmall.common;

public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role{
        int Role_CUSTOMER = 0; // 普通用户
        int Role_ADMIN = 1; // 管理员
    }
}
