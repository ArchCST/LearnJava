package Week2.Lessons.Day_10.classorder;

public class Child extends Parent {
    public static int childStaticInt = 1;
    public int childInt = 1;

    static {
        System.out.println("-----------子类静态代码块-----------");
        // childStaticInt
        if (childStaticInt == 1) {
            System.out.println("| childStaticInt    已声明，已赋值 |");
        } else {
            System.out.println("| childStaticInt    已声明，未赋值 |");
        };
        /* childInt 报错：静态资源无法访问非静态资源
        if (childInt == 1) {
            System.out.println("| childInt          已声明，已赋值 |");
        } else {
            System.out.println("| childInt          已声明，未赋值 |");
        };
        */
        System.out.println("| childInt            报错：未声明 |");
        // parentStaticInt
        if (parentStaticInt == 1) {
            System.out.println("| parentStaticInt   已声明，已赋值 |");
        } else {
            System.out.println("| parentStaticInt   已声明，未赋值 |");
        }
        /* parentInt 报错：静态资源无法访问非静态资源
        if (parentInt == 1) {
            System.out.println("| parentInt          已声明，已赋值 |");
        } else {
            System.out.println("| parentInt          已声明，未赋值 |");
        };
        */
        System.out.println("| parentInt           报错：未声明 |"); // if (parentInt != 1) {} 报错
        System.out.println("------------------------------------");
        System.out.println();
    }

    {
        System.out.println("-----------子类构造代码块-----------");
        // childStaticInt
        if (childStaticInt == 1) {
            System.out.println("| childStaticInt    已声明，已赋值 |");
        } else {
            System.out.println("| childStaticInt    已声明，未赋值 |");
        };
        // childInt
        if (childInt == 1) {
            System.out.println("| childInt          已声明，已赋值 |");
        } else {
            System.out.println("| childInt          已声明，未赋值 |");
        };
        // parentStaticInt
        if (parentStaticInt == 1) {
            System.out.println("| parentStaticInt   已声明，已赋值 |");
        } else {
            System.out.println("| parentStaticInt   已声明，未赋值 |");
        }
        // parentInt
        if (parentInt == 1) {
            System.out.println("| parentInt         已声明，已赋值 |");
        } else {
            System.out.println("| parentInt         已声明，未赋值 |");
        };
        System.out.println("------------------------------------");
        System.out.println();
    }

    public Child() {
        System.out.println("-------------子类构造器-------------");
        // childStaticInt
        if (Child.childStaticInt == 1) {
            System.out.println("| childStaticInt    已声明，已赋值 |");
        } else {
            System.out.println("| childStaticInt    已声明，未赋值 |");
        };
        // childInt
        if (childInt == 1) {
            System.out.println("| childInt          已声明，已赋值 |");
        } else {
            System.out.println("| childInt          已声明，未赋值 |");
        };
        // parentStaticInt
        if (parentStaticInt == 1) {
            System.out.println("| parentStaticInt   已声明，已赋值 |");
        } else {
            System.out.println("| parentStaticInt   已声明，未赋值 |");
        }
        // parentInt
        if (parentInt == 1) {
            System.out.println("| parentInt         已声明，已赋值 |");
        } else {
            System.out.println("| parentInt         已声明，未赋值 |");
        };
        System.out.println("------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("        !!! Child's main !!!");
        new Child();
    }
}
