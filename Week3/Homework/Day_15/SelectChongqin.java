package Week3.Homework.Day_15;

/*
定义一个对象数组，里面包含用户名，密码，地址属性
创建5个对象存入当前对象数组。
张三	123  四川省双流区
李四    admin  重庆江北路
小吴    root  四川南充市
小黑    123456 甘肃兰州
小白    woniuxy  四川省梁山市
判断有几个重庆的并且输出其数量。
 */
public class SelectChongqin {
    public static void main(String[] args) {
        CQ_Users[] cq_users = new CQ_Users[]{
                new CQ_Users("张三", "123", "四川省双流区"),
                new CQ_Users("李四", "admin", "重庆江北路"),
                new CQ_Users("小吴", "root", "四川南充市"),
                new CQ_Users("小黑", "123456", "甘肃兰州"),
                new CQ_Users("小白", "woniuxy", "四川省梁山市"),
        };

        int count = 0;
        for (CQ_Users user : cq_users) {
            if (user.getAddress().contains("重庆")){
                count++;
            }
        }

        System.out.println(count);
    }

}
