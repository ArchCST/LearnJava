package Projects.ParkingSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataCenter {

    private static DataCenter dataCenter = null;
    private static List<Ticket> pool;
    private static File pFile = new File("src/Projects/ParkingSystem/_pool.db");
    private static File aFile = new File("src/Projects/ParkingSystem/_archive.txt");

    private DataCenter() {
        // 文件为空会在创建ObjectInputStream时报错
        if (pFile.length() == 0) {
            pool = new ArrayList<>();
            writeToPoolDB();
        } else {
            readFromPoolDB();
        }
    }

    public static DataCenter getInstance() {
        if (dataCenter == null) {
            dataCenter = new DataCenter();
        }
        return dataCenter;
    }

    private static void readFromPoolDB() {
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(pFile);
            objectInputStream = new ObjectInputStream(inputStream);
            pool = (ArrayList<Ticket>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void writeToPoolDB() {
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            outputStream = new FileOutputStream(pFile);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(pool);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int findTicketFromPool(Ticket ticket) {
        return pool.indexOf(ticket);
    }

    public Ticket findTicketFromPool(int index) {
        return pool.get(index);
    }

    public void appendToPool(Ticket ticket) {
        pool.add(ticket);
        writeToPoolDB();
    }

    public void archiveTicket(Ticket ticket) {
        pool.remove(ticket);
        writeToPoolDB();
        Writer writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter(aFile, true);
            bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(ticket.toString());
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

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String randomPlate() {
        Random r = new Random();
        if (!pool.isEmpty()) {
            return pool.get(r.nextInt(pool.size())).getPlate();
        }
        return "";
    }

    public void listPool() {
        for (Ticket ticket : pool) {
            System.out.println(ticket);
        }
    }
}
