package String;

import java.util.Scanner;

//Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке 
//возрастания их кодов. Если таких слов несколько, найти первое из них.
public class Task6 {
	public static void main(String [] args) {
		int n; //кол-во слов
        String text;
        Scanner scan = new Scanner (System.in);
        if (scan.hasNextInt ()) {
        
        	
            n = Integer.parseInt (scan.nextLine());
          
            text = scan.nextLine ();
            int wordCount = 0;
            for (String word :
                    text.split (" ", n)) {
                int count = 0;
                for (int i = 1; i < word.length (); i++) {
                    if (word.toCharArray ()[i] > word.toCharArray ()[i - 1]) {
                        count++;
                    }
                }
                System.out.println("Word = "+word+": count = "+count);
                if ((word.length () - 1 == count) && (word.length () > 1) && (wordCount == 0)) {
                    System.out.println (word);
                    wordCount++;
                }

            }
            if (wordCount == 0)
                System.out.println ("NOT FOUND");
	}
	}
	}

