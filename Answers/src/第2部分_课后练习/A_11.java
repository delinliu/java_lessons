package 第2部分_课后练习;

/**
 * 编写程序，输出所有水仙花数。所谓水仙花数是指一个三位数，其各位数字立方和等于该数本身。例如，153=1^3+5^3+3^3
 *
 * @author LiuDelin
 */
public class A_11 {

	public static void main(String[] args) {

		for (int i = 100; i < 999; i++) {
			int left = i / 100;
			int mid = i % 100 / 10;
			int right = i % 10;
			if (i == left * left * left + mid * mid * mid + right * right
					* right) {
				System.out.println(i);
			}
		}
	}

}
