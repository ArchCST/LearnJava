package Week2.Lessons.Day_12.Animal;

import java.util.Scanner;

public class DemoMain {
    public static void main(String[] args) {
        Cat cat = new Cat("小喵喵", 30, 30);
        Fish fish = new Fish("小鱼鱼", 5, 5);
        Person person = new Person("敏姐", 5, 100);

        String a;
        person.setAnimals(cat, fish);

        Scanner sc = new Scanner(System.in);
        char input;

        do {
            System.out.println("1. 喂猫   2. 喂鱼   3. 都喂   4. 查看状态   0. 退出");
            input = sc.next().charAt(0);
            switch (input) {
                case '1':
                    person.feed(person.animals[0]);
                    break;
                case '2':
                    person.feed(person.animals[1]);
                    break;
                case '3':
                    person.feedAll();
                    break;
                case '4':
                    person.reportStatus();
                    person.petsStatus();
                    break;
                case '0':
                    System.out.println("撒哟啦啦");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

        } while (input != '0');
    }
}
