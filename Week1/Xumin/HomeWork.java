package Week1.Xumin;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		/*
		 * 1、完成用户登录功能：
			控制台提示用户输入账号、密码；
			如果账号为"admin",密码为"123456"，则控制台输出提示"登录成功!"；
			如果账号不为"admin"，则控制台输出提示"账号有误!"；
			如果账号为"admin",密码不为"123456"，则控制台输出提示"密码有误!"；
			提示：与其他基本数据类型不同的是，字符串求等不用"=="，二使用str2.equels(str1)来求等，比如:String str="张三";str.equels("admin")判断字符串张三是否等于admin
			2、字符判断：从键盘输入一个字符，判断这个字符是数字，还是大写字母，还是小写字母，还是其他字符。
			3、System.out.println((byte)128);值是多少？为什么？
			4、System.out.println((int)(char)（byte）-1)的输出结果是什么？为什么会出现这样的结果？
		 */
		
		
		/*
		 * 1、完成用户登录功能：
			控制台提示用户输入账号、密码；
			如果账号为"admin",密码为"123456"，则控制台输出提示"登录成功!"；
			如果账号不为"admin"，则控制台输出提示"账号有误!"；
			如果账号为"admin",密码不为"123456"，则控制台输出提示"密码有误!"；
			提示：与其他基本数据类型不同的是，字符串求等不用"=="，二使用str2.equels(str1)来求等，比如:String str="张三";str.equels("admin")判断字符串张三是否等于admin
		 */
		//控制台提示用户输入账号、密码；
		//输入对象
//		Scanner sc=new Scanner(System.in);
//		//提示用户输入账号
//		System.out.print("请输入登录账号:");
//		//控制台输入
//		String account=sc.next();
//		//提示用户输入密码
//		System.out.print("请输入登录密码:");
//		//控制台输入
//		String password=sc.next();
//		//判断用户账号是否正确
//		if(account.equals("admin")){
//			if(password.equals("123456")){
//				System.out.println("登录成功！");
//			}else{
//				System.out.println("密码有误！");
//			}
//		}else{
//			System.out.println("账号有误！");
//		}
		
		
		//2、字符判断：从键盘输入一个字符，判断这个字符是数字，还是大写字母，还是小写字母，还是其他字符。
		//提示用户进行控制台输入
		/*System.out.print("请输入一个字符:");
		//创建输入对象
		Scanner sc=new Scanner(System.in);
		//控制台输入
		String str=sc.next();
		//获取字符串的第一个字符  
		char ch=str.charAt(0);
		//获取字符编码
		int codeCh=ch;
		//这个字符是数字 [48,57]
		if(codeCh>=48 && codeCh<=57){
			System.out.println("字符为数字");
			//大写字母 [65,90]
		}else if(codeCh>=65 && codeCh<=90){
			System.out.println("字符为大写字母");
			//小写字母 [97,122]
		}else if(codeCh>=97 && codeCh<=122){
			System.out.println("字符为小写字母");
		}else {
			System.out.println("字符为除数字、字母外的其他字符");
		}*/
		
		//3、System.out.println((byte)128);值是多少？为什么？
		System.out.println((byte)128);
		
		
		
		//4、System.out.println((int)(char)(byte)-1)的输出结果是什么？为什么会出现这样的结果？
	}
}
