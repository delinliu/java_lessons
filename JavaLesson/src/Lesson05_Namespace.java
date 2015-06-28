/**
 * 变量的作用范围（变量的生命周期）
 * 
 * @author LiuDelin
 */
public class Lesson05_Namespace {
	public static void main(String[] args) {
		/* main作用域开始 */

		int a = 10;
		System.out.println("a=" + a);

		outer: {
			/* outer作用域开始 */

			System.out.println("a=" + a);
			int b = 20;
			System.out.println("b=" + b);

			inner: {
				/* inner作用域开始 */

				System.out.println("a=" + a);
				System.out.println("b=" + b);
				int c = 30;
				System.out.println("c=" + c);

				/* inner作用域结束 */
			}
			System.out.println("b=" + b);
			// System.out.println("c=" + c); // Error！无法访问到变量c，它的作用范围不再这里

			/* outer作用域结束 */
		}

		// System.out.println(b); // Error!无法访问到变量b，它的作用范围不在这里

		/* main作用域结束 */
	}
}
