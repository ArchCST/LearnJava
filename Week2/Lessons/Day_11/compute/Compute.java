package Week2.Lessons.Day_11.compute;
/*
（1）定义一个接口Compute含有一个方法int computer(int n, int m)。
（2）设计四个类分别实现此接口，完成加减乘除运算。
（3）设计一个类UseCompute，类中含有方法：public void useCom(Compute com, int one, int two)，此方法能够用传递过来的对象调用computer方法完成运算，并输出运算的结果。
（4）设计一个主类Test，调用UseCompute中的方法useCom来完成加减乘除运算。
 */
public interface Compute {
    public abstract int computer(int n, int m);
}
