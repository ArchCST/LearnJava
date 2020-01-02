package Week1.Xumin;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		//循环：重复做相同或相似的事情(代码执行)
		//死循环：当循环条件永远为true时
		//定义变量，赋初始值为100
//		int num=100;
//		while(num>0){
//			System.out.println(num+"我最漂亮！");
//			num--;
//		}
		//控制台打印0~100
//		int num1=0;
//		while(num1<101){
//			System.out.println(num1);
//			num1++;
//		}
		//打印所有能整除100的正除数
		// 被除数 / 除数=商.....余数
//		int num2=100;
//		while(num2>0){
//			if(100%num2==0){
//				System.out.println(num2);
//			}
//			num2--;
//		}
		//打印100以内所有正偶数
//		int num3=100;
//		while(num3>0){
//			if(num3%2==0){
//				System.out.println(num3);
//			}
//			num3--;
//		}
		//打印100以内从大到小前10个正偶数
		//break:退出当前整个循环
//		int num3=100;
//		int count=0;
//		while(num3>0){
//			if(num3%2==0){
//				System.out.println(num3);
//				count++;
//				if(count==10){
//					break;
//				}
//			}
//			num3--;
//		}
		//打印100以内所有正偶数,除了82以外
//		int num3=100;
//		while(num3>0){
//			if(num3%2==0){
//				if(num3!=82){
//					System.out.println(num3);
//				}
//			}
//			num3--;
//		}
		//continue:结束当次循环，继续下一次循环
//		int num4=0;
//		while(num4<10){
//			num4++;
//			if(num4%2==0){
//				continue;
//			}
//			System.out.println(num4);
//		}
		
		
		//do-while:先执行，再判断，条件满足时，继续循环，直到条件不满足，退出循环
//		int num5=0;
//		do {
//			System.out.println(num5);
//			num5++;
//		} while (num5<101);
		//登录功能，直到用户输入正确的账号、密码，否则一直进行登录操作
		//创建输入对象
//		Scanner sc=new Scanner(System.in);
//		boolean isSuccess=false;
//		do{
//			//提示用户输入账号
//			System.out.print("请输入登录账号:");
//			//控制台输入
//			String account=sc.next();
//			//提示用户输入登录密码
//			System.out.print("请输入登录密码:");
//			//控制台输入
//			String password=sc.next();
//			//判断账号是否正确
//			if(account.equals("admin")){
//				if(password.equals("123456")){
//					System.out.println("登录成功！");
//					isSuccess=true;
//				}else{
//					System.out.println("密码有误！");
//				}
//			}else{
//				System.out.println("账号有误！");
//			}
//		}while(!isSuccess);
		/*
		 * for循环
		 * for(初始化操作①;循环条件②;步进③){
		 * 	循环体④;
		 * }
		 * ① -> ② -> ④ -> ③ -> ② -> ④ -> ③ .....(直到循环条件②不满足) 退出循环
		 */
//		for(int i=0;i<11;i++){
//			System.out.println(i);
//		}
		/*for (;true;) {
			System.out.println("Hello");
		}*/
		//(1)	循环求和：利用循环语句计算从100加到500的总和。
		int result=0;
		for (int num = 100; num < 501; num++) {
			result+=num;
		}
		System.out.println(result);
	}
}
