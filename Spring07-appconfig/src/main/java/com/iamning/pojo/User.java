package com.iamning.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component这里这个注解的意思，就是说明这个类被Spring接管了，注册到了容器中
@Component
@ToString
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("张三")
    public void setName(String name) {
        this.name = name;
    }

}
