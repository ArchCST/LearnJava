package Week2.Homework.Weektest_2;

import java.util.Arrays;

public class Pascal {
    public static void main(String[] args) {
//        myPascal(5);
        formatPascal(20);
    }

    public static void myPascal(int level){
        int[] previous = new int[]{1};
        int[] current = new int[]{1, 1};

        pascalPrint(previous);
        pascalPrint(current);

        level -= 2;

        for (int lv = 0; lv < level; lv++) {
            previous = current;
            current = new int[previous.length+1];
            current[0] = 1;
            current[previous.length] = 1;
            for (int i = 0; i < previous.length - 1; i++) {
                current[i+1] = previous[i] + previous[i+1];
            }
            pascalPrint(current);
        }
    }

    public static void pascalPrint(int[] array){
        for (int a : array) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static int[][] formatPascal(int level) {
        int[][] pascal = new int[level][level];
        pascal[1][1] = 1;

        for (int[] arr : pascal) {
            arr[0] = 1;
        }

        // 生成杨辉三角数据
        for (int lv = 2; lv < level; lv++){
            for (int i = 0; i < lv; i++) {
                pascal[lv][i+1] = pascal[lv - 1][i] + pascal[lv - 1][i+1];
            }
        }

        // 找到最大数的位数
        int middle = (level % 2 == 0) ? level / 2 : (level + 1) / 2;
        int maxLength = String.valueOf(pascal[level - 1][middle]).length();

        // 格式化输出杨辉三角
        for (int i = 0; i < level; i++) {
            // 打印本行前的空格
            for (int n = 1; n < level - i; n++) {
                for (int x = 0; x < maxLength; x++)
                System.out.print(" ");
            }

            // 打印本行
            for (int j = 0; j <= i; j++) {
                int eleLen = String.valueOf(pascal[i][j]).length();
                int headSpace = ((maxLength - eleLen) % 2 == 0) ? (maxLength - eleLen) / 2 : (maxLength - eleLen) /2 + 1;
                for (int m = 0; m <= headSpace; m++){
                    System.out.print(" ");
                }
                System.out.print(pascal[i][j]);
                for (int m = 0; m <= maxLength - eleLen - headSpace; m++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        return pascal;
    }
}
