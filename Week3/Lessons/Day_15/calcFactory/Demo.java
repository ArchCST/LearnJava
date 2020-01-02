package Week3.Lessons.Day_15.calcFactory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Calc calc = CalcFactory.createCalc("*");
        System.out.println(calc.calculate(10, 5));
    }
}
