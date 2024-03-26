package metotlar;
public class Metotlar {
	
	private void helloWorld() {
		System.out.println("Hello world");
	}
	private int topla(int x ,int y) {
		int toplam=x+y;
		return toplam;
	}
	private float topla(float x ,int y) {
		float toplam=x+y;
		return (float)toplam;
	}
	private float topla(float x ,float y) {
		float toplam=x+y;
		return (float)toplam;
	}


	public static void main(String[] args) {
		// geleceği yazanlar 201 
		new Metotlar().helloWorld();
		int sonuc =new Metotlar().topla(20, 30);
		System.out.println(sonuc);
		
		

	}

}
