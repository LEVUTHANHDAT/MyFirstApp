import java.util.Scanner;

public class BT19thang3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("so lan dao dong: ");
		long A = sc.nextLong();
		// System.out.println(A);
		if (A >= 1000000000L && A <= 10000000000L) {
			long s = A / 100;
			long p = s / 60;
			long h = p / 60;
			long d = h / 24;
			long m = d / 30;
			long y = m / 12;
			// System.out.println(s + " " + p + " " + h + " " + d + " " + m + " " + y);
			long adu = A % 100;
			long sdu = s % 60;
			long pdu = p % 60;
			long hdu = h % 24;
			long ddu = d % 30;
			long mdu = m % 12;
			// System.out.println(sdu + " " + pdu + " " + hdu + " " + ddu + " " + mdu);
			// System.out.println(20000000%60);
			/*System.out.println(s + " giay " + adu + " dao dong");
			System.out.println(p + " phut " + sdu + " giay");
			System.out.println(h + " gio " + pdu + "  phut");
			System.out.println(d + " ngay " + hdu + "  gio");
			System.out.println(m + " thang " + ddu + "  ngay");*/
			System.out.println(y+" nam "+mdu+" thang " + ddu + " ngay " + hdu + " gio " + pdu + " phut " + sdu + " giay "+adu+" dao dong ");
		}

	}

}
