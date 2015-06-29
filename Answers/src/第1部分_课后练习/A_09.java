package 第1部分_课后练习;

import java.util.Scanner;

/**
 * 输入一个字符串、一个整数、一个双精度浮点数，把这三个变量用“+”连起来，输出到屏幕上。
 *
 * @author LiuDelin
 */
public class A_09 {
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a string:");
		String string_type = scanner.nextLine();
		System.out.print("Input an integer:");
		int int_type = scanner.nextInt();
		System.out.print("Input a double type number:");
		double double_type = scanner.nextDouble();
		
		System.out.println(string_type + int_type + double_type);
		scanner.close();
	}
}
