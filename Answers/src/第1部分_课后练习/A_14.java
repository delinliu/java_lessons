package 第1部分_课后练习;

import java.util.Scanner;

/**
 * 输入一个长度为3字符串，字符串中的字符全是数字（如："123"，注意不是输入整数，而是字符串）。
 * 在程序里把这个字符串转成整数（这里需要动脑筋），然后输出。
 * 提示，取一个字符串的第i个字符：char c = s.charAt(i);
 * 如：String s = scanner.nextLine(); // 这时s=123
 * 	int a = 0;
 * 	.... // 经过一些运算之后
 * 	System.out.println(a); // 这时a=123
 *
 * @author LiuDelin
 */
public class A_14 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input an integer:");
		String str = scanner.nextLine();
		char a = str.charAt(0);
		char b = str.charAt(1);
		char c = str.charAt(2);
		int result = 100*(a-'0') + 10*(b-'0') + (c-'0');
		System.out.println(result);
		
		scanner.close();
	}
}
