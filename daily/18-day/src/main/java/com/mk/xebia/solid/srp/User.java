package com.mk.xebia.solid.srp;

public class User {
    private String email;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private String password;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
