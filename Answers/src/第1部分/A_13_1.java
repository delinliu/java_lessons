package 第1部分;

/**
 * 编写程序，定义一个长度为4的字符型数组，为它们赋值，然后把它们连成一个字符串输出。
 *
 * @author LiuDelin
 */
public class A_13_1 {

	public static void main(String [] args){
		char arr[] = new char[4];
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'c';
		arr[3] = 'd';
		String str = "" + arr[0] + arr[1] + arr[2] + arr[3];
		System.out.println(str);
	}
}
