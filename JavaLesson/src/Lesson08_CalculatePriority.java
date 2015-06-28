/**
 * 运算优先级
 *
 * @author LiuDelin
 */
public class Lesson08_CalculatePriority {

	public static void main(String[] args) {

		int a = 10 + 2 * 5; // */的优先级高于+-
		System.out.println(a);

		a = (10 + 2) * 5;
		System.out.println(a);

		boolean b = true || false && !true; // !的优先级高于&&，&&的优先级高于||
		System.out.println(b);

		b = (true || false) && !true;
		System.out.println(b);

		/* 优先级表，从高到低排列，更详细的表参照书本 */
		/* (后置++、后置--)，(前置++、前置--、!)，(*、/、%)，(+、-)，(>、>=、<、<=)，(==、!=)，(&&、||)，(=) */

		/* 记不住优先级的时候，记得使用括号 */
	}
}
