package Projects.ParkingSystem;

import playground.Faker;
import java.util.Date;
import java.util.Scanner;

public class PackingDemo {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        Scanner sc = new Scanner(System.in);
        Faker faker = new Faker();
        while (true) {
            String plate;
            String color;
            System.out.print("1.随机入场 2.手动入场 3.随机出场 4.手动出场 5.退出：");
            char c = sc.next().charAt(0);
            switch (c) {
                case '0':
                    ticketService.listPool();
                    break;
                case '1':
                    plate = faker.plate();
                    color = faker.color();
                    System.out.println("入场车：" + plate + " " + color + "色");
                    ticketService.carIn(plate, color, faker.timeBefore(0,1,30));
                    break;
                case '2':
                    System.out.print("车牌号：");
                    plate = sc.next();
                    System.out.print("颜  色：");
                    color = sc.next();
                    ticketService.carIn(plate, color, new Date().getTime());
                    break;

                case '3':
                    plate = ticketService.randomPlateInPool();
                    if (plate.equals("")) {
                        System.out.println("停车场空了！");
                    } else {
                        ticketService.carOut(plate);
                    }
                    break;
                case '4':
                    System.out.print("出场车牌号：");
                    plate = sc.next();
                    ticketService.carOut(plate);
                    break;
                case '5':
                    System.out.println("撒哟啦啦~");
                    return;
                default:
                    System.out.println("你的输入有误，请重试");
                    break;
            }

        }

    }
}
