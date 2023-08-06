package Lesson12;

public class Matrix<T> {
	private T[] array;

	public Matrix(T[] array) {
		this.array = array.clone();

	}

	public static void main(String[] args) {
		Matrix<Double> doubleMatrex = new Matrix<Double>(new Double[2]);
		Matrix<Integer> integerMatrix = new Matrix<Integer>(new Integer[4]);
		Matrix<Byte> byteMatrix = new Matrix<Byte>(new Byte[7]);
	}

}
