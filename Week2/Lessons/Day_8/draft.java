package Week2.Lessons.Day_8;

public class draft {
    /*
    可变长度参数
        实参可以传入任意个数
        定义时形参是：形参类型 ... 形参名
     */
    public void para(int ... nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void mian(String[] args) {
        new draft().para(11, 22, 33);
    }
}
