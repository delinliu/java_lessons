/**
 * 运算
 * 
 * @author LiuDelin
 */
public class Lesson07_Calculate {

	public static void main(String[] args) {

		/* 基本运算 */
		int a = 1;
		a += 5; // 等价于 a = a+5;
		a -= 5; // 等价于 a = a-5;
		a *= 2; // 等价于 a = a*2;
		a /= 2; // 等价于 a = a/2;
		a %= 2; // 等价于a = a%2; 百分号%是取余数的意思

		a = 1; // 赋值
		a = -a; // 取负值
		a++; // 自增（并返回自增前的值）
		++a; // 自增（并返回自增后的值）
		a--; // 自减（并返回自减前的值）
		--a; // 自减（并返回自减后的值）

		/* 逻辑运算 */
		boolean b = true;
		b = 10 > 5; // 大于
		b = 10 >= 5; // 大于等于
		b = 10 < 5; // 小于
		b = 10 <= 5; // 小于等于
		b = 10 == 5; // 等于
		b = 10 != 5; // 不等于

		boolean c = true;
		boolean d = false;
		b = c && d; // 与
		b = c || d; // 或
		b = !c; // 非

		/* 条件运算符 */
		a = 10 > 5 ? 1 : -1;
		
		/*字符串拼接运算*/
		String s;
		s = "Hello" + '\n' + "World!"; // \n是转义字符，是换行的意思
		System.out.println(s);
	}
}
