package Week1.Homework;

import java.util.Scanner;

public class Day_3 {
    public static void main(String[] args) {
//        login();
//        whatIsTheChar();
        byte_128();
//        intCharByteMinus1();
    }

    /*
     * 完成用户登录功能：
     *     控制台提示用户输入账号、密码
     *     分别判断账号和密码
     */
    public static void login() {
        // Setup right account and password
        String rightName = "admin";
        String rightPass = "123456";

        // Read account from console
        Scanner sc = new Scanner(System.in);
        System.out.print("Account: ");
        String inputName = sc.next();

        // Validate account
        if (!inputName.equals(rightName)) {
            System.out.println("No account: " + inputName);
        } else {
            // Read password from console
            System.out.print("Password: ");
            String inputPass = sc.next();

            // Validate password
            if (!inputPass.equals(rightPass)) {
                System.out.println("Wrong password!");
            } else {
                System.out.println("Success!");
            }
        }


    }

    /*
     * 字符判断：
     *     读取输入字符，判断是数字、大写字母、小写字母或其它
     */
    public static void whatIsTheChar() {
        // New Scanner object
        Scanner sc = new Scanner(System.in);

        // Read from console and get the ASCII code
        System.out.print("Please input a character: ");
        int inputCode = sc.next().charAt(0);

        // Number?
        if (inputCode >= 47 && inputCode <= 58) {
            System.out.println("This is a Number");
        } else if (inputCode >= 65 && inputCode <= 90) {
            System.out.println("This is a capital letter");
        } else if (inputCode >= 97 && inputCode <= 122) {
            System.out.println("This is a lowercase letter");
        } else {
            System.out.println("This is a Symbol or none-ASCII character");
        }

    }

    /*
     * System.out.println((byte)128); 值是什么，为什么？
     */
    public static void byte_128() {
        System.out.println("反码和补码的计算方法：");
        System.out.println("    1. 正数的 反码 和 原码 相同");
        System.out.println("    2. 正数的 补码 和 原码 也相同");
        System.out.println("    3. 负数的 反码 符号位不变其余的按位取反");
        System.out.println("    4. 负数的 补码 则是其反码+1");
        System.out.println("    5. 补码的补码就是原码");
        System.out.println("");
        System.out.println("   (int) 128 = [0000 000 0000 0000 1000 0000]原0000 0000 0");
        System.out.println("正数补码不变 = [0000 0000 0000 0000 0000 0000 1000 0000]补");
        System.out.println("强转 byte 丢弃高位              (byte) 128 = [1000 0000]补");
        System.out.println("");
//        System.out.println("Java 在处理 byte、short、char 时会转换为 int 来操作，并分配 4 Byte 内存");
//        System.out.println("  (byte) 128 = [1111 1111 1111 1111 1111 1111 1000 0000]补");
//        System.out.println("");
        System.out.println("System.out.println((byte)128); --> " + (byte) 128);
        System.out.println("内存中就是 [1000 0000]补，但人读要转原码，计算过程如下：");
        System.out.println("补码的补码即为原码，负数的补码符号位不变其余位按位取反后+1：");
        System.out.println("[(1)000 0000]补 = [(1)111 1111]反 = [(1) 1000 0000]原 = 十进制 -128");
        System.out.println(" (1)为不参与计算的符号位 (负号)");
        System.out.println("");
        System.out.println("[(1) 1000 0000]原 只是方便人读的原码，并非内存中的值，内存中依旧是 [1000 0000]补，并没有第9位。");
        System.out.println("这也是为什么 byte 负数边界的绝对值（128）比正数边界（127）大1的另一个解释。");
    }

    /*
     * System.out.println((int)(char)(byte)-1)的输出结果是什么，为什么？
     */
    public static void intCharByteMinus1() {
        System.out.println(" (byte) -1  =  [1000 0001]原  =  [1111 1110]反  =  [1111 1111]补");
        System.out.println("转 char，高位补符号位 (char) (byte) -1 = [1111 1111 1111 1111]补");
        System.out.println("由于 char 取值范围是 0 ~ 65535，故无符号位，转 int 高位补0：");
        System.out.println("(int) (char) (byte) -1 = [0000 0000 0000 0000 1111 1111 1111 1111]补");
        System.out.println("                       = [0000 0000 0000 0000 1111 1111 1111 1111]原 = 十进制 65535");
        System.out.println("System.out.println((int) (char) (byte) -1); --> " + (int) (char) (byte) -1);
    }
}
