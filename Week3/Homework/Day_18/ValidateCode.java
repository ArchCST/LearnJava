package Week3.Homework.Day_18;

import java.util.Random;
import java.util.Scanner;

public class ValidateCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 生成验证码
            String vc = new ValidateCode().vcString();
            System.out.print("请输入括号中的验证码(" + vc + ")：");
            String input = sc.next();

            // 大小写不敏感
            if (input.toLowerCase().equals(vc.toLowerCase())) {
                System.out.println("验证成功！");
            } else {
                System.out.println("验证失败！");
            }
        }
    }

    public String vcString() {
        String vc = "";
        Random r = new Random();

        // 字符串中 0 代表任意，1代表数字，2代表小写字母，3代表大写字母
        StringBuilder types = new StringBuilder("0123");

        while (vc.length() < 4){
            char type = types.charAt(r.nextInt(types.length()));
            char ch = vcChar(type);
            if (!vc.contains(ch+"")) {
                vc += ch;
                types.deleteCharAt(types.indexOf(type+""));
            }
        }
        return vc;
    }

    public char vcChar(char type) {
        Random r = new Random();

        // 用参数控制生成的类型，0为参数时随机生成
        if (type == '0') {
            type = (char) (r.nextInt(3) + '1');
        }

        switch (type) {
            case '1':
                return (char) ('0' + r.nextInt(10));
            case '2':
                return (char) ('a' + r.nextInt(26));
            case '3':
                return (char) ('A' + r.nextInt(26));
        }

        return '0';
    }
}
