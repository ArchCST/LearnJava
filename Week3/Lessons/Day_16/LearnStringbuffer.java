package Week3.Lessons.Day_16;

public class LearnStringbuffer {
    public static void main(String[] args) {
        buildStringBuffer();
    }
    public static void buildStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer hello_woniew = new StringBuffer("Hello Woniew");
        StringBuffer string_32 = new StringBuffer(32);

        hello_woniew.insert(6, " - ");
        System.out.println(hello_woniew);
        hello_woniew.setCharAt(4,'x');
        System.out.println(hello_woniew);
    }
}
