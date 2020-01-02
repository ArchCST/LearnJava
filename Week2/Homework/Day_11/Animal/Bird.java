package Week2.Homework.Day_11.Animal;
/*
抽象类练习
1. 定义抽象类animal，拥有名称、食物成员变量，吃饭、睡觉、呼吸抽象方法
2. 定义animal子类bird，拥有脚数成员变量，飞的方法，并实现animal所有抽象方法
3. 定义animal子类fish，拥有鱼鳍数的成员变量，游的方法，并实现animal所有抽象方法
 */
public class Bird extends Animal {
    private int feet;

    public void setFeet(int feet){
        this.feet = feet;
    }

    public int getFeet(){
        return feet;
    }

    public void fly(){
        System.out.println("Bird is flying!");
    }

    public void eat(String food){
        System.out.println("Bird is eating "+food);
    }

    public void sleep(){
        System.out.println("Bird sleeping!");
    }

    public void breath(){
        System.out.println("Bird breathing!");
    }
}
