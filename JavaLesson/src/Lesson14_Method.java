/**
 * 方法
 *
 * @author LiuDelin
 */
public class Lesson14_Method {

	public static void main(String[] args) {

		double radius = 2;
		double area = getArea(radius);
		System.out.println("radius=" + radius + ", area=" + area);

		int n = 4;
		System.out.println(n + "! = " + getFactorial(n));
		
		printDivide(1, 0);
		printDivide(1, 2);
	}

	// 给出半径，返回面积
	public static double getArea(double radius) {
		return 3.14 * radius * radius;
	}

	// n!
	public static int getFactorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

	public static void printDivide(int a, int b) {
		if (b == 0) {
			System.out.println(a + "/0=?");
			return; // 返回，结束掉方法调用
		}
		System.out.println(a + "/" + b + "=" + ((double)a / b));
	}
}
