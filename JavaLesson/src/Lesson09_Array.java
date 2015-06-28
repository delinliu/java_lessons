/**
 * 数组
 *
 * @author LiuDelin
 */
public class Lesson09_Array {

	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		System.out.println("length:" + arr.length); // 数组的长度
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr = new int[]{0, 1, 2}; // 初始化数组的简易写法
		System.out.println("length:" + arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		int arr2[][] = new int[2][];
		arr2[0] = new int[3];
		arr2[1] = new int[3];
		arr2[0][0] = 0;
		arr2[0][1] = 1;
		arr2[0][2] = 2;
		arr2[1][0] = 0;
		arr2[1][1] = 1;
		arr2[1][2] = 2;
		System.out.println("length:" + arr2.length);
		System.out.println("length:" + arr2[0].length);
	}
}
