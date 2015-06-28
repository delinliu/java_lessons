/**
 * 变量的命名规则和关键字
 * 
 * @author LiuDelin
 */
public class Lesson03_VariableAndKeywords {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/* java的变量名 */

		// 变量名首字母必须为以下几种：1.字母；2.下划线；3.文字（并不推荐这么写）
		int aaa; // 小写字母开头
		int Aaa; // 大写字母开头
		int _aa; // 下划线开头
		int 这是变量 = 1; // 文字开头！注意：并不推荐这样做，因为中文会造成很多问题，比如乱码、外国人看不懂、不易输入等。
		// int 1aa; // 数字开头！Error!
		// int #aa; // 其他字符开头！Error！

		// 变量名不能含有除了字母、下划线、文字之外的其他字符
		// int aa#; // 含有其他字符！Error！
		// int aa&; // 含有其他字符！Error！

		// 正确的变量名示范
		double pi = 3.14; // pi表示π
		double soundSpeed = 340; // 声速为340m/s
		double sound_speed = 340; // 声速为340m/s

		/* java关键字 */

		// java的关键字有很多，这些关键字不能用来做变量名
		// abstract, implements
		// double, int, float, long, void, char
		// if, else
		// for, continue, break
		// switch, case
		// try, catch
		// 还有很多，不一一例举了，也没有要求去记这些。以后慢慢熟悉了java自然就会知道的。
	}
}
