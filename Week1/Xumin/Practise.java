package Week1.Xumin;

import java.util.Scanner;

public class Practise {
	public static void main(String[] args) {
		/*
		 * 统计字符：从键盘上输入一个字符串，统计这个字符串当中包含几个大写字母，几个小写字母，几个数字，几个特殊符号；
		 */
//		int count1=0;
//		int count2=0;
//		int count3=0;
//		int count4=0;
//		//提示用户输入字符串
//		System.out.print("请输入一个字符串:");
//		//创建输入对象
//		Scanner sc=new Scanner(System.in);
//		//控制台输入
//		String str=sc.next();
//		//获取字符串长度,有多少个字符
//		int len=str.length();
//		for (int i = 0; i < len; i++) {
//			//分别获取字符串中每一个字符
//			char ch=str.charAt(i);
//			//获取字符编码
//			int code=ch;
//			//判断是否为数字 [48,57]  
//			if(code>47 && code<58){
//				count1++;
//				//大写字母[65,90]
//			}else if(code>64 && code<91){
//				count2++;
//				//小写[97,122]
//			}else if(code>96 && code<123){
//				count3++;
//			}else{
//				count4++;
//			}
//			
//		}
//		System.out.println("数字有:"+count1+"个，大写字母有:"+count2+"个，小写字母有:"+count3+"个，其它字符有:"+count4+"个");
		
		/*
		 * 鸡兔同笼35个头94只脚问 鸡有多少只 兔有多少只java程序解决;
		 */
//		for (int chicken=0; chicken < 36; chicken++) {
//			//兔的只数
//			int rabbit=35-chicken;
//			//94只脚
//			if(chicken*2+rabbit*4==94){
//				System.out.println("鸡有:"+chicken+"只，兔有:"+rabbit+"只");
//			}
//		}
		
		
		/*
		 * 密码验证：尝试将上述的用户名和密码验证分开进行，即如果用户名输入错误，则不需要再提示输入密码，
		 * 只有当用户名正确的情况下，我们才提示输入密码,并且机会只有3次;
		 */
		//创建输入对象
		Scanner sc=new Scanner(System.in);
		boolean state=true;
		int count=3;
		while(state && count>0){
			//提示用户输入账号
			System.out.print("请输入账号:");
			//控制台输入
			String account=sc.next();
			//验证账号是否输入正确
			if(!account.equals("admin")){
				System.out.println("账号有误！请重新输入！");
				count--;
			}else{
				//退出循环
				state=false;
			}
		}
		state=true;
		while(state && count>0){
			//提示输入密码
			System.out.print("请输入密码:");
			//控制台输入
			String password=sc.next();
			//验证密码是否输入正确
			if(!password.equals("123456")){
				System.out.println("密码有误！请重新输入！");
				count--;
			}else{
				state=false;
				System.out.println("登录成功！");
			}
		}
	}
}
