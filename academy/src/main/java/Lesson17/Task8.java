package Lesson17;

import java.util.HashMap;
import java.util.Map;

public class Task8 {
	public static void main(String[] args) {
		Map<String, Double> student = new HashMap<String, Double>();
		System.out.println(student.isEmpty());

		student.put("Ivanov", 8.8);
		student.put("Roshkov", 3.8);
		student.put("Ivanov", 5.8);
		
		System.out.println(student.isEmpty());
		
		for (String key : student.keySet()) {
			System.out.println(key + ":" + student.get(key));
		}
		for (Double value : student.values()) {
			System.out.println(value);
		}
		for (Map.Entry<String , Double> entry : student.entrySet()) {
			System.out.println(entry)
			System.out.println(entry.getKey() + ""
 	}

	}
}
