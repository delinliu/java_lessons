/**
 * 继承
 *
 * @author LiuDelin
 */
public class Lesson17_Inherit {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.printInfo();
		shape.getArea();

		Circle3 c = new Circle3();
		c.printInfo();
		System.out.println("Area is " + c.getArea() + ".");

		Rectangle2 r = new Rectangle2();
		r.printInfo();
		System.out.println("Area is " + r.getArea() + ".");
		
		Square s = new Square();
		s.printInfo();
		System.out.println("Area is " + s.getArea() + ".");
		
		Shape squareShape = new Square();
		squareShape.printInfo();
		System.out.println("Area is " + squareShape.getArea() + ".");
		
		Shape arr[] = new Shape[]{
				new Shape(),
				new Circle3(),
				new Rectangle2(),
				new Square()
		};
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i].getArea() + " ");
		}
	}
}

class Shape {

	public String description = "This is a shape";

	protected String className = "Shape";

	private int secret = 0;

	public void printInfo() {
		System.out.println("Class name is " + className + ". Description is \""
				+ description + "\".");
	}

	public double getArea() {
		System.out.println("No! This is just a shape. It has no area.");
		return 0;
	}
}

class Circle3 extends Shape {

	private double radius = 10;

	public Circle3() {
		System.out
				.println("My father's description: " + this.description + ".");
		System.out.println("My father's className: " + this.className + ".");
		this.className = "Circle";
		this.description = "This is a circle";
		// int secret = this.secret; // Error!private权限的变量不能被访问
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}
}

class Rectangle2 extends Shape {
	private double width = 10;
	private double height = 20;

	public Rectangle2() {
		this.className = "Rectangle";
		this.description = "This is a rectangle";
	}

	@Override
	public double getArea() {
		return width * height;
	}
}

class Square extends Rectangle2 {
	
	private double length = 10;
	
	public Square(){
		this.className = "Square";
		this.description = "This is a square";
	}
	
	@Override
	public double getArea() {
		return length * length;
	}
}