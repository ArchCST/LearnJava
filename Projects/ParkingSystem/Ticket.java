package Projects.ParkingSystem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket implements Serializable {

    private static final long serialVersionUID = 4463501559751555605L;
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

    public String getPlate() {
        return plate;
    }

    //出场构造器
    public Ticket(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        StringBuilder re = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String[] lines = new String[9];
        lines[0] = "╭────────── Packing System ───────────╮";
        lines[1] = "│                                     │";
        lines[2] = "│  " + "车 牌 号: " + plate + "                 │";
        lines[3] = "│  " + "颜    色: " + color + "                       │";
        lines[4] = "│  " + "入场时间: " + sdf.format(inTime) + "  │";
        lines[5] = "│  " + "出场时间: " + sdf.format(outTime) + "  │";
        lines[6] = "│  ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄  │";
        lines[8] = "╰─────────────────────────────────────╯";

        StringBuilder sb = new StringBuilder("│              ");
        for (int i = 0; i < 12 - (""+charge).length(); i++) {
            sb.append(" ");
        }
        sb.append("收费: ").append(charge).append(" 元  │");
        lines[7] = sb.toString();

        for (String line : lines) {
            re.append(line);
            re.append("\n");
        }
        re.append("\n");

        return re.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Ticket) {
            Ticket t = (Ticket) obj;
            return this.plate.equals(t.plate);
        }
        return false;
    }

    // 设置出场时间时计算成员变量 charge
    public void setOutTime(long outTime) {
        BigDecimal inTimeD = new BigDecimal(inTime);
        BigDecimal outTimeD = new BigDecimal(outTime);

        charge = outTimeD.subtract(inTimeD).divide(new BigDecimal("3600000"), BigDecimal.ROUND_CEILING).multiply(new BigDecimal("5"));
        this.outTime = outTime;
    }
}
