package metotlar;
import java.util.Scanner;

public class MetotTanımlama {
	//değer döndürmeyen metot
	private void merhaba() {
		System.out.println("Merhaba");
	}
	//değer döndüren
	public int topla(int x,int y) {
		int toplam=x+y;
		return toplam;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MetotTanımlama metotTanımlama=new MetotTanımlama();
		metotTanımlama.merhaba();
		System.out.print("İlk sayıyı girin :");
		int x=scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz : ");
		int y = scanner.nextInt();
		int sonuc = metotTanımlama.topla(x, y);
		System.out.println("Sonuç : "+sonuc);
	}

}
