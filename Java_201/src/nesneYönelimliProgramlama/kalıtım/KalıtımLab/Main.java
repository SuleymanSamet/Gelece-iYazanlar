package nesneYönelimliProgramlama.kalıtım.KalıtımLab;

public class Main {
	public static void main(String[] args) {
		Kisi kisi=new Kisi();
		kisi.setIsim("Süleyman");
		System.out.println(kisi.getIsim());

		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setIsim("Samet");
		ogrenci.setDers("Java 201");
		System.out.println(ogrenci.getIsim());
		System.out.println(ogrenci.getDers());
		
		UnivOgrenci univOgrenci =new UnivOgrenci();
		univOgrenci.setIsim("Fatih");
		univOgrenci.setDers("Bilgisayar Temelleri 101");
		univOgrenci.setKampus("AÜ");
		System.out.println(univOgrenci.getIsim());
		System.out.println(univOgrenci.getDers());
		System.out.println(univOgrenci.getKampus());
		
		Ogretmen ogretmen = new Ogretmen();
		ogretmen.setIsim("Aykut Kocaman");
		ogretmen.setOkul("hayat okulu");
		System.out.println(ogretmen.getIsim());
		System.out.println(ogretmen.getOkul());
		
		Doktor doktor = new Doktor();
		doktor.setIsim("Ahmet çakar");
		doktor.setBrans("Beyin cerrahisi");
		System.out.println(doktor.getIsim());
		System.out.println(doktor.getBrans());
	}
}
