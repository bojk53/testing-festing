package lall;

import java.util.Scanner;
 	
public class strack {


	public static void main(String[] args) {
		
	//Spelet är hänga gubbe där man har max 5 chanser på sig att gissa rätt
		
		System.out.println("Tjena mors, ska vi ta  o köra lite hängagubbe elle?");

		boolean goback = false;
		do {
	//ifall man har avslutat spelet så kan man välja att gå tillbaka och då blir man tillbaka tagen hit med hjälp av boolean
		Scanner input = new Scanner(System.in);
		
		System.out.println("gött då nu kör vi igång, välj din mening:");
		String mening = input.nextLine();
	//tar och använder sig av frasen
		mening = mening.trim();
	//tar bort utrymmena i början och även slutet
		mening = mening.replaceAll(" ", "  ");
		mening = mening.toUpperCase();
		String mening1 = mening.replaceAll("[A-Z]", "_ ");
	//Visar frasen i underskrifter med ett mellanslag mellan varje bokstav och dubbelt utrymme för 1 mellanslag i den ursprungliga frasen

		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
	//gör en ny tom rad
		System.out.println("OKAJ OKAj du kör vi då:");
		System.out.println(" btw du har 4 gissningar på dig!");

		int försök = 0;
		int incorrect = 0;
		String guess;
		int clos = 0;
		char letter;
		boolean rättgisning;
		String guesses = "";
		boolean phrasecontainsguess;
		
	//försök = räknar antalet försök felaktigt = räknar antalet felaktiga försök gissar = lagrar gissat brev inmatningsbrev = drar
	//ut första bokstaven från gissning för användning gissningar = lagrar alla redan gissade bokstäver guessescontainsguess = boolean
	//för gissning i redan gissade bokstäver phrasecontainsguess = booleska för gissning i fras

	
		while (incorrect < 5 && mening1.contains("_")) {
	//medans loopen börjar

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
	//bilderna för den hängda gubben
			
			System.out.println("KOM DÅ, gissa nu:");
			guess = input.nextLine(); 
	//tar gissningsinmatningen
			guess = guess.toUpperCase(); 
	//konverterar till stor bokstav för att jämföra
			letter = guess.charAt(0); 
	//tar första bokstaven som är gissat

			rättgisning = (guesses.indexOf(letter)) != -1;
			guesses += letter;
	//bevarar alla bokstäver som har blivit gissade på

			letter = Character.toUpperCase(letter); 
			System.out.print("\n");
			if (rättgisning == true) { 
	//konverterar till stor bokstav för att jämföra
				System.out.println("du har REDAN gissat på" + letter + "dummer.");
				System.out.print("\n");
				if (incorrect > 0) { 
	//inre if börjar
					incorrect--;
				} 
	//inre if slutar

			} 
	//if börjar

			phrasecontainsguess = (mening.indexOf(letter)) != -1;
			if (phrasecontainsguess == true) {
	//if börjar
				System.out.println(letter + " jo det är med någonstans där");
				System.out.print("\n");
				for (int position = 0; position < mening.length(); position++) {
	//for börjar
					if (mening.charAt(position) == letter && mening1.charAt(position) != letter) {
	//inre if börjar
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
	//if slutar annar börjar if 
				System.out.print("\n");
				System.out.println(letter + " är fan inte rätt");
				System.out.print("\n");
				incorrect++;
	//incorrect = incorrect + 1 efter varje felgivet svar
			}

			försök++; 
	//försök = försök + 1 efter varje angivet svar

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
			System.out.println("GAME OVER GUBBEN, knas asså!");
	//sista bilden som innebär att man har förlorat spelet
		} else {

			System.out.println("Ordet var: ");
	//när löst
			System.out.println(mening1);
			System.out.println("NÄMEN se på fan du vann!");
		}
		
		System.out.println("Vill du köra igen elle? Isåfall skriv 1, annars 2");
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