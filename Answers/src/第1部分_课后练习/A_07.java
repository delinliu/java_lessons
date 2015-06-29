package 第1部分_课后练习;

/**
 * 说出表达式的值：x+a%3*(int)(x+y)%2/4，设double x=2.5; int a=7; double y=4.7。然后用程序来验证。
 *
 * @author LiuDelin
 */
public class A_07 {

	public static void main(String[] args) {

		double x = 2.5;
		int a = 7;
		double y = 4.7;

		double result = x + a % 3 * (int) (x + y) % 2 / 4;

		// 上述表达式是按着下列添加括号的顺序执行的
		// 首先是计算(x+y)为7.2，表达式变为 result = x + a % 3 * (int) 7.2 % 2 / 4;
		// 然后计算(int)7.2为7，表达式变为 result = x + a % 3 * 7 % 2 / 4;
		// 然后计算a%3为1，表达式变为result = x + 1 * 7 % 2 / 4;
		// 然后计算1*7为7，表达式变为result = x + 7 % 2 / 4;
		// 然后计算7%2为1，表达式变为result = x + 1 / 4;
		// 然后计算1/4为0，表达式变为result = x + 0;
		// 最后计算x+0为2.5
		double result2 = x + (((a % 3) * ((int) (x + y))) % 2) / 4;

		System.out.println(result);
		System.out.println(result2);
	}
}
