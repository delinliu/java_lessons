/**
 * 类
 *
 * @author LiuDelin
 */
public class Lesson15_Class {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.printInfo();
		c.radius = 10;
		c.printInfo();

		Circle c2 = new Circle(10);
		c2.printInfo();
		
		System.out.println("------------------------");

		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle(10);
		Rectangle r3 = new Rectangle(10, 20);

		System.out.println("------------------------");
		
		Cylinder cylinder = new Cylinder(c, 2);
		System.out.println("bottom area:" + cylinder.bottom.getArea());
		System.out.println("volume:" + cylinder.getVolume());
	}
}

// 定义一个类：圆
class Circle {

	// 成员变量：半径
	double radius;

	Circle() {
		System.out.println("constructor without parameter");
	}

	Circle(double radius) {
		System.out.println("constructor with one parameter");
		this.radius = radius;
	}

	// 方法：获取面积
	double getArea() {
		return 3.14 * radius * radius;
	}

	// 方法：获取周长
	double getCircumference() {
		return 2 * 3.14 * radius;
	}

	void printInfo() {
		System.out.println("radius:" + radius);
		System.out.println("area:" + getArea());
		System.out.println("circumference:" + getCircumference());
	}
}

// 定义一个类：矩形
class Rectangle {

	double width; // 宽
	double height; // 高

	Rectangle() {
		System.out.println("no param");
	}

	Rectangle(double length) {
		System.out.println("one param");
		width = length;
		height = length;
	}

	Rectangle(double width, double height) {
		System.out.println("two params");
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}

	double getCircumference() {
		return 2 * (width + height);
	}
}

// 定义一个类：圆柱
class Cylinder {

	Circle bottom; // 底面
	double height; // 高

	Cylinder(Circle bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}

	double getVolume() {
		return bottom.getArea() * height;
	}
}