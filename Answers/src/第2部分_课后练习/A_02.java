package 第2部分_课后练习;

import java.util.Scanner;

/**
 * 输入一个字符串，实现反向输出。
 *
 * @author LiuDelin
 */
public class A_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		for(int i=line.length()-1; i>=0; i--){
			System.out.print(line.charAt(i));
		}
	}

}
