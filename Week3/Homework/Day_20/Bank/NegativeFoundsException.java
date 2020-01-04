package Week3.Homework.Day_20.Bank;

public class NegativeFoundsException extends RuntimeException{
    public NegativeFoundsException() {
        super("不能取负数金额");
    }
}
