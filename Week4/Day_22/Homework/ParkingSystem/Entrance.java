package Week4.Day_22.Homework.ParkingSystem;

import java.util.Date;

public class Entrance {
    private static Entrance entrance = null;

    private Entrance() {}

    public static Entrance getInstance(){
        if (entrance == null) {
            entrance = new Entrance();
        }
        return entrance;
    }

    public void carPassing(String plate, String color) {
        Ticket ticket = new Ticket(plate, color, new Date().getTime());
        DataCenter dc = new DataCenter();

        if (dc.locateTicket(ticket) != -1) {
            System.out.println("重复入场");
        } else {
            if (dc.saveEntranceTicket(ticket)) {
                System.out.println("写入数据库成功！");
            }
        }
    }
}
