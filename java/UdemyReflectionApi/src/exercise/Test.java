package exercise;

public class Test {

	public static void main(String[] args) {

		
	}
}// Test

class Student {

	private static Student student;

	private String name;
	private int age;

	private Student(String name, int age) {
		this.name = name;
		this.age = age;

		if (student == null) {
			student = this;
		}
	}// Test(-,-)

	public static Student getInstnce() {

		return student;
	}

}
