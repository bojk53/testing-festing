import java.util.ArrayList;

public class lista {

	public static void main (String[] args) {
		
		int[] jonny = {1, 2, 3, 4, 5};
		String[] Pontus = {"Str�ng", "Hej"};
		
		for (int i = 0; i < Pontus.length; i++ ) {
			System.out.println(jonny[i]);
		}
		
		// Skapa en Arraylist (t�nk p� likheten med Scanner)
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("Jonny");
		nameList.add("Olle");
		nameList.add("Lisa");
		nameList.add("Alex");
		
		// skriver ut en ArrayList inneh�llet mha .size() och .get()
		for (int i = 0; i < nameList.size(); i++) {
			System.out.print(nameList.get(i) + " ");
		}
		System.out.println();
		
		nameList.add(1, "Anna");
		System.out.println(nameList);
		
		nameList.add(2, "Britta");
		System.out.println(nameList);
		
		nameList.remove(0);
		System.out.println(nameList);
		
		nameList.remove("Britta");
		System.out.println(nameList);
		
		

	
	}
}
