package nesneYönelimliProgramlama.pojoSinifleri;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		/*
		Calisan calisan = new Calisan();
		calisan.setIsim("Kadir");
		calisan.setMaas(17002);
		calisan.setIsegirisTarihi(new Date());
		
		System.out.println(calisan.getIsim());
		System.out.println(calisan.getMaas());
		System.out.println(calisan.getIsegirisTarihi());*/
		Kare kare =new Kare();
		kare.setX(10);
		kare.setY(5);
		kare.setUzunluk(100);
		kare.ekranaBastır();
		
		System.out.println(kare.getX());
	}

}
