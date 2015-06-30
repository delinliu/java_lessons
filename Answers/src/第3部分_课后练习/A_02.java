package 第3部分_课后练习;

class MyInt {
	int data;

	MyInt(int data) {
		this.data = data;
	}
}

public class A_02 {
	public static void main(String[] args) {
		MyInt a = new MyInt(1);
		MyInt b = new MyInt(2);

		System.out.println("main: a=" + a.data + ", b=" + b.data);
		swap(a, b);
		System.out.println("main: a=" + a.data + ", b=" + b.data);
	}

	static public void swap(MyInt a, MyInt b) {
		System.out.println("swap: a=" + a.data + ", b=" + b.data);
		int t = a.data;
		a.data = b.data;
		b.data = t;
		System.out.println("swap: a=" + a.data + ", b=" + b.data);
	}
}