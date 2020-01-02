package Week1.Homework;

public class Day_2 {
	public static void main(String[] args) {
		/*
		 * 思考x与y的值，再用程序验证，是否与预期相同？为什么？
		 * x = 10, y = 10
		 * x++
		 * y = ++x+y++
		 * 
		 * 答：x = 12, y = 22
		 */
		int x = 10, y = 10;
		x++;
		y = ++x + y++;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		/*
		 * 假设 byte a = 1，分别求 a += 1 和 a = a + 1 的值
		 */
		byte a = 1;
		a += 1;
		// a = a + 1; 报错，无法自动转换 int
		System.out.println(a);

		/*
		 * 求字符串120和字符串5之商
		 */
		String str1 = "120";
		String str2 = "5";
		int resulf = Integer.valueOf(str1)/Integer.valueOf(str2);
		System.out.println(resulf);

		/*
		 * 输出 A 的 ASCII 码值与 a 的 ASCII 码值，并计算它们之间差值
		 */
		int asciiOf_A = (int)'A';
		int asciiOf_a = (int)'a';
		System.out.println("A:"+asciiOf_A);
		System.out.println("a:"+asciiOf_a);
		System.out.println("A-a:"+(asciiOf_A - asciiOf_a));
	}
}
