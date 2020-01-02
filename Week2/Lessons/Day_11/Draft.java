package Week2.Lessons.Day_11;

public class Draft {
    public String[] names;

    public void setNames(String... name){
        this.names = name;
    }

    public int calc(int a, int b){
        return a+b;
    }

    public double calc(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Draft d = new Draft();
        d.setNames("A","B","C");

        for (String n : d.names) {
            System.out.println(n);
        }

    }
}
