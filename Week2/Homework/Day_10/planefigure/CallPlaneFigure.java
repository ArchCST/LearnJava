package Week2.Homework.Day_10.planefigure;

public class CallPlaneFigure {
    public static void main(String[] args) {
        double a = 1.5;
        double b = 3.0;
        Square square = new Square(a, b);
        System.out.println("Square area: "+square.area());
        System.out.println("Square perimeter: "+square.perimeter());

        Circular circular = new Circular(a);
        System.out.println("Circular area: "+circular.area());
        System.out.println("Circular perimeter: "+circular.perimeter());

        PlaneFigure p = new PlaneFigure() {
            @Override
            protected double area() {
                return 0;
            }
        };
    }
}
