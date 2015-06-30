package 第2部分_课后练习;

import java.util.Scanner;

/**
 * 编写程序，输入10个整数，存放到数组中。再输入一个数，如果为1，从数组中输出最大值；如果为2，从数组中输出最小值。
 *
 * @author LiuDelin
 */
public class A_10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int nums = 10;
		int arr[] = new int[nums];
		for (int i = 0; i < nums; i++) {
			System.out.print("Input an integer:");
			arr[i] = scanner.nextInt();
		}

		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}

		System.out.print("Input 1 for max value, 2 for min value:");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("max value is " + max);
			break;
		case 2:
			System.out.println("min value is " + min);
			break;
		default:
		}
		scanner.close();
	}

}
