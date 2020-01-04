package Week3.Lessons.Day_20.customException;

import java.util.Scanner;

public class NoAgeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try {
            AgeService.validateAge(age);
        } catch (NoAgeException e) {
            e.printStackTrace();
        }
    }
}
