package Week3.Lessons.Day_18;

import Week2.Lessons.Day_11.area.B;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
科学计算法类
 */
public class LearnBigDecimal {
    public static void main(String[] args) {
        // double 类型在底层存储是，是舍去了一部分小数点位。并不是一个精准的定点数
        BigDecimal bd1 = new BigDecimal(10.0);
        BigDecimal bd2 = new BigDecimal(3.0);

        // 所以一般是使用字符串创建 BigDecimal
        BigDecimal bigDecimal1 = new BigDecimal("1");
        BigDecimal bigDecimal2 = new BigDecimal("2");
        BigDecimal bigDecimal3;

        bigDecimal3 = bigDecimal1.divide(bigDecimal2, 0, RoundingMode.DOWN);
        System.out.println(bigDecimal3);
        bigDecimal3 = bigDecimal1.divide(bigDecimal2, 0, RoundingMode.UP);
        System.out.println(bigDecimal3);
        bigDecimal3 = bigDecimal1.divide(bigDecimal2, 0, RoundingMode.HALF_DOWN);
        System.out.println(bigDecimal3);
        bigDecimal3 = bigDecimal1.divide(bigDecimal2, 0, RoundingMode.HALF_UP);
        System.out.println(bigDecimal3);
        bigDecimal3 = bigDecimal1.divide(bigDecimal2, 0, RoundingMode.HALF_EVEN);
        System.out.println(bigDecimal3);
        BigDecimal b = new BigDecimal("0.000000100000000");
        System.out.println(b.stripTrailingZeros().toString());
        System.out.println(b.stripTrailingZeros().toPlainString());
    }
}
