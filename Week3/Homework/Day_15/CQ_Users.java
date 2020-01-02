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
public class CQ_Users {
    private String username;
    private String password;
    private String address;

    public CQ_Users(String username, String password, String address) {
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }
}
