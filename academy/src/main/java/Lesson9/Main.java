package Lesson9;

public class Main {
	
	    public static void main(String[] args) {
	        Circle o1 = new Circle();
	        o1.printCircle(); 
	        Circle o2 = new Circle(1,-1,14);
	        o2.printCircle(); //
	        System.out.println("square Circle o2: "+o2.squareCircle()); //615.75...
	        o1.zoomCircle(14);
	        if(o1.equalsCircle(o2)) {
	            System.out.println("Circle o2 and o1 equal");
	        } else {
	            System.out.println("Circle o2 and o1 differt square");
	        }
	    }
	}


