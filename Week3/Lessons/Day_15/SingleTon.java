package Week3.Lessons.Day_15;
/*
单例模式 1
缺点：占用内存空间，初始化时间长
 */
public class SingleTon {
    // 创建一个唯一对象
    private static SingleTon s = new SingleTon(); // 类加载阶段就会初始化

    // 私有化构造器
    private  SingleTon(){}

    public static SingleTon getInstance(){
        return s;
    }
}
