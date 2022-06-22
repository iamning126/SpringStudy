package com.iamning.demo01;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Proxy implements Rent{
    private Host host;


    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }
    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
    //合同
    public void hetong(){
        System.out.println("签租赁合同");
    }

}
