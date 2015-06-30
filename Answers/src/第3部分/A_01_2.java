package 第3部分;

/**
 * 编写程序，编写一个方法，返回n!（参数为n）
 * 调用这个方法，输出1+1/1!+1/2!+1/3!+...+1/n!的值。（n<=10）
 *
 * @author LiuDelin
 */
public class A_01_2 {

	public static void main(String[] args) {
		
		int n = 6;
		double result = 1;
		for(int i=1; i<=n; i++){
			result += 1.0/factorial(i);
		}
		System.out.println(result);
	}

	public static int factorial(int n){
		int result = 1;
		for(int i=1; i<=n; i++){
			result *= i;
		}
		return result;
	}
}
