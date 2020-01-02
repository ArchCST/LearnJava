package Week2.Lessons.Day_10;

public class Fish extends Animal{
    public String color;
    public void eat() {
        System.out.println("fish eat "+food);
    }

    public void swam() {
        System.out.println("Fish swaming");
    }
    public void bubble() {
        System.out.println("Fish bubbling");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.food = "虾米";
        fish.eat();
    }
}

