package Week3.Lessons.Day_15.interviewQuestion;

public class JVMQuestion2 {
    private String name = "woniuxy";

    static int age = 10;

    public JVMQuestion2(String n, int age) {
        if (age < 0) {
            System.out.println("Wrong");
            return;
        }

        name = n;
        System.out.println(age);
        System.out.println(name+":"+ JVMQuestion2.age+age); // 坑：为什么 Top4Sub3.age 的值是 9？
        return;
    }

    public static void main(String[] args) {
        new JVMQuestion2("小蜗牛", JVMQuestion2.age--);
        /*
        输出结果：
        10
        小蜗牛:910
         */
    }
}
