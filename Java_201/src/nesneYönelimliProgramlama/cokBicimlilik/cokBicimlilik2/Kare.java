package nesneYönelimliProgramlama.cokBicimlilik.cokBicimlilik2;

public class Kare extends Sekil{
	private int kenarUzunlugu;
	
	public Kare(int kenarUzunlugu) {
		
		this.kenarUzunlugu = kenarUzunlugu;
	}



	public int getKenarUzunlugu() {
		return kenarUzunlugu;
	}



	public void setKenarUzunlugu(int kenarUzunlugu) {
		this.kenarUzunlugu = kenarUzunlugu;
	}



	public void alan() {
		System.out.println("Kare alan : "+Math.pow(kenarUzunlugu, 2));
	}

}
