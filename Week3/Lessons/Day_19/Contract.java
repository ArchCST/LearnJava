package Week3.Lessons.Day_19;

import java.util.Date;

public class Contract implements Cloneable {
    private String name;
    private Date date;

    public Contract(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Contract{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
