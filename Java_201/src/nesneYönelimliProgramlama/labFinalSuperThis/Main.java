package nesneYönelimliProgramlama.labFinalSuperThis;

public class Main {

	public static void main(String[] args) {
		Arac arac = new Arac("34 tt 12", "x marka");
		arac.yazdir();
		System.out.println("--------------");
		Araba araba = new Araba("80 kyk 688", "Tesla", 4, 5);
		araba.yazdir();

	}

}
