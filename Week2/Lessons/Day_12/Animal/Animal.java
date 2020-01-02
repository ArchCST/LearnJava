package Week2.Lessons.Day_12.Animal;

public abstract class Animal {
    protected String name;
    protected int happyValue;
    protected int energy;

    protected abstract void call();

    public abstract void eat();

    public void reportStatus() {
        System.out.println(name+" happy:"+happyValue+" energy:"+energy);
    }

    public Animal(String name, int happyValue, int energy) {
        this.name = name;
        this.happyValue = happyValue;
        this.energy = energy;
    }

    public int getHappyValue() {
        return happyValue;
    }

    public void setHappyValue(int happyValue) {
        this.happyValue = happyValue;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }
}
