package Week3.Lessons.Day_19;

public class LearnObject {
    public static void main(String[] args) {
        LearnObject learnObject = new LearnObject();
        // 天然继承 Object，可使用 Object 方法
        // Object 可以接收所有的引用类型
        learnObject.toString();

        // hashCode 物理地址的数值表示，当不对hashCode进行重写时，则当前的hashCode就是物理地址
        learnObject.hashCode();

        int[] arr = new int[10];
        System.out.println(arr.toString());
        System.out.println(arr.hashCode());
        System.out.println(Integer.toString(arr.hashCode(),16));

        User chenshitong = new User("Chenshitong", 33, 99.9);
        System.out.println(chenshitong.toString());

        User chenshitong1 = new User("Chenshitong", 33, 99.9);
        System.out.println(chenshitong.equals(chenshitong1));
    }
}
