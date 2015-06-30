package 第2部分;

import java.util.Scanner;

/**
 * 编写程序，输入一个整数n，输出1+1/1!+1/2!+1/3!+...+1/n!。（n<=10）
 *
 * @author LiuDelin
 */
public class A_02_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int n = scanner.nextInt();
		scanner.close();
		
		double result = 1;
		for(int i=1; i<=n; i++){
			
			double part_result = 1;
			for(int j=1; j<=i; j++){
				part_result /= j;
			}
			result += part_result;
		}
		System.out.println(result);
	}

}
