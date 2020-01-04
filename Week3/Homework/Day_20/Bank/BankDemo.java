package Week3.Homework.Day_20.Bank;

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            System.out.println(bank.withDrawal(101));
        } catch (InsufficientFoundsException e) {
            System.out.println("你没那么多钱");
        } catch (NegativeFoundsException e) {
            System.out.println("你不能取负数金额");
        }

    }
}
