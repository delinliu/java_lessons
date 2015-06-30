package 第2部分_课后练习;

import java.util.Scanner;

/**
 * 输入一个字符串，计算其长度，如果长度为基数，输出中间字符，否则给出提示。
 * 提示：使用str.charAt(i)能够获得字符串str在i处的字符
 * 使用str.length()能获得字符串的长度
 *
 * @author LiuDelin
 */
public class A_01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		if(line.length()%2 == 0){
			System.out.println("length=" + line.length());
		}else{
			System.out.println(line.charAt(line.length()/2));
		}
	}

}
