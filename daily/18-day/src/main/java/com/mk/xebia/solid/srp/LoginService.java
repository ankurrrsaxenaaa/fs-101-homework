package com.mk.xebia.solid.srp;


import java.util.HashMap;

import java.util.Map;

public class LoginService {


    private static Map<String,String> existingUsers= ExistingUserPool.getUsers();

    public static String getAccess(User user) {

        Map<String,Boolean> accessToken=new HashMap<String, Boolean>();
        accessToken.put("email", false);
        accessToken.put("password", false);


        if(existingUsers.containsKey(user.getEmail())){
            accessToken.put("email",true);
            if(existingUsers.get(user.getEmail()).equals(user.getPassword())){
                accessToken.put("password",true);
            }
        }
        return getMessage(user.getEmail(), accessToken);
    }

    private static String getMessage(String email, Map<String, Boolean> accessToken) {
        if(accessToken.get("email").equals(true) && accessToken.get("password").equals(true)){
            return "Congratulations "+email+"! You have successfully logged in.";
        }
        if(accessToken.get("password").equals(false) && accessToken.get("email").equals(true)){
            return "Are you sure you have provided correct password?";
        }else {
            return "Are you sure you have provided correct username?";
        }
    }
}
