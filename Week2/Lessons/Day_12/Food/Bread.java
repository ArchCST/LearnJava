package Week2.Lessons.Day_12.Food;

public class Bread extends Food{
    public Bread(String name, int energy){
        super(name, energy);
    }

    public void deteriorate(){
        System.out.println("面包变质了");
    }
}
