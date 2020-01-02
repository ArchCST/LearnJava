package Week3.Homework.Day_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
（需求）判断简单邮箱的验证示例：wangyijsyy@126.com
规则：邮箱首字母为字母，@符号以前字母数字下划线均可，@符号后与.符号前，字母+数字 ，然后在.后只能是3位字母。
 */
public class ValidateEmail {
    public static void main(String[] args) {
        System.out.println(validateEmail("wangyijsyy@126.com"));
        System.out.println(validateEmail("w@126.123"));
        System.out.println(validateEmail("w23_27@126sldnf.123"));
    }

    public static boolean validateEmail(String email) {
        Pattern p = Pattern.compile("^[a-z]\\w*@[a-zA-Z0-9]*\\.\\d{3}$");
        Matcher matcher = p.matcher(email);

        return matcher.matches();
    }
}
