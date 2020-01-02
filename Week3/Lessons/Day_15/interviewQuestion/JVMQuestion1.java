package Week3.Lessons.Day_15.interviewQuestion;
/*
类加载过程：
1. 加载（将字节码文件加载到JVM）-
链接（验证（准备类变量，对当前字节码文件正确性验证）-准备-
 */
public class JVMQuestion1 {
    public static JVMQuestion1 t4 = new JVMQuestion1(); // 坑：为什么在这里构造时没有运行静态代码块？

    static {
        System.out.println("学院");
    }

    public JVMQuestion1(){
        System.out.println("蜗牛");
    }

    public static void main(String[] args) {
        JVMQuestion1 t3 = new JVMQuestion1();
        /*
        输出结果：
        蜗牛
        学院
        蜗牛
         */
    }

}
