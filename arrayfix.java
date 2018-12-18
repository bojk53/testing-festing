package veckor;
public class arrayfix {

	//olika nummer mellan 0-9
	static int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};
	// 100st namn
	static String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
	public static void main(String[] args) {
		// kör alla 10 metoder
		System.out.println(mängd());
		System.out.println(namn());
		System.out.println(itNummer());
		System.out.println(Drusilla());
		System.out.println(equal());
		System.out.println(letterL());
		System.out.println(letterFive());
		antal();
		System.out.println(unik());
	}
	
	//metod 1
		// 100st tal i intervallet 0-9
		public static int mängd () {
		//skapar aktuela variabler 
			int tims = numbers.length;
			int ansor = 0;
			//identiifera alla numer av värder 7.
			for(int i = 0 ; i < tims; i++ ) {
				
				if (numbers[i] == 7) {
				ansor++;
			}
		}
		return ansor;
	}
	
	//metod 2
		public static int namn () {
			//skapa aktuella variabeler.
			int ansor = 0;
			int tims = names.length;
				//identiferar de angivna namn och leter efter matchning
				for(int i = 0 ; i < tims; i++ ) {
					if (names[i].equals("Tom")||names[i].equals("tom")) {
						ansor++;
					}
			}
		return ansor;
	}
	
	//metod 3
		public static int itNummer() {
			//skapar variabler 
			int  outnum2 = 0;
			int ansor =0;
			int tims = numbers.length;
			int conter = 0;
			//skaper en arrey
			int [] index = new int [10];
			//testar numrerna 1-9
			for(int i = 0 ; i < 10; i++ ) {
				conter = 0;
			//tar reda på ifall de är lika
			for(int e = 0; e<tims; e++) {
				if (numbers[e] == i) {
					conter++;
					}
					index[i]=conter;
				}
			}
			//letar efter det minsta värdet
		    for (int i = 0; i < index.length - 1; i++) { 
		       if ( outnum2 > index[i+1]) {
		            outnum2 = i+1;
		           }
		       }
		    ansor = numbers[outnum2];
		    return ansor;
	}
	
	//metod4
		public static int Drusilla() {
		//skapa aktuella variabler.
			int ansor = 0;
			int tims = names.length;
			//söker aktuelt namn och retunerarn platsen i listan 
			for(int i = 0 ; i < tims; i++ ) {
				if (names[i].equals("Drusilla")){
					ansor= i;
			}
		}
		return ansor;
	}
	
	//metod 5
		public static int equal() {
		//skaper aktuela variaber
			int ansor = 0;
			int tims = numbers.length;
			//söker efeer och adderar aktuella värden 
			for(int i = 0 ; i < tims; i++ ) {
				if(numbers[i]==2||numbers[i]==4||numbers[i]==6||numbers[i]==8) {
					ansor= ansor+ numbers[i];
			}
		}
		return ansor;
	}
	
	//metod6	
		public static int letterL() {
		//skaper aktuella variabler
			int ansor = 0;
			int tims = names.length;
				char oneLetter;
				//söker för en angiven bokstav på fursta platsen i stringen. ifall träff addera med ett i int
			for(int i = 0 ; i < tims; i++ ) { 
				oneLetter = names[i].charAt(0);
				if(oneLetter=='L') {
					ansor++;
			}
		}
		return ansor;
	}
	
	//metod7	
		public static int letterFive() {
		//skapa aktuella variabeler  
			String str;
		 int ansor =0;
		 int tims = names.length;
		 	//kollar hela listan eferer or som ineholler fem bokstäver;
		 for(int i = 0 ; i < tims; i++ ) { 
			str = names[i];
			if (str.length() == 5) {
				ansor++;
				}
		}
		 return ansor;
	}
	
	//method 8
		public static void antal () {
		//skaper aktuella variabeler + lista med 10 platser 
			int tims = numbers.length;
			int conter = 0;
			int [] indexx = new int [10];
			//lägger till väden i listat indexx
			for(int i = 0 ; i < 10; i++ ) {
				conter = 0;
				//söker efeter dubbleter av en sifra och räknar dem.
			for(int e = 1; e<tims; e++) {
				if (numbers[e] == i) {
					conter++;
				}
				//lägger till resultatet från söknigen 
				indexx[i]=conter;
			}
		}
		//skriver ut listan med tillhörande sifra. 
			for (int i = 0; i<10; i++) {
				System.out.println(indexx[i]+"of nr"+i);
		}
	}
	//metod 9 
		public static int unik() {
			//skapar aktuella variabler 
			int ansor = 0 ;
			int tims = names.length;
				String bas;
				// analyserar om det fin dubletter 
			for(int i = 0 ; i < tims; i++ ) {
					bas = names[i];
			for (int e = 0; e<tims; e++) {
			//stop för att inte gämföra med sin egen plats.
				if (i!=e) {
				//bryt lopp och tästa nästa om den hittar dubletter anars lägg till värde 
				if(bas.equals(names[e])) {
					break;	
					}
				if(e==tims-1) {
				ansor++;
					}	
				}
			}
		}
	return ansor;
	}
}