package Week1.Lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Day_5 {
    public static void main(String[] args) {
//        forEach();
//         meetArray();
//        sort();
         /* 电话号码判断
        String[] tels = {
                "12345678901",
                "23457325802",
                "1232323244",
                "13880137880",
                "12382489a23",
                "123989283781"
        };

        for (String tel : tels) {
            System.out.println(isTel(tel));
        }
        */

        Scanner sc = new Scanner(System.in);

//        String str = sc.next();

    }

    public static boolean isTel(String str) {
        int i;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 47 || str.charAt(i) > 58) {
                break;
            }
        }

//        if (str.charAt(0) != '1' || i != 11) {
//            return false;
//        } else {
//            return true;
//        }

        /* 精华！*/
        return str.charAt(0) == '1' && i == 11;
    }

    public static void sort() {
        int[][] a = {
                {2, 3, 4},
                {3, 5, 4},
                {5, 4, 6},
                {6, 7, 5},
                {8, 6, 7},
                {9, 8, 7},
        };

        for (int[] tmp : a) {
            if (tmp[0] > tmp[1]) {
                tmp[0] ^= tmp[1];
                tmp[1] ^= tmp[0];
                tmp[0] ^= tmp[1];
            }

            if (tmp[1] > tmp[2]) {
                tmp[1] ^= tmp[2];
                tmp[2] ^= tmp[1];
                tmp[1] ^= tmp[2];
            }

            if (tmp[0] > tmp[1]) {
                tmp[0] ^= tmp[1];
                tmp[1] ^= tmp[0];
                tmp[0] ^= tmp[1];
            }
        }

        for (int[] p : a) {
            for (int pp : p) {
                System.out.print(pp + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(a));
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
    }

    public static void meetArray() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8, 4, 2, 1, 23, 344, 12};

        System.out.print("Guess a number, we'll see if it's in the arr: ");
        boolean guessed = false;
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i]) {
                guessed = true;
            }
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Sum is " + sum);
        if (guessed) {
            System.out.println("Yes it's there");
        } else {
            System.out.println("No it isn't there");
        }
    }

    /*
    定义两个 int 型数组 firstBuf 的 secondBuf，将其连接为一个大数组 buf。
    对 buf 数组进行升序排序，要求不使用自带的 sort 方法
     */
    public static void forEach() {
        int[] firstBuf = {4, 7, 3, 1, 6};
        int[] secondBuf = {5, 8, 2, 4, 9};
        int[] buf = new int[(firstBuf.length + secondBuf.length)];

        for (int i = 0; i < buf.length; i++) {
            if (i < firstBuf.length) {
                buf[i] = firstBuf[i];
            } else {
                buf[i] = secondBuf[i - firstBuf.length];
            }
        }

        System.out.println(Arrays.toString(bubbleSort(buf)));
        System.out.println(Arrays.toString(selectSort(buf)));
    }

    // 冒泡排序
    public static int[] bubbleSort(int[] arr) {
        int times = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            boolean isSwapped = false;
            for (int j = 0; j < i - 1; j++) {
                times++;
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        System.out.println("bubbleSort times: " + times);
        return arr;
    }

    // 选择排序
    public static int[] selectSort(int[] arr) {
        int maxIndex;
        int times = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            maxIndex = 0;
            int j;
            for (j = 0; j <= i; j++) {
                times++;
                maxIndex = (arr[j] > arr[maxIndex]) ? j : maxIndex;
            }
            if (i != maxIndex) {
                arr[i] ^= arr[maxIndex];
                arr[maxIndex] ^= arr[i];
                arr[i] ^= arr[maxIndex];
            }
        }
        System.out.println("selectSort times: " + times);
        return arr;
    }

    //二维数组实现用户登录
    public static void loginV4() {
        String[][] accounts = {
                {"xumin", "beautiful"},
                {"chenshitong", "handsome"},
                {"gaoletian", "soso"},
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUser = sc.next();
        String inputPass;
        boolean exists = false;
        int times = 3;

        for (String[] acc : accounts) {
            if (inputUser.equals(acc[0])) {
                exists = true;
                do {
                    if (times == 0) {
                        System.out.println("Try again later.");
                        break;
                    }
                    System.out.print("Password: ");
                    inputPass = sc.next();
                    if (inputPass.equals(acc[1])) {
                        System.out.println("Success!");
                    } else {
                        System.out.println("Wrong password.");
                        times--;
                    }
                } while (!inputPass.equals(acc[1]));
            }
        }

        if (!exists) {
            System.out.println("User doesn't exists.");
        }
    }

}

