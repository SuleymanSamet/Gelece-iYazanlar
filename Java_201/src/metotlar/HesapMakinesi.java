package metotlar;
import java.util.Scanner;

public class HesapMakinesi {
	public double topla(double x ,double y) {
		double toplam=x+y;
		return toplam;
	}
	public double çıkar(double x,double y) {
		double çıkarma=x-y;
		return çıkarma;
	}
	public double çarp(double x,double y) {
		double çarpma=x*y;
		return çarpma;
	}
	public double böl(double x, double y) {
		double bölme=x/y;
		return bölme;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ilk sayı : ");
		int x=scanner.nextInt();
		System.out.print("İkinci sayı : ");
		int y=scanner.nextInt();
		System.out.print(" toplama = 1 \n çıkarma = 2 \n çarpma = 3 \n bölme = 4 \n Yapılacak işlem : ");
		int secim=scanner.nextInt();
		HesapMakinesi hesapMakinesi=new HesapMakinesi();
		
		if (true) {
			if (secim==1) {
				System.out.println(hesapMakinesi.topla(x, y));
				
			}else if (secim==2) {
				System.out.println(hesapMakinesi.çıkar(x, y));
				
			} else if (secim==3) {
				System.out.println(hesapMakinesi.çarp(x, y));
			} else if (secim==4) {
				System.out.println(hesapMakinesi.böl(x, y));
			}else {
				System.out.println("Hatalı tuşlama yaptınız");
			}
			
		}
		
	}

}
