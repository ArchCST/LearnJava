package Week4.Day_22.Homework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PackingService {
    private static ArrayList<String> data;
    private static AccessDB accessDB;

    public PackingService() {
        accessDB = AccessDB.getInstance();
        data = accessDB.getData();
    }

    // 车辆入场
    public boolean carIn(String plate, String color) {
        String[] log = new String[6]; // 未离场记录 logID, plate, color, inTime, outTime, charge
        if (locateEnterLog(plate) >= 0) {
            System.out.println("Error：重复进场");
            return false;
        } else {
            log[0] = (data.size() + 10000001) + "";
            log[1] = plate;
            log[2] = color;
            log[3] = "" + new Date().getTime();
            log[4] = "0";
            log[5] = "0.00";
            appendToData(log);
            accessDB.writeDB();
            return true;
        }
    }

    // 车辆出场
    public boolean carOut(String plate) {
        long now = new Date().getTime();
        int index = locateEnterLog(plate); // 找到未出场记录
        if (index >= 0) {
            String[] log = new String[5]; // 未离场记录 logID, plate, color, inTime, outTime, charge
            log = data.get(index).split(",");
            log[4] = "" + now;
            long diff = (now - Long.parseLong(log[3])) / 1000 / 60; // 停车时长（分钟）
            double charge = Double.parseDouble(diff+"");
            log[5]  = "" + charge;

            updateLog(log, index); // 更新数据库缓存

            System.out.println(formatLog(data.get(index))); // 输出计费信息

            accessDB.writeDB();

            return true;
        } else if (index == -2){
            System.out.println("Error: 多条未出场记录");
            return false;
        } else {
            System.out.println("Error: 未找到车辆");
            return false;
        }
    }

    // 查找未出场记录
    public int locateEnterLog(String plate) {
        long now = new Date().getTime(); // 出场时间
        int index = -1; // 记录位于数据库中的位置

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).indexOf(plate) == 9) {
                String[] log = data.get(i).split(",");
                if (log[4].equals("0")) {
                    if (index == -1) {
                        index = i;
                    } else {
                        return -2; // 多条出场记录
                    }
                }
            }
        }

        return index;
    }

    // 格式化单行记录
    private String formatLog(String log) {
        StringBuilder re = new StringBuilder();
        String[] strs = log.split(",");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String[] lines = new String[10];
        lines[0] = "╭────────── Packing System ───────────╮";
        lines[1] = "│                                     │";
        lines[2] = "│  " + "单    号: " + strs[0] + "                 │";
        lines[3] = "│  " + "车 牌 号: " + strs[1] + "                 │";
        lines[4] = "│  " + "颜    色: " + strs[2] + "                       │";
        lines[5] = "│  " + "入场时间: " + sdf.format(Long.parseLong(strs[3])) + "  │";
        lines[6] = "│  " + "出场时间: " + sdf.format(Long.parseLong(strs[4])) + "  │";
        lines[7] = "│  ┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄  │";
        lines[8] = "│                       收费：" + strs[5] + " 元  │";
        lines[9] = "╰─────────────────────────────────────╯";

        StringBuilder sb = new StringBuilder("│              ");
        for (int i = 0; i < 12 - strs[5].length(); i++) {
            sb.append(" ");
        }
        sb.append("收费: ").append(strs[5]).append(" 元  │");
        lines[8] = sb.toString();

        for (int i = 0; i < lines.length; i++) {
            re.append(lines[i]);
            if (i < lines.length - 1) {
                re.append("\n");
            }
        }

        return re.toString();

    }

    // 更新数据库缓存
    private void updateLog(String[] log, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < log.length; i++) {
            sb.append(log[i]);
            if (i < log.length - 1) {
                sb.append(",");
            }
        }

        data.set(index, sb.toString());
    }

    // 添加记录
    private void appendToData(String[] log) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < log.length; i++) {
            sb.append(log[i]);
            if (i < log.length - 1) {
                sb.append(",");
            }
        }

        data.add(sb.toString());
    }

    public ArrayList<String[]> carLogs(ArrayList<String> data, String plate) {
        ArrayList<String[]> matchs = new ArrayList<>();
        for (String line : data) {
            String[] log = line.split(",");
            if (plate.equals(log[0])) {
                matchs.add(log);
            }
        }

        return matchs;
    }

}
