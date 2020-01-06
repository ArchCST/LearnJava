package Week3.Homework.Day_20.File;

import java.io.File;
import java.util.Scanner;

public class FileUtils {
    public int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入搜索目录：");
//        String dir = sc.next();
        String dir = "/Users/cst/git/WNJava/LearnJava/";

        System.out.println("请输入文件后缀，多后缀用英文逗号分割：");
        String extInput = sc.next();

        String[] exts = extInput.split(",");

        // 为后缀添加「.」
        for (String ext:exts) {
            if (!ext.startsWith(".")) {
                ext = "." + ext;
            }
        }

        FileUtils cf = new FileUtils();
        File file = new File(dir);
        if (!file.isDirectory()) {
            System.out.println(file.getAbsolutePath()+" 不是一个目录");
        } else {
            cf.fileSearch(file, exts, "");
        }

        System.out.println("匹配的文件共： "+cf.count+" 个");
    }

    public void fileSearch(File file, String[] exts, String tree) {
        File[] files = file.listFiles();

        for (File f : files) {
            // 排除 .git 目录
            if (f.isDirectory() && !f.getName().equals(".git")) {
                // 递归
                System.out.println(tree+f.getName());
                fileSearch(f, exts, tree+"  ");
            } else if (f.isFile()) {
                // String path = f.getAbsolutePath();
                String path = f.getName();
                for (String e : exts) {
                    if (path.endsWith(e)) {
                        System.out.println(tree+path);
                        count++;
                    }
                }
            }
        }
    }
}
