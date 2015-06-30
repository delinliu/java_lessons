package 第2部分_课后练习;

import java.util.Scanner;

/**
 * 编写程序，输入一串英文文字，然后按输出字母出现的频率。例如输入：This is a fantasy story about ghost.
 * 输出（只需要统计字母，大小写不区分；没有必要按照频率从高到低输出）：
 * s 5
 * t 5
 * a 4
 * o 3
 * ...
 *
 * @author LiuDelin
 */
public class A_07 {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		int arr[] = new int[26];
		for(int i=0; i<arr.length; i++){
			arr[i] = 0;
		}
		for(int i=0; i<line.length(); i++){
			char c = line.charAt(i);
			if(c >= 'a' && c <= 'z'){
				arr[c - 'a'] += 1;
			}else if(c >= 'A' && c <= 'Z'){
				arr[c - 'A'] += 1;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] != 0){
				System.out.println(((char)('a'+i)) + "\t" + arr[i]);
			}
		}
	}
}
