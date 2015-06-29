package 第1部分;

/**
 * 编写程序，定义一个二维整数数组（2*3)，第一个位置赋值为0，然后每个位置赋值都加1，输出它们。
 *
 * @author LiuDelin
 */
public class A_13_2 {

	public static void main(String [] args){
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
		System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
	}
}
