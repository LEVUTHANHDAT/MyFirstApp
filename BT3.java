import java.util.Scanner;

public class BT3 {
	private static final String String = null;

	public static void main(String[] args) {
		String arr[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };

		System.out.println(" Nhap ki tu: ");
		Scanner sc = new Scanner(System.in);
		String kitu = sc.nextLine();

		int i = 0;
		 
			if (kitu.equals(arr[i]) ) {
				System.out.println(i+1);
		}
	}
}