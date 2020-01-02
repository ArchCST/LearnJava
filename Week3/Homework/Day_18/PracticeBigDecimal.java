package Week3.Homework.Day_18;

import java.math.BigDecimal;

public class PracticeBigDecimal {
    // 挂号费10元，门诊费10元，办卡费3.5元，药费23.91元，服务费按照总金额的5%收取，求总费用
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10");
        BigDecimal bd2 = new BigDecimal("10");
        BigDecimal bd3 = new BigDecimal("3.5");
        BigDecimal bd4 = new BigDecimal("23.91");
        BigDecimal percent = new BigDecimal("0.05");

        BigDecimal bd5;

        bd5 = bd1.add(bd2).add(bd3).add(bd4);
        bd5 = bd5.add(bd5.multiply(percent));

        bd5 = bd5.setScale(2, BigDecimal.ROUND_HALF_UP);

        System.out.println("共"+ bd5 +"元");

    }
}
