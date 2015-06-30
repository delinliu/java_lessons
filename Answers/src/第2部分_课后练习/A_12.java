package 第2部分_课后练习;

/**
 * 编写程序，猴子吃枣问题。猴子第一天摘下若干枣子，当即吃了一半，还不过瘾，有多吃了一个。
 *  第二天早上又将剩下的枣子吃掉了一半，又多吃了一个。
 *  以后每天早上都吃了前一天剩下的一半，再多吃一个。到了第10天早上想再吃的时候，见只剩下1个枣子了。求第一天摘了多少枣子？
 *  （除了最后一天，每天准备吃枣的时候，枣子的数目都是偶数）
 *
 * @author LiuDelin
 */
public class A_12 {

	public static void main(String[] args) {

		int num = 1; // 第10天早上还剩1个
		for(int i=9; i>=1; i--){
			
			num++;
			num*=2; // 第i天早上还剩num个
		}
		System.out.println(num);
	}

}
