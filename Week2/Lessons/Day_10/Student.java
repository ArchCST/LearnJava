package Week2.Lessons.Day_10;

import Week2.Lessons.Day_10.classorder.Parent;

public class Student extends Parent {
    static {
        System.out.println("子类静态构造代码块");
    }

    {
        System.out.println("子类构造代码块");
    }

    public Student() {
        System.out.println("子类构造方法");
    }

    public static void main(String[] args) {
        System.out.println("stu main");
        Student stu = new Student();
    }
}
