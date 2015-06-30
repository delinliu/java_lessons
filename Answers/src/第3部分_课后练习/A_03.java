package 第3部分_课后练习;

public class A_03 {
	static public void main(String[] args) {
		printAlphabet();
	}

	static public void printAlphabet() {
		printAlphabet('a');
	}

	static public void printAlphabet(char c) {
		if (c < 'a' || c > 'z') {
			return;
		}
		System.out.println(c);
		printAlphabet(++c);
	}
}
