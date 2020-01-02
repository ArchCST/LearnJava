package Week3.Homework.Day_16;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LearnDate {
    public static void main(String[] args) throws ParseException {

        // Date 类保留的三个API：
        // 1. 无参构造，跟距当前时间生成 Date 对象
        Date d = new Date();
        System.out.println(d);

        // 2. 通过时间戳创建Date对象
        // 时间戳：距离1970年1月1日00:00:00 GMT 的毫秒数，Long类型
        Date d2 = new Date(1000L);
        System.out.println(d2);

        // 3. 获取 Date 对象的时间戳
        System.out.println(d.getTime());

        // 格式化时间输出
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "yyyy年MM月dd日 HH:mm:ss E 一年中第D天 一年中第w周（有误） 本月第W周 a 时区：z");
        System.out.println(simpleDateFormat.format(d));
        String string = "2019年12月31日 16:04:17 星期二 一年中第365天 一年中第1周（有误） 本月第5周 下午 时区：CST";

        // 把字符串通过 SimpleDateFormat 转换回 Date 对象
        Date d3 = simpleDateFormat.parse(string);
        System.out.println(d3);


        // 早于1970年的时间的时间戳是负吗？是的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date d4 = sdf.parse("16540302");
        System.out.println(d4.getTime());
    }
}
