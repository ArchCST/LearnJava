package Week2.Lessons.Day_11.compute;

public class CallCompute {
    public void useCompute(Compute method, int a, int b){
        System.out.println(method.computer(a, b));
    }

    public static void main(String[] args) {
        CallCompute callCompute = new CallCompute();
        callCompute.useCompute(new ComputeAdd(), 100 ,5);
        callCompute.useCompute(new ComputeReduce(), 100 ,5);
        callCompute.useCompute(new ComputeDevide(), 100 ,5);
        callCompute.useCompute(new ComputeMulti(), 100 ,5);
    }

}
