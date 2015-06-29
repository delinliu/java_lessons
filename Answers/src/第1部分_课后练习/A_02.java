package 第1部分_课后练习;

/**
 * Java中的整数类型有哪几种，分别有多少位（bit）？
 *
 * @author LiuDelin
 */
public class A_02 {

	public static void main(String[] args) {

		// 共有以下三种
		short short_type;
		int int_type;
		long long_type;

		// 这里用到了java的一些其他帮助类，可以暂时不去管
		System.out.println("1 short is " + Short.SIZE + " bits");
		System.out.println("1 int is " + Integer.SIZE + " bits");
		System.out.println("1 long is " + Long.SIZE + " bits");
	}
}
