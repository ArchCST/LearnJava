package Week3.Homework.Day_18;
/*
递归求 6*5*4*3*2*1
 */
public class RecursiveFunc {
    public static int foo(int num){
        if (num > 1) {

            // return result *= foo(num - 1);
            return num*foo(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(foo(6));
    }
}
