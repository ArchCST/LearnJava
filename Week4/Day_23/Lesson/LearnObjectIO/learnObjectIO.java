package Week4.Day_23.Lesson.LearnObjectIO;

import java.io.*;

public class learnObjectIO {
    private static File file = new File("src/Week4/Day_23/Lesson/LearnObjectIO/OBJFile");
    public static void main(String[] args) {
        learnWriteObject();
        learnReadObject();
    }

    public static void learnWriteObject() {
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream =  new ObjectOutputStream(outputStream);
            Car[] myCars = new Car[2];
            myCars[0] = new Car("川A12345", 123456789L, 987654321L, "pass1");
            myCars[1] = new Car("川A54321", 32323232L, 23232323L, "pass2");
            // 写入对象，类必须实现 Serializable 接口
            objectOutputStream.writeObject(myCars);
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

    public static void learnReadObject() {
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            Object obj = objectInputStream.readObject();
            Car[] myCars = (Car[]) obj;

            for (Car c : myCars) {
                System.out.println(c);
            }
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
}
