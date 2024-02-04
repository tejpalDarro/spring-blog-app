package com.phenol.blogapp.payload;

import lombok.Data;

@Data
public class CommentDto {
    private long id;
    private String name;
    private String email;
    private String body;

    @Data
    public static class LoginDto {
        private String usernameOrEmail;
        private String password;
    }
}
