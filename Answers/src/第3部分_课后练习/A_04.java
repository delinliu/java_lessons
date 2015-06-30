package 第3部分_课后练习;

class Link {
	private char data = ' ';
	private Link next = null;

	public Link() {
	}

	public Link(char data) {
		setData(data);
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public void printAllLink() {
		System.out.print(data);
		if (next != null) {
			next.printAllLink();
		}
	}
	
	// 递归求length
	public int length(){
		if(next == null){
			return 1;
		}else{
			return 1 + next.length();
		}
	}
	
	// 循环求length
	public int length2(){
		Link temp = next;
		int length = 1;
		while(temp != null){
			length++;
			temp = temp.next;
		}
		return length;
	}
	
	public void append(char c){
		Link temp = this;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.setNext(new Link(c));
	}
}

public class A_04 {
	static public void main(String[] args) {
		
		Link arr[] = { new Link('T'), new Link('h'), new Link('i'),
				new Link('s'), new Link(), new Link('i'), new Link('s'),
				new Link(), new Link('a'), new Link(), new Link('S'),
				new Link('t'), new Link('r'), new Link('i'), new Link('n'),
				new Link('g'), new Link('.') };
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i].setNext(arr[i + 1]);
		}
		arr[0].printAllLink();
		System.out.println();

		Link link = new Link('a');
		link.append('b');
		link.append('c');
		link.append('d');
		System.out.println(link.length2()); // 输出4
		link.printAllLink(); // 输出abcd
	}
}