package com.iamning.demo02;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy=new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.delete();

    }
}
