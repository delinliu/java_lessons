package 第1部分;

import java.util.Scanner;

/**
 * 编写程序，输入两个整数，如果两个数都大于0，输出true，否则输出false。
 *
 * @author LiuDelin
 */
public class A_11_4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		boolean greater = a > 0 && b > 0 ? true : false;
		System.out.println(greater);

		scanner.close();
	}
}
