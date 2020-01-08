package Week4.Day_22.Homework.ParkingSystem;

public class Export {
    public void carPassing(String plate) {
        DataCenter dc = new DataCenter();
        Ticket ticket = new Ticket(plate, "", 0);
        int index = dc.locateTicket(ticket);
        if (index == -1) {
            System.out.println("找不到车辆入场信息！");
        } else {
            // chargeAndPrint
            // archiveToDB
            // removeFromPool
        }



    }
}
