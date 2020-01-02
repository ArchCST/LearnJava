package Week3.Homework.Day_15;

/*
编写程序将 “jdk” 全部变为大写,并输出到屏幕,“woniuxyteachjdkjdkisjava”
将一个字符串进行反转。例：”abcdefg”反转成“gfedcba”.
如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为:
“D:\myDonload\SogouExplorer\8.0.5.28300\LocalPage\test.java”判断这段字符串是否为java文件
已知一个18位身份证号码（字符串），求出其出生年月日(格式:1990年3月1号或1991年11月29号)
给定一个字符串，要求将其中的-全部替换为空字符串(13131-dewfre-113213-131231)-->(13131dewfre113213131231)
 */

/*

 */
public class StringAPI {
    public static void main(String[] args) {
        upperCaseJDK();
        reverseString();
        System.out.println();
        findBCB();
        System.out.println();
        isJava();
        birthOfId();
        reverseString();
        replaceDash();

    }

    // 编写程序将 “jdk” 全部变为大写,并输出到屏幕,“woniuxyteachjdkjdkisjava”
    public static void upperCaseJDK() {
        String str = "woniuxyteachjdkjdkisjava";
        System.out.println(str.replace("jdk", "JDK"));
    }

    //将一个字符串进行反转。例：”abcdefg”反转成“gfedcba”.
    public static void reverseString() {
        String str = "abcdefg";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    // 如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为:
    public static void findBCB() {
        String str = "abcbcbabcb34bcbd";
        int index = 0;

        do {
            index = str.indexOf("bcb", index);
            System.out.print(index++ + " ");
        } while (str.indexOf("bcb", index) != -1);
        //    } while (index != 0);
    }

    // “D:\myDonload\SogouExplorer\8.0.5.28300\LocalPage\test.java”判断这段字符串是否为java文件
    public static void isJava() {
        String str = "D:\\myDonload\\SogouExplorer\\8.0.5.28300\\LocalPage\\test.java";
        if (str.endsWith(".java")) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }

    // 已知一个18位身份证号码（字符串），求出其出生年月日(格式:1990年3月1号或1991年11月29号)
    public static void birthOfId() {
        String id = "510106190012120234";
        String birth = id.substring(6,10) + "年" + id.substring(10,12) + "月" + id.substring(12, 14) + "日";

        System.out.println(birth);
    }

    // 给定一个字符串，要求将其中的-全部替换为空字符串(13131-dewfre-113213-131231)-->(13131dewfre113213131231)
    public static void replaceDash() {
        String str = "13131-dewfre-113213-131231";
        System.out.println(str.replace("-", ""));
    }
}
