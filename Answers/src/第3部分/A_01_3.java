package 第3部分;

/**
 * 编写程序，编写一个方法，返回1~n范围内的所有质数。（参数为n，返回一个数组）
 *
 * @author LiuDelin
 */
public class A_01_3 {

	public static void main(String [] args){
		
		int n = 1000;
		int arr[] = primes(n);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static int[] primes(int n){
		int[] large_arr = new int[n];
		int length = 0;
		outer: for(int i=2; i<=n; i++){
			for(int j=2; j<i; j++){
				if(i%j == 0){
					continue outer;
				}
			}
			large_arr[length++] = i;
		}
		
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++){
			arr[i] = large_arr[i];
		}
		return arr;
	}
}
