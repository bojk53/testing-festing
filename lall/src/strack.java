package lall;

import java.util.Scanner;
 	
public class strack {


	public static void main(String[] args) {
		
	//Spelet �r h�nga gubbe d�r man har max 5 chanser p� sig att gissa r�tt
		
		System.out.println("Tjena mors, ska vi ta  o k�ra lite h�ngagubbe elle?");

		boolean goback = false;
		do {
	//ifall man har avslutat spelet s� kan man v�lja att g� tillbaka och d� blir man tillbaka tagen hit med hj�lp av boolean
		Scanner input = new Scanner(System.in);
		
		System.out.println("g�tt d� nu k�r vi ig�ng, v�lj din mening:");
		String mening = input.nextLine();
	//tar och anv�nder sig av frasen
		mening = mening.trim();
	//tar bort utrymmena i b�rjan och �ven slutet
		mening = mening.replaceAll(" ", "  ");
		mening = mening.toUpperCase();
		String mening1 = mening.replaceAll("[A-Z]", "_ ");
	//Visar frasen i underskrifter med ett mellanslag mellan varje bokstav och dubbelt utrymme f�r 1 mellanslag i den ursprungliga frasen

		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
	//g�r en ny tom rad
		System.out.println("OKAJ OKAj du k�r vi d�:");
		System.out.println(" btw du har 4 gissningar p� dig!");

		int f�rs�k = 0;
		int incorrect = 0;
		String guess;
		int clos = 0;
		char letter;
		boolean r�ttgisning;
		String guesses = "";
		boolean phrasecontainsguess;
		
	//f�rs�k = r�knar antalet f�rs�k felaktigt = r�knar antalet felaktiga f�rs�k gissar = lagrar gissat brev inmatningsbrev = drar
	//ut f�rsta bokstaven fr�n gissning f�r anv�ndning gissningar = lagrar alla redan gissade bokst�ver guessescontainsguess = boolean
	//f�r gissning i redan gissade bokst�ver phrasecontainsguess = booleska f�r gissning i fras

	
		while (incorrect < 5 && mening1.contains("_")) {
	//medans loopen b�rjar

			System.out.println(mening1);
			System.out.print("\n");
			System.out.println("HA du har ju " + incorrect + " fel gissningar just nu");
			System.out.print("\n");
			if (incorrect == 1) { 
				System.out.println("      _________        ");
				System.out.println("      |        I       ");
				System.out.println("      |        O       ");
				System.out.println("      |                ");
				System.out.println("      |                ");
				System.out.println("      |_____           ");
				System.out.println("      |     |          ");
				System.out.print("\n");
			} else if (incorrect == 2) { 
				System.out.println("      _________        ");
				System.out.println("      |        I       ");
				System.out.println("      |        O       ");
				System.out.println("      |        |       ");
				System.out.println("      |                ");
				System.out.println("      |_____           ");
				System.out.println("      |     |          ");
				System.out.print("\n");
			} else if (incorrect == 3) { 
				System.out.println("      _________        ");
				System.out.println("      |        I       ");
				System.out.println("      |        O       ");
				System.out.println("      |      ( | )     ");
				System.out.println("      |                ");
				System.out.println("      |_____           ");
				System.out.println("      |     |          ");
				System.out.print("\n");
			} else if (incorrect == 4) { 
				System.out.println("      _________        ");
				System.out.println("      |        I       ");
				System.out.println("      |        O       ");
				System.out.println("      |      ( | )     ");
				System.out.println("      |       (        ");
				System.out.println("      |_____           ");
				System.out.println("      |     |          ");
				System.out.print("\n");
			}
	//bilderna f�r den h�ngda gubben
			
			System.out.println("KOM D�, gissa nu:");
			guess = input.nextLine(); 
	//tar gissningsinmatningen
			guess = guess.toUpperCase(); 
	//konverterar till stor bokstav f�r att j�mf�ra
			letter = guess.charAt(0); 
	//tar f�rsta bokstaven som �r gissat

			r�ttgisning = (guesses.indexOf(letter)) != -1;
			guesses += letter;
	//bevarar alla bokst�ver som har blivit gissade p�

			letter = Character.toUpperCase(letter); 
			System.out.print("\n");
			if (r�ttgisning == true) { 
	//konverterar till stor bokstav f�r att j�mf�ra
				System.out.println("du har REDAN gissat p�" + letter + "dummer.");
				System.out.print("\n");
				if (incorrect > 0) { 
	//inre if b�rjar
					incorrect--;
				} 
	//inre if slutar

			} 
	//if b�rjar

			phrasecontainsguess = (mening.indexOf(letter)) != -1;
			if (phrasecontainsguess == true) {
	//if b�rjar
				System.out.println(letter + " jo det �r med n�gonstans d�r");
				System.out.print("\n");
				for (int position = 0; position < mening.length(); position++) {
	//for b�rjar
					if (mening.charAt(position) == letter && mening1.charAt(position) != letter) {
	//inre if b�rjar
						mening1 = mening1.replaceAll("_ ", "_");
						String mening2;
						mening2 = mening1.substring(0, position) + letter + mening1.substring(position + 1);
						mening2 = mening2.replaceAll("_", "_ ");
						mening1 = mening2;
					} 
	//inre if slutar
				} 
	//for slutar
			} else {
	//if slutar annar b�rjar if 
				System.out.print("\n");
				System.out.println(letter + " �r fan inte r�tt");
				System.out.print("\n");
				incorrect++;
	//incorrect = incorrect + 1 efter varje felgivet svar
			}

			f�rs�k++; 
	//f�rs�k = f�rs�k + 1 efter varje angivet svar

		} 
	//while loop slutar

		if (incorrect == 5) { 
			System.out.println("      _________        ");
			System.out.println("      |        I       ");
			System.out.println("      |        O       ");
			System.out.println("      |      ( | )     ");
			System.out.println("      |       ( )      ");
			System.out.println("      |_____           ");
			System.out.println("      |     |          ");
			System.out.print("\n");
			System.out.println("GAME OVER GUBBEN, knas ass�!");
	//sista bilden som inneb�r att man har f�rlorat spelet
		} else {

			System.out.println("Ordet var: ");
	//n�r l�st
			System.out.println(mening1);
			System.out.println("N�MEN se p� fan du vann!");
		}
		
		System.out.println("Vill du k�ra igen elle? Is�fall skriv 1, annars 2");
		clos = input.nextInt();
		if(clos == 1) {
			goback = true;
	//tar dig tillbaka till starten av spelet
		}
		else if (clos == 2) {
			input.close();
	//spelet avslutas
		}
		
		}while (goback == true);
		
	
	}

}