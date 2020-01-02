package Week2.Homework.Day_11.liaoxuefeng;

public class Income {
    protected double income;
    public double getTax(){
        return income*0.1;
    }

    public Income(double income) {
        this.income = income;
    }
}
