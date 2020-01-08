package Week4.Day_22.Homework;

import java.io.*;
import java.util.ArrayList;

public class AccessDB {
    private static final File db = new File("src/Week3/Homework/Day_22/db");
    private static AccessDB accessDB = null;
    private static ArrayList<String> data;
    private static Writer dbWriter = null;
    private static Reader dbReader = null;
    private static BufferedReader bufferedReader = null;
    private static BufferedWriter bufferedWriter = null;

    private AccessDB() {
        data = new ArrayList<String>();
        readDB();
    }

    public static AccessDB getInstance() {
        if (accessDB == null) {
            accessDB = new AccessDB();
        }
        return accessDB;
    }

    public void readDB() {
        try {
            dbReader = new FileReader(db);
            bufferedReader = new BufferedReader(dbReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals("")) {
                    data.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeReaderPipes();
        }
    }

    public void writeDB() {
        try {
            dbWriter = new FileWriter(db);
            bufferedWriter = new BufferedWriter(dbWriter);

            for (String line : data) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeWriterPipes();
        }
    }

    public void closeReaderPipes() {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (dbReader != null) {
            try {
                dbReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void closeWriterPipes() {
        if (bufferedWriter != null) {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (dbWriter != null) {
            try {
                dbWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        AccessDB.data = data;
    }
}
