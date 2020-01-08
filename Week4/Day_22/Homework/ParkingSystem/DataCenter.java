package Week4.Day_22.Homework.ParkingSystem;

import java.io.*;
import java.text.SimpleDateFormat;

public class DataCenter {
    private static File aFile = new File("src/Week3/Homework/Day_22/ParkingSystem/_archive.db");
    private static File pFile = new File("src/Week3/Homework/Day_22/ParkingSystem/_parkpool.db");

    protected static Ticket[] tickets = new Ticket[10];

    static { loadFromPool(); }

    // 加载数据库到 tickets
    protected static void loadFromPool() {
        Reader poolReader = null;
        BufferedReader bufferedReader = null;
        try {
            poolReader = new FileReader(pFile);
            bufferedReader = new BufferedReader(poolReader);
            String str = null;
            int index = 0;
            while ((str = bufferedReader.readLine()) != null) {
                String[] strs = str.split(",");
                Ticket ticket = new Ticket(strs[0], strs[1], Long.parseLong(strs[2]));
                tickets[index++] = ticket;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (poolReader != null) {
                try {
                    poolReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    // 找同车牌的记录
    protected int locateTicket(Ticket ticket) {
        for (int i = 0; i < tickets.length; i++) {
            if (ticket.equals(tickets[i])) {
                return i;
            }
        }
        return -1;
    }

    // 存入内存
    protected boolean saveEntranceTicket(Ticket ticket) {
        boolean success = false;

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i] == null) {
                tickets[i] = ticket;
                success = true;
                break;
            }
        }

        if (!success) {
            System.out.println("停车场已满！");
            return false;
        } else {
            Writer poolWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                poolWriter = new FileWriter(pFile, true);
                bufferedWriter = new BufferedWriter(poolWriter);
                bufferedWriter.write(ticket.toString());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (poolWriter != null) {
                    try {
                        poolWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return true;
        }
    }

    // chargeAndPrint

    //
    private String formatTicket(String log) {
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
    // archiveToDB
    // removeFromPool
}
