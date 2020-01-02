package Week2.Homework.Day_11.liaoxuefeng;

public class StateCouncilSpeciaSpecialAllowance extends Income{
    public StateCouncilSpeciaSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
       return 0;
    }
}
