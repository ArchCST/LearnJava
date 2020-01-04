package Week3.Homework.Day_19;

import java.sql.SQLOutput;
import java.util.Date;

/*
找到日常常见的三个异常
 */
public class FindExceptions {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            for (int i = 0; i <= arr.length; i++){
                arr[i] = i;
            }
        } catch (Exception e) {
            System.out.println("数组越界异常");
        }

        String[] strs = new String[5];
        strs[1] = "abc";
        strs[2] = "abc";
        try {
            for (String str : strs) {
                str.indexOf("ab");
            }
        } catch (Exception e) {
            System.out.println("空指针异常");
        }

        try {
            int i = 3/0;
        } catch (Exception e) {
            System.out.println("除0异常");
        }
    }
}
