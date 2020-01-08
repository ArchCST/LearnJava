package playground;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Random;

public class Faker {
    private Random r = null;

    public Faker() {
        r = new Random();
    }

    public Faker(long seed) {
        r = new Random(seed);
    }

    public String plate() {
        StringBuilder sb = new StringBuilder();
        String[] provices = {"京", "津", "冀", "晋", "辽", "吉", "黑", "沪", "苏",
                "浙", "皖", "闽", "赣", "鲁", "豫", "鄂", "湘", "粤", "桂", "琼",
                "川", "黔", "贵", "云", "渝", "藏", "秦", "陇", "青", "宁", "新",
                "港", "澳", "台"};

        sb.append(provices[r.nextInt(provices.length)]);
        sb.append((char) (r.nextInt(26) + 'A'));

        for (int i = 2; i < 7; i++) {
            if (r.nextBoolean()) {
                sb.append((char) (r.nextInt(26) + 'A'));
            } else {
                sb.append((char) (r.nextInt(10) + '0'));
            }
        }

        return sb.toString();
    }

    public String color() {
        String[] colors = {"红", "橙", "黄", "绿", "青", "蓝", "紫"};
        return colors[new Random().nextInt(colors.length)];
    }

    public long timeBefore(int days, int hours, int minutes) {
        return new Date().getTime() - r.nextInt(days * 86400 + hours * 3600 + minutes * 60) * 1000;
    }

    public long timeAfter(int days, int hours, int minutes) {
        return new Date().getTime() + r.nextInt(days * 86400 + hours * 3600 + minutes * 60) * 1000;
    }

