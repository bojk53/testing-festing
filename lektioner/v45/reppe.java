import java.util.Scanner;

public class reppe {

	
	public static void main(String[] args) {
		
		int heltal2; // initiera variabel
		heltal2 = 2; // tilldela varibeln ett v�rde
		int heltal = 1; // deklarerar
		double decimaltal = 1.1;
		String ord = "Henrik " + "Stahl"; // "+" kallas att konkatinera
		char bokstav = 'b';
		
		// System.out.print("Henrik vill inte ha matte prov n�sta vecka \n\t"); // \n betyder ny rad
	
		// System.out.printf("f�rsta talet �r %d, andra talet �r %.2f%n", heltal2, decimaltal);
		// System.out.print("f�rsta talet �r " + heltal2 + "\n" + ord);
		
		int tal1 = 0; //initierar en variabel som kommer tilldelas ett v�rde av Scanner
		double average = 0;
		double summa = 0;
		// int tal1; input = new Scanner(System.in);
		
		// Importerar Scanner
		Scanner input = new Scanner(System.in);
		
		// Skriver ut ett medelande 
		System.out.println("please type 10 numbers: ");
		
		//l�ser in ett heltal fr�n konsolen
		
		for (int i = 1; i <= 10; i++) {
			  (tal1 < 0) {
			System.out.println("Your number in negative. Please type again! ");
			i--;
		}
			
		//SKRIV IN ETT VILLKOR S� ATT TAL > 20 INTE SKA KSRIVAS UT
			
		else {
			summa += tal1;
			}
		}

		
		int antalLoopar = 1;
		// samma som forloopen ovan
		while (antalLoopar <=10) {
			
			//tal1 = input.nextInt();
			antalLoopar++;
		}
			
			average = ((double) tal1)/10;
			
			System.out.println(10/3);
			System.out.println(average);
		
	}
	
}
