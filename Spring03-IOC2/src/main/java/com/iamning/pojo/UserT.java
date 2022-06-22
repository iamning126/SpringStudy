package com.iamning.pojo;

import lombok.Data;

@Data
public class UserT {
    private String name;
    public UserT(){
        System.out.println("UserT被创建了");
    }
    public void show(){
        System.out.println("name="+name);
    }
}
