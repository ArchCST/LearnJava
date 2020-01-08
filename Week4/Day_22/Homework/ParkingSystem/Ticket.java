package Week4.Day_22.Homework.ParkingSystem;

import java.math.BigDecimal;

public class Ticket {
    private String plate;
    private String color;
    private long inTime;
    private long outTime;
    private BigDecimal charge;

    // 入场构造器
    public Ticket(String plate, String color, long inTime) {
        this.plate = plate;
        this.color = color;
        this.inTime = inTime;
    }

    // 出场构造器
    public Ticket(String plate) {

    }


    @Override
    public String toString() {
        return plate + "," + color + "," + inTime + "," + outTime + "," + charge;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Ticket) {
            return this.plate.equals(((Ticket) obj).plate);
        }

        return false;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getInTime() {
        return inTime;
    }

    public void setInTime(long inTime) {
        this.inTime = inTime;
    }

    public long getOutTime() {
        return outTime;
    }

    public void setOutTime(long outTime) {
        this.outTime = outTime;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }
}
