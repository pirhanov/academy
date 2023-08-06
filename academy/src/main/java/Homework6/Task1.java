package Homework6;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Stop to fin it");
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fileWriter = new FileWriter("txt.txt - academy/src/main/java/Homework6F");
		while (true) {
			String text3 = console.readLine();
			if (text3.equals("#ESC"))
				break;
			fileWriter.write(text3 + "\n");
		}
		fileWriter.close();
	}
}