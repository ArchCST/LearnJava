package playground;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

public class Draft {
    public static void main(String[] args) {
        String c = new String("asdfasdf");
        String d = new String("asdfasdf");
        String a = "asdfasdf";
        String b = "asdfasdf";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(c == d);

        System.out.println(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();

        calendar.set(2019,12,02);
        System.out.println(new GregorianCalendar().isLeapYear(2019));

        double[] x = {1.0, 3.0, 2.0, 1.4, 0.8, 7.0, 0.5};
        for (int i = x.length-1 ; i> 0; i--){
            for (int j = 0; j < i - 1; j++) {
                if (x[j] < x[j+1]) {
                    double tmp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(x));

    }
}
