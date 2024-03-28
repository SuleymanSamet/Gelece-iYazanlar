package nesneYönelimliProgramlama.superOrnek;

public class Kisi {
	private String isim;
	
	

	public Kisi(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	public void bilgileriYazdır() {
		System.out.println("Kisi "+ isim);
	}
	
	

}
