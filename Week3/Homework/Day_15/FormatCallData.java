package Week3.Homework.Day_15;

/*
[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57],
[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]，
[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]
{1}表示主叫
{0}表示被叫
计算通话时间和通话类型以：【主叫：1分20秒 】的格式输出
 */
public class FormatCallData {
    public static void main(String[] args) {
        String[] data = {
                "[2016][9][8][10][55][3]{1}[2016][9][8][10][58][57]",
                "[2004][2][28][10][55][3]{1}[2004][3][1][10][58][57]",
                "[2005][2][28][10][55][3]{1}[2005][3][1][10][58][57]"
        };

        for (String str : data) {
            formatedString(str);
        }
    }

    public static void formatedString(String string) {
        String start = string.substring(0, string.indexOf('{'));
        String end = string.substring(string.indexOf('}') + 1);
        String from = string.substring(string.indexOf('{') + 1, string.indexOf('}'));
        from = (from.equals("1")) ? "主叫" : "被叫";
        start = start.substring(1, start.length() - 1);
        end = end.substring(1, end.length() - 1);
        // startString endString: [0:year] [1:month] [2:day] [3:hours] [4:minute] [5:seconds]
        String[] startStrings = start.split("\\]\\[");
        String[] endStrings = end.split("\\]\\[");

        // parseInt startString & endString
        int[] startInt = new int[startStrings.length];
        int[] endInt = new int[endStrings.length];

        for (int i = 0; i < startStrings.length; i++) {
            startInt[i] = Integer.parseInt(startStrings[i]);
            endInt[i] = Integer.parseInt(endStrings[i]);
        }

        // get the diff of two time
        int seconds = getSecondsSinceAC(endInt) - getSecondsSinceAC(startInt);

        // transfer seconds to readable time
        int[] lasts = readTime(seconds);

        System.out.println(from + lasts[0] + "小时" + lasts[1] + "分钟" + lasts[2] + "秒");

    }

    // calc the seconds since 00000101 00:00
    public static int getSecondsSinceAC(int[] date) {
        // how many days does the YEAR contains since 00000101
        int daysOfYear = date[0] / 4 - date[0] / 100 + date[0] / 400 + date[0] * 365;

        int daysOfMonths = 0;

        // how many days of the months contains
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        monthDays[1] = (date[0] % 4 == 0 && date[0] % 100 != 0 || date[0] % 400 == 0) ? 29 : 28;
        for (int i = 1; i < date[1]; i++) {
            daysOfMonths += monthDays[i - 1];
        }

        // total days since 00000101
        int totalDays = daysOfYear + daysOfMonths + date[2];

        // return total seconds since 00000101 00:00
        return totalDays * 24 * 60 * 60 + date[3] * 60 + date[4] * 60 + date[5];
    }

    // format total seconds into [0:hours] [1:minutes] [2:seconds]
    public static int[] readTime(int seconds) {
        int[] result = new int[3];
        result[0] = seconds / 3600; // hours
        result[1] = seconds / 60 % 60;
        result[2] = seconds % 60;

        return result;
    }
}
