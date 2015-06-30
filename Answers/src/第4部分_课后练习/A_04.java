package 第4部分_课后练习;

import java.util.Scanner;

/**
 * 第1部分中的课后练习第10题，当你输入的数不是整数的时候会发生什么？修改程序，进行异常处理。
 * 如果输入的数不是整数，那么提示"You can only input integers."，然后重新输入，直到输入3个整数为止。
 *
 * @author LiuDelin
 */
public class A_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		while (true) {
			try {
				System.out.print("Input an integer:");
				a = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("You can only input integers.");
			}
		}
		while (true) {
			try {
				System.out.print("Input an integer:");
				b = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("You can only input integers.");
			}
		}
		while (true) {
			try {
				System.out.print("Input an integer:");
				c = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("You can only input integers.");
			}
		}
		scanner.close();

		boolean isTriangle = true;
		isTriangle = (a <= 0 || b <= 0 || c <= 0) ? false : isTriangle;
		isTriangle = (a + b <= c) || (a + c <= b) || (b + c <= a) ? false
				: isTriangle;
		String result = isTriangle ? "" + (a + b + c)
				: "cannot build a triangle";
		System.out.println(result);

	}

}
