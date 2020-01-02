package Week2.Homework.Day_11.Phone;
/*
接口练习
1. 定义Phone，定义手机功能标准，要求所有手机都必须有打电话、发短信功能，且最大重量为250克
2. 定义Phone子类FeaturePhone，实现Phone所有抽象方法
3. 定义SmartPhone接口，继承Phone接口，且拥拍照、播放音频、玩游戏抽象方法
4. 定义Apple的SmartPhone子类，实现SmartPhone所有抽象方法
5. 定义HuaWei的SmartPhone子类，实现SmartPhone所有抽象方法
 */
public class Apple implements SmartPhone{
    public void call(){
        System.out.println("Apple calling");
    }

    public void sms(){
        System.out.println("Apple SMSing");
    }

    public void camera(){
        System.out.println("Apple filming");
    }

    public void music(){
        System.out.println("Apple playing music");
    }

    public void game(){
        System.out.println("Apple gaming");
    }
}
