package Week3.Lessons.Day_18;

import java.util.Calendar;

public class LearnCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 获取年份：
        System.out.println(calendar.get(Calendar.YEAR));

        // 获取月份：月份从 0 开始，一般需要 +1
        System.out.println(calendar.get(Calendar.MONTH));

        // 获取一月中的第几天（日）
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        // 获取一周中的第几天，从周日开始
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        // 获取一月中第几周
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        Calendar calendar1 = Calendar.getInstance();

        calendar.set(2019,8,17,11,05,30);

        System.out.println(calendar.getTime());
        System.out.println(calendar1.getTime());

    }
}
