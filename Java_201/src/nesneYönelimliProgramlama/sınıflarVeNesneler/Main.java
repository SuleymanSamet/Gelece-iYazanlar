package nesneYönelimliProgramlama.sınıflarVeNesneler;

public class Main {

	public static void main(String[] args) {
		Daire daire = new Daire();
		daire.x=10.0;
		daire.y=20.0;
		daire.r=3.0;
		
		System.out.println(daire.x);
		System.out.println(daire.y);
		System.out.println(daire.r);
		
		double alanHesapla = daire.alanHesapla();
		double cevreHesapla= daire.cevreHesapla();
		
		System.out.println(alanHesapla);
		System.out.println(cevreHesapla);
		
		Daire daire2=new Daire();
		daire2.r=30;
		System.out.println(daire2.alanHesapla());
		System.out.println(daire.cevreHesapla());
		
		Daire daire3 = daire2;
		daire3.r=30;
	}
}
