package nesneYönelimliProgramlama.metotEzme.metotOverridingLab;

public class Kisi {
	private String tcNo;
	private String isim;
	
	public Kisi() {
		
	}

	public Kisi(String tcNo) {
		
		this.tcNo = tcNo;
	}

	public Kisi(String tcNo, String isim) {
		
		this.tcNo = tcNo;
		this.isim = isim;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	@Override
	public boolean equals(Object object) {
		Kisi kisi = (Kisi) object;
		return kisi.tcNo.equals(this.tcNo)&&kisi.isim.equals(this.isim);
	}
	@Override
	public String toString() {
		return "TC no : "+tcNo+", İsim : "+isim;
	}
	
	
	
	

}
