package Lesson21;

import java.lang.reflect.Modifier;

import Lesson18.myExeption;

public class Field {
	public static void main(String[] args) {

		Cat cat = new Cat(500, 120, "Bob");
		Class<Cat> catClass = Cat.class;
		try {
			java.lang.reflect.Field price = catClass.getDeclaredField("price");
			java.lang.reflect.Field name;
			boolean ture;
			name.setAccessible(ture);
			int value = price.getInt(cat);
			System.out.println(value);
			price.set(cat, 15);
			System.out.println(cat);
			int modifier = price.getModifiers();
			System.out.println(Modifier.isPrivate(modifier));
		} catch (MismatchException e) {
			System.out.println("Smth need be there!");

		}

	}

}
