/**
 * 简单的权限控制：private、public
 *
 * @author LiuDelin
 */
public class Lesson16_SimpleAccessControl {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		c.getArea();
		c.getRadius();
		c.setRadius(10);
		// c.privateMethod(); // Error!私有方法不能在类外面访问
		c.info = "This is a circle";
		// c.radius = 10; // Error!私有变量不能在类外面访问
	}
}

class Circle2 {

	private double radius; // private，私有成员
	public String info; // public，公有成员

	public double getArea() {
		return 3.14 * radius * radius;
	}

	private void privateMethod() {
		System.out
				.println("You cannot see this line out of the class Circle2.");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}