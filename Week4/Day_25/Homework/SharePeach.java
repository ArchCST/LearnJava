package Week4.Day_25.Homework;
/*
这里有一堆桃子,目测不超过10000个,五只猴子去分桃,但是怎么分都不能分成5份,只好先去睡觉了,但是夜里1只猴子偷偷爬起来,
吃掉了一个桃子,然后分成5等份,藏起自己的一份,睡觉去了,
第二只猴子又爬起来了,同样吃掉一只桃子,在分成5份,藏起自己的一份,睡觉去了;
以后三只猴子以此类推,问当初有多少桃子? (写程序)
 */
public class SharePeach {
    public static void main(String[] args) {

//        Integer i = new Integer(1000);
//        int j = 1000;
//        System.out.println(i == j);

        sharePeachMain();
        System.out.println("------");
        sharePeachWithFor();
    }

    // 递归方法
    public static void sharePeachMain() {
        for (int i = 1; i < 10000; i++) {
            if (sharePeach(5, i)) {
                System.out.println(i);
            }

        }
    }
    // 递归方法的子方法
    public static boolean sharePeach (int monkeyCount, int peach) {
        if (monkeyCount > 0) {
            if (peach > 1 && (peach - 1) % 5 == 0) {
                return sharePeach(--monkeyCount, (peach - 1) / 5 * 4);
            } else  return false;
        } else {
            return true;
        }
    }

    public static void sharePeachWithFor() {
        for (int i = 0; i < 10000; i++) {
            int peach = i;
            for (int j = 0; j < 5; j++) {
                if ((peach - 1) % 5 == 0) {
                    if (j == 4) {
                        System.out.println(i);
                        break;
                    }
                    peach = (peach-1) / 5 * 4;
                } else {
                    break;
                }
            }
        }
    }
}
