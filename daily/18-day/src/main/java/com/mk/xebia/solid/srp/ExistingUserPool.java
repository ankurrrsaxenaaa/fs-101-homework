package com.mk.xebia.solid.srp;

import java.util.HashMap;
import java.util.Map;

public class ExistingUserPool {
    static Map<String,String> getUsers(){
    HashMap<String, String> users= new HashMap<String, String>();
    users.put("username@myapp.com","My $ecurE P@$$w0rd");
    users.put("admin","@dm1n");
    users.put("user","p@$$w0rd");
    return users;
    }
}
