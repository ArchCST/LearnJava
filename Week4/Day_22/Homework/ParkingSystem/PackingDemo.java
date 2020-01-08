package Week4.Day_22.Homework.ParkingSystem;

import playground.Faker;

import java.util.Scanner;

public class PackingDemo {

    public static String randomPlate() {
        Faker faker = new Faker();
        return faker.plate();
    }


    public static void main(String[] args) {
        String plate = "";
        String color = "";
        Entrance entrance = Entrance.getInstance();
        Scanner sc = new Scanner(System.in);
        Faker faker = new Faker();

        while (true) {
            System.out.print("1.随机入场 2.手动入场 3.随机出场 4.手动出场 5.退出：");
            char c = sc.next().charAt(0);
            switch (c) {
                case '0' :
                    break;
                case '1' :
                    plate = faker.plate();
                    color = faker.color();
                    System.out.println("入场车："+plate+" "+color+"色");
                    entrance.carPassing(plate, color);
                    break;
                case '2' :
                    System.out.print("车牌号：");
                    plate = sc.next();
                    System.out.print("颜  色：");
                    color = sc.next();
                    entrance.carPassing(plate, color);
                    break;

                case '3' :
                    System.out.print("随机出场车：");
//                    packingService.carOut(sc.next());
                    break;
                case '4' :
                    System.out.print("出场车牌号：");
//                    packingService.carOut(sc.next());
                    break;
                case '5' :
                    System.out.println("撒哟啦啦~");
                    return;
                default:
                    System.out.println("你的输入有误，请重试");
                    break;
            }
        }
    }
}
