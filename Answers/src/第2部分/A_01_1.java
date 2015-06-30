package 第2部分;

import java.util.Scanner;

/**
 * 编写程序，考试的评级是这样算的：A为9、10，B为8，C为7，D为6，F为0~5。
 * 输入一个整数，使用switch语句，根据相应的分段打印出评级，如果分段不在0~10之间，输出"Unknown"
 *
 * @author LiuDelin
 */
public class A_01_1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int score = scanner.nextInt();
		scanner.close();

		switch (score) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("F");
			break;
		case 6:
			System.out.println("D");
			break;
		case 7:
			System.out.println("C");
			break;
		case 8:
			System.out.println("B");
		case 9:
		case 10:
			System.out.println("A");
			break;
		default:
			System.out.println("Unknown");
		}
	}
}
