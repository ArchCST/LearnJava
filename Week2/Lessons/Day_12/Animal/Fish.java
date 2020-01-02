package Week2.Lessons.Day_12.Animal;

public class Fish extends Animal {
    private int fins;

    public Fish(String name, int happyValue, int energy) {
        super(name, happyValue, energy);
        fins = 3;
    }

    @Override
    public void call() {
        System.out.println("。。。");
    }

    public void eat() {
        happyValue += 5;
        energy += 100;
        call();
    }

    public void swim(){
        System.out.println("Fish swimming");
    }
}
