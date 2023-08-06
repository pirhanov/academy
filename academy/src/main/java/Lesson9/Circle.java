package Lesson9;

// Создать класс Circle, который содержит 
//- переменную radius;
//- методы, вычисляющие площадь и длину окружности;
//- константу PI.
//Создать несколько объектов данного класса.
public class Circle {

	public double radius;
	public double square;
	public double lengthCircle;

	public void printCircle() {
		System.out.println("A circle with a center ( " + square + ";" + lengthCircle + ") and radius " + radius);
	}

	public void moveCircle(double a, double b) {
		square = square + a;
		lengthCircle = lengthCircle + b;
	}

	public void zoomCircle(double k) {
		this.radius = radius * k;
	}

	public Circle() {
		square = 0.0;
		lengthCircle = 0.0;
		radius = 1.0;
	}

	public Circle(double a, double b, double s) {
		square = a;
		lengthCircle = b;
		radius = s;
	}

	public double squareCircle() {
		double s = Math.PI * radius * radius;
		return s;
	}

	public boolean equalsCircle(Circle cir) {
		if (this.squareCircle() == cir.squareCircle()) {
			return true;
		} else {
			return false;
		}
	}

}
