package Week4.Day_23.Lesson.LearnList;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("S01", 50));
        students.add(new Student("S02", 52));
        students.add(new Student("S03", 54));
        students.add(new Student("赵辉", 56));
        students.add(new Student("S05", 58));
        students.add(new Student("S06", 60));
        students.add(new Student("S07", 62));

        // 把赵辉成绩改成 80 分
        Student zh = new Student("赵辉", 80);

        System.out.println("contains: "+students.contains(zh));

//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).equals(zh)) {
//                students.set(i, zh);
//            }
//        }

        for (Student s : students) {
            if (s.equals(zh)) {
                s = zh; // todo 为什么这里不行？
                System.out.println(" ABC "+s);
            }
        }

        for (Student s : students) {
            System.out.println(s);
        }


    }
}
