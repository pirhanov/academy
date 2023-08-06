package lesson4;
import java.util.Scanner;
// В сберкассу на трёхпроцентный вклад положили S рублей
//Какой станет сумма вклада через N лет
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type your amount of money: ");
		int s = scan.nextInt(); 
		System.out.println("Type time how long you will put money: ");
		int n = scan.nextInt(); // время;
		int m;
		scan.close();
		for (int i =1; i<=n; i++) {
			m = (int) (s + (s*0.03)*n);
			System.out.println("The amount will be in: " + n + " year " + m );
			
		}

	}

}
