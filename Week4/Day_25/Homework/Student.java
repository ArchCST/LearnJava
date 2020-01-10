package Week4.Day_25.Homework;

import java.util.Objects;

public class Student {
    private String name;
    private int id;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        // 超强短路的用法！避面了 obj 为 null 时调用 obj.getClass()
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name) &&
                id == student.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    //    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        Student student = (Student) object;
//        // todo 为什么这里是 Objects.equals
//        return id == student.id &&
//                Objects.equals(name, student.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    //
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, id);
//    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
