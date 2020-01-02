package Week3.Homework.Day_16;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormantCallDateWithDateClass_2 {

    public static void main(String[] args) throws ParseException {
        String string = "[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]," +
                "[2004][2][28][10][55][3]{0}[2004][3][1][10][58][57]," +
                "[2005][2][28][10][55][3]{1}[2005][3][1][10][58][57]";

        String[] data = string.split(",");

        for (String str : data) {
            System.out.println(charge(str));
        }
    }

    public static String charge(String str) throws ParseException {
        String start = str.substring(0, str.indexOf("{"));
        String end = str.substring(str.indexOf("}") + 1);
        String from = str.substring(str.indexOf('{') + 1, str.indexOf('}'));

        // core code
        SimpleDateFormat smp = new SimpleDateFormat("[yyyy][MM][dd][HH][mm][ss]");

        // calc the difference of start time and end time
        long diff = smp.parse(end).getTime() - smp.parse(start).getTime();
        diff = diff / 1000;

        // calc hours/minutes/seconds for return
        long hours = diff / 3600;
        long minutes = diff / 60 % 60;
        long seconds = diff % 60;

        // calc call charge: called 0, calling 0.3/min, ceiling the seconds.
        double money = from.equals("1") ? hours * 18 + minutes * 0.3 + ((seconds > 0) ? 0.3 : 0) : 0;

        from = from.equals("1") ? "主叫" : "被叫";

        return from + hours + "小时" + minutes + "分钟" + seconds + "秒，收费：" + money + "元";
    }
}
