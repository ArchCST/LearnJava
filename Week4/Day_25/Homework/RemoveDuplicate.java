package Week4.Day_25.Homework;

import javax.swing.plaf.IconUIResource;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class RemoveDuplicate {
    /*
    利用 HashSet 对字符串去重
     */
    public static String removeDp(String str) {
        char[] chars = str.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        HashSet<String> s = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : chars) {
            while (!hashSet.contains(c)) {
                hashSet.add(c);
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    /*
    生成10个1到20之间的不重复的随机数
     */
    public static HashSet<Integer> noRepeatRandomNumber(int count) {
        Random r = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < count) {
            hashSet.add(r.nextInt(20) + 1);
        }

        return hashSet;
    }

    /*
    把如下元素存入List集合 ;
    "aaa", "bbb", "aaa", "abc", "xyz", "123", "xyz")
    去掉重复元素
     */
    public static List<String> inToList(String...strings) {
        HashSet<String> hashSet = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (String string :
                strings) {
            if (!hashSet.contains(string)) {
                hashSet.add(string);
                list.add(string);
            }
        }

        return list;
    }
    /*
    已知有十六支男子足球队参加2008 北京奥运会。写一个程序，把这16 支球队随机分为4 个组。采用List集合和随机数
    2008 北京奥运会男足参赛国家：
    String[] countries = {"科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰", "尼日利亚", "日本", "美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利"};
     */
    public static void olympic() {
        String[] strings = {"科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰", "尼日利亚", "日本",
                "美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利"};
        ArrayList<String> arrayList = new ArrayList<>();
        Random random = new Random();

        for (String str :
                strings) {
            arrayList.add(str);
        }

        for (int i = 0; i < 4; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                int r = random.nextInt(arrayList.size());
                sb.append(arrayList.get(r)).append(" ");
                arrayList.remove(r);
            }
            System.out.println("Team "+i+": "+sb);
        }
    }

    /*
    当前班上有同学进行报道，当学号与姓名相同时就被认为是同一个学生，统计当前班上同学姓名和人数。随意创建5个学生即可。
     */
    public static void validateStudent() {
        HashSet<Student> students= new HashSet<>();
        students.add(new Student("N", 10));
        students.add(new Student("N", 11));
        students.add(new Student("N", 12));
        students.add(new Student("N1", 10));
        students.add(new Student("N", 10));

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }



    public static void main(String[] args) {
        System.out.println("--- 1 ---");
        System.out.println("请输入一个字符串: asdfdfgghj21460");
        String result = removeDp("asdfdfgghj21460");
        System.out.println("去重后的字符串为: " + result);

        System.out.println("--- 2 ---");

        System.out.println(noRepeatRandomNumber(10));

        System.out.println("--- 3 ---");

        System.out.println(inToList("aaa", "bbb", "aaa", "abc", "xyz", "123", "xyz"));

        System.out.println("--- 4 ---");

        olympic();

        System.out.println("--- 5 ---");

        validateStudent();
    }
}
