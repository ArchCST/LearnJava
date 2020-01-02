package Week3.Homework.Day_17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
日期练习—计算已出生多少天
 */
public class HowManyDaysSinceBirthday {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请以「年月日」的格式输入你的生日：");
        String string = sc.next();

        System.out.println("你已出生 " + calcDays(string) + " 天");
    }

    public static long calcDays(String string) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date birthday = sdf.parse(string);
        Date today = new Date();

        long diff = today.getTime() - birthday.getTime();

        return diff / 1000 / 60 / 60 / 24;
    }
}
