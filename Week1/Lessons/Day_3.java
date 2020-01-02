package Week1.Lessons;

import java.util.Scanner;

public class Day_3 {
    public static void main(String[] args) {

//        new Day3().switchPractise();
//        new Day3().swapAB();
//        new Day3().precisionAndOverflow();
//        new Day3().logicalOperations();
//        new Day3().isIdentifier();
//        new Day3().classDistribute();
//        new Day3().studentRate();
//        new Day3().divideByTFS();
//        new Day3().leapYear();
//        new Day3().maxOfThree();

    }

    /*
     * 不用第三个数交换两个数
     */
    public static void swapAB() {
        int a = 7;
        int b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void precisionAndOverflow() {
        /*
         * 精度问题
         * 1.10 换算成二进制为 1.00011001100110011... 无限循环，会丢失掉尾数
         */
        double a = 2.00;
        double b = 1.10;
        System.out.println(a - b);

        /*
         * 为什么 d = 44？
         * 因为 300 = 0001 0010 1100，而 byte 只有 0000 0000，所以截取了后八位 0010 1100，结果为 44
         */
        int c = 300;
        byte d = (byte) c;
        System.out.println(d);
    }

    /*
     * 逻辑运算符：
     * 与：& and （一个 false 则为 false）
     * 或：| or  （一个 true 则为 true）
     * 非：! not （取反）
     */
    public static void logicalOperations() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符：");
        int score = sc.nextInt();
        if (score >= 60 && score < 90) {
            System.out.println("你的分数是" + score + "，平行班！");
        } else if (score > 90 || score == 0) {
            System.out.println("你的分数是" + score + "，火箭班！");
        } else {
            System.out.println("你的分数是" + score + "，回炉重造！");
        }
    }

    /*
    1，判断一个字符是否为数字;
    2，判断一个字符是否为字母;
    3，判断一个字符是否为标识符字符;
     */
    public static void isIdentifier() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符：");
        int chInt = sc.next().charAt(0);
        if (chInt > 47 && chInt < 58) {
            System.out.println("这是一个数字，数字是标识符");
        } else if ((chInt >= 65 && chInt <= 90) || (chInt >= 97 && chInt <= 122)) {
            System.out.println("这是一个字母，字母是标识符");
        } else if (chInt == 95 || chInt == 36) {
            System.out.println("这是一个标识符");
        } else {
            System.out.println("这不是一个标识符");
            System.out.println("字符的 ASCII 码为：" + chInt);
        }
    }

    /*
     * 跟据成绩分班
     */
    public static void classDistribute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的成绩：");

        int score = sc.nextInt();

        if (score > 90) {
            System.out.println("进入火箭班！");
        } else if (score > 60) {
            System.out.println("进入平行班！");
        } else if (score >= 0) {
            System.out.println("回炉重造！");
        } else {
            System.out.println("成绩无效！");
        }
    }

    /*
     * 跟据成绩判断等级
     */
    public static void studentRate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        double score = sc.nextDouble();

        if (score >= 80 && score <= 100) {
            System.out.println("你的分数是" + score + "，优秀");
        } else if (score >= 70) {
            System.out.println("你的分数是" + score + "，良好");
        } else if (score >= 60) {
            System.out.println("你的分数是" + score + "，及格了！");
        } else if (score >= 0) {
            System.out.println("你的分数是" + score + "，不及格！");
        } else {
            System.out.println("输入有误");
        }
    }

    /*
     * 请输入一个数，判断能不能被3、5、7整除
     */
    public static void divideByTFS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数，判断能不能被3、5、7整除：");
        int num = sc.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " 能被 3 整除");
        }
        if (num % 5 == 0) {
            System.out.println(num + " 能被 5 整除");
        }
        if (num % 7 == 0) {
            System.out.println(num + " 能被 7 整除");
        }
    }

    /*
     * 输入一个年份，判断是不是闰年
     */
    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入任意年份，判断是不是闰年：");
        int year = sc.nextInt();
//        if (year % 4 == 0) {
//            if (year % 400 != 0 && year % 100 == 0) {
//                System.out.println("不是闰年！");
//            } else {
//                System.out.println("是闰年！");
//            }
//        } else {
//            System.out.println("不是闰年！");
//        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("是闰年！");
        } else {
            System.out.println("不是闰年！");
        }
    }

    /*
     * 定义三个数，求出其中的最大值
     */
    public static void maxOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        double a = sc.nextDouble();
        System.out.print("请输入第二个数字：");
        double b = sc.nextDouble();
        System.out.print("请输入第三个数字：");
        double c = sc.nextDouble();

        if (a >= b && a >= c) {
            System.out.print("第一个数字");
        } else if (b >= a && b >= c) {
            System.out.print("第二个数字");
        } else {
            System.out.print("第三个数字");
        }
        System.out.println("最大");
    }

    /*
     * Switch 练习
     * Switch 变量只能是：
     *     byte short int char String 枚举类型
     */
    public static void switchPractise() {
        Scanner sc = new Scanner(System.in);
        char rate = sc.next().charAt(0);
        switch (rate) {
            case 'a':
                System.out.println("A级");
                break;
            default:
                System.out.println("下次再来！");
                break;
            case 'b':
                System.out.println("B级");
                break;
            case 'c':
                System.out.println("C级");
                break;
        }
    }
}

