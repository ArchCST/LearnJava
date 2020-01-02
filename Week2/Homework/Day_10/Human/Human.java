package Week2.Homework.Day_10.Human;

public class Human {
    protected String name;
    protected int age;

    protected void showInfo() {
        System.out.println("Human name: " + name);
        System.out.println("Human age: " + age);
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}
