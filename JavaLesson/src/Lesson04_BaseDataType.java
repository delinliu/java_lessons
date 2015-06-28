/**
 * 基本数据类型
 * 
 * @author LiuDelin
 */
public class Lesson04_BaseDataType {

	public static void main(String[] args) {

		// 布尔数据类型，只有两种值：true, false
		boolean bool_type = true;
		bool_type = false;
		System.out.println("bool_type：" + bool_type);

		// 字节类型。1个byte长度为8个bit，所以只能表示2^8个不同的数。byte值的范围在-128~127之间
		byte byte_type = 0;
		byte_type = 127;
		byte_type = -128;
		// byte_type = 128; // Error!不能大于127
		// byte_type = -129; // Error!不能小于-128
		System.out.println("byte_type：" + byte_type);

		// 字符类型。能够表示任意的字符。1个char长度为16个bit。
		char char_type = 'a';
		char_type = '#';
		char_type = '1';
		char_type = '字';
		System.out.println("char_type：" + char_type);

		// 短整数类型。1个short长度为16个bit，所以只能表示2^16个不同的数。short值的范围在-32768~32767之间
		// 基本上不怎么用，因为现在的电脑内存足够，所以一般情况下是不用short而是用int。
		short short_type = 0;
		short_type = 32767;
		short_type = -32768;
		// short_type = 32768; // Error!不能大于32767
		// short_type = -32769; // Error!不能小于-32768
		System.out.println("short_type：" + short_type);

		// 整数类型。1个int长度为32个bit，所以能表示2^32个不同的数。int值的范围在-2^31~2^31-1之间
		int int_type = 0;
		int_type = 2147483647;
		int_type = -2147483648;
		// int_type = 32768; // Error!不能大于2147483647
		// int_type = -32769; // Error!不能小于-2147483648
		System.out.println("int_type：" + int_type);

		// 长整数类型。1个long长度为64个bit，所以能表示2^64个不同的数。long值的范围在-2^63~2^63-1之间
		// 基本是不怎么用，除非要用超级大的整数。
		long long_type = 0;
		long_type = 9223372036854775807L; // 这里要加上L后缀，表示是长整形
		long_type = -9223372036854775808L;
		// long_type = 9223372036854775808L; // Error!不能大于9223372036854775807L
		// long_type = -9223372036854775809L; // Error!不能大于9223372036854775808L
		System.out.println("long_type：" + long_type);

		// 浮点数类型。一个float长度为32个bit。表示范围±1.4E-45~±3.4028235E+38
		// 不常用，一般使用double类型。
		float float_type = 0.0F;
		float_type = 2.5F;
		float_type = -2.5F;
		System.out.println("float_type：" + float_type);

		// 双精度类型。一个double长度为64个bit。表示范围±4.9E-324~±1.7976931348623157E+308
		// ps:程序中用到小数的地方基本都用double，因为现在电脑内存足够，而且double表示的精度高。
		// double、float的表示范围不用可以去管，普通程度的计算基本不会超出其表示范围。
		double double_type = 0.0;
		double_type = 2.5;
		double_type = -2.5;
		System.out.println("double_type：" + double_type);
	}
}
