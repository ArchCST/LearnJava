package Week3.Lessons.Day_19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
}
