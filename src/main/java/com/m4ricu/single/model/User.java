package com.m4ricu.single.model;

import lombok.Data;

@Data
public class User {
    private String cpf;
    private String username;
    private String password;
    private String avatarUrl;
}
