package Week2.Homework.Day_10.Human;

public class Student extends Human{
    private char sex;

    // 可以不要无参构造
    public Student() {
        super("", 0);
    }

    public Student(String name, int age, char sex) {
        super(name, age);
        this.sex = sex;
    }

    public void showInfo() {
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student sex: "+sex);
    }

    public static void main(String[] args) {
        Student cst = new Student("陈诗桐", 32, '男');
        cst.showInfo();
    }

}
