package playground;

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
    }
}
