package cn.qianfeng.pojo;

public class LbLd extends Dog {
    private static Dog dog =new LbLd();

    public static Dog getInstance(){
        if (dog==null){
            dog=new LbLd();
        }
        return dog;
    }
    public LbLd(){
        System.out.println("我出生了");
    }
  /*  public void eat(){
        System.out.println("吃狗粮");
    }*/
}
