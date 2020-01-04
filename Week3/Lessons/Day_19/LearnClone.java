package Week3.Lessons.Day_19;
/*
CLone 的步骤：
1. 实现 Cloneable 接口
2. 扩大访部修饰符
3. 强转，因为 clone() 返回的是 Object 对象
4. 抛出一个 CloneNotSupportedException
 */
public class LearnClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u = new User("CST", 32, 99);
        User u2 = (User) u.clone();

        u2.setAge(33);

        System.out.println(u.toString());
        System.out.println(u2.toString());
    }
}
