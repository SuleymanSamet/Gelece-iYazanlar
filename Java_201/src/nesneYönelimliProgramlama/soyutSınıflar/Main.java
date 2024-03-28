package nesneYönelimliProgramlama.soyutSınıflar;

public class Main {

	public static void main(String[] args) {
		Oyuncu oyuncu = new Basketbolcu();
		oyuncu.setIsim("Mehmet");
		oyuncu.setNumarasi(10);
		oyuncu.pasVer();
		oyuncu.sutCek();

	}

}
