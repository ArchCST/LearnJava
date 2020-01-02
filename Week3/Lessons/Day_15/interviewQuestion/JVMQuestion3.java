package Week3.Lessons.Day_15.interviewQuestion;

public class JVMQuestion3 {
    public static void main(String[] args) {
        JVMQuestion3 t5 = new JVMQuestion3();
        t5.first();
    }

    private void first(){
        int i = 5;
        // public class Value {public int i = 15;}
        JVMQuestion3_Value v = new JVMQuestion3_Value();
        v.i = 25;
        secound(v, i);
        System.out.println(v.i);
    }

    private void secound(JVMQuestion3_Value v, int i) {
        i = 0;
        v.i = 20; // 坑：这里对 first 中生成的 v 指向的内存作了修改吗？
        JVMQuestion3_Value v2 = new JVMQuestion3_Value();
        v = v2;
        System.out.println(v.i + "bbb:" + i);
    }
}
