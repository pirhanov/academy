package OOP;

public class TestTime {

	public static void main(String[] args) {
		
		Time t1 = new Time (25, 00, 25);
		System.out.println(t1);
		
		
		System.out.println("");
		t1.setMinutem(24);
		t1.setMinutem(61);
		t1.setSecond(61);
		System.out.println(t1);
		
		t1.setTime(61, 61, 25);
		System.out.println(t1);
		
		t1.setTime(58,59,25);
		System.out.println(t1);
	}

}
