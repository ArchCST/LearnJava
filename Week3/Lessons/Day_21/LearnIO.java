package Week3.Lessons.Day_21;

import java.io.*;
import java.util.Properties;

public class LearnIO {
    public static void main(String[] args) {
//        learnInput();
//        learnOutput();
//        copyWithIO();
//        characterStream();
        learnProperties();

    }

    public static void learnInput() {
        File file = new File("ioFiles/mdFile.md");
        System.out.println(file.length());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 创建输入流
        InputStream input = null;

        try {
            input = new FileInputStream(file);
            byte[] b = new byte[1024];
            int len = 0;

            // 循环读取
            while ((len = input.read(b)) != -1) {
                String str = new String(b);
                System.out.println(str);
            }

//            // 通过接口把数据读取到容器中
//            input.read(b); // 返回值为当次读取到 byte 数组中的长度
//
//            // 测试一下：
//            String str = new String(b);
//            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void learnOutput() {
        File file = new File("ioFiles/mdFile.md");
        String str = "待得秋来九月八，" +
                "我花开时百花杀。" +
                "冲天香阵透长安，" +
                "满城尽带黄金甲。";

        str = str.replace("，", ",");
        str = str.replace("。", ",");

        String[] strs = str.split(",");


        OutputStream os = null;

        try {
            os = new FileOutputStream(file, false); // 默认为 false 表示覆盖文件
            for (String s : strs) {
                System.out.println(s);
                os.write((s + "\n").getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copyWithIO() {
        File srcFile = new File("ioFiles/pic.jpeg");
        File tarFile = new File("ioFiles/picCopy.jpeg");
//        File srcFile = new File("ioFiles/mdFile.md");
//        File tarFile = new File("ioFiles/mdFileCopy.md");

        InputStream inputPipe = null;
        OutputStream outputPipe = null;
        byte[] b = new byte[1024];
        int len = 0;

        try {
            inputPipe = new FileInputStream(srcFile);
            outputPipe = new FileOutputStream(tarFile);
            while ((len = inputPipe.read(b)) != -1) {
                outputPipe.write(b, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 后开的先关
            if (outputPipe != null) {
                try {
                    outputPipe.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            // 先开的后关
            if (inputPipe != null) {
                try {
                    inputPipe.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void characterStream() {
//        File srcFile = new File("ioFiles/pic.jpeg");
//        File tarFile = new File("ioFiles/picCopy.jpeg");
        File srcFile = new File("ioFiles/mdFile.md");
        File tarFile = new File("ioFiles/mdFileCopy.md");

        Reader readerPipe = null;
        Writer writerPipe = null;
        char[] c = new char[1024];
        int len = 0;

        try {
            readerPipe = new FileReader(srcFile);
            writerPipe = new FileWriter(tarFile);
            while ((len = readerPipe.read(c)) != -1) {
                writerPipe.write(new String(c, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writerPipe != null) {
                try {
                    writerPipe.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (readerPipe != null) {
                try {
                    readerPipe.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void learnProperties() {
        File propertiesFile = new File("/Users/cst/git/test.properties");
        System.out.println(propertiesFile.getAbsolutePath());
        System.out.println(propertiesFile.exists());

        // 建立 Properties 对象
        Properties properties = new Properties();
        FileReader propertiesReader = null;
        FileWriter propertiesWriter = null;

        try {
            propertiesReader = new FileReader(propertiesFile);
            // todo 问题：为什么不能放这里？
            propertiesWriter = new FileWriter(propertiesFile);

            // 通过 FileReader 对象加载 properties 对象，也可用 InputStream 加载
            properties.load(propertiesReader);
            // 读取键值对
            String un = properties.getProperty("mysql-username");
            System.out.println(un);

            // 写入配制信息
            properties.setProperty("mysql-password", "apassword");
            // 通过 FileWriter 保存 properties 对象到 test.properties 文件，也可用 OutputStream。
            properties.store(propertiesWriter, "Some comments");


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (propertiesReader != null) {
                try {
                    propertiesReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
