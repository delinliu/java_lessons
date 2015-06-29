
import java.util.*;
class MyInt {
	int data;

	MyInt(int data) {
		this.data = data;
	}
}
public class test {
	static public void main(String [] args){
		long x = 1;
		for(int i=1; i<30; i++){
			x *= i;
		}
		System.out.println(x);
	}

	static public void printAlphabet() {
		printAlphabet('a');
	}

	static public void printAlphabet(char c) {
		if (c < 'a' || c > 'z') {
			return;
		}
		System.out.print(c);
		printAlphabet(++c);
	}
}