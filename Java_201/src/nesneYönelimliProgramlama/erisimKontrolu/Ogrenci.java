package nesneYönelimliProgramlama.erisimKontrolu;

public class Ogrenci {
	private int numara;
	private String ad;
	private String soyad;
	private int yas;
	
	
	
    public int getNumara() {
		return numara;
	}



	public void setNumara(int numara) {
		this.numara = numara;
	}



	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getSoyad() {
		return soyad;
	}



	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}



	public int getYas() {
		return yas;
	}



	public void setYas(int yas) {
		if (yas>0) {
			this.yas = yas;
		}else {
			System.out.println("Yas değeri 0 dan küçük olamaz");
		}
	}


	public void bilgileriYazdır() {
		System.out.println("Numara :"+numara);
		System.out.println("Ad :"+ad);
		System.out.println("Soyad : "+ soyad);
		System.out.println("Yaş : "+yas);
	}

	public void numarayıYazdır() {
		System.out.println(numara);
	}

}
