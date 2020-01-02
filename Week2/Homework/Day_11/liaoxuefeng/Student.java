package Week2.Homework.Day_11.liaoxuefeng;

public class Student extends Person{
    public String grade;
    @Override
    public void run(){
        System.out.println("student run");
    }

    public void test(){
        System.out.println("student text");
    }

    public Student(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Person ps = new Student("xiaomimi");
        Person pp = new Person("Pserson");
        Student ss = new Student("xiaomimi");

//        p.text();
        System.out.println(ps instanceof Student);
        System.out.println(pp instanceof Student);
        System.out.println(ss instanceof Student);


        System.out.println(ps instanceof Person);
        System.out.println(pp instanceof Person);
        System.out.println(ss instanceof Person);
    }


}
