
import java.util.Scanner;

public class name {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name();
		String name2();
		
		System.out.println("Hej! Vad heter du och din mamma?");
		name = input.nextLine();
		name2 = input.nextLine();
		
		welcomeMessage(name, name2);
		// System.out.print("Hej " + name + "! v�lkommen hit!");
		
	}
	
	//skriv en metod som returnerar en h�lsning till en person
	
	static void welcomeMessage(String name, String name2) {
	
	System.out.println("hej " + name + " v�lkommen");
	System.out.println("hej " + name2 + " v�lkommen hit du ocks�");
	}
}