    public String randomChineseWord() {
        String str = null;
        int highpos, lowpos;
        highpos = (176 + r.nextInt(39));
        lowpos = (161 + r.nextInt(93));
        byte[] bb = new byte[2];
        bb[0] = new Integer(highpos).byteValue();
        bb[1] = new Integer(lowpos).byteValue();

        try {
            str = new String(bb, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return str;
    }

    private String surname(boolean bigSet) {
        String[] surnames = {
                "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨",
                "朱", "秦", "尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜 ",
                "戚", "谢", "邹", "喻", "柏", "水", "窦", "章", "云", "苏", "潘", "葛", "奚", "范", "彭", "郎",
                "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳", "酆", "鲍", "史", "唐",
                "费", "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常",
                "乐", "于", "时", "傅", "皮", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄",
                "和", "穆", "萧", "尹", "姚", "邵", "湛", "汪", "祁", "毛", "禹", "狄", "米", "贝", "明", "臧",
                "计", "伏", "成", "戴", "谈", "宋", "茅", "庞", "熊", "纪", "舒", "屈", "项", "祝", "董", "梁",
                "杜", "阮", "蓝", "闵", "席", "季", "麻", "强", "贾", "路", "娄", "危", "江", "童", "颜", "郭",
                "梅", "盛", "林", "刁", "锺", "徐", "邱", "骆", "高", "夏", "蔡", "田", "樊", "胡", "凌", "霍",
                "虞", "万", "支", "柯", "昝", "管", "卢", "莫", "经", "房", "裘", "缪", "干", "解", "应", "宗",
                "丁", "宣", "贲", "邓", "郁", "单", "杭", "洪", "包", "诸", "左", "石", "崔", "吉", "钮", "龚",
                "程", "嵇", "邢", "滑", "裴", "陆", "荣", "翁", "荀", "羊", "於", "惠", "甄", "麹", "家", "封",
                "芮", "羿", "储", "靳", "汲", "邴", "糜", "松", "井", "段", "富", "巫", "乌", "焦", "巴", "弓",
                "牧", "隗", "山", "谷", "车", "侯", "宓", "蓬", "全", "郗", "班", "仰", "秋", "仲", "伊", "宫",
                "甯", "仇", "栾", "暴", "甘", "钭", "厉", "戎", "祖", "武", "符", "刘", "景", "詹", "束", "龙",
                "叶", "幸", "司", "韶", "郜", "黎", "蓟", "薄", "印", "宿", "白", "怀", "蒲", "邰", "从", "鄂",
                "索", "咸", "籍", "赖", "卓", "蔺", "屠", "蒙", "池", "乔", "阴", "鬱", "胥", "能", "苍", "双",
                "闻", "莘", "党", "翟", "谭", "贡", "劳", "逄", "姬", "申", "扶", "堵", "冉", "宰", "郦", "雍",
                "郤", "璩", "桑", "桂", "濮", "牛", "寿", "通", "边", "扈", "燕", "冀", "郏", "浦", "尚", "农",
                "温", "别", "庄", "晏", "柴", "瞿", "阎", "充", "慕", "连", "茹", "习", "宦", "艾", "鱼", "容",
                "向", "古", "易", "慎", "戈", "廖", "庾", "终", "暨", "居", "衡", "步", "都", "耿", "满", "弘",
                "匡", "国", "文", "寇", "广", "禄", "阙", "东", "欧", "殳", "沃", "利", "蔚", "越", "夔", "隆",
                "师", "巩", "厍", "聂", "晁", "勾", "敖", "融", "冷", "訾", "辛", "阚", "那", "简", "饶", "空",
                "曾", "毋", "沙", "乜", "养", "鞠", "须", "丰", "巢", "关", "蒯", "相", "查", "后", "荆", "红",
                "游", "竺", "权", "逯", "盖", "益", "桓", "公", "仉", "督", "晋", "楚", "闫", "法", "汝", "鄢",
                "涂", "钦", "归", "海", "岳", "帅", "缑", "亢", "况", "后", "有", "琴", "商", "牟", "佘", "佴",
                "伯", "赏", "墨", "哈", "谯", "笪", "年", "爱", "阳", "佟 ", "言", "福",
                "万俟", "司马", "上官", "欧阳", "夏侯", "诸葛", "闻人", "东方", "赫连", "皇甫", "尉迟", "公羊",
                "澹台", "公冶", "宗政", "濮阳", "淳于", "单于", "太叔", "申屠", "公孙", "仲孙", "轩辕", "令狐",
                "锺离", "宇文", "长孙", "慕容", "鲜于", "闾丘", "司徒", "司空", "亓官", "司寇", "子车", "颛孙",
                "端木", "巫马", "公西", "漆雕", "乐正", "壤驷", "公良", "拓跋", "夹谷", "宰父", "穀梁", "段干",
                "百里", "东郭", "南门", "呼延", "羊舌", "微生", "梁丘", "左丘", "东门", "西门", "南宫", "第五"};

        String[] smallSurnames = {
                "王", "李", "张", "刘", "陈", "杨", "黄", "赵", "周", "吴", "徐", "孙", "马", "胡", "朱", "郭",
                "何", "罗", "高", "林",
                "欧阳", "上官", "皇甫", "司徒", "令狐", "诸葛", "司马", "宇文", "申屠", "南宫", "夏侯"};

        if (bigSet) {
            return surnames[r.nextInt(smallSurnames.length)];
        } else {
            return smallSurnames[r.nextInt(smallSurnames.length)];
        }
    }

    private String surname() {
        return surname(false);
    }

    /**
     * @param length length of name
     * @return a random Chinese person's name. User small set of surnames (around 30 surnames).
     */
    public String chineseName(int length) {
        return chineseName(length, false);
    }

    /**
     * Generate a Chinese name.
     *
     * @param length        length of the Chinese name.
     * @param bigSurnameSet if true use big surname set (504 surnames) including Chinese very rare surnames.
     * @return A Chinese name.
     */
    public String chineseName(int length, boolean bigSurnameSet) {
        String surname = surname(bigSurnameSet);
        String firstname = "";
        // 中文名至少两个字
        if (length < 2) {
            return "-1";
        }
        // 复姓修正
        while (surname.length() > length - 1) {
            surname = surname(bigSurnameSet);
        }

        // 生成名
        for (int i = 0; i < length - surname.length(); i++) {
            firstname += randomChineseWord();
        }

        return surname + firstname;
    }

    public String chineseName(int min, int max, boolean bigSurnameSet) {
        if (min < 2 || max < 2) {
            return "-1";
        }

        int length = r.nextInt(Math.abs(max - min) + 1) + Math.min(min, max);
        return chineseName(length, bigSurnameSet);
    }

    /* test code */
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 100; i++) {
            System.out.println("二字名：" + faker.chineseName(2));
            System.out.println("三字名：" + faker.chineseName(3));
        }
    }
}

