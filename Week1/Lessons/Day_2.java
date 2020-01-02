package Week1.Lessons;

public class Day_2 {
	public static void main(String[] args) {
		byte byteNum = Byte.valueOf("22");
		int intNum = Integer.valueOf("22");
		short shortNum = Short.valueOf("22");
		long longNum = Long.valueOf("22");
		float floatNum = Float.valueOf("22");
		double doubleNum = Double.valueOf("22");
		boolean b = Boolean.valueOf("true");

		System.out.println(byteNum);
		System.out.println(intNum);
		System.out.println(shortNum);
		System.out.println(longNum);
		System.out.println(floatNum);
		System.out.println(doubleNum);
		System.out.println(b);

		String str;
		str = Byte.toString(byteNum);
		System.out.println(str);
		str = Integer.toString(intNum);
		System.out.println(str);
		str = Short.toString(shortNum);
		System.out.println(str);
		str = Long.toString(longNum);
		System.out.println(str);
		str = Float.toString(floatNum);
		System.out.println(str);
		str = Double.toString(doubleNum);
		System.out.println(str);
		str = Boolean.toString(b);
		System.out.println(str);

		System.out.println(String.valueOf(3.14159265359));
		System.out.println(""+3.14);
	}
}
