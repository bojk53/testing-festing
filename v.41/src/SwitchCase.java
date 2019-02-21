

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare

		Scanner input = new Scanner(System.in);

		String genre;

		int goback = 0;
		switch (start(input)) {
		
		case 1:
			goback = 0;
			genre = "Sneakers";
			System.out.println("You chose " + genre + "! Here are three names of cool brands and their webbsite!");
			System.out.println();
			System.out.println("1. Nike, https://www.nike.com/se/sv_se/");
			System.out.println("2. Adidas, https://www.adidas.se/");
			System.out.println("3. Vans, https://www.vans.se/");
			System.out.println();
			System.out.println("If you want to go back enter 1");
			goback = input.nextInt();
			if (goback == 1) {
				start(input);
			}else
			break;
		case 2:
			goback = 0;
			genre = "Boots";
			System.out.println("You chose " + genre + "! Here are three names of cool brands and their webbsite!");
			System.out.println();
			System.out.println("1. Timberland, https://www.timberland.se/");
			System.out.println("2. Dr Martens, https://www.drmartens.com/eu/en_eu/");
			System.out.println("3. CAT, https://www.catfootwear.com/US/en/home");
			System.out.println();
			System.out.println("If you want to go back enter 1");
			goback = input.nextInt();
			if (goback == 1) {
			start(input);
			}else
			break;
		case 3:
			goback = 0;
			genre = "High heels";
			System.out.println("You chose " + genre + "! Here are three names of cool brands and their webbsite!");
			System.out.println();
			System.out.println("1. Michael Kors, https://www.michaelkors.eu/en_SE/");
			System.out.println("2. Pura Lopez, https://www.puralopez.com/se/en");
			System.out.println("3. Tory Burch, https://www.toryburch.eu/");
			System.out.println();
			System.out.println("If you want to go back enter 1");
			goback = input.nextInt();
			if (goback == 1) {
			start(input);
			}else
			break;
		case 4:
			goback = 0;
			genre = "Running shoes";
			System.out.println("You chose " + genre + "! Here are three names of cool brands and their webbsite!");
			System.out.println();
			System.out.println("1. ASICS, https://www.asics.com/nl/en-nl/");
			System.out.println("2. Puma, https://eu.puma.com/se/en/home");
			System.out.println("3. Reebok, https://www.reebok.se/");
			System.out.println();
			System.out.println("If you want to go back enter 1");
			goback = input.nextInt();
			if (goback == 1) {
			start(input);
			}else
			break;
		case 5:
			System.out.println("Thank you for today!");
			break;
		default:
			genre = "invalid";
			System.out.println("You have made a " + genre + " choice! Too bad for you!");
			System.out.println();
			break;
		}

		input.close();
	}
	public static int start(Scanner input) {
	System.out.println("Hi there i heard you are looking to buy new shoes, here is some popular brands! Please choose a type!");
	System.out.println("(1) - Sneakers");
	System.out.println("(2) - Boots");
	System.out.println("(3) - High heels");
	System.out.println("(4) - Running shoes");
	System.out.println("(5) - Quit");
	System.out.println();

	int choice = input.nextInt(); 
	return choice;
	}
}