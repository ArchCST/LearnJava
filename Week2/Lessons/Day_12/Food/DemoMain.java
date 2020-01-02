package Week2.Lessons.Day_12.Food;

import Week2.Lessons.Day_11.area.B;

public class DemoMain {
    public static void main(String[] args) {
        Person person = new Person("敏姐", 10);
        Bread bread = new Bread("一条面包", 80);
        Noodle noodle = new Noodle("大碗宽面", 300);
        Rice rice = new Rice("精米", 250);
        person.eat(bread);
        person.eat(noodle);
        person.eat(rice);
        System.out.println(person.getName()+"的能量："+person.getEnergy());
    }
}
