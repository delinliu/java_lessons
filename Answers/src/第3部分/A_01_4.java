package 第3部分;

/**
 * 编写程序
 * 	编写一个方法，打印一个数组的所有值（用空格分割）。
 * 	编写一个方法，传入一个整数数组，对这个数组的值从小到大排序。
 * 	在main方法中定义一个长度为10的整数数组，并且用1~100中的值随机初始化它。
 * 	然后调用打印数组的所有值的方法，再调用排序方法，在调用打印方法。
 * 	提示1：Math.random()可以获得一个随机的0~1的浮点数，那么如何生成1~100的随机整数？
 * 	提示2：如何排序？下面一段代码能够把arr[0]与arr[1]的值交换。
 * 		if(arr[0] < arr[1]){
 * 			int t = arr[0];
 * 			arr[0] = arr[1];
 * 			arr[1] = t;
 * 		}
 *
 * @author LiuDelin
 */
public class A_01_4 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random() * 100);
		}
		printArr(arr);
		sortArr(arr);
		printArr(arr);
	}
	
	public static void printArr(int [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void sortArr(int [] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i] > arr[j]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}
}
