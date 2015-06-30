package 第3部分;

/**
 * 编写程序，编写一个类MyDate。它有私有变量month（取值为1~12）、year（>0）、day（1~31）。
 * 	默认值为month = 1; year = 2015; day = 1;
 * 	对于这三个私有变量都有对应的set和get方法。
 * 	set方法中需要有合法性判断条件，如setMonth(0)就是非法的。此方法setDay(day)只需要1~31就是合法。
 * 	有一个私有方法：boolean isLeapYear(); // 判断是否为闰年（非整百年是4的倍数即闰年，整百年是400的倍数即是闰年）
 * 	有一个私有方法：int daysOfMonth(); // 获取该月份的天数（注意，闰年的2月是29天）
 * 	有一个公有方法：void printDate(); // 输出year-month-day，然后根据daysOfMonth计算该月的天数，
 * 										判断day是否超出该天数，超出就输出"illegal date"
 *
 * @author LiuDelin
 */
public class A_03_1 {

	public static void main(String[] args) {

		MyDate myDate = new MyDate();
		myDate.printDate();
		
		myDate.setMonth(4);
		myDate.setDay(31);
		myDate.printDate();
		
		myDate.setMonth(2);
		myDate.setDay(29);
		myDate.printDate();
		
		myDate.setYear(2012);
		myDate.printDate();

		myDate.setYear(2000);
		myDate.printDate();
		
		myDate.setYear(1900);
		myDate.printDate();
		
	}

}

class MyDate{
	
	private int month = 1;
	private int year = 2015;
	private int day = 1;
	
	public void printDate(){
		System.out.print(year + "-" + month + "-" + day);
		if(day < 1 || day > daysOfMonth()){
			System.out.print(" illegal date");
		}
		System.out.println();
	}
	
	private boolean isLeapYear(){
		if(year%100 == 0){
			return year%400 == 0;
		}else{
			return year%4==0;
		}
	}
	
	private int daysOfMonth(){
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return isLeapYear() ? 29 : 28;
		default:
			return 0;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12){
			System.out.println("month cannot be " + month);
			return;
		}
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year <= 0){
			System.out.println("year cannot be " + year);
			return;
		}
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day < 1 || day > 31){
			System.out.println("day cannot be " + day);
			return;
		}
		this.day = day;
	}
}
