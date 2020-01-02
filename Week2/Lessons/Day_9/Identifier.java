package Week2.Lessons.Day_9;

/*
访问修饰符
    public
        公共，同工程内访问
    default
        不写，同包下访问
    private
        私有，同类下才能访问
    protected
        继承的才能访问
 */
public class Identifier {
    {
        System.out.println("构造代码块");
    }
    static {
        System.out.println("静态代码块");
    }

}
