package nesneYönelimliProgramlama.sınıfLab;

public class Telefon {
	TelefonTipi tip;
	String marka;
	String model;
	boolean wifi;
	boolean mobilVeri;
	
	boolean aramaVarmı;
	
	void aramaYap(String telefonNumarası) {
			System.out.println(telefonNumarası);
			aramaVarmı =true;
	}
	void aramayıSonlandır() {
		if (aramaVarmı) {
			System.out.println("Arama sonlandırıldı");
		}
		
	}
	void mesajGonder(String mesaj) {
		if (mobilVeri) {
			System.out.println("mesaj gönderildi");
		}
	}
	 

}
