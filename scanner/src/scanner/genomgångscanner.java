package scanner;

import java.util.Scanner;

public class genomg�ngscanner {

		public static void main(String[] args) {
			
			Scanner input=new Scanner(System.in);
			System.out.println("vad heter du?");
			String name=input.nextLine();
			System.out.println("vad �r din address?");
			String address=input.nextLine();
			System.out.println("Vilken klass g�r du i?");
			String klass=input.nextLine();
			System.out.println("Vad �r ditt telefonnummer?");
			String nummer=input.nextLine();
			System.out.println("Ditt namn �r: " + name);
			System.out.println("Din address �r: " + address);
			System.out.println("Du g�r i klassen: " + klass);
			System.out.println("Ditt nummer �r: " + nummer);
			

		}
}
