package 第1部分;

import java.util.Scanner;
/**
 * 编写程序，输入3个整数，输出这3个整数的和。
 *
 * @author LiuDelin
 */
public class A_06_1 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		int result = 0;

		System.out.print("Input an integer:");
		result += scanner.nextInt();
		System.out.print("Input an integer:");
		result += scanner.nextInt();
		System.out.print("Input an integer:");
		result += scanner.nextInt();
		
		System.out.println(result);
		scanner.close();
	}
}
