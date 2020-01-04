package Week3.Lessons.Day_19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
checkException = IoException = 编译异常 = 非运行时异常：主动处理，或者在方法上定义 throws 让调用者处理（必须）
runtimeException = 运行时异常 = UncheckException： 在程序运行中可能出现的异常，可以向上抛出，也可以不抛出异常（可选）
throws： 定义在方法上，作为异常标志，让调用者去处理代码中的异常
throw： 直接实例化异常对象并抛出
 */
public class LearnException {
    public static void main(String[] args) throws ParseException {
        System.out.println("开始执行");

        try {
            // 运行时异常
            int i = 3 / 0;
            // Error
            // System.out.println(foo(1));
        } catch (Exception e) {
            System.out.println("出现异常");
        }

        System.out.println("结束执行");


        // 编译时异常
        SimpleDateFormat sdf = new SimpleDateFormat("-yyyy");
        try {
            sdf.parse("2020-01-01");
            System.out.println("正常执行");
        } catch (ParseException e) {
            System.out.println("日期转换错误");
            // e.printStackTrace();
        }

    }

    // Error
    public static int foo(int num) {
        return foo(num - 1);
    }

    // 多异常处理
    public static void multiException() {
        User[] u = new User[10];
        String username = u[11].getUsername(); // 数组越界+空指针
        username.equals("张三"); // 空指针
    }
}
