package Week3.Lessons.Day_22;

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) {
        learnBufferedReader();
        learnBufferedWriter();


    }

    public static void learnBufferedReader() {
        File file = new File("ioFiles/bufferedMD.md");
        Reader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader= new BufferedReader(fileReader);
            // 旧的实现
//            char[] c = new char[1024];
//            int len;
//            while ((len = bufferedReader.read(c)) != -1) {
//                String str = new String(c, 0, len);
//                System.out.println(str);
//            }

            // 新的实现
            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
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

            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void learnBufferedWriter() {
        File file = new File("ioFiles/bufferedMD.md");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, true); // true 为追加操作
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("bufferWrite writes this line");
            bufferedWriter.newLine(); // 换行
            bufferedWriter.write("bufferWrite writes this line");
            bufferedWriter.flush(); // 写入文件
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

            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
