public class test {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = a++ + a-- * ++b;
		System.out.println(c);
		
		int n = 30;
		long val = 1;
		for(int i=1; i<=n; i++){
			val = val*i;
		}
		System.out.println(val);
		
		Math.sqrt(1);
	}
}
