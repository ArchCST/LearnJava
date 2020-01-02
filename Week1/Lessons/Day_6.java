package Week1.Lessons;
import java.util.Scanner;

public class Day_6 {
    public static void main(String[] args) {
        new Day_6().callFuncs();
    }

    // 简化调用
    public void callFuncs() {
//        print();
//        System.out.println(getMax());
        System.out.println(getGrade(65));

    }

    // 无参无返回值方法，打印输入的整数
    public void print() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input a Integer: ");
        int input = sc.nextInt();

        System.out.println(input);
    }

    // 无参数有返回值方法，返回输入两数中的较大数
    public int getMax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input 1st integer: ");
        int a = sc.nextInt();
        System.out.print("Please input 2nd integer: ");
        int b = sc.nextInt();

        return (a > b) ? a : b;
    }

    // 有参数有返回值方法，传入整数成绩，判断不及格、及格、良、优
    public String getGrade(int score) {
        if (score > 90 && score < 100) {
            return "优";
        } else if (score > 80) {
            return "良";
        } else if (score > 60) {
            return "及格";
        } else if (score > 0) {
            return "不及格";
        } else {
            return "输入有勿";
        }
    }
}
