package nesneYönelimliProgramlama.kalıtım;

public class Daire extends Şekil{
	private int yaricap;

	public int getYaricap() {
		return yaricap;
	}

	public void setYaricap(int yaricap) {
		this.yaricap = yaricap;
	}
	public void alanHesapla() {
		System.out.println("Alan : "+(Math.PI*yaricap*yaricap));
	}

}
