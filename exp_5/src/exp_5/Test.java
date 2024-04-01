package exp_5;
//super key with constructor
class Person {
	Person() {
		System.out.println("Person class Constructor");
	}
}

class Student extends Person {
	Student() {
		super();
		System.out.println("Student class Constructor");
	}
}

class Test {
	public static void main(String[] args) {
		Student s = new Student();
	}
}
