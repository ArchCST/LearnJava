package playground;

public class Timer {
    private static long staticStartTime = 0;

    public static void start() {
        if (staticStartTime == 0) {
            System.out.println("--- LOG: Start timing.");
        } else {
            System.out.println("--- WARNING: Reset start time!");
        }
        staticStartTime = System.currentTimeMillis();
    }

    public static void end() {
        if (staticStartTime == 0) {
            System.out.println("--- WRONG: No start time!");
        } else {
            System.out.println("--- Result: "+(System.currentTimeMillis() - staticStartTime)+" ms");
            staticStartTime = 0;
        }
    }
}
