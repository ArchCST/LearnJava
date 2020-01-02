package Week3.Homework.Day_17;

import java.util.Scanner;

/*
在网络程序中，如聊天室、聊天软件等，经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。
如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”等，这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。
 */
public class WordMask {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请发言：");
//        String input = sc.next();
        String input = "本店新到学生用品一次性饭盒、红色情书专用信封、油爆炸鸡，电影院今晚放映《恐怖游轮》、《三军火枪手》";
        System.out.println(maskWord(input));

    }

    public static String maskWord(String string) {
        StringBuilder sb = new StringBuilder(string);
        String[] dirtyWords = new String[]{
                "性", "色情", "爆炸", "恐怖", "军火", "枪"
        };

        for (String dw : dirtyWords) {
            while (sb.indexOf(dw) != -1) {
                sb.replace(sb.indexOf(dw), sb.indexOf(dw) + dw.length(), "和谐");
            }
        }

        return sb.toString();
    }
}
