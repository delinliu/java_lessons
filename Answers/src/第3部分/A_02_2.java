package 第3部分;

/**
 * 编写程序，修改Square类，为其添加两个构造方法：Square()、Square(int length)。如果没有参数，
 * 	则赋值length=1，如果有参数则赋值length为相应的值。
 * 	用两种初始化方法分别初始化一个Square对象，然后输出它们的面积。
 *
 *	修改后的Square用Square2表示
 * @author LiuDelin
 */
public class A_02_2 {

	public static void main(String[] args){
		Square2 s1 = new Square2();
		Square2 s2 = new Square2(10);
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
	}
}

class Square2{
	
	double length;
	
	Square2(){
		length = 1;
	}
	
	Square2(int length){
		this.length = length;
	}
	
	double getArea(){
		return length*length;
	}
}