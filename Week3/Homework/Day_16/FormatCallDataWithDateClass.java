package Week3.Homework.Day_16;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLFault;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57],
[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]，
[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]
{1}表示主叫
{0}表示被叫
计算通话时间和通话类型以：【主叫：1分20秒 】的格式输出
 */
public class FormatCallDataWithDateClass {
    public static void main(String[] args) throws ParseException {
        String[] data = {
                "[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]",
                "[2004][2][28][10][55][3]{1}[2004][3][1][10][58][57]",
                "[2005][2][28][10][55][3]{1}[2005][3][1][10][58][57]"
        };

        for (String str : data) {
            formatedString(str);
        }
    }

    public static void formatedString(String string) throws ParseException {
        String start = string.substring(0, string.indexOf('{'));
        String end = string.substring(string.indexOf('}') + 1);
        String from = string.substring(string.indexOf('{') + 1, string.indexOf('}'));
        from = (from.equals("1")) ? "主叫" : "被叫";
        start = start.substring(1, start.length() - 1);
        end = end.substring(1, end.length() - 1);

        // startString endString: [0:year] [1:month] [2:day] [3:hours] [4:minute] [5:seconds]
        String[] startStrings = start.split("\\]\\[");
        String[] endStrings = end.split("\\]\\[");

        for (int i = 1; i < startStrings.length; i++) {
            if (startStrings[i].length() < 2) {
                startStrings[i] = "0"+startStrings[i];
            }
            if (endStrings[i].length() < 2) {
                endStrings[i] = "0"+endStrings[i];
            }
        }
        // calc the call lasts
        Date lasts = calcLasts(startStrings, endStrings);

        // money calc
        double money = 0;
        if (from.equals("主叫")) {
            money = calcMoney(lasts);
        }

        long seconds = lasts.getTime() / 1000;

        long[] result = readTime(seconds);

        System.out.println(from+result[0]+"小时"+result[1]+"分钟"+result[2]+"秒"+"，收费："+money+"元");


    }

    public static Date calcLasts(String[] startStrings, String[] endStrings) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        StringBuffer startBuffer = new StringBuffer();
        StringBuffer endBuffer = new StringBuffer();
        for (int i = 0; i < startStrings.length; i++) {
            startBuffer.append(startStrings[i]);
            endBuffer.append(endStrings[i]);
        }

        System.out.println(startBuffer.toString());
        System.out.println(endBuffer.toString());

        Date startDate = simpleDateFormat.parse(startBuffer.toString());
        Date endDate = simpleDateFormat.parse(endBuffer.toString());

        Date lasts = new Date(endDate.getTime() - startDate.getTime());

        System.out.println(lasts);

        return lasts;
    }

    public static double calcMoney(Date lasts) {
        double money = (lasts.getTime() / 1000 / 60) * 0.3;
        return money;
    }


    public static long[] readTime(long seconds) {
        long[] result = new long[3];
        result[0] = seconds / 3600; // hours
        result[1] = seconds / 60 % 60;
        result[2] = seconds % 60;

        return result;
    }
}
