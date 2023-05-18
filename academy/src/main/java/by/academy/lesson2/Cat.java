package by.academy.lesson2;

public class Cat {
	String nickname;
	String color;
	double weight;
	int age;

	public Cat() {
		super();
	}
		public Cat(String nickname, String color, double weight, int age) {
			super();
			this.nickname=nickname;
			this.color=color;
			this.weight = weight;
			this.age = age;
			
					
			
		}

	public void sleep() {
		System.out.println(nickname + "спить");
	}

	public void eat() {
		weight = weight + 1;

		System.out.println(nickname + ", вес кота теперь" + weight);

	}

	public void walk() {
		weight = weight - 1;
		System.out.println(nickname + "прокаченный кот теперть весит");
	}

	@Override
	public String toString() {
		return "nickname:" + nickname + "color:" + color + "weight" + weight + "age" + age;

	}

}
