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

		overloadFunction();
		overloadFunction(1);
		overloadFunction(1.0);
		overloadFunction(1.0f);
		overloadFunction("s");
		overloadFunction(1, 1);
		overloadFunction(1.0f, 1.0);
		overloadFunction(1.0, 1.0f);
		// overloadFunction(1.0f, 1.0f); // Error!模棱两可的调用，定义中有(double, float)、(float, double)两种能与这个调用匹配，所以不知道选哪个
		// overloadFunction(1.0, 1.0); // Error!没有找打(double, double)的定义
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
		System.out.println(a + "/" + b + "=" + ((double) a / b));
	}

	public static void overloadFunction() {
		System.out.println("overloadFunction without params.");
	}

	public static void overloadFunction(int a) {
		System.out.println("overloadFunction with an int param.");
	}

	public static void overloadFunction(double a) {
		System.out.println("overloadFunction with a double param.");
	}

	public static void overloadFunction(float a) {
		System.out.println("overloadFunction with a float param.");
	}

	public static void overloadFunction(String a) {
		System.out.println("overloadFunction with a String param.");
	}

	public static void overloadFunction(int a, int b) {
		System.out.println("overloadFunction with two int params.");
	}

	public static void overloadFunction(float a, double b) {
		System.out
				.println("overloadFunction with an int param and a double param.");
	}

	public static void overloadFunction(double a, float b) {
		System.out
				.println("overloadFunction with a double param and an int param.");
	}

}
