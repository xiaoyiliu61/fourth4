package cn.qianfeng.entrance;

import cn.qianfeng.contriler.PayInterface;
import cn.qianfeng.contriler.QuerUserlmpl;
import cn.qianfeng.contriler.QuerUserlmpl02;
import cn.qianfeng.contriler.QueryUser;
import cn.qianfeng.pojo.*;

public class test {
    public static void main(String[] args) {
        /*Singer dzq =new Singer();
        String wxy =new Singer();*/
     /*   Singer obj=new Singer(1,"邓紫棋","165");
        obj.sex="女";
        System.out.println(obj.sex);
        Student stu=new Student(1,"小义",18);
        stu.demo();
        System.out.println(stu);
        System.out.println(stu.toString());
        System.out.println(stu.hashCode());
    }*/

       /* QueryUser qu = new QuerUserlmpl();
        qu = new QuerUserlmpl02();*/
      /* Dog dog1 =LbLd.getInstance();
       Dog dog2 =LbLd.getInstance();
       Dog dog3 =LbLd.getInstance();
       Dog dog4 =LbLd.getInstance();
       System.out.println(dog1==dog2);
       System.out.println(dog1==dog3);
       System.out.println(dog1==dog4);
       System.out.println(dog2==dog3);*/

        PayInterface p =new NewPerson();
        p.pay();
    }
}
