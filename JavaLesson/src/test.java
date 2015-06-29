
import java.util.*;
class MyInt {
	int data;

	MyInt(int data) {
		this.data = data;
	}
}
public class test {
	static public void main(String [] args){
		Guess arr[] = new Guess[]{
				new Teacher("Teacher1", 43, "male", "Math"),
				new Teacher("Teacher2", 41, "male", "Math"),
				new Teacher("Teacher3", 50, "female", "English"),
				new Teacher("Teacher4", 37, "female", "English"),
				new Student("Student1", 15, "male", 1),
				new Student("Student2", 16, "female", 2),
				new Student("Student3", 15, "male", 1),
				new Student("Student4", 16, "female", 1),
				new Person("Person1", 5, "male"),
				new Person("Person2", 5, "male"),
				new Person("Person3", 5, "female"),
			};
			for(Guess p : arr){
				p.guess();
			}
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
interface Guess{
	public void guess();
}

class Person implements Guess{
	String name;
	String sex;
	int age;
	Person(String name, int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void printInfo(){
		System.out.println("Person(" + name + "," + age + "," + sex + ")");
	}

	@Override
	public void guess() {
		if(age > 30){
			System.out.println("Teacher");
		}else if(age > 7){
			System.out.println("Student");
		}else{
			System.out.println("Child");
		}
	}
}
class Teacher extends Person{
	String type;
	Teacher(String name, int age, String sex, String type){
		super(name, age, sex);
		this.type = type;
	}
	
	public void printInfo(){
		System.out.println("Teacher(" + name + "," + age + "," + sex + "," + type + ")");
	}
}
class Student extends Person{
	int grade;
	Student(String name, int age, String sex, int grade){
		super(name, age, sex);
		this.grade = grade;
	}
	
	public void printInfo(){
		System.out.println("Teacher(" + name + "," + age + "," + sex + "," + grade + ")");
	}
}