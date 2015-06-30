package µÚ2²¿·Ö;

public class A_02_2 {

	public static void main(String[] args) {

		int range = 500;
		outer: for (int i = 2; i <= range; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue outer;
				}
			}
			System.out.println(i);
		}
	}
}
