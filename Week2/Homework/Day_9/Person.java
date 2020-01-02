package Week2.Homework.Day_9;

/*
Person 类有姓名、年龄、性别、地址属性
验证年龄（0-130）、身份证位数、性别
对年龄（0-130）进行合法性的验证
 */
public class Person {
    private String name;
    private int age;
    private char sex;
    private String id;
    private String address;

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
        this.age = (age > 0 && age < 130) ? age : 0;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == '男' || sex == '女') {
            this.sex = sex;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() == 18) {
            this.id = id;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
