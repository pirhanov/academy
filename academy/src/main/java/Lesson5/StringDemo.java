package Lesson5;
//Lorem Ipsum is simply dummy text
public class StringDemo {
	public static void main (String [] args) {
		String str = "Lorem";
		StringBuilder st = new StringBuilder(str);
		st.append("Lorem").append("Ipsum").append("is").append("simply").append("dummy text");
		System.out.println(st);
		String result = st.toString();
		int startIndex = result.indexOf("is");
		int endIndex = startIndex + "is".length();
		
		st.replace(startIndex, endIndex, " abc");
		
	}

}
