package Week3.Lessons.Day_20.customException;

public class AgeService {
    public static void validateAge(int age) throws NoAgeException{
        if (age > 0 && age < 3) {
            System.out.println("这是个婴儿");
        } else if (age >= 3 && age < 12) {
            System.out.println("这是个小屁孩");
        } else if (age >= 12 && age < 18) {
            System.out.println("这是个表少年");
        } else if (age >= 18 && age < 60) {
            System.out.println("这是个成年人");
        } else if (age >= 60 && age < 120) {
            System.out.println("这是个老年人");
        } else {
            throw new NoAgeException(age+"");
        }
    }
}
