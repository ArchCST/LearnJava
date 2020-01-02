package Week2.Lessons.Day_12.Animal;

public class Cat extends Animal{
    private int earCount;

    public Cat(String name, int happyValue, int energy) {
        super(name, happyValue, energy);
        earCount = 2;
    }

    public void call() {
        System.out.println("喵喵喵");
    }

    public void eat() {
        this.happyValue += 20;
        this.energy += 50;
        call();
    }

    public String toString(){
        return "toString + " + name;
    }
}
