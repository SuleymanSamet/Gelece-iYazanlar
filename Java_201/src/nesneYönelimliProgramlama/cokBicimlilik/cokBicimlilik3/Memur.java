package nesneYönelimliProgramlama.cokBicimlilik.cokBicimlilik3;

public class Memur extends Calisan{
	
	private String birim;

	public Memur(String isim, String gorev, int maas,String birim) {
		super(isim, gorev, maas);
		this.birim=birim;
		
	}

	public String getBirim() {
		return birim;
	}

	public void setBirim(String birim) {
		this.birim = birim;
	}
	
	public void ozet() {
		System.out.println("Memur isim: "+getIsim());
		System.out.println("Memur görev:"+getGorev());
		System.out.println("memur maas :"+getMaas());
		System.out.println("Memur birim : "+birim);
	}
	
	

}
