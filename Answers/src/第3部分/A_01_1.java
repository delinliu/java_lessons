package 第3部分;

/**
 * 编写程序，编写一个方法，传入一个整数数组，返回这个数组的所有值的和。
 *
 * @author LiuDelin
 */
public class A_01_1 {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 3, 6, 1 };
		System.out.println(sum(arr));
	}

	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
