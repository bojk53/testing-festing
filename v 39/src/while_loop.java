import java.util.Scanner;

public class while_loop {

	// J�mf�r f�re iteration
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		boolean exit = false;
		
		while(!exit) {
			// Massa kod
		
			// If (m�let �r uppn�t){
		/*�ndra v�rdet p� exit variabel s� att while-loopen avslutas
		}*/
			String line = input.nextLine();
			if(line.equals("exit"));
			exit = true;
		}
	}
}
