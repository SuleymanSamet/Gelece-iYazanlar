package metotlar.metotLab;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ogrenci ogrenci =new Ogrenci();
		ogrenci.isim="Tuğrul";
		ogrenci.yas=19;
		
		Main main =new Main();
		main.ogrenciBilgileri(ogrenci);

	}
	
	public void ogrenciBilgileri(Ogrenci ogrenci) {
		System.out.println(ogrenci.isim);
		System.out.println(ogrenci.yas);
	}

}
