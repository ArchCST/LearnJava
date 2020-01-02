package Week2.Lessons.Day_12.Food;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.naming.Name;

public class Person {
    private String name;
    private int energy;

    public Person(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    public void eat(Food food){
        this.energy += food.energy;
        food.energy = 0;
        System.out.println(this.name+"吃"+food.name);
    }

    public int getEnergy() {
        return energy;
    }

    public String getName(){
        return name;
    }
}
