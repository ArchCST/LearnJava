package Week3.Homework.Day_20.File;

import java.io.File;
import java.util.Scanner;

public class CustomListFiles {
    public int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入搜索目录：");
        String dir = sc.next();
        System.out.println("请输入文件后缀，多后缀用英文逗号分割：");
        String extInput = sc.next();

        String[] exts = extInput.split(",");

        // 为后缀添加「.」
        for (String ext:exts) {
            if (!ext.startsWith(".")) {
                ext = "." + ext;
            }
        }

        CustomListFiles cf = new CustomListFiles();
        File file = new File(dir);
        if (file.isDirectory() != true) {
            System.out.println(file.getAbsolutePath()+" 不是一个目录");
        } else {
            cf.fileSearch(file, exts);
        }

        System.out.println("匹配的文件共： "+cf.count+" 个");
    }

    public void fileSearch(File file, String[] exts) {
        File[] files = file.listFiles();

        for (File f:files) {
            if (f.isDirectory()) {
                // 递归
                fileSearch(f, exts);
            } else if (f.isFile()) {
                String path = f.getAbsolutePath();
                for (String e : exts) {
                    if (path.endsWith(e)) {
                        System.out.println(path);
                        count++;
                    }
                }
            }
        }
    }
}
