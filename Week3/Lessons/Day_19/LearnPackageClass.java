package Week3.Lessons.Day_19;

public class LearnPackageClass {
    public static void main(String[] args) {
        String str = "成都-武侯区-永辉超市-猪里脊-25.8元";
        String sub = str.substring(str.lastIndexOf("-")+1, str.indexOf("元"));
        System.out.println(sub);

        // 强转
        Double d = Double.valueOf(sub);

        // 构造方法创建
        Double d1 = new Double(sub);

        // 自动装箱：使用引用数型接收基本数据类型
        Double d3 = 10.1; // 自动调用 Double.valueOf();
        Double d4 = Double.valueOf(10.1);

        // 自动拆箱：
        Double d5 = new Double(200);
        double d6 = d5; // 自动调用 doubleValue(); Number 类中抽象方法的实现
        double d7 = d5.doubleValue();


        // 缓存区范围:
        //     Boolean: true,false
        //     Byte、Short、Integer、Long: -128 ~ 127
        //     Character: 0 ~ 127
        //     Double、Float: 没有

        // 面试题1:
        // 包装类缓存区只适用于自动装箱，不适用于手动装箱
        boolean q1 = new Integer(5) == new Integer(5);
        System.out.println(q1);

        // 面试题2:
        // 范围内自动装箱引用缓存区
        Integer i1 = 10;
        Integer i2 = 10;
        boolean q2_1 = i1 == i2;
        System.out.println(q2_1);
        // 范围外自动装箱区生成新实例
        Integer i3 = 128;
        Integer i4 = 128;
        boolean q2_2 = i3 == i4;
        System.out.println(q2_2);

        // 面试题3:
        // 范围内自动装箱引用缓存区
        boolean q3_1 = Integer.valueOf(5) == Integer.valueOf(5);
        System.out.println(q3_1);
        // 范围外自动装箱区生成新实例
        boolean q3_2 = Integer.valueOf(-129) == Integer.valueOf(-129);
        System.out.println(q3_2);

        // 包装类转字符串
        Integer intX = 200;
        String str1 = String.valueOf(intX);
        String str2 = intX.toString();
        String str3 = intX+"";

        // 字符串转基本数据类型
        int intY = Integer.parseInt(str1);
        double doubleY = Double.parseDouble(str2);
    }
}
