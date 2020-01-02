package Week1.Homework;

import java.util.Scanner;

/*
完成登录登录、注册功能：
 */
public class Day_7 {
    /*
	1、创建长度为[10][2]的二维数组users，用于存储用户账号以及密码，并在数组中存储3个初始化账号密码信息;
     */
    public static void main(String[] args) {
        String[][] users = new String[10][2];
        users[0] = new String[]{"xumin", "xmpass"};
        users[1] = new String[]{"chenshitong", "cstpass"};
        users[2] = new String[]{"chenpengyu", "cpypass"};

        // implement repeat login or register for bug testing.
        // can login with new registered accounts.
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            System.out.print("1. 登录  2. 注册  3. 离开: ");
            c = sc.next().charAt(0);
            switch (c) {
                case '1':
                    System.out.println(((new Day_7().login(users)) ? "登录成功！" : "登录失败！")); // call login method
                    break;
                case '2':
                    System.out.println(new Day_7().register(users)); // call register method
                    break;
                case '3':
                    System.out.println("撒哟啦啦！");
                    break;
                case '9':
                    // ester egg: print all username and password
                    for (String[] user : users) {
                        System.out.print(user[0]+"|"+user[1]+"  ");
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (c != '3');
    }
    /*
	2、定义login方法,将users数组作为实参传入login方法，login方法功能为:用户控制台输入登录账号、密码信息，根据
    用户输入的账号和密码是否存在于users数组中 来确认登录是否成功，并将登录结果作为login方法返回值返回;
     */
    public boolean login(String[][] users) {
        Scanner sc = new Scanner(System.in);

        // read from console.
        System.out.print("Username: ");
        String inputUser = sc.next();
        System.out.print("Password: ");
        String inputPass = sc.next();

        // validate user.
        for (String[] user : users) {
            if (inputUser.equals(user[0])) {
                // return true if password matched.
                return inputPass.equals(user[1]);
            }
        }

        // return false if traversed all users[] can't find user
        return false;
    }

    /*
	3、定义register方法,将users数组作为实参传入register方法，register方法功能为:用户控制台输入要注册的账号、密
    码信息，判断账号是否已经存在于users数组中，如果存在，则结束当前方法执行，返回“账号已存在！请直接登录，注册
    失败！”;如果账号不存在与users数组中，则将用户输入的账号与密码存储到users数组的下一个空 间中(注意：起始位
    置应该在3索引开始，因为初始化账号信息占了三个空间)，并返回"注册成功！";
    */


    public String register(String[][] users) {
        // find the empty spot for new user
        int newSpot;
        for (newSpot = 3; newSpot < users.length; newSpot++) {
            if (users[newSpot][0] == null) break;
        }

        // if no spot for new user
        if (newSpot == users.length) {
            return "用户数量达到上限，注册失败！";
        }

        // read account info from console
        Scanner sc = new Scanner(System.in);
        System.out.print("New username: ");
        String newUser = sc.next();
        System.out.print("New password: ");
        String newPass = sc.next();

        // find our if new user has already exist.
        for (int i = 0; i < newSpot; i++) {
            if (newUser.equals(users[i][0])) {
                return "用户名已存在，请登录或重新注册！";
            }
        }

        // register user into users[newSpot]
        users[newSpot][0] = newUser;
        users[newSpot][1] = newPass;
        return "注册成功！";
    }
}
