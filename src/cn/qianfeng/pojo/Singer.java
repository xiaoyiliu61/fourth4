package cn.qianfeng.pojo;

public class Singer {
    //类中属性使用全局变量表示
    public int id;
    public  String name;
    public String height;
    public String sex;
    public String hobby;

    public void eat(){
        System.out.println("吃饭饭");
    }

    public void run(){
        System.out.println("操场跑圈");
    }
    public Singer(int mId,String mName,String mHeight){
        id=mId;
        name=mName;
        height=mHeight;
        System.out.println("我创建了");
    }
     public void sex(){
        if (sex=="男"&&sex=="女")
        System.out.println(sex);
     }
}
