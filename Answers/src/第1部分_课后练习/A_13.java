package 第1部分_课后练习;

/**
 * 数学中除以0是没有意义的，那么在java中会怎么样呢，请尝试？
 * 以下的代码又会怎么样呢？
 * int a = -1;
 * if(a > 0 && (1/(a+1) > 10)){}
 *
 * @author LiuDelin
 */
public class A_13 {

	public static void main(String[] args) {
		
		// int t = 1/0;
		
		int a = -1;
		if(a > 0 && (1/(a+1) > 10)){}
	}

}
