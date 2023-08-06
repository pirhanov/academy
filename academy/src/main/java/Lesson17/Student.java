package Lesson17;

import java.util.Arrays;
import java.util.Scanner;

/*Создать класс Student, содержащий следующие характеристики
– имя, группа, курс, оценки по предметам. 
Создать коллекцию, содержащую объекты класса Student. 
Написать метод, который удаляет студентов со средним баллом <3. Если средний балл>=3, студент переводится на следующий курс.
Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса и печатает
на консоль имена тех студентов из списка, которые обучаются на данном курсе.*/

public class Student implements Comparable<Student> {

	private final String name;
	private final int group;
	private final int course;
	private final double score;

	
	public Student(String name, int group, int course, double score) {
		super();
		this.name = name;
		this.group = group;
		this.course = course;
		this.score = score;
	}
	/*
	 * public Student(String name, int group){ this.name = name; this.group = group;
	 * }
	 */
	

	public int compareTo(Student o) {
		return name.compareTo(o.getName());
	}

	public String getName() {
		return name;
	}

	public int getGroup() {
		return group;
	}

	public int getCourse() {
		return course;
	}

	public double getScore() {
		return score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + group;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (group != other.group)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", score=" + score + "]";
	}

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      Student[] s= new Student[];

        for(int i = 0; i < 5; i++){
            System.out.print("Name of student: ");
            String name = sc.nextLine();
            System.out.print("group: ");
            int age = sc.nextInt();
            
            s[i] = new Student(name,group);
        }
        for(int i = 0; i < s.size(); i++){
            if(s)
        }

        System.out.println(Arrays.toString(s));

    }
}
