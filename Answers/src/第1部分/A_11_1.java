package 第1部分;

import java.util.Scanner;

/**
 * 编写程序，输入两个整数，第二个整数被第一个整数除，输出商的整数部分和余数。
 *
 * @author LiuDelin
 */
public class A_11_1 {

public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		System.out.println(a + "/" + b + "=" + a/b + "..." + a%b);
		
		scanner.close();
	}
}
