package Week2.Lessons.Day_12.Food;

public class Rice extends Food{

    @Override
    public void deteriorate() {
        System.out.println("米饭馊了");
    }

    public Rice(String name, int energy) {
        super(name, energy);
    }
}
