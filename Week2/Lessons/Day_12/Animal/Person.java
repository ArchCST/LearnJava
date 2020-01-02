package Week2.Lessons.Day_12.Animal;

public class Person {
    private String name;
    private int happyValue;
    private int energy;
    Animal[] animals;

    public void setAnimals(Animal... animals) {
        this.animals = animals;
    }


    public Person(String name, int happyValue, int energy) {
        this.name = name;
        this.happyValue = happyValue;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void feed(Animal animal){
        System.out.println(name+"喂了"+animal.name);
        happyValue += 10;
        energy -= 5;
        animal.eat();
    }

    public void feedAll(){
        System.out.println(name+"把所有宠物都喂了");
        for (Animal animal : animals) {
            feed(animal);
        }
    }

    public void petsStatus(){
        for (Animal animal : animals) {
            animal.reportStatus();
        }
    }
    public void reportStatus(){
        System.out.println(name+" happy:"+happyValue+" energy:"+energy);
    }
}
