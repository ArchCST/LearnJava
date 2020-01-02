package Week2.Lessons.Day_8;

// 定义 Dog 类，类名大驼峰
public class Dog {
    // 成员属性：静态描述
    public String name;
    public int age;
    public double weight;
    public String type;

    // 成员方法：动态描述
    public void eat() {
        System.out.println(name + " eating!");
    }

    public void play(String friend) {
        System.out.println(name + " playing with " + friend);
    }

    public void sleep() {
        System.out.println(name + " sleeping!");
    }

    /*
    构造方法 (Constructor)：在创建对象时对对象的成员属性赋初
    始值。
        又称构造函数、构造器
        1. 构造方法是没有返回值的
        2. 方法名称必须与类名一致
        3. Java 规定任意类都必须含有至少一个构造方法，
           如果未显式声明构造方法，Java会自动生成一个
           默认的无参的空构造方法。
        4. 一但自定义了构造方法，Java 不会再自动添加
        默认的无参构造方法。
        5. 构造器一般在 new 关键字后调用
     */

    /* 默认的无参空构造方法 */
    public Dog(){}

    /* 每个类可以有一个以上的构造器 */
    public Dog(String p_dog, int p_age, double p_weight, String p_type) {
        /* 当成员变量与局部变量重名时，会根据就近原则 */
        name = p_dog;
        age = p_age;
        weight = p_weight;
        type = p_type;
    }

    /* 构造器可以定义多个，类似重载的 */
    public Dog(String dog) {
        /* 当成员变量与局部变量重名时，会根据就近原则 */
        // name = name
        /* 可以使用 this 关键字指代当前对象（谁调用，就指代
        谁），来调用成员属性 */
        this.name = dog;
    }

    // 程序主入口
    public static void main(String[] args) {
        // 通过默认的无参构造器创建对象
        Dog a = new Dog();
        // 注意如果自定义了构造器，这行将会报错

        // 然后再给成员属性赋值
        a.name = "GuangDongDong";
        a.age = 3;
        a.weight = 8;
        a.type = "法斗";

        // 调用成员方法
        a.eat();
        a.play("FuMiao");
        a.sleep();

        /* 通过自定义的构造器创建对象，并赋初始值 */
        Dog b = new Dog("B_Dog", 3, 12.5, "Golden");

    }
}
