package exp_5;

public class Person {
	Person() {
		System.out.println("Parent class constructor");
	}
}

class Student extends Person {
	Student() {
		super();
		System.out.println("Child class constructor");
	}
}

class Test {
	public static void main(String args[]) {
		Student s = new Student();
	}
}
