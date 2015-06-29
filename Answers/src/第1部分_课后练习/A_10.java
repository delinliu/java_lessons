package 第1部分_课后练习;

import java.util.Scanner;

/**
 * 输入三个整数，判断这三个整数的值是否能够作为一个三角形的变成。
 * 如果不能构成三角形，输出“不能构成三角形”，如果能构成三角形，输出三角形的周长。
 *
 * @author LiuDelin
 */
public class A_10 {
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		System.out.print("Input an integer:");
		int c = scanner.nextInt();

		scanner.close();
		
		boolean isTriangle = true;
		isTriangle = (a<=0 || b<=0 || c<=0) ? false : isTriangle;
		isTriangle = (a+b<=c) || (a+c<=b) || (b+c<=a) ? false : isTriangle;
		String result = isTriangle ? "" + (a+b+c) : "cannot build a triangle";
		System.out.println(result);
		
	}
}
