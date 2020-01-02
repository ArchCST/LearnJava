package Week1.Homework;

import java.util.Scanner;

public class Day_4 {
    public static void main(String[] args) {

//        narcissistic();

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please input x: ");
//        int x = sc.nextInt();
//        System.out.print("Please input y: ");
//        int y = sc.nextInt();
//        System.out.println(power(x,y));

//         grabBall();
//         multiTable();
//         bullEyes();
        validateNumber();
    }

    // 水仙花数
    public static void narcissistic() {
        for (int i = 100; i <= 999; i++) {
            int n1 = i / 100;
            int n2 = i / 10 % 10;
            int n3 = i % 10;
            int count = 0;
            if (power(n1, 3) + power(n2, 3) + power(n3, 3) == i) {
                count++;
                System.out.println("第" + count + "组：" + i);
            }
        }
    }

    // 次方计算
    public static double power(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            double result = 1;
            boolean isMinus = y < 0;
            y = (isMinus) ? -y : y;
            for (int i = 0; i < y; i++) {
                result *= x;
            }
            result = (isMinus) ? 1 / result : result;
            return result;
        }
    }

    // 50 枚 1、2、5 分硬币兑 1 元，有多少种组合
    public static void grabBall() {
        int times = 0;
        int count = 0;
        for (int coin_5 = 0; coin_5 <= 20; coin_5++) {
            for (int coin_2 = 0; coin_2 <= ((100 - coin_5 * 5) / 2); coin_2++) {
                times++;
                if (coin_2 + coin_5 > 50) {
                    break;
                }
                int coin_1 = 50 - coin_2 - coin_5;

                if (coin_1 + coin_2 * 2 + coin_5 * 5 == 100) {
                    count++;
                    System.out.println("组合" + count + "：" + coin_1 + "个1分，" + coin_2 + "个2分，" + coin_5 + "个5分");
                }
            }
        }
        System.out.println("内层循环：" + times + "次");
    }

    // 九九乘法表
    public static void multiTable() {
        for (int y = 1; y <= 9; y++) {
            for (int x = 1; x <= y; x++) {
                String p = x + " x " + y + " = " + x * y;
                p = (p.length() == 9) ? p + "    " : p + "   ";
                System.out.print(p);
            }
            System.out.println();
        }
    }

    // 用户输入猜 200 以内的数字
    public static void bullEyes() {
        Scanner sc = new Scanner(System.in);
        int target = (int) (Math.random() * 200);
        int guess = 0;

        System.out.print("Guess a number: ");
        guess = sc.nextInt();
        int times = 1;

        do {
            times++;

            if (guess > target) {
                System.out.print("Too large, guess again: ");
            } else if (guess != target) {
                System.out.print("Too small, guess again: ");
            }
            guess = sc.nextInt();

        } while (guess != target);

        System.out.println("Congrats! the answer is " + target + ", you tried " + times + " times!");

    }

    // 用户输入字符串，判断是否能转换成数字
    public static void validateNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a string, we'll see if it's a number: ");
        String input = sc.next();
        boolean isNumber = true;
        boolean isFloat = false;

        for (int i = 0; i < input.length(); i++) {

            // '-' must be placed at first
            if (input.charAt(i) == '-') {
                if (i != 0) {
                    isNumber = false;
                    break;
                }
            }

            // There can't be two '.'
            else if (input.charAt(i) == '.') {
                // '.' can't be at last
                if (i == input.length() - 1) {
                    isNumber = false;
                    break;
                }

                if (isFloat) {
                    isNumber = false;
                    break;
                }

                // '.' must placed after a number (for human)
                else {
                    boolean numBeforeDot = false;
                    for (int j = 0; j < i; j++) {
                        if (input.charAt(j) >= 47 && input.charAt(j) <= 58) {
                            numBeforeDot = true;
                            break;
                        }
                    }
                    if (!numBeforeDot) {
                        isNumber = false;
                        break;
                    }
                    isFloat = true;
                }
            }

            // The end of the string can be L/l or F/f
            else if (input.charAt(i) == 'l'
                    || input.charAt(i) == 'L'
                    || input.charAt(i) == 'f'
                    || input.charAt(i) == 'F') {
                if (i != input.length() - 1) {
                    isNumber = false;
                    break;
                }
            }

            // all other char's ASCII should between [47, 58]
            else if (input.charAt(i) < 47 || input.charAt(i) > 58) {
                isNumber = false;
                break;
            }
        }

        // Feedback to user
        String feedback = (isNumber) ? "This is a number!" : "This is not a number!";
        System.out.println(feedback);
    }
}
