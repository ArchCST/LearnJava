package Week3.Lessons.Day_15.calcFactory;

public class CalcFactory {
    public static Calc createCalc(String string){
        Calc re = null;
        switch (string) {
            case "+":
                re = new CalcPlus();
                break;
            case "-":
                re = new CalcReduce();
                break;
            case "*":
                re = new CalcMultiply();
                break;
            case "/":
                re = new CalcDevice();
                break;
        }

        return re;
    }
}
