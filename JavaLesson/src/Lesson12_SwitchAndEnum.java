/**
 * 开关、枚举
 *
 * @author LiuDelin
 */
public class Lesson12_SwitchAndEnum {

	public static void main(String[] args) {

		// int型switch
		int a = 3;
		switch (a) {
		case 0:
			System.out.println("a=0");
			break; // 注意，break很重要，千万别忘记
		case 1:
			System.out.println("a=1");
			break;
		case 2:
			System.out.println("a=2");
			break;
		case 3:
			System.out.println("a=3");
			break;
		case 4:
			System.out.println("a=4");
			break;
		case 5:
			System.out.println("a=5");
			break;
		case 6:
			System.out.println("a=6");
			break;
		default:
			System.out.println("a<0 or a>6");
		}

		// 其实就是int型，因为会把char默认转为int
		char b = 'd';
		switch (b) {
		case 'a':
			System.out.println('a');
			break;
		case 'b':
			System.out.println('b');
			break;
		case 99:
			System.out.println('c');
			break;
		default:
			System.out.println("Other character");
		}

		// String型
		String s = "Math";
		switch (s) {
		case "English":
			System.out.println("English time");
			break;
		case "Math":
			System.out.println("Math time");
		default:
		}

		TYPE type = TYPE.TYPE2;
		switch (type) {
		case TYPE1:
			System.out.println("type 1");
			break;
		case TYPE2:
			System.out.println("type 2");
			break;
		case TYPE3:
			System.out.println("type 3");
			break;
		default:
			System.out.println("Other type");
			break;
		}
	}

	// 定义枚举类型
	static enum TYPE {
		TYPE1, TYPE2, TYPE3
	}
}
