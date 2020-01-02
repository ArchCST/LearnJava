package Week2.Lessons.Day_9;

import java.util.Arrays;

public class draft {

    {
        // 构造代码块在构造方法前执行
        System.out.println("构造代码块");
        sex = '2';
    }

    public String name;
    public char sex = '1';


    public draft() {
        System.out.println("draft 类的无参构造：创建对象时，对对象进行初始化");
    }
    public draft(String pname) {
        System.out.println("draft 类的有参构造：创建对象时，对对象进行初始化");
        name = pname;
    }


    public static void main(String[] args) {
        draft d = new draft("admin");
        System.out.println(d.sex);

        int a = 10;

        int[] nums = {2,5,3,6,7,9,4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}