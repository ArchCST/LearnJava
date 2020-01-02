package Week2.Lessons.Day_11.area;
/*
1. 定义接口A，里面包含值为3.14的常量PI和抽象方法 double area()
2. 定义接口B，里面包含抽象方法void setColor(String c)。
3. 定义接口C，该接口继承了接口A和B，里面包含抽象方法 void volume()。
4. 定义圆柱体类Cylinder实现接口C，该类中包含三个成员变量：底圆半径radius、圆柱体的高height、颜色color。
5. 创建主类来测试类Cylinder。
 */
public interface C extends A,B {
    void volume();
}
