package Week4.Day_23.Lesson.LearnObjectIO;

import java.io.*;

public class LearnBufferedStream {
    private static File file = new File("src/Week4/Day_23/Lesson/LearnObjectIO/db");

    public static void main(String[] args) {
//        learnBufferedWriter();
//        learnBufferedOutputStream();
        learnBufferedInputStream();
    }

    public static void learnBufferedInputStream() {
        InputStream is = null;
        BufferedInputStream bis = null;

        try {
            is = new FileInputStream(file);
            bis = new BufferedInputStream(is);
            byte[] b = new byte[8192];
            int len = 0;
            while ((len = bis.read(b)) != -1) {
                String str = new String(b,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void learnBufferedOutputStream() {
        OutputStream os = null;
        BufferedOutputStream bos = null;

        try {
            os = new FileOutputStream(file, true);
            bos = new BufferedOutputStream(os);
            bos.write("Good! BufferedOutputStream!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void learnBufferedWriter() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.write("This is a string. ");
            // 不写 flush()，在 close() 时也会自动 flush()
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fw != null) {
                try {
                    fw.close(); // 自动 flush()
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
