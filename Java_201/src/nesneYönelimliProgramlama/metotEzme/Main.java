package nesneYönelimliProgramlama.metotEzme;

public class Main {
	public static void main(String[] args) {
		Araba araba = new Araba("x marka","Ymodel",2023);
		System.out.println(araba.toString());
		
		araba.setMarka("Tesla");
		System.out.println(araba.toString());
		
	}

}
