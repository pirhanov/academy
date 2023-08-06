package Lesson21;

import java.security.DrbgParameters.Instantiation;

import javax.xml.crypto.NoSuchMechanismException;

public class Ref {
	public static void main(String[] args) {
		Class<Cat> catClass = Cat.class;
		try {
			Cat cat = catClass.newInstance();
			Cat cat1 = catClass.getDeclaredConstructor(int.class, int.class, String.class).newInstance(150, 888,
					"Karl");
			System.out.println(cat);
			System.out.println(cat1);
		} catch (InstantiationException | IllegalAccessError | IllegalArgumentException | NoSuchMechanismException
				| SecurityException e) {
			e.printStackTrace();
		}
	}

}
