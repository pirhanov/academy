package OOP;

public class Circle { // Определение класаа Circle

	public static final double DEAFULT_RADIUS = 1.0; // public constants (we can't change them);
	public static final String DEAFULT_COLOR = "red";

// private переменнные;	
	private double radius;
	private String color;

// Constructers (перегружаемые);
	public Circle() { // 1 constructer (deafult, because it's empety);
		radius = DEAFULT_RADIUS;
		color = DEAFULT_COLOR;
	}

	public Circle(double radius) { // 2 constructer;
		this.radius = radius;
		this.color = DEAFULT_COLOR;
	}

	public Circle(double radius, String color) { // 3 constructer;
		this.radius = radius;
		this.color = color;

	}

	public Circle(String color) {
		this.radius = DEAFULT_RADIUS;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double getDeafultRadius() {
		return DEAFULT_RADIUS;
	}

	public static String getDeafultColor() {
		return DEAFULT_COLOR;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(radius);
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
		Circle other = (Circle) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

}
