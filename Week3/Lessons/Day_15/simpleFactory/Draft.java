package Week3.Lessons.Day_15.simpleFactory;

public class Draft {
    // 正常逻辑
    public static void main(String[] args) {

        ShangCar cf = CarFactory.createcarFactory("pastte");
        cf.createCar();
    }

    // 简单工场模式
}
