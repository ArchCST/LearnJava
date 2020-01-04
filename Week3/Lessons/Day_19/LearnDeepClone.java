package Week3.Lessons.Day_19;

import java.util.Date;

public class LearnDeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        User userA = new User("A", 10, 100);
        User userB = (User) userA.clone();

        userA.setAge(30);
        userA.getContract().setDate(new Date(2000));

        System.out.println(userA.toString());
        System.out.println(userB.toString());
    }
}
