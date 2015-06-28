/**
 * 类型转换
 * 
 * @author LiuDelin
 */
public class Lesson06_TypeCast {

	public static void main(String[] args) {

		/** 以下是强制类型转换， **/
		short short_type = 10;
		int int_type = 1000000;
		long long_type = 100000000000000L;

		System.out.println("short:" + short_type);
		System.out.println("short->int:" + (int) short_type); // 向上转型
		System.out.println("short->long:" + (long) short_type); // 向上转型
		System.out.println();

		System.out.println("int->short:" + (short) int_type); // 向下转型
		System.out.println("int:" + int_type);
		System.out.println("int->long:" + (long) int_type); // 向上转型
		System.out.println();

		System.out.println("long->short:" + (short) long_type); // 向下转型
		System.out.println("long->short:" + (int) long_type); // 向下转型
		System.out.println("long:" + long_type);
		System.out.println();
		/* 向下转型需要注意精度损失 */

		float float_type = 1.5F;
		double double_type = 1.5;
		System.out.println("float->int:" + (int) float_type); // 向下转型
		System.out.println("double->int:" + (int) double_type); // 向下转型
		/* 浮点数转整数会只取整数部分 */

		boolean bool_type = true;
		// System.out.println("bool->int:" + (int)boolean); //
		// Error!boolean不能与其他基本类型互相转换

		/** 以下是默认类型转换 **/

		int_type = short_type; // 默认类型转换（short->int）
		// short_type = int_type; // Error!不支持默认类型转换

		double_type = float_type;
		// float_type = double_type; // Error!不支持默认类型转换

		float_type = long_type;
		// long_type = float_type; // Error!不支持默认类型转换

		/** 以下是字面常量的类型 **/

		// 整数常量是int型
		int_type = 1000000000;
		// short_type = 1000000000; // Error!int->short不支持默认转型
		long_type = 1000000000; // int->long

		// 整数后面加上L是long型
		// int_type = 1L; // Error!long->int不支持默认转型
		long_type = 1L;

		// 小数常量是double型
		// float_type = 1.0; // Error!double->float不支持默认转型
		double_type = 1.0;

		// 小数后面加上F是float型
		float_type = 1.0F;
		double_type = 1.0F; // float->double

		/* 注意：当默认转型不成功的时候需要使用强制转型 */
		
		/* char和byte类型的实质其实是整数 */
		char char_type = 'a';
		byte byte_type = 10;
		int_type = char_type;
		int_type = byte_type;
	}
}
