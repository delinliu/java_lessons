/**
 *  ‰»Î
 *
 * @author LiuDelin
 */
import java.util.Scanner;

public class Lesson10_Input {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int a = scanner.nextInt();
		System.out.print("Input an integer:");
		int b = scanner.nextInt();
		System.out.print("Input an integer:");
		int c = scanner.nextInt();
		System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
		scanner.close();
	}
}
