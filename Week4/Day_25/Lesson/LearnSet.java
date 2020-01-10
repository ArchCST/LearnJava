package Week4.Day_25.Lesson;

import playground.Faker;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        learnHashSet();
    }

    public static void learnHashSet() {

        HashSet<Company> hashSet= new HashSet<>();
        hashSet.add(new Company("1", "有限公司1"));
        hashSet.add(new Company("2", "有限公司2"));
        hashSet.add(new Company("3", "有限公司2"));
        hashSet.add(new Company("4", "有限公司1"));
        hashSet.add(new Company("5", "有限公司1"));
        hashSet.add(new Company("6", "有限公司2"));

        System.out.println(hashSet);

        Iterator<Company> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
