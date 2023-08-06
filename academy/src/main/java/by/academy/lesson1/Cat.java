package by.academy.lesson1;

import java.util.Scanner;
public class Cat {
	
	int age;
	int sleep;
	int money;
	int weight;
	String nickname;
	String color;
	boolean isHomeAnimals;
	char initials;
	
	
	public Cat() {
		super();
	}
	
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.println("How long he is sleep: ");
	int sleep = sc.nextInt();
	System.out.println("how old is the buyer?");
	int age = sc.nextInt();
	
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.nickname = "Hulk";
		
		cat1.initials = 'H';
		System.out.println(cat1);
		
		Cat cat2 = new Cat("Izek");
		System.out.println(cat2);
		
		cat2.eat();
		cat2.sleep();
		cat2.walk();
		
		cat1.grow();
		cat1.grow();
		cat1.grow();
		
		System.out.println(cat1.age);

	}



	
	public Cat (String nickname) {
		this.nickname = nickname;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	
	public void grow() {
		age = age +1;
		System.out.println("The cat " + nickname + " getting older: " + age + " and he is vampire");
	}
	
	public void sleep(){
		sleep = sleep + 1;
		System.out.println("The cat " + nickname + " sleeps -" + sleep + " hours a day");
	}
	
	public void eat() {
		weight = weight +1;
		System.out.println("The cat " + nickname + " weights -" + weight + "  kg after eating");
	}
	
	public void walk() {
		weight = weight -1;
		System.out.println("The cat " + nickname + " weights: " + weight + " kg after training. Now he looks athletic.");
	}
	public int getmoney() {
		return getmoney();
	}
	
	public void setmoney(int money) {
		this.money = money;
	}
	public char getInitials() {
		initials = nickname.charAt(0);
		return initials;
	}
	public void setInitials(char initials) {
		this.initials = initials;
	}
	public boolean isHomeAnimals() {
		isHomeAnimals = true;
		return isHomeAnimals;
	}
	public void setisHomeAnimals(boolean isHomeAnimals) {
		this.isHomeAnimals = isHomeAnimals;
	}
	
	@Override
	public String toString() {
		return "nickname: " + nickname + ','+ " age: " + age + ',' + " initials: " + initials +',' + " money: " + money + ',' + " isHomeAnimal: " + isHomeAnimals +',' + " color: "+ color + ','+ " weight " + weight;
	}
}
