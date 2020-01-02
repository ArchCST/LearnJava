package Week2.Lessons.Day_10.classorder;

import Week2.Lessons.Day_10.classorder.Child;

public class ThirdClass {
    static {
        System.out.println("      ThirdClass's  静态代码块");
    }
    {
        System.out.println("      ThirdClass's  构造代码块");
    }
    public ThirdClass() {
        System.out.println("        ThirdClass's  构造器");
    }
    public static void main(String[] args) {
        System.out.println("     !!! ThirdClass's  main !!!");
        new Child();
        new ThirdClass();
    }
}
