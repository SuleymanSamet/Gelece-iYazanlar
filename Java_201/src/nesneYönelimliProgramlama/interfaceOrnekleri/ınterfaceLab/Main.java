package nesneYönelimliProgramlama.interfaceOrnekleri.ınterfaceLab;

public class Main {

	public static void main(String[] args) {
		Elma[] elmalar = new Elma[10];
		elmalar[0] = new Elma(10, "Kırmızı");
		elmalar[1] = new Elma(20, "Sarı");
		elmalar[2] = new Elma(15, "Yeşil");
		elmalar[3] = new Elma(100, "Kırmızı");
		elmalar[4] = new Elma(104, "Yeşil");
		elmalar[5] = new Elma(25, "Kırmızı");
		elmalar[6] = new Elma(30, "Sarı");
		elmalar[7] = new Elma(11, "Kırmızı");
		elmalar[8] = new Elma(5, "Sarı");
		elmalar[9] = new Elma(9, "Yeşil");
/*
		renkFiltrele("Kırmızı", elmalar);
		System.out.println("***********");
		agirlikFiltrele(50, elmalar);
		System.out.println("***********");
		agirlikFiltrele(100, elmalar);*/
		
		RenkFiltresi filtresi=new RenkFiltresi();
		//filtrele(filtresi, elmalar);
		AgirlikFiltresi agirlikFiltresi=new AgirlikFiltresi();
		filtrele(agirlikFiltresi, elmalar);

	}
	
	public static void filtrele(ElmaFiltresi elmaFiltresi,Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma=elmalar[i];
			if (elmaFiltresi.filtrele(elma)) {
				System.out.println(elma.getAgirlik()+" "+elma.getRenk());
			}
		}
	}

	public static void renkFiltrele(String renk, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getRenk().equals(renk)) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
			}

		}
	}

	public static void agirlikFiltrele(int agirlik, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() >= agirlik) {
				System.out.println(elma.getAgirlik() + " " + elma.getRenk());

			}
		}
	}

	public static void agirlikFiltrele2(int agirlik, Elma[] elmalar) {
		for (int i = 0; i < elmalar.length; i++) {
			Elma elma = elmalar[i];
			if (elma.getAgirlik() < agirlik) {
				System.out.println(elma.getRenk() + " " + elma.getAgirlik());
			}
		} 

	}
}
