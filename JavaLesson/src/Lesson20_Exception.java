import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常处理
 *
 * @author LiuDelin
 */
public class Lesson20_Exception {

	public static void main(String[] args) {

		catchException();

		System.out.println("------------------------------");

		catchException2();

		System.out.println("------------------------------");
		
		try {
			throwException();
		} catch (ArithmeticException ae) {
			System.out.println("divide by zero!");
		} catch (NullPointerException npe) {
			System.out.println("null pointer!");
		} catch (FileNotFoundException fnfe) {
			System.out.println("file not found!");
		} catch (Exception e) {
			System.out.println("unexpected exception!");
		} finally {
			System.out.println("Finally main.");
		}
	}

	public static void catchException() {
		try {
			int random = (int) (Math.random() * 4);
			switch (random) {
			case 0:
				int a = 1 / 0; // 除以0
				break;
			case 1:
				String s = null;
				s.length(); // 空指针
				break;
			case 2:
				File f = new File("X://1.txt");
				FileInputStream is = new FileInputStream(f); // 找不到文件
				break;
			default:
				System.out.println("No Exception.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally catchException.");
		}
	}

	public static void catchException2() {
		try {
			int random = (int) (Math.random() * 4);
			switch (random) {
			case 0:
				int a = 1 / 0;
				break;
			case 1:
				String s = null;
				s.length();
				break;
			case 2:
				File f = new File("X://1.txt");
				FileInputStream is = new FileInputStream(f);
				break;
			default:
				System.out.println("No Exception.");
			}
		} catch (ArithmeticException ae) {
			System.out.println("divide by zero!");
			// ae.printStackTrace();
		} catch (NullPointerException npe) {
			System.out.println("null pointer!");
			// npe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			System.out.println("file not found!");
			// fnfe.printStackTrace();
		} catch (Exception e) {
			System.out.println("unexpected exception!");
			e.printStackTrace();
		} finally {
			System.out.println("Finally catchException2.");
		}
	}

	public static void throwException() throws ArithmeticException,
			NullPointerException, FileNotFoundException, Exception {
		int random = (int) (Math.random() * 4);
		switch (random) {
		case 0:
			int a = 1 / 0;
			break;
		case 1:
			String s = null;
			s.length();
			break;
		case 2:
			File f = new File("X://1.txt");
			FileInputStream is = new FileInputStream(f);
			break;
		default:
			System.out.println("No Exception.");
		}
	}
}
