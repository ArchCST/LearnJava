package Week2.Homework.Day_8;

/*
创建一个汽车类，该类拥有
品牌、轮胎数、车门数、颜色、重量等属性，
加速、减速等行为，
并且利用构造器为每个对象设置轮胎数初始值为4，车门数为4，颜色为白色，并创建两个汽车对象，分别调用其行为;
 */
public class Car {
    public String brand;
    public int tiresCount;
    public int doorsCount;
    public String color;
    public double weight;
    public int speed;

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Speed: " + this.speed + " km/h");
    }

    public void decelerate(int speed) {
        this.speed -= speed;
        System.out.println("Speed: " + this.speed + " km/h");
    }

    public Car(int tiresCount, int doorsCount, String color) {
        this.tiresCount = tiresCount;
        this.doorsCount = doorsCount;
    }

    public Car() {
        this.tiresCount = 4;
        this.doorsCount = 4;
    }

    public static void main(String[] args) {
        Car a = new Car(4, 4, "white");
        a.accelerate(100);

        Car b = new Car();
        b.decelerate(20);
    }
}
