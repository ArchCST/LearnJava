package Week2.Homework.Day_11.Animal;
/*
抽象类练习
1. 定义抽象类Animal，拥有名称、食物成员变量，吃饭、睡觉、呼吸抽象方法
2. 定义Animal子类Bird，拥有脚数成员变量，飞的方法，并实现Animal所有抽象方法
3. 定义Animal子类Fish，拥有鱼鳍数的成员变量，游的方法，并实现Animal所有抽象方法
 */
public abstract class Animal {
    protected String name;
    protected String food;
    protected abstract void eat(String food);
    protected abstract void sleep();
    protected abstract void breath();
}
