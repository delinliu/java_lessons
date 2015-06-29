/**
 * ½Ó¿Ú
 *
 * @author LiuDelin
 */
public class Lesson18_Interface {
	
	public static void main(String [] args){

		Circle4 circle = new Circle4();
		Square2 square = new Square2();
		circle.printBaseInfo();
		System.out.println(circle.getArea());
		System.out.println(circle.getColor());
		square.printBaseInfo();
		System.out.println(square.getArea());
		System.out.println(square.getColor());
		
		System.out.println("------------------------------");
		
		BaseInfoInterface infoCircle = circle;
		BaseInfoInterface infoSquare = square;
		infoCircle.printBaseInfo();
		infoSquare.printBaseInfo();

		System.out.println("------------------------------");

		ShapeInterface shapeCircle = circle;
		ShapeInterface shapeSquare = square;
		System.out.println(shapeCircle.getArea());
		System.out.println(shapeSquare.getArea());

		System.out.println("------------------------------");

		ColorInterface colorCircle = circle;
		ColorInterface colorSquare = square;
		System.out.println(colorCircle.getColor());
		System.out.println(colorSquare.getColor());
	}
}

interface BaseInfoInterface {
	
	public void printBaseInfo();
}

interface ShapeInterface {
	
	public double getArea();
}

interface ColorInterface {
	
	public String getColor();
}

class Circle4 implements ShapeInterface, ColorInterface, BaseInfoInterface{

	private double radius = 10;
	private String color = "red";
	
	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void printBaseInfo() {
		System.out.println("Area is " + getArea() + ". Color is " + getColor());
	}
}


class Square2 implements ShapeInterface, ColorInterface, BaseInfoInterface{

	private double length = 10;
	private String color = "green";
	
	@Override
	public double getArea() {
		return length*length;
	}

	@Override
	public String getColor() {
		return color;
	}
	
	@Override
	public void printBaseInfo() {
		System.out.println("Area is " + getArea() + ". Color is " + getColor());
	}
}