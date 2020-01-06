package Week3.Homework.Day_21;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
简易停车场系统：
1：入场：登记入库车辆车牌号，时间，颜色信息:
2：出场：登记车辆，车牌号，颜色信息，自动获取时间，并且与入场进行匹配，每分钟1块钱计算.
其他需求;要求数据要能永久保存。
 */
public class PackingSystem {
    private AccessDB accessDB = new AccessDB();

    public void carIn(String plate, String color) {
        String log = plate+","+color+","+(new Date().getTime())+",0;";
        System.out.println(log);

        accessDB.appendDB(log);
    }

    public int carOut(String plate) {
        int charge = 0;
        boolean b = false;
        String data = accessDB.readDB();
        long now = new Date().getTime();
        long inTime = 0;

        String[][] uppacked = unpackData(data);
//        System.out.println(Arrays.deepToString(uppacked));


        for (String[] line : uppacked) {
            if (line[0].equals(plate) && line[3].equals("0")) {
                inTime = Long.parseLong(line[2]);
                line[3] = "" + now;
                charge =(int) (now - inTime) / 1000 / 60;
                b = true;
                accessDB.coverDB(packData(uppacked));
            }
        }

        if (!b) {
            System.out.println("找不到记录！");
            return 0;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm:ss");
            System.out.println(plate + "：");
            System.out.println(" - 入场时间：" + sdf.format(new Date(inTime)));
            System.out.println(" - 出场时间：" + sdf.format(new Date(now)));
            System.out.println(" - 收费：" + charge + " 元");
            return charge;
        }
    }

    public String[][] unpackData(String data) {
        String[] lines = data.split(";");
        String[][] unpacked = new String[lines.length][4];
        for (int i = 0; i < lines.length; i++) {
            unpacked[i] = lines[i].split(",");
        }

        return unpacked;
    }

    public String packData(String[][] data) {
        StringBuilder sb = new StringBuilder();
        for (String[] line : data) {
            for (int i = 0; i < 4; i++) {
                if (i < 3) {
                    sb.append(line[i]).append(",");
                } else {
                    sb.append(line[i]).append(";");
                }
            }
        }
        return sb.toString();
    }
}
