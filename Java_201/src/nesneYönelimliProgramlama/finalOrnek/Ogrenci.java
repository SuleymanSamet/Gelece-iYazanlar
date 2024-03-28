package nesneYönelimliProgramlama.finalOrnek;

public /*final*/ class Ogrenci {
	private final int numara;
	
	

	public Ogrenci(int numara) {
		
		this.numara = numara;
	}



	public int getNumara() {
		return numara;
	}
	public /*final*/ void yazdır() {
		System.out.println(numara);
	}
	
	

}
