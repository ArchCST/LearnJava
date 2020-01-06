package Week3.Homework.Day_21;

import java.util.Scanner;

public class PackingDemo {
    public static void main(String[] args) {
        PackingSystem packingSystem = new PackingSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1.车辆入场  2.车辆出场  3.退出：");
            char c = sc.next().charAt(0);
            switch (c) {
                case '0' :
                    System.out.println(new AccessDB().readDB());
                    break;
                case '1' :
                    System.out.print("入场车牌号：");
                    String plate = sc.next();
                    System.out.print("  颜  色  ：");
                    String color = sc.next();
                    packingSystem.carIn(plate, color);
                    break;
                case '2' :
                    System.out.print("出场车牌号：");
                    packingSystem.carOut(sc.next());
                    break;
                case '3' :
                    System.out.println("撒哟啦啦~");
                    return;
                default:
                    System.out.println("你的输入有误，请重试");
                    break;
            }
        }
    }
}
