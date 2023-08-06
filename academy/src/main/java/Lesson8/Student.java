package Lesson8;

public class Student {
	String nickanme;
	int age;

	public Student() {
		super();

	}

	public Student(String nickname) {
		this.nickanme = nickname;
	}

	public Student(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((nickanme == null) ? 0 : nickanme.hashCode());
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
		if (age != other.age)
			return false;
		if (nickanme == null) {
			if (other.nickanme != null)
				return false;
		} else if (!nickanme.equals(other.nickanme))
			return false;
		return true;
	}

}