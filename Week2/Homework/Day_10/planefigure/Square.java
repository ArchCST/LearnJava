package Week2.Homework.Day_10.planefigure;

// 创建一个PlaneFigure类的Square子类，拥有长、宽属性，重写计算面积与周长的行为，限制其只能通过构造器为其赋值;
public class Square extends PlaneFigure {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2*(length + width);
    }
}
