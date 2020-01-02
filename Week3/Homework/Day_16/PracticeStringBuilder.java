package Week3.Homework.Day_16;

public class PracticeStringBuilder {
    public static void main(String[] args) {
        String lyric = "这些年一个人，风也过，雨也走，有过泪，有过错, 还记得坚持甚么，真爱过才会懂，会寂寞会回首，终有梦终有你在心中。" +
                "朋友一生一起走，那些日子不再有，一句话，一辈子，一生情，一杯酒。朋友不曾孤单过，一声朋友你会懂，还有伤，还有痛，还要走，还有我。";
        String suffix = "朋友";
        System.out.println("共有「" + suffix + "」" + countString(lyric, suffix) + " 个");

        System.out.println(addComma(123456789012345689l));

        appendNums();
        reversePart();
    }

    /*
    请从这段歌词中统计出朋友出现的次数。
     */
    public static int countString(String string, String suffix) {
        StringBuffer sb = new StringBuffer(string);
        int count = 0;
        while (sb.indexOf(suffix) != -1) {
            sb.delete(0, sb.indexOf(suffix) + suffix.length());
            count++;
//            System.out.println(sb);
        }

        return count;
    }

    /*
    习题：钱币输出：从右边开始计数，每三个数字用逗号分割 如：23456789--->输出     23,456,789
     */
    public static StringBuffer addComma(long num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));

        System.out.println(sb);
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        return sb;
    }

    /*
    编写一个StringBufferDemo类，在主方法中，创建两个int值，和一个double值，建立一个StringBuffer对象，把三个值添加到StringBuffer中，并且输出
     */
    public static void appendNums() {
        int a = 0;
        int b = 1;
        double c = 2;
        StringBuffer sb = new StringBuffer();
        sb.append(a).append(b).append(c); // 骚操作
        System.out.println(sb);
    }

    /*
    将一个字符串的其中一部分内容进行翻转“蜗牛学院评价表：xxx 学院满意度：优  教师评分：中 教师评价:伙食评价：差”
    对其中“教师评价：”这几个字进行翻转，其他字符不变，并且整句输出
     */
    public static void reversePart(){
        StringBuffer sb = new StringBuffer("蜗牛学院评价表：xxx 学院满意度：优  教师评分：中 教师评价:伙食评价：差");
        StringBuffer suffix = new StringBuffer("教师评价:");
        int index = sb.indexOf(suffix.toString());
        sb.delete(index, index + suffix.length());
        sb.insert(index, suffix.reverse());
        System.out.println(sb);

        // 方案二：
        StringBuffer sb2 = new StringBuffer("蜗牛学院评价表：xxx 学院满意度：优  教师评分：中 教师评价:伙食评价：差");
        StringBuffer suffix2 = new StringBuffer("教师评价:");
        sb2.replace(sb2.indexOf(suffix2.toString()), sb2.indexOf(suffix2.toString())+suffix2.length(), suffix2.reverse().toString());
        System.out.println(sb2);
    }
}
