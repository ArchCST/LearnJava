package Week4.Day_24.Lesson;

import Week4.Day_23.Lesson.LearnList.Student;
import playground.Faker;
import playground.Timer;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedList {
    public static void main(String[] args) {
        Faker faker = new Faker(1);
        List<Student> lkList = new LinkedList<>();
        for (int i = 0; i < 200000; i++) {
            lkList.add(new Student("lkList", 50));
        }

        List<Student> alList = new ArrayList<>();
        for (int i = 0; i < 200000; i++) {
            alList.add(new Student("alList", 50));
        }

        Timer.start();
        for (int i = 0; i < 1000; i++) {
            lkList.add(2000, new Student("666", 0));
        }
        Timer.end();


        Timer.start();
        for (int i = 0; i < 1000; i++) {
            alList.add(2000, new Student("666", 0));
        }
        Timer.end();

    }
}
