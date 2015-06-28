/**
 * 循环语句
 *
 * @author LiuDelin
 */
public class Lesson13_Loop {

	public static void main(String[] args) {

		/* for循环 */

		// 常用形式
		for (int i = 0; i < 3; i++) {
			System.out.println("i=" + i);
		}

		System.out.println("----------------1------------------");

		// 可以省略结尾操作
		for (int i = 0; i < 3; /* 这里可以不写语句 */) {
			System.out.println("i=" + i);
			i++; // 记得自增，不然就死循环了
		}

		System.out.println("----------------2------------------");

		// 定义多个变量
		for (int i = 0, j = 0; i < 5 && j < 100; i++, j += 10) {
			System.out.println("i=" + i + ", j=" + j);
		}

		System.out.println("----------------3------------------");

		// 不在循环中定义变量
		int i = 0;
		for (; i < 3; i++) {
			System.out.println("i=" + i);
		}

		System.out.println("----------------4------------------");

		// 省略跳出循环判断语句
		for (i = 0;; i++) {
			System.out.println("i=" + i);
			if (i >= 3) {
				break; // break的功能是跳出循环
			}
		}

		System.out.println("----------------5------------------");

		// 全省略
		i = 0;
		for (;;) {
			System.out.println("i=" + i);
			i++;
			if (i >= 3) {
				break;
			}
		}

		System.out.println("----------------6------------------");

		for (i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("i=" + i);
		}

		System.out.println("----------------7------------------");

		/* while循环 */

		i = 0;
		while (i < 4) {
			System.out.println("i=" + i);
			i++;
		}

		System.out.println("----------------8------------------");

		i = 0;
		while (true) {
			System.out.println("i=" + i);
			i++;
			if (i >= 4) {
				break;
			}
		}

		System.out.println("----------------9------------------");

		i = 0;
		while (i < 4) {
			if (i == 2) {
				i++;
				continue;
			}
			System.out.println("i=" + i);
			i++;
		}
		
		System.out.println("----------------10------------------");

		/* do-while循环 */

		// 这种形式用得很少，就不详细介绍了
		i = 0;
		do {
			System.out.println("i=" + i);
			i++;
		} while (i < 4);
	}
}
