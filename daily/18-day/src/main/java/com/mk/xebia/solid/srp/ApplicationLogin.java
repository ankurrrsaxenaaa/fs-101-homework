package com.mk.xebia.solid.srp;

public class ApplicationLogin {
    public static void main(String[] args) {
        User user = new User("username@myapp.com","My $ecurE P@$$w0rd");
        System.out.println(LoginService.getAccess(user));
    }
}
