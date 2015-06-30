package 第2部分_课后练习;

/**
 * 编写程序，一个数如果恰好等于它的所有因子（除了它自己）之和，这个数就称为完数，打印出1000之内所有完数。如28=1+2+4+7+14，1不是完数
 *
 * @author LiuDelin
 */
public class A_05 {

	public static void main(String[] args) {

		int range = 1000;
		
		// 因为1不是完数，所以直接从2开始
		for(int i=2; i<=range; i++){
			
			int num = i;
			int sum = 1; // 任何数都有1这个因子，所以初始化为1
			String info = "1";
			for(int j=2; j<num; j++){
				if(num%j == 0){
					sum += j;
					info += "+" + j;
				}
			}
			if(sum == num){
				System.out.println(i + "=" + info);
			}
		}
	}

}
