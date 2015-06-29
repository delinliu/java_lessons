package 第1部分;

import java.util.Scanner;

/**
 * 编写程序，输入两个浮点数，然后根据四舍五入的原则输出它们的和。
 *
 * @author LiuDelin
 */
public class A_10_2 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a float type number:");
		float float_type1 = scanner.nextFloat();
		System.out.print("Input a float type number:");
		float float_type2 = scanner.nextFloat();
		
		float result = float_type1 + float_type2;
		int round_result = (int) (result + 0.5);
		System.out.println("rounding (" + float_type1 + "+" + float_type2 + ")" + result + " is " + round_result);
		
		scanner.close();
	}
}
