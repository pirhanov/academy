package Lesson5;
// Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
//Найти все подстроки "Java <X>" и распечатать их.
public class Task1 {
public static void main (String [] args) {
	String str = "лVersions: Java  5, Java 6, Java   7, Java 8, Java 12";
	String substring = "Java";

	System.out.println(str.contains(substring));
}
}
