package com.iamning.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@Getter
public class People {
    //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
    @Resource(name = "cat2")
    private Cat cat;
    @Resource
    private Dog dog;
    private String name;

}
