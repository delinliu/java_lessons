package 第3部分_课后练习;

public class A_05 {

	public static void main(String [] args){
		
		LargeInt largeInt = new LargeInt(1);
		largeInt.printValue(); // 输出1
		largeInt.add(9);
		largeInt.printValue(); // 输出10
		for(int i=0; i<100; i++){
			largeInt.mul(10); 
		}
		largeInt.printValue(); // 输出100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
		
		largeInt = new LargeInt(1);
		for(int i=1; i<=40; i++){
			largeInt.mul(i);
		}
		largeInt.printValue(); // 输出40!对应的值
	}
}

class LargeInt {

	private static int lengthOfNode = 1; // >=1

	private static int MAX;
	{
		MAX = 1;
		for(int i=0; i<lengthOfNode; i++){
			MAX *= 10;
		}
	}

	private int data = 0;
	private LargeInt next = null;

	public LargeInt() {

	}

	public LargeInt(int data) {
		if (data < 0) {
			System.out.println("cannot support negative value");
			return;
		}
		this.data = data;
		format();
	}
	
	public void add(int num){
		if(num < 0){
			System.out.println("cannot support negative value");
			return;
		}
		data += num;
		format();
	}

	public void mul(int num){
		if(num < 0){
			System.out.println("cannot support negative value");
			return;
		}
		LargeInt temp = this;
		while(temp != null){
			temp.data *= num;
			temp = temp.next;
		}
		format();
	}
	
	public void printValue() {
		String value = "";
		LargeInt temp = this;
		while(temp.next != null){
			value = addZero("" + temp.data, lengthOfNode) + value;
			temp = temp.next;
		}
		value = temp.data + value;
		System.out.println(value);
	}
	
	// 这个函数不要求写，功能是补充0，比如说一个节点如果表示3位，那么如果这个节点的值是21，那么表示为021
	private String addZero(String str, int n) {
		while (str.length() < n) {
			str = "0" + str;
		}
		return str;
	}

	// 进位，比如说现在是这样的数据分布：24->31>1，那么运行此方法后就变成了：4->3->4
	private void format() {

		int value = 0;
		LargeInt temp = this;
		while (temp.next != null) {
			temp.data += value;
			value = temp.data / MAX;
			temp.data %= MAX;
			temp = temp.next;
		}
		temp.data += value;
		value = temp.data / MAX;
		temp.data %= MAX;
		if(value > 0){
			temp.next = new LargeInt(value);
		}
	}
	
	// 这个方法不要求写。它的功能是返回总节点个数
	public int length(){
		int length = 0;
		LargeInt temp = this;
		while(temp != null){
			length++;
			temp = temp.next;
		}
		return length;
	}
}
