package Week2.Homework.Day_11.liaoxuefeng;

public class Person {
    public String name;
    public void run(){
        System.out.println("person run");
    }
    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name = " + name;
    }

    public static void main(String[] args) {
        Person person = new Person("CST");
        System.out.println(person.toString());

    }

}
