package com.iamning.config;

import com.iamning.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这个也会被Spring容器托管，因为它本来就是一个@Component
//@Configuration代表这是一个配置类，就和我们之前看到的beans.xml
@Configuration
@ComponentScan("com.iamning.pojo")
@Import(Iamning2Config.class)
public class IamningConfig {
    //注册一个bean，就相当于我们之间写的一个bean标签，
    //这个方法的名字，就相当于bean便签的id属性
    //这个方法的返回值，就相当于bean便签的class属性
    @Bean
    public User getUser(){
        return new User();//就是要返回注入到bean的对象！
    }
}
