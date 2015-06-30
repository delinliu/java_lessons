package 第4部分_课后练习;

public class A_01 {

	public static void main(String[] args) {
		Person arr[] = new Person[] {
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
				new Person("Person3", 5, "female"), };
		for (Person p : arr) {
			p.printInfo();
		}

		Guess arr2[] = new Guess[] {
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
				new Person("Person3", 5, "female"), };
		for (Guess p : arr2) {
			p.guess();
		}
	}
}

interface Guess {
	public void guess();
}

class Person implements Guess {

	String name;
	int age;
	String sex;

	Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	void printInfo() {
		System.out.println("name:" + name + ", age:" + age + ", sex:" + sex);
	}

	@Override
	public void guess() {
		if (age > 30) {
			System.out.println("Teacher");
		} else if (age >= 8) {
			System.out.println("Student");
		} else {
			System.out.println("Child");
		}
	}
}

class Teacher extends Person {

	String type;

	Teacher(String name, int age, String sex, String type) {
		super(name, age, sex);
		this.type = type;
	}

	@Override
	void printInfo() {
		System.out.println("name:" + name + ", age:" + age + ", sex:" + sex
				+ ", type:" + type);
	}
}

class Student extends Person {

	int grade;

	Student(String name, int age, String sex, int grade) {
		super(name, age, sex);
		this.grade = grade;
	}

	@Override
	void printInfo() {
		System.out.println("name:" + name + ", age:" + age + ", sex:" + sex
				+ ", grade:" + grade);
	}
}
