package Week3.Lessons.Day_15;
/*
单例模式 2
缺点：双重非空加锁
 */

public class SingleTon2 {
    // 创建一个唯一对象
    private static SingleTon2 s = null;

    // 私有化构造器
    private SingleTon2(){}

    // 需要用时再生成单例
    public static SingleTon2 getInstance(){
        if (s == null) {
            s = new SingleTon2();
        }
        return s;
    }
}
