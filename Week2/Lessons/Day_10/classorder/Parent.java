package Week2.Lessons.Day_10.classorder;

import Week2.Lessons.Day_10.classorder.Child;

import javax.swing.*;

public class Parent {
    public static int parentStaticInt = 1;
    public int parentInt = 1;

    static {
        System.out.println("-----------父类静态代码块-----------");
        // childStaticInt
        if (Child.childStaticInt == 1) {
            System.out.println("| childStaticInt    已声明，已赋值 |");
        } else {
            System.out.println("| childStaticInt    已声明，未赋值 |");
        };
        /* childInt 报错：静态资源无法访问非静态资源
        if (Child.childInt == 1) {
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
        System.out.println("-----------父类构造代码块-----------");
        // childStaticInt
        if (Child.childStaticInt == 1) {
            System.out.println("| childStaticInt    已声明，已赋值 |");
        } else {
            System.out.println("| childStaticInt    已声明，未赋值 |");
        };
        /* childInt 报错：静态资源无法访问非静态资源
        if (Child.childInt == 1) {
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
        // parentInt
        if (parentInt == 1) {
            System.out.println("| parentInt         已声明，已赋值 |");
        } else {
            System.out.println("| parentInt         已声明，未赋值 |");
        };
        System.out.println("------------------------------------");
        System.out.println();
    }

    public Parent() {
        System.out.println("-------------父类构造器-------------");
        // childStaticInt
        if (Child.childStaticInt == 1) {
            System.out.println("| childStaticInt    已声明，已赋值 |");
        } else {
            System.out.println("| childStaticInt    已声明，未赋值 |");
        };
        /* childInt 报错：静态资源无法访问非静态资源
        if (Child.childInt == 1) {
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
        // parentInt
        if (parentInt == 1) {
            System.out.println("| parentInt         已声明，已赋值 |");
        } else {
            System.out.println("| parentInt         已声明，未赋值 |");
        };
        System.out.println("------------------------------------");
        System.out.println();
    }
}
