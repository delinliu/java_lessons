package 第1部分_课后练习;

/**
 * 猜测表达式的值：a+++a--*++b，设int a=3, b=4。然后用程序验证。
 *
 * @author LiuDelin
 */
public class A_08 {

	public static void main(String [] args){
		
		int a = 3;
		int b = 4;
		int result = a+++a--*++b;

		a = 3;
		b = 4;
		// 首先计算a++为3，此后a变成了4，表达式变为result = 3+a--*++b;
		// 再计算a--为4，此后a变成了3，表达式变为result = 3+4*++b;
		// 再计算++b为5，此后b变成了5，表达式变为result = 3+4*5;
		int result2 = a++ + (a-- * ++b);
		System.out.println(result);
		System.out.println(result2);
	}
}
