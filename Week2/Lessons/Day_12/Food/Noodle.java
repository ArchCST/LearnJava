package Week2.Lessons.Day_12.Food;

public class Noodle extends Food{
    public Noodle(String name, int energy) {
        super(name, energy);
    }

    public void deteriorate(){
        System.out.println("面条变质了");
    }
}
