package 第1部分;

import java.util.Scanner;

/**
 * 编写程序，输入两个整数，如果第一个数大于第二个数，输出"A>B"，否则输出"A<=B"
 *
 * @author LiuDelin
 */
public class A_11_3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		String greater = a>b ? "A>B":"A<=B";
		System.out.println(greater);
		
		scanner.close();
	}
}
