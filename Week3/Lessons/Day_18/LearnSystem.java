package Week3.Lessons.Day_18;

import java.util.Arrays;
import java.util.Properties;

public class LearnSystem {
    public static void main(String[] args) {
        // 获取系统时间戳，可用来测试框架速度
        long cm = System.currentTimeMillis();

        // 数组的copy
        int[] i1 = {1,2,3,4,2,3,4,5};
        int[] i2 = new int[10];
        // 参数：1. 源数据 2. 源数据偏移量 3. 目标数据 4. 目标数据偏移时 5. 长度
        System.arraycopy(i1, 2, i2, 3, 6);
        System.out.println(Arrays.toString(i2));

        // 退出程序，参数是退出状态码
        System.exit(0);

        // 获取系统资源
        Properties properties = System.getProperties();
        String path = System.getProperty("java.class.path");
        System.out.println(path);
    }
}
