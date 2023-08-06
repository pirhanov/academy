package OOP;

public class TestCircle {

	public static void main(String[] args) { // точка входа;

// создаем класс;
		Circle c1 = new Circle(5.0, "red");
		Circle c2 = new Circle(3.2);
		Circle c3 = new Circle("green");

		System.out.println("Radius = " + c1.getRadius() + " " + "Area = " + c1.getArea() + " " + "color of circle is: "
				+ c1.getColor());
		System.out.println("radius c2 = " + c2.getRadius() + " " + " " + "color of the circle is: " + c2.getColor());
		System.out.println("c3 radius = " + c3.getRadius() + " " + "color of the circle is: " + c3.getColor() + " "
				+ "Area of the c3 is DEAFULT and it is: " + c3.getArea());

	}

}
