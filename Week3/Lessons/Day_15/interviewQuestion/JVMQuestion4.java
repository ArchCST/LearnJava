package Week3.Lessons.Day_15.interviewQuestion;

public class JVMQuestion4 {
    public static void main(String[] args) {
        System.out.println(JVMQuestion4_2.s);
        // 坑：1 和 2 到底加载吗？
    }

}

/*
public class JVMQuestion4_1 {
    public static final String s = "教得真好";
    static {
        System.out.println("蜗牛学院");
    }
}
 */

/*
public class JVMQuestion4_2 extends JVMQuestion4_1{
    static {
        System.out.println("教得好");
    }
}
 */