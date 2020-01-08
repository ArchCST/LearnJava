package Week4.Day_22.Homework;

import java.util.Random;
import java.util.Scanner;

public class PackingDemo {
    public static String randomPlate() {
        String re;
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        String[] provices = {"京", "津", "冀", "晋", "辽", "吉", "黑", "沪", "苏",
                "浙", "皖", "闽", "赣", "鲁", "豫", "鄂", "湘", "粤", "桂", "琼",
                "川", "黔", "贵", "云", "渝", "藏", "秦", "陇", "青", "宁", "新",
                "港", "澳", "台"};

        String[] plate = new String[7];
        sb.append(provices[r.nextInt(provices.length)]);
        sb.append((char) (r.nextInt(26) + 'A'));

        for (int i = 2; i < 7; i++) {
            if (r.nextBoolean()) {
                sb.append((char) (r.nextInt(26) + 'A'));
            } else {
                sb.append((char) (r.nextInt(10) + '0'));
            }
        }

        return sb.toString();
    }

    public static String randomColor() {
        String[] colors = {"红","橙","黄","绿","青","蓝","紫"};

        return colors[new Random().nextInt(colors.length)];

    }


    public static String randomCar() {
        AccessDB accessDB = AccessDB.getInstance();

        return "";

    }


    public static void main(String[] args) {
        String plate = "";
        String color = "";
        PackingService packingService = new PackingService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1.随机入场  2.随机出场 3.手动入场 4.手动出场 5.退出：");
            char c = sc.next().charAt(0);
            switch (c) {
                case '0' :
                    break;
                case '1' :
                    plate = randomPlate();
                    color = randomColor();
                    System.out.println("入场车："+plate+" "+color+"色");
                    packingService.carIn(plate, color);
                    break;
                case '2' :
                    System.out.print("车牌号：");
                    plate = sc.next();
                    System.out.print("颜  色：");
                    color = sc.next();
                    packingService.carIn(plate, color);
                    break;

                case '3' :
                    System.out.print("随机出场车：");
                    packingService.carOut(sc.next());
                    break;
                case '4' :
                    System.out.print("出场车牌号：");
                    packingService.carOut(sc.next());
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
