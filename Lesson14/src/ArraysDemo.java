
public class ArraysDemo {

	public static void main(String[] args) {

		String ogrenci1 = "Yasin";
		String ogrenci2 = "Gürkan";
		String ogrenci3 = "Samet";
		String ogrenci4 = "Ahmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("---------------------------");

		String[] ogrenciler = new String[6];
		ogrenciler[0] = "Yasin";
		ogrenciler[1] = "Gürkan";
		ogrenciler[2] = "Samet";
		ogrenciler[3] = "Ahmet";
		ogrenciler[4] = "Mehmet";
		ogrenciler[5] = "Duru";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		System.out.println("---------------------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}

	}

}
