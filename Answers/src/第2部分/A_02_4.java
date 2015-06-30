package 第2部分;

import java.util.Scanner;

/**
 * 编写程序，输入一个整数n，输出n的阶乘。（n<=10）
 *
 * @author LiuDelin
 */
public class A_02_4 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int n = scanner.nextInt();
		scanner.close();
		
		int result = 1;
		for(int i=1; i<=n; i++){
			result *= i;
		}
		System.out.println(result);
	}
}
