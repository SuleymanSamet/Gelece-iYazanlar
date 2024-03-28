package nesneYönelimliProgramlama.metotEzme;

public class Araba {
	private String marka;
	private String model;
	private int yıl;
	
	public Araba() {
		
	}
	public Araba(String marka,String model,int yıl) {
		this.marka=marka;
		this.model=model;
		this.yıl=yıl;
	}
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYıl() {
		return yıl;
	}
	public void setYıl(int yıl) {
		this.yıl = yıl;
	}
	@Override
	public String toString() {
		return "Marka : "+getMarka()+" Model :"+getModel()+" yıl : "+getYıl();
	}
	
	

}
