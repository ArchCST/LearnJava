package Projects.ParkingSystem;

import java.util.Date;

public class TicketService {

    private DataCenter dataCenter = DataCenter.getInstance();

    public void carIn(String plate, String color, long inTime) {
        Ticket ticket = new Ticket(plate, color, inTime);

        if (dataCenter.findTicketFromPool(ticket) != -1) {
            System.out.println("重复入场，已报警！");
        } else {
            dataCenter.appendToPool(ticket);
        }
    }

    public void carOut(String plate) {
        Ticket ticket = new Ticket(plate);

        int index = dataCenter.findTicketFromPool(ticket);
        if (index == -1) {
            System.out.println("找不到该车！请联系管理员！");
        } else {
            ticket = dataCenter.findTicketFromPool(index);
            ticket.setOutTime(new Date().getTime());
            System.out.println(ticket);
            dataCenter.archiveTicket(ticket);
        }
    }

    public void listPool() {
        dataCenter.listPool();
    }

    public String randomPlateInPool(){
        return dataCenter.randomPlate();
    }
}
