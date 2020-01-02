package Week2.Homework.Day_10.planefigure;

// 创建一个PlaneFigure类的Circular子类，拥有半径属性，重写计算面积与周长的行为，限制其只能通过构造器为其赋值;
public class Circular extends PlaneFigure {
    private static final double PI = 3.14169255359;
    private double r;

    public Circular(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2*PI*r;
    }
}
