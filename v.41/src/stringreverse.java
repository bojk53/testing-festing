import java.util.Scanner;
public class stringreverse {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String baklšnges;
		baklšnges = reverse(scan.nextLine());
		System.out.println(baklšnges);
	}
	public static String reverse(String str)
	{
		String r = "";
		for (int i=str.length()-1; i>=0; i--)
			r = r + str.charAt(i);
		return r;
	}
}
