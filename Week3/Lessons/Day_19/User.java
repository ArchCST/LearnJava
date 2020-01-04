package Week3.Lessons.Day_19;
import java.util.Date;

/*
重写 toString() 方法
 */
public class User implements Cloneable{
    private String username;
    private int age;
    private double score;
    private Contract contract;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User u = (User) super.clone();
        Contract c = (Contract) u.getContract().clone();
        u.setContract(c);
        return u;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public User(String username, int age, double score) {
        this.username = username;
        this.age = age;
        this.score = score;
        this.contract = new Contract("", new Date());
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User u = (User) obj;
            return username.equals(u.username);
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", contract=" + contract.toString() +
                '}';
    }
}
