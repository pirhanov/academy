package Array;

import java.util.Random;

public class Task3 {
	public static void main (String [] args) {
		
	        int b=0;
	        int[] Mas = new int[15];
	        for(int i=0;i<Mas.length;i++){
	            Random rnd=new Random();
	            Mas[i]=rnd.nextInt(10);
	            System.out.print(Mas[i] +" ");
	            if(Mas[i]>0 & Mas[i]%2==0)b++;
	        }
	       
	System.out.println();
		       
		        System.out.println("The number of even numbers in the list "+b);
		    }
	
}
