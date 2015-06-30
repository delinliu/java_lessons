package 第2部分_课后练习;

import java.util.Scanner;

/**
 * 编写程序，输入两个正整数m、n，定义一个二维数组arr[m][n]，初始化它为arr[i][j]=i+j。然后打印出整个二维数组，如（m=2，n=3）：
 * 0 1 2
 * 1 2 3
 *
 * @author LiuDelin
 */
public class A_03 {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer:");
		int m = scanner.nextInt();
		System.out.print("Input an integer:");
		int n = scanner.nextInt();
		scanner.close();
		
		int arr[][] = new int[m][];
		for(int i=0; i<m; i++){
			arr[i] = new int[n];
			for(int j=0; j<n; j++){
				arr[i][j] = i+j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
