package nesneYönelimliProgramlama.labFinalSuperThis;

public class YukTasimaAraci extends Arac{
	private int yukKapasite;

	public YukTasimaAraci(String plaka, String marka,int yukKapasitesi) {
		super(plaka, marka);
		this.yukKapasite=yukKapasitesi;
		
	}

	public int getYukKapasite() {
		return yukKapasite;
	}

	public void setYukKapasite(int yukKapasite) {
		this.yukKapasite = yukKapasite;
	}
	public void yazdir() {
		super.yazdir();
		System.out.println("Yük kapasitesi : "+yukKapasite);
	}

}
