package Week2.Lessons.Day_9;

/*
static: 表示静态，可以修饰成员变量、成员方法、构造代码块
    静态代码块
        当 static 修饰代码块时，称为静态代码块，该代码块会在第一次加载类时被执行
        创建目标类的对象前，会对类进行加载，此时会执行静态代码块内容，且只执行一次
    静态变量
        当 static 修饰 **成员变量** 时，称该变时为`静态变量`或`类变量`，该变量空间被该类所有对象共享
        静态变量是储存在 **方法区** 里的
    静态方法
        称为静态方法或类方法，该方法不依赖于任何对象，可以直接使用类名调用，没有 this

    注意：静态资源不能直接使用非静态资源（普通资源），非要使用则需要创建对象
          普能资源可以直接使用静态资源
 */


public class learnStatic {
    public String name;
    public static String staticName;
    public static void changeSN(String n) {
        staticName = n;
    }

    public static void main(String[] args) {
        learnStatic A = new learnStatic();
        learnStatic B = new learnStatic();

        System.out.println(A.name + " " + A.staticName);
        System.out.println(B.name + " " + B.staticName);

        learnStatic.changeSN("32");

        System.out.println(A.name + " " + A.staticName);
        System.out.println(B.name + " " + B.staticName);
    }
}
