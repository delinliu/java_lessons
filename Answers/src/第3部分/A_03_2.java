package 第3部分;

/**
 * 编写程序，编写一个类BankAccount。
 * 	私有成员变量：double balance（余额）、double rate（年利率）
 * 	get、set方法：针对所有私有成员变量都有get、set方法，set方法需要加上合法性判断(balance>=0、rate>=0)
 * 	公有方法nextYear()：时间过去一年，需要计算利息，加到本金里。
 * 	公有方法manyYears(int n)：时间过去n年，需要计算利息，加到本金里。
 * 	公有方法printInfo()：打印本金、利息
 * 	初始化余额为10000，利率为0.05。打印100年后的账号情况。
 *
 * @author LiuDelin
 */
public class A_03_2 {

	public static void main(String [] args){
		BankAccount bankAccount = new BankAccount();
		bankAccount.printInfo();
		bankAccount.manyYears(100);
		bankAccount.printInfo();
	}
}

class BankAccount{
	
	private double balance = 10000;
	private double rate = 0.05;
	
	public void nextYear(){
		balance *= (1+rate);
	}
	
	public void manyYears(int n){
		for(int i=0; i<n; i++){
			nextYear();
		}
	}
	
	public void printInfo(){
		System.out.println("balance is " + balance + ", rate is " +rate);
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance < 0){
			System.out.println("balance cannot be " + balance);
			return;
		}
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		if(rate < 0){
			System.out.println("rate cannot be " + rate);
			return;
		}
		this.rate = rate;
	}
	
}
