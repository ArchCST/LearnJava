package Week2.Homework.Day_11.liaoxuefeng;

public class calcTax {
    public static double totalTax(Income... incomes){
        double total = 0;
        for (Income income : incomes) {
            total = total + income.getTax();
        }

        return total;
    }

    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Income(3000),
                new Salary(7000),
                new StateCouncilSpeciaSpecialAllowance(15000)
        };

        System.out.println(totalTax(incomes));
    }
}
