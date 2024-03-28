package nesneYönelimliProgramlama.sınıfLab;

public class Kalem {
	String marka;
	String tip;
	boolean doldurulabilir;
	boolean silinebilir;
	
	void yaz(String metin) {
		System.out.println(metin);
	}
	void tekrarDoldur() {
		if (doldurulabilir) {
			System.out.println("Kalem dolduruldu");
		}else {
			System.out.println("bu kalem doldurulamaz");
		}
	}
	void sil() {
		if (silinebilir) {
			System.out.println("yazı silindi");
		}else {
			System.out.println("Yazı silinemez");
		}
	}

}
