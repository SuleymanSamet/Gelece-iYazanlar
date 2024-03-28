package nesneYönelimliProgramlama.pojoSinifleri;

public class Kare {
	private int x;
	private int y;
	private int uzunluk;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if (x>=0) {
			this.x = x;
		}else {
			System.out.println("x sıfırdan büyük olmalıdır");
		}
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if (y>=0) {
			this.y = y;
		}else {
			System.err.println("y sıfırdan büyük olmalı");
		}
	}
	public int getUzunluk() {
		return uzunluk;
	}
	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	
	public void ekranaBastır() {
		System.out.println("x: "+x);
		System.out.println("y:"+y);
		System.out.println("uzunluk:"+uzunluk);
	}
	
	

}
