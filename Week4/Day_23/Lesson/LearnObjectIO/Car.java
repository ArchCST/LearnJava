package Week4.Day_23.Lesson.LearnObjectIO;

import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = -6044929083968099686L;
    private String plate;
    private long inTime;
    private long outTime;
    private transient String password; // 不会被序列化的字段

    public Car(String plate, long inTime, long outTime, String password) {
        this.plate = plate;
        this.inTime = inTime;
        this.outTime = outTime;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ExampleObj{" +
                "plate='" + plate + '\'' +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                ", password=" + password +
                '}';
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public long getInTime() {
        return inTime;
    }

    public void setInTime(long inTime) {
        this.inTime = inTime;
    }

    public long getOutTime() {
        return outTime;
    }

    public void setOutTime(long outTime) {
        this.outTime = outTime;
    }
}
