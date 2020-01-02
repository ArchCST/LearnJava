package Week2.Homework.Day_8;
/*
		 * 1、创建IntArrayKit类，成员属性为int数组，
		 * 2、有一个无参构造，有一个有参构造，参数为一个int数组，并将该数组赋值给其成员变量
		 * 3、创建成员方法(行为)toString，功能为：将成员变量的数组按“[1,2,4,6]”格式进行控制台输出(可以考虑不用控制台输出，直接作为返回值返回)；
		 * 4、创建成员方法sort，功能为：将成员变量数组中数据按从小到大排序;
		 * 5、创建成员方法getMax,功能为：找出成员变量数组中最大值，并将其作为该方法的返回值返回;
*/
public class IntArrayKit {
	public int[] array;

	// Constructors
	public IntArrayKit(){}

	public IntArrayKit(int[] array){
		this.array = array;
	}

	// Member method
    public String aToString() {
		String re = "[";
		for (int i = 0; i < this.array.length; i++) {
			re += this.array[i];
			if (i != this.array.length - 1) {
				re += ",";
			}
		}
		return re + "]";

	}

	// insert sort 插入排序
	public void sort() {
	    for (int i = 1; i < this.array.length; i++) {
	    	int tmp = this.array[i];
	    	int j = i - 1;
	    	while (j >= 0 && tmp < this.array[j]) {
	    		this.array[j + 1] = this.array[j];
	    		j--;
			}
	    	this.array[j + 1] = tmp;
		}
	}

	public int getMax() {
		int max = this.array[0];
		for (int a : this.array) {
			max = (max < a) ? a : max;
		}
		return max;
	}

	public static void main(String[] args) {
		int[] nums = {5,3,2,4,1};
	    IntArrayKit array = new IntArrayKit(nums);
		array.sort();
		System.out.println(array.aToString());
		System.out.println(array.getMax());
	}
}
