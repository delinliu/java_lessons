package 第1部分;

import java.util.Scanner;

/**
 * 编写程序，输入一个整数，然后输出它，再输入一个浮点数，然后输出它，输入一个字符串，然后输出它。
 *
 * @author LiuDelin
 */
public class A_08_2 {

	public static void main(String [] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input an integer:");
		int int_type = scanner.nextInt();
		System.out.println("int_type:" + int_type);
		
		System.out.print("Input a double type number:");
		double double_type = scanner.nextDouble();
		System.out.println("double_type:" + double_type);
		
		System.out.print("Input a string:");
		scanner.nextLine(); // nextInt()、nextDouble()这些方法是不会把流中的换行符读入的，所以得先消耗掉上一个换行符
		String string_type = scanner.nextLine();
		System.out.println("string_type:" + string_type);
		
		scanner.close();
	}
}
