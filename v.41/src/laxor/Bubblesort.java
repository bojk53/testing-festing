package laxor;
public class Bubblesort {
	public static void main(String[] args) {
	
		int[] randomnummer = new int[20];

        for (int i = 0; i < 20; i++) {

            // fyller arrayen med 20 slumpmässiga heltal mellan 0 och 20
            randomnummer[i] = (int) (Math.random() * 20) + 1;
        }
		
		System.out.print(bubbleSort(randomnummer));
	}

public static int bubbleSort(int[] randomnummer) {
boolean swapped = true;
int counter = 0;
int temp = 0;

do {
	
	swapped = false;
	for (int i = 0; i < randomnummer.length - 1; i++) {
		
		if (randomnummer[i] > randomnummer[i + 1]) {
			int tempo = randomnummer[i + 1];
			randomnummer[i + 1] = randomnummer[i];
			randomnummer[i] = temp;
			swapped = true;
		}
		counter++;
	}
	
 }	
while (swapped);
return counter;
}
}