package Week3.Homework.Day_18;

import Week2.Lessons.Day_11.area.C;
import sun.util.cldr.CLDRLocaleDataMetaInfo;

import java.util.Calendar;
import java.util.concurrent.CancellationException;

public class PractiseCalendar {
    public static void main(String[] args) {
        twoDateDiff();
        howManyDaysInFeb();
        lastYearToday();

    }

    // 判断 1996年6月19日10时68分10秒，1995年5月15日12时68分10秒之间相差多少秒
    public static void twoDateDiff() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.set(1996,6,19,10,68,10);
        System.out.println(c1.getTime());
        c2.set(1995,5,15,12,68,10);
        System.out.println(c2.getTime());

        long diff = (c1.getTimeInMillis() - c2.getTimeInMillis()) / 1000;

        System.out.println(diff);
    }

    // 2028年的2月一共有多少天？
    public static void howManyDaysInFeb(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2028,1,29);

        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DATE, 1);
        calendar.add(Calendar.DATE, -1);

        System.out.println("这个月有" + calendar.get(Calendar.DAY_OF_MONTH) + "天");
    }

    // 去年的今天是哪一天？
    public static void  lastYearToday(){
        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR) - 1);
        calendar.add(Calendar.YEAR, -1);
        String str = "abc";
//        str.re

        System.out.println(calendar.getTime());
    }
}
