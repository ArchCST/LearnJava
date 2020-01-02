package Week3.Homework.Day_17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
(Scanner)当以年-月-日的格式输入一个日期时，输出其该年是否为闰年，该月有几天，该日是星期几
 */
public class DateAnalyse {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请以「年-月-日」的格式输入一个日期：");
        String string = sc.next();

        String[] result = analyseDate(string);
        System.out.println("该日期" + result[0] + "闰年，这个月有" + result[1] + "天，这一天是" + result[2]);

        System.out.println(analyseWithCalendar(string));

    }

    public static String[] analyseDate(String string) throws ParseException {
        String[] strings = string.split("-");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(string);

        String[] result = new String[3];

        int year = Integer.parseInt(strings[0]);
        int month = Integer.parseInt(strings[1]);
        int day = Integer.parseInt(strings[2]);

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        monthDays[1] = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28;

        result[0] = (monthDays[1] == 29) ? "是" : "不是";
        result[1] = String.valueOf(monthDays[month - 1]);

        SimpleDateFormat sdf2 = new SimpleDateFormat("E");
        result[2] = sdf2.format(date);

        return result;
    }

    public static String analyseWithCalendar(String string) {
        String[] strings = string.split("-");
        int[] dateInt = new int[3];

        for (int i = 0; i < dateInt.length; i ++) {
            dateInt[i] = Integer.parseInt(strings[i]);
        }

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(dateInt[0], dateInt[1] - 1, dateInt[2]);

        String isLeap = (gc.isLeapYear(gc.get(Calendar.YEAR))) ? "是" : "不是";
        int dayOfWeek = gc.get(Calendar.DAY_OF_WEEK) - 1;

        dayOfWeek = (dayOfWeek == 0) ? 7 : dayOfWeek;

        gc.add(Calendar.MONTH, 1);
        gc.set(Calendar.DATE, 0);

        int monthDays = gc.get(Calendar.DAY_OF_MONTH);

        return string + "：这一年" + isLeap + "闰年，这个月有" + monthDays + "天，这一天是星期" + dayOfWeek;
    }
}
