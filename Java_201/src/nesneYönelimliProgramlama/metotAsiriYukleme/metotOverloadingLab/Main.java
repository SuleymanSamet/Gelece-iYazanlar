package nesneYönelimliProgramlama.metotAsiriYukleme.metotOverloadingLab;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calisan calisan=new Calisan();
		calisan.bilgileriYazdır();
		Calisan calisan2=new Calisan("Furkan");
		calisan2.bilgileriYazdır();
		Calisan calisan3=new Calisan("Furkan", "IT");
		calisan3.bilgileriYazdır();
		Calisan calisan4=new Calisan("Furkan", "IT", new Date());
		calisan4.bilgileriYazdır();

	}

}
