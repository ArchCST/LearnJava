package Week2.Lessons.Day_12.Food;

public abstract class Food {
    protected String name;
    protected int energy;

    public Food(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public abstract void deteriorate();
}
