package Week2.Lessons.Day_11.learninterface;

public class ConstantsTest implements Constants{
    public void differ(){
        System.out.println(MAX - MIN);
    }

    public static void main(String[] args) {
        ConstantsTest ct = new ConstantsTest();
        ct.differ();
    }
}
