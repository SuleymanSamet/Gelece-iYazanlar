package nesneYönelimliProgramlama.thisOrnek;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calisan calisan = new Calisan();
		calisan.setIsim("Volkan");
		calisan.setMaas(26000);
		calisan.setIseBaslamaTarihi(new Date());
		calisan.yazdir();

	}

}
