package Week3.Lessons.Day_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        String[] qqs = {
                "287128719247918742",
                "183183s123",
                "1234",
                "01237412",
                "11111111111",
                "111111111111",
        };

        for (String str : qqs) {
            System.out.println(str+": "+validateQQWithRegex(str));
        }


        Pattern p = Pattern.compile(".+");
        Matcher matcher = p.matcher("");
        System.out.println(matcher.matches());

    }

    // 用 String 实现验证
    public static boolean validateQQ(String qq){
        if (qq.length() < 5 || qq.length() > 11) {
            return false;
        } else if (qq.charAt(0) == '0') {
            return false;
        } else {
            for (char ch : qq.toCharArray()) {
                if (ch < '0' || ch > '9') {
                    return false;
                }
            }
        }

        return true;
    }

    // 用正则表达式实现验证
    public static boolean validateQQWithRegex(String qq) {
        Pattern pattern = Pattern.compile("^[1-9][0-9]{4,10}$");
        Matcher matcher = pattern.matcher(qq);

        return matcher.matches();
    }
}
