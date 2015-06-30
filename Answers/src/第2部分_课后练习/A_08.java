package 第2部分_课后练习;

import java.util.Scanner;

/**
 * 编写程序，输入一串英文文字（只存在字母和空格，但是可能有连续的空格，头尾也可能有空格），然后判断单词出现的个数。例如输入：abc  def ghi。
 * 输出：3
 *
 * @author LiuDelin
 */
public class A_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		int words = 0;
		line = line + " "; // 为什么要加这个空格呢？
		for(int i=1; i<line.length(); i++){
			if(line.charAt(i) == ' ' && line.charAt(i-1) != ' '){
				words += 1;
			}
		}
		System.out.println(words);
	}

}
