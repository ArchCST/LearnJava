package Week3.Homework.Day_20.Bank;
/*
建立exception包,建立Bank类,类中有
成员变量double balance表示存款,
Bank类的构造方法能增加存款,
Bank类中有取款的发方法withDrawal(double dAmount),
当取款的数额大于存款时,抛出InsufficientFoundsException,取款数额为负数,抛出
NagativeFoundsException,
测试:如new Bank(100),表示存入银行100元,当用方法withdrawal(150) ,
 withdrawal(-15)时会抛出自定义异常。
 */
public class Bank {
    private double balance;
    public Bank() {
        this.balance = 100;
    }

    public double withDrawal(double dAmount) throws InsufficientFoundsException {
        if (dAmount < 0) {
            throw new NegativeFoundsException();
        } else if (dAmount > balance) {
            throw new InsufficientFoundsException();
        } else {
            balance -= dAmount;
        }
        return balance;
    }
}
