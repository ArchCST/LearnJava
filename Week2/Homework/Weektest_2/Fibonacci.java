package Week2.Homework.Weektest_2;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci_1(15));
        System.out.println(fibonacci_2(15));
    }

    // 变量实现
    public static int fibonacci_1(int n){
        if (n == 1 || n == 2) {
            return 1;
        } else if (n < 1) {
            return -1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // 递归实现
    public static int fibonacci_2(int n){
        if (n == 1 || n == 2) {
            return 1;
        } else if (n < 1) {
            return -1;
        } else {
            return fibonacci_2(n-1)+ fibonacci_2(n-2);
        }
    }

}
