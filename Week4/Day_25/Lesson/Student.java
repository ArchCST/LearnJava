package Week4.Day_25.Lesson;

import java.util.Objects;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 哈希码本质上就是比较两个对象是不是相等时提速的工具
    @Override
    public int hashCode() {
        return name.hashCode()+score;
    }

    //    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        Student student = (Student) object;
//        return score == student.score &&
//                Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, score);
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
