package Week3.Homework.Day_20.Bank;

public class InsufficientFoundsException extends Exception {
    public InsufficientFoundsException(){
        super("余额不足");
    }
}
