package nesneYönelimliProgramlama.superOrnek;

public class Main {

	public static void main(String[] args) {
		Kisi kisi=new Kisi("Samet");
		System.out.println(kisi.getIsim());
		
		Ogrenci ogrenci = new Ogrenci("Kadir", 69);
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getNumara());
		ogrenci.ozet();

	}

}
