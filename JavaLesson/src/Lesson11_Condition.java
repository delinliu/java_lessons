/**
 * 条件判断
 *
 * @author LiuDelin
 */
public class Lesson11_Condition {

	public static void main(String[] args) {
		int a = 1;
		int b = -1;
		boolean c = true;

		// 典型的if else语句
		if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a <= b");
		}

		// 不带大括号的if else，不建议这样写！
		if (a > b)
			System.out.println("a > b");
		else
			System.out.println("a <= b");

		// 没有else的if语句
		if (a > b) {
			System.out.println("a > b");
		}

		// 推荐这样写
		if(c){
			System.out.println("c == true");
		}else{
			System.out.println("c == false");
		}
		// 不推荐这样写
		if(c == true){
			System.out.println("c == true");
		}else{
			System.out.println("c == false");
		}
		
		
		if(a <= b){
			System.out.println("a <= b");
		}else if(c){
			System.out.println("c == true && a > b");
		}else{
			System.out.println("c == false && a > b");
		}
	}
}
