package Week3.Homework.Day_21;

import java.io.*;

public class AccessDB {
    private static final File db = new File("src/Week3/Homework/Day_21/db");

    public AccessDB() {
        readDB();
    }

    public String readDB() {
        FileReader dbReader = null;
        StringBuilder sb = new StringBuilder();

        try {
            dbReader = new FileReader(db);
            char[] chars = new char[1024];
            int len;
            while ((len = dbReader.read(chars)) != -1) {
                sb.append(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public void appendDB(String str) {
        FileWriter dbWriter = null;
        try {
            dbWriter = new FileWriter(db, true);
            dbWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dbWriter != null){
                try {
                    dbWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void coverDB(String str) {
        FileWriter dbWriter = null;
        try {
            dbWriter = new FileWriter(db);
            dbWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dbWriter != null){
                try {
                    dbWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
