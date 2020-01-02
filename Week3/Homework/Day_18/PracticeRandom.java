package Week3.Homework.Day_18;

import com.sun.xml.internal.xsom.impl.SchemaImpl;

import java.util.Random;
import java.util.Scanner;

public class PracticeRandom {
    private int lengthOfVC = 6;
    public static void main(String[] args) {

        PracticeRandom practiceRandom = new PracticeRandom();
        String vc = practiceRandom.generateVC();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入括号中的验证码(" + vc + ")：");
        String input = sc.next();

        if (input.equals(vc)) {
            System.out.println("验证成功！");
        } else {
            System.out.println("验证失败！");
        }

    }

    // 跟据 lengthOfVC 设定的长度生成验证字符串
    public String generateVC() {
        StringBuilder sb = new StringBuilder();
        char[] chs = new char[lengthOfVC];

        while (sb.length() < lengthOfVC) {
            char ch = generateChar();
            if (sb.indexOf(ch+"") == -1) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    // 生成单个的数字或大小写字符
    public char generateChar() {
        Random r = new Random();
        int type = r.nextInt(3);
        char ch = '0';
        switch (type) {
            case 0:
                // [48, 57] 数字
                ch = (char) (r.nextInt(10) + '0');
                break;
            case 1:
                // [65，90] 大写
                ch = (char) (r.nextInt(26) + 'A');
                break;
            case 2:
                // [97，122] 小写
                ch = (char) (r.nextInt(26) + 'a');
                break;
        }
        return ch;
    }
}
