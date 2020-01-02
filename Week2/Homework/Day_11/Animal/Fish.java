package Week2.Homework.Day_11.Animal;
/*
抽象类练习
1. 定义抽象类animal，拥有名称、食物成员变量，吃饭、睡觉、呼吸抽象方法
2. 定义animal子类bird，拥有脚数成员变量，飞的方法，并实现animal所有抽象方法
3. 定义animal子类fish，拥有鱼鳍数的成员变量，游的方法，并实现animal所有抽象方法
 */
public class Fish extends Animal{
    private int fins;

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public void swimming(){
        System.out.println("Fish is swimming!");
    }

    @Override
    protected void eat(String food) {
        System.out.println("Fish is eating "+food);
    }

    @Override
    protected void sleep() {
        System.out.println("Fish is sleeping!");

    }

    @Override
    protected void breath() {
        System.out.println("Fish is breathing!");

    }
}
