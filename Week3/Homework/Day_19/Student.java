package Week3.Homework.Day_19;
/*
创建了一个Student类，重写equals,要求：只要他们成绩相等就说他们两个人相等
创建一个学生类里面含有姓名，年龄，成绩，性别属性，调用toString方法输出相应的值。
对上面的学生类实现浅克隆
 */
public class Student implements Cloneable{
    private String name;
    private int age;
    private double score;
    private char sex;

    public static void main(String[] args) throws CloneNotSupportedException {
        Student a = new Student("A", 20, 'M', 80);
        Student b = new Student("B", 20, 'F', 70);
        Student c = new Student("C", 20, 'M', 70);

        // test equals()
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));

        // test toString()
        System.out.println(a.toString());

        // test clone()
        Student d = (Student) a.clone();
        d.setAge(32);
        System.out.println("Origin: "+a.toString());
        System.out.println("Cloned: "+d.toString());
    }

    @Override // override clone
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // override equals
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Student) {
            return ((Student) obj).getScore() == this.score;
        }
        return false;
    }

    @Override // override toString (handmade)
    public String toString(){
        return "{name: '" + this.name + "'" +
                "  age: " + this.age +
                "  sex: '" + this.sex + "'" +
                "  score: " + this.score + "}";
    }

    public Student(String name, int age, char sex, double score) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
