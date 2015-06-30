package 第3部分;

/**
 * 编写程序，编写一个类Square（正方形），它有一个成员变量length，有一个获取面积的方法getArea，
 * 初始化一个Square对象，设置它的length=10，然后输出它的面积。
 *
 * @author LiuDelin
 */
public class A_02_1 {

	public static void main(String[] args) {
		Square square = new Square();
		square.length = 10;
		System.out.println(square.getArea());
	}

}

class Square {
	double length;

	double getArea() {
		return length * length;
	}
}
