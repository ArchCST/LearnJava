package Week3.Lessons.Day_15.simpleFactory;

public class CarFactory {
    public static ShangCar createcarFactory(String str){
        ShangCar s = null;
        switch (str){
            case "pastte":
                s = new Pastte();
                break;
            case "HuiTeng":
                s = new HuiTeng();
                break;
        }
        return s;
    }
}
