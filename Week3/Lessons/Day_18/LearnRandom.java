package Week3.Lessons.Day_18;

import java.util.Random;

public class LearnRandom {
    public static void main(String[] args) {
//        Random r = new Random(2);
        Random r = new Random();
        for (int i = 0; i < 3 ; i++) {
            int n = r.nextInt(5);
            System.out.println(n);
        }
    }
}
