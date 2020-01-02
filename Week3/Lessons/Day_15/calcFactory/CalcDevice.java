package Week3.Lessons.Day_15.calcFactory;

public class CalcDevice implements Calc{
    @Override
    public double calculate(double x, double y) {
        if (y != 0) {
            return x/y;
        } else {
            // todo
            return 0;
        }
    }
}
