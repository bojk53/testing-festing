
public class ageControl {

	public static void main(String[] args) 
	{
		System.out.println(ageControl(30));
	}
	public static int ageControl(int age) 
    {
        if (age < 6)
            System.out.println("Sm�barn f�r inte g�ra n�got.");
        if (age > 5 && age < 13)
            System.out.println("Du f�r spela Fortnite.");
        if (age > 12 && age < 15)
            System.out.println("Du �r ton�ring.");
        if (age > 14 && age < 18)
            System.out.println("Du f�r k�ra moppe.");
        if (age > 17 && age < 20)
            System.out.println("Du f�r k�ra bil.");
        if (age > 19 && age < 65)
            System.out.println("Du f�r g� p� systemet.");
        if (age > 64 && age < 100)
            System.out.println("Du �r pension�r.");
        if (age > 99)
            System.out.println("R.I.P");
        return age;
    }
	
}
