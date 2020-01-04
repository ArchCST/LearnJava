package Week3.Homework.Day_20;

public class PracticeExceptions {
    public static void main(String[] args) {
        String[] strs = {"1", "2", "三", "4"};
        int[] a = myParse(strs);

    }

    public static int[] myParse(String[] strs) {
        int[] result = new int[3];

        for (int i = 0; i < strs.length; i++) {
            try {
                result[i] = Integer.parseInt(strs[i]);
                System.out.println(result[i]);
            } catch (NumberFormatException e) {
                System.out.println("转换类型错误");
                System.out.println(result[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组越界错误");
            }
        }
        return result;
    }
}
