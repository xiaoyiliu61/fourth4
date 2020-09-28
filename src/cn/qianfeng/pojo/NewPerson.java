package cn.qianfeng.pojo;

import cn.qianfeng.contriler.PayInterface;

public class NewPerson implements PayInterface {
    public PayInterface p;
    public void pay(){
        System.out.println("短信验证");
        p.pay();
        System.out.println("账单发送");
    }
}
