package 第2部分_课后练习;

import java.util.Scanner;

/**
 * 输入一段英文，反向输出其单词。例如输入：This is a fantasy story about ghost
 * 输出：ghost about story fantasy a is This
 *
 * @author LiuDelin
 */
public class A_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a line:");
		String line = scanner.nextLine();
		scanner.close();
		
		String result = "";
		String word = "";
		for(int i=0; i<line.length(); i++){
			if(line.charAt(i) == ' '){
				result = ' ' + word + result;
				word = "";
			}else{
				word += line.charAt(i);
			}
		}
		result = word + result;
		System.out.println(result);
	}

}
