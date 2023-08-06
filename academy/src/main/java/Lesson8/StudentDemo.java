package Lesson8;

public class StudentDemo {
	public static void main(String [] args) {
		Student student0 = new Student("Lara");
		Student student1 = new Student("Venom");
		Student student2 = new Student("Harry");
		Student student3 = new Student("John");
		student1= student3;
		
		System.out.println(student0.equals(student1));
		System.out.println(student2.equals(student3));
		System.out.println(student1.equals(student3));


	}

}
