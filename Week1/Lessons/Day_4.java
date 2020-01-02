package Week1.Lessons;

import java.util.Scanner;

public class Day_4 {
    public static void main(String[] args) {
//        loginV3();
//        animal();
//        classifyChars();
//        addTo500();
//        login();
//        evenIn100();
//        mod_100();
//        print_100();
    }

    // 打印 0 ~ 100
    public static void print_100() {
        // while
        int num = 1;
        while (num <= 100) {
            System.out.print(num + " ");
            num++;
        }

        System.out.println();

        // do ... while
        num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 100);

        System.out.println();

        // for (初始化操作1;循环条件2;步进4) {代码块3}
        // 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> 3 -> 4(false)
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    // 打印所有能整除100的正除数
    public static void mod_100() {
        // while
        int num = 1;
        while (num <= 100) {
            if (100 % num == 0) System.out.println(num);
            num++;
        }

        // do while
        num = 1;
        do {
            if (100 % num == 0) System.out.println(num);
            num++;
        } while (num <= 100);

        // for
        for (num = 1; num <= 100; num++) {
            if (100 % num == 0) System.out.println(num);
        }
    }

    // 打印 100 以内所有偶数，只要前 10 个
    public static void evenIn100() {
        // while
        int num = 100;
        int count = 0;
        while (num >= 0) {
            if (num % 2 == 0) {
                System.out.print(" " + num);
                count++;
            }

            if (count == 10) break;

            num--;
        }

        System.out.println();
        // do while
        num = 100;
        do {
            if (num % 2 == 0) System.out.print(" " + num);
            num--;
        } while (num >= 0);

        System.out.println();
        // for
        for (num = 0; num <= 100; num++) {
            if (num % 2 == 0) System.out.print(" " + num);
        }
    }

    // 模拟登录
    public static void login() {
        String username = "admin";
        String password = "123456";
        String inputUser;
        String inputPass;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Account: ");
            inputUser = sc.next();
            System.out.print("Password: ");
            inputPass = sc.next();
        } while (!(inputUser.equals(username) && inputPass.equals(password)));

        System.out.println("Login success!");
    }

    // 100 加到 500
    public static void addTo500() {
        int result = 0;
        for (int i = 100; i <= 500; i++) {
            result += i;
        }
        System.out.println(result);
    }

    // 统计字符：从键盘上输入一个字符串，统计这个字符串当中包含几个大写字母，几个小写字母，几个数字，几个特殊符号；
    public static void classifyChars(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input a String: ");
        String str = sc.next();
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        int symbolCount = 0;

        for (int i = 0; i < str.length(); i++) {
            int charInt = str.charAt(i);
            if (charInt >= 47 && charInt <= 58) {
                numCount++;
            } else if (charInt >= 65 && charInt <= 90) {
                upperCount++;
            } else if (charInt >= 97 && charInt <= 122) {
                lowerCount++;
            } else {
                symbolCount++;
            }
        }
        System.out.println("Number: "+ numCount);
        System.out.println("Capitals: "+ upperCount);
        System.out.println("Lowercase: "+ lowerCount);
        System.out.println("Symbols: "+ symbolCount);
    }

    // 鸡兔同笼35个头94只脚用 鸡有多少只 兔有多少只java程序解决;
    public static void animal() {
        int head = 35;
        int foot = 94;
        int chicken = 35;
        int rabbit = foot/4;

        while (((chicken*2 + rabbit*4) != foot) || (chicken + rabbit != 35)) {
            chicken--;
            rabbit = 35 - chicken;
        }

        System.out.println("Chicken: "+chicken);
        System.out.println("Rabbit: "+rabbit);
    }

    // 密码验证：尝试将上述的用户名和密码验证分进行，即如果用户名输入错误，则不需要再提示输入密码，只有当用户名正确的情况下，我们才提示输入密码,并且机会只有3次;
    public static void loginV3() {
        // Setup right account and password
        String rightName = "admin";
        String rightPass = "123456";
        String inputName;
        String inputPass;
        int times = 3;
        Scanner sc = new Scanner(System.in);

        for (times = 3; times > 0; times--) {
            System.out.println(times+" times left.");
            System.out.print("Account: ");
            inputName = sc.next();

            if (inputName.equals(rightName)) {
                System.out.print("Password: ");
                inputPass = sc.next();

                if (inputPass.equals(rightPass)) {
                    System.out.println("Success!");
                    break;
                }
            }
        }
    }

}
